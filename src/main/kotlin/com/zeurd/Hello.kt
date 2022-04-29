
// this annotation is used to call function here im java with the annotated name for the class
@file:JvmName("Util")
package com.zeurd

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "man"
    println("Hello $name")
    
    listOf('a', 'b', 'c').joinToString(separator="", prefix="(", postfix=")") 

fun max(a: Int, b:Int): Int = if (a > b) a else b

// function wieth default value
fun foo(char: Char = '*', size: Int = 3) {
    repeat(size) {
        println(char)
    }
}

fun isValidIdentifier(s: String): Boolean {
    fun isLetter(c: Char) = (c in 'a'..'z' || c in 'A'..'Z')
    fun isNumber(c: Char) = c in '0'..'9'

    if (s.isEmpty() || !isLetter(s[0]) && s[0] != '_') {
        return false
    }
    for (c in s.subSequence(1, s.length)) {
        if (!isLetter(c) && !isNumber(c) && c != '_') {
            return false
        }
    }
    return true
}

// extension function
fun String.lastChar() = get(length - 1)

/*
Extension defined in standard library
(standard kotlin library is actually just java class extended)
Eg: hashSetOf(), arratListOf(), mapOf(k to v)
this is why there's no kotlin jdk

other ex: joinToString, getOrNull

String: """ triple " for multi-line + no need to escape special char
.trimMargin / .trimIndent (to align multiline)
.toRegex
.toInt toDouble + toIntOrnUll toDoubleOrNull
 */

 fun Array<Int>.sum(): Int {
     var r = 0
     for (i in this) {
         r += i
     }
     return r
 }

 fun foo() {
     var nullable: String? = null;
     var s: String = "cannot be null"
     
     //equivalent to if (nullable == null) {}
     var x = nullable?.length
     // x is of type Int?

     //to get if else operator: elvis operator
     var y = nullable?.length ?: 0
 }