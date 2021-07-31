package typings.voca

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("voca", JSImport.Namespace)
  @js.native
  val ^ : VocaStatic = js.native
  
  @js.native
  trait Chain extends StObject {
    
    // Case
    def camelCase(): Chain = js.native
    
    def capitalize(): Chain = js.native
    def capitalize(restToLoweropt: Boolean): Chain = js.native
    
    def chain(): ExplicitChain[String] = js.native
    
    // Chop
    def charAt(): Chain = js.native
    def charAt(position: Double): Chain = js.native
    
    // Split
    def chars(): js.Array[String] = js.native
    
    def codePointAt(): Chain = js.native
    def codePointAt(position: Double): Chain = js.native
    
    def codePoints(): js.Array[Double] = js.native
    
    // Count
    def count(): Double = js.native
    
    def countGraphemes(): Double = js.native
    
    def countSubstrings(): Double = js.native
    def countSubstrings(substring: String): Double = js.native
    
    def countWhere(): Double = js.native
    def countWhere(predicate: Unit, context: js.Any): Double = js.native
    def countWhere(predicate: CountPredicate): Double = js.native
    def countWhere(predicate: CountPredicate, context: js.Any): Double = js.native
    
    def countWords(): Double = js.native
    def countWords(pattern: String): Double = js.native
    def countWords(pattern: String, flags: String): Double = js.native
    def countWords(pattern: Unit, flags: String): Double = js.native
    def countWords(pattern: RegExp): Double = js.native
    def countWords(pattern: RegExp, flags: String): Double = js.native
    
    def decapitalize(): Chain = js.native
    
    // Query
    def endsWith(): Boolean = js.native
    def endsWith(end: String): Boolean = js.native
    def endsWith(end: String, position: Double): Boolean = js.native
    def endsWith(end: Unit, position: Double): Boolean = js.native
    
    // Escape
    def escapeHtml(): Chain = js.native
    
    def escapeRegExp(): Chain = js.native
    
    def first(): Chain = js.native
    def first(length: Double): Chain = js.native
    
    def graphemeAt(): Chain = js.native
    def graphemeAt(position: Double): Chain = js.native
    
    def graphemes(): js.Array[String] = js.native
    
    def includes(): Boolean = js.native
    def includes(search: String): Boolean = js.native
    def includes(search: String, position: Double): Boolean = js.native
    def includes(search: Unit, position: Double): Boolean = js.native
    
    // Index
    def indexOf(): Double = js.native
    def indexOf(search: String): Double = js.native
    def indexOf(search: String, fromIndex: Double): Double = js.native
    def indexOf(search: Unit, fromIndex: Double): Double = js.native
    
    // Multipulate
    def insert(): Chain = js.native
    def insert(toInsert: String): Chain = js.native
    def insert(toInsert: String, position: Double): Chain = js.native
    def insert(toInsert: Unit, position: Double): Chain = js.native
    
    def isAlpha(): Boolean = js.native
    
    def isAlphaDigit(): Boolean = js.native
    
    def isBlank(): Boolean = js.native
    
    def isDigit(): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    def isLowerCase(): Boolean = js.native
    
    def isNumeric(): Boolean = js.native
    
    def isString(): Boolean = js.native
    
    def isUpperCase(): Boolean = js.native
    
    def kebabCase(): Chain = js.native
    
    def last(): Chain = js.native
    def last(length: Double): Chain = js.native
    
    def lastIndexOf(): Double = js.native
    def lastIndexOf(search: String): Double = js.native
    def lastIndexOf(search: String, fromIndex: Double): Double = js.native
    def lastIndexOf(search: Unit, fromIndex: Double): Double = js.native
    
    def latinise(): Chain = js.native
    
    def lowerCase(): Chain = js.native
    
    def matches(): Boolean = js.native
    def matches(pattern: String): Boolean = js.native
    def matches(pattern: String, flags: String): Boolean = js.native
    def matches(pattern: Unit, flags: String): Boolean = js.native
    def matches(pattern: RegExp): Boolean = js.native
    def matches(pattern: RegExp, flags: String): Boolean = js.native
    
    def pad(): Chain = js.native
    def pad(length: Double): Chain = js.native
    def pad(length: Double, pad: String): Chain = js.native
    def pad(length: Unit, pad: String): Chain = js.native
    
    def padLeft(): Chain = js.native
    def padLeft(length: Double): Chain = js.native
    def padLeft(length: Double, pad: String): Chain = js.native
    def padLeft(length: Unit, pad: String): Chain = js.native
    
    def padRight(): Chain = js.native
    def padRight(length: Double): Chain = js.native
    def padRight(length: Double, pad: String): Chain = js.native
    def padRight(length: Unit, pad: String): Chain = js.native
    
    def prune(): Chain = js.native
    def prune(length: Double): Chain = js.native
    def prune(length: Double, end: String): Chain = js.native
    def prune(length: Unit, end: String): Chain = js.native
    
    def repeat(): Chain = js.native
    def repeat(times: Double): Chain = js.native
    
    def replace(): Chain = js.native
    def replace(pattern: String): Chain = js.native
    def replace(pattern: String, replacement: String): Chain = js.native
    def replace(pattern: String, replacement: ReplacementFunction): Chain = js.native
    def replace(pattern: Unit, replacement: String): Chain = js.native
    def replace(pattern: Unit, replacement: ReplacementFunction): Chain = js.native
    def replace(pattern: RegExp): Chain = js.native
    def replace(pattern: RegExp, replacement: String): Chain = js.native
    def replace(pattern: RegExp, replacement: ReplacementFunction): Chain = js.native
    
    def replaceAll(): Chain = js.native
    def replaceAll(pattern: String): Chain = js.native
    def replaceAll(pattern: String, replacement: String): Chain = js.native
    def replaceAll(pattern: String, replacement: ReplacementFunction): Chain = js.native
    def replaceAll(pattern: Unit, replacement: String): Chain = js.native
    def replaceAll(pattern: Unit, replacement: ReplacementFunction): Chain = js.native
    def replaceAll(pattern: RegExp): Chain = js.native
    def replaceAll(pattern: RegExp, replacement: String): Chain = js.native
    def replaceAll(pattern: RegExp, replacement: ReplacementFunction): Chain = js.native
    
    def reverse(): Chain = js.native
    
    def reverseGrapheme(): Chain = js.native
    
    def search(): Double = js.native
    def search(pattern: String): Double = js.native
    def search(pattern: String, fromIndex: Double): Double = js.native
    def search(pattern: Unit, fromIndex: Double): Double = js.native
    def search(pattern: RegExp): Double = js.native
    def search(pattern: RegExp, fromIndex: Double): Double = js.native
    
    def slice(): Chain = js.native
    def slice(start: Double): Chain = js.native
    def slice(start: Double, end: Double): Chain = js.native
    def slice(start: Unit, end: Double): Chain = js.native
    
    def slugify(): Chain = js.native
    
    def snakeCase(): Chain = js.native
    
    def splice(): Chain = js.native
    def splice(start: Double): Chain = js.native
    def splice(start: Double, deleteCount: Double): Chain = js.native
    def splice(start: Double, deleteCount: Double, toAdd: String): Chain = js.native
    def splice(start: Double, deleteCount: Unit, toAdd: String): Chain = js.native
    def splice(start: Unit, deleteCount: Double): Chain = js.native
    def splice(start: Unit, deleteCount: Double, toAdd: String): Chain = js.native
    def splice(start: Unit, deleteCount: Unit, toAdd: String): Chain = js.native
    
    def split(): js.Array[String] = js.native
    def split(separator: String): js.Array[String] = js.native
    def split(separator: String, limit: Double): js.Array[String] = js.native
    def split(separator: Unit, limit: Double): js.Array[String] = js.native
    def split(separator: RegExp): js.Array[String] = js.native
    def split(separator: RegExp, limit: Double): js.Array[String] = js.native
    
    // Format
    def sprintf(replacements: js.Any*): Chain = js.native
    
    def startsWith(): Boolean = js.native
    def startsWith(start: String): Boolean = js.native
    def startsWith(start: String, position: Double): Boolean = js.native
    def startsWith(start: Unit, position: Double): Boolean = js.native
    
    // Strip
    def stripBom(): Chain = js.native
    
    def stripTags(): Chain = js.native
    def stripTags(allowbleTags: String): Chain = js.native
    def stripTags(allowbleTags: String, replacement: String): Chain = js.native
    def stripTags(allowbleTags: js.Array[String]): Chain = js.native
    def stripTags(allowbleTags: js.Array[String], replacement: String): Chain = js.native
    def stripTags(allowbleTags: Unit, replacement: String): Chain = js.native
    
    def substr(): Chain = js.native
    def substr(start: Double): Chain = js.native
    def substr(start: Double, length: Double): Chain = js.native
    def substr(start: Unit, length: Double): Chain = js.native
    
    def substring(): Chain = js.native
    def substring(start: Double): Chain = js.native
    def substring(start: Double, end: Double): Chain = js.native
    def substring(start: Unit, end: Double): Chain = js.native
    
    def swapCase(): Chain = js.native
    
    def titleCase(): Chain = js.native
    def titleCase(ignoreWordsopt: js.Array[String]): Chain = js.native
    
    def tr(): Chain = js.native
    def tr(from: String): Chain = js.native
    def tr(from: String, to: String): Chain = js.native
    def tr(from: StringDictionary[String]): Chain = js.native
    def tr(from: Unit, to: String): Chain = js.native
    
    def trim(): Chain = js.native
    def trim(whitespace: String): Chain = js.native
    
    def trimLeft(): Chain = js.native
    def trimLeft(whitespace: String): Chain = js.native
    
    def trimRight(): Chain = js.native
    def trimRight(whitespace: String): Chain = js.native
    
    def truncate(): Chain = js.native
    def truncate(length: Double): Chain = js.native
    def truncate(length: Double, end: String): Chain = js.native
    def truncate(length: Unit, end: String): Chain = js.native
    
    def unescapeHtml(): Chain = js.native
    
    def upperCase(): Chain = js.native
    
    // Chain
    def value(): String = js.native
    
    def vprintf(replacements: js.Any*): Chain = js.native
    
    def wordWrap(): Chain = js.native
    def wordWrap(options: WordWrapOptions): Chain = js.native
    
    def words(): js.Array[String] = js.native
    def words(pattern: String): js.Array[String] = js.native
    def words(pattern: String, flag: String): js.Array[String] = js.native
    def words(pattern: Unit, flag: String): js.Array[String] = js.native
    def words(pattern: RegExp): js.Array[String] = js.native
    def words(pattern: RegExp, flag: String): js.Array[String] = js.native
  }
  
  type CountPredicate = js.Function3[/* character */ String, /* index */ Double, /* str */ String, Boolean]
  
  @js.native
  trait ExplicitChain[T] extends StObject {
    
    // Case
    def camelCase(): ExplicitChain[String] = js.native
    
    def capitalize(): ExplicitChain[String] = js.native
    def capitalize(restToLoweropt: Boolean): ExplicitChain[String] = js.native
    
    // Chop
    def charAt(): ExplicitChain[String] = js.native
    def charAt(position: Double): ExplicitChain[String] = js.native
    
    // Split
    def chars(): ExplicitChain[js.Array[String]] = js.native
    
    def codePointAt(): ExplicitChain[String] = js.native
    def codePointAt(position: Double): ExplicitChain[String] = js.native
    
    def codePoints(): ExplicitChain[js.Array[Double]] = js.native
    
    // Count
    def count(): ExplicitChain[Double] = js.native
    
    def countGraphemes(): ExplicitChain[Double] = js.native
    
    def countSubstrings(): ExplicitChain[Double] = js.native
    def countSubstrings(substring: String): ExplicitChain[Double] = js.native
    
    def countWhere(): ExplicitChain[Double] = js.native
    def countWhere(predicate: Unit, context: js.Any): ExplicitChain[Double] = js.native
    def countWhere(predicate: CountPredicate): ExplicitChain[Double] = js.native
    def countWhere(predicate: CountPredicate, context: js.Any): ExplicitChain[Double] = js.native
    
    def countWords(): ExplicitChain[Double] = js.native
    def countWords(pattern: String): ExplicitChain[Double] = js.native
    def countWords(pattern: String, flags: String): ExplicitChain[Double] = js.native
    def countWords(pattern: Unit, flags: String): ExplicitChain[Double] = js.native
    def countWords(pattern: RegExp): ExplicitChain[Double] = js.native
    def countWords(pattern: RegExp, flags: String): ExplicitChain[Double] = js.native
    
    def decapitalize(): ExplicitChain[String] = js.native
    
    // Query
    def endsWith(): ExplicitChain[Boolean] = js.native
    def endsWith(end: String): ExplicitChain[Boolean] = js.native
    def endsWith(end: String, position: Double): ExplicitChain[Boolean] = js.native
    def endsWith(end: Unit, position: Double): ExplicitChain[Boolean] = js.native
    
    // Escape
    def escapeHtml(): ExplicitChain[String] = js.native
    
    def escapeRegExp(): ExplicitChain[String] = js.native
    
    def first(): ExplicitChain[String] = js.native
    def first(length: Double): ExplicitChain[String] = js.native
    
    def graphemeAt(): ExplicitChain[String] = js.native
    def graphemeAt(position: Double): ExplicitChain[String] = js.native
    
    def graphemes(): ExplicitChain[js.Array[String]] = js.native
    
    def includes(): ExplicitChain[Boolean] = js.native
    def includes(search: String): ExplicitChain[Boolean] = js.native
    def includes(search: String, position: Double): ExplicitChain[Boolean] = js.native
    def includes(search: Unit, position: Double): ExplicitChain[Boolean] = js.native
    
    // Index
    def indexOf(): ExplicitChain[Double] = js.native
    def indexOf(search: String): ExplicitChain[Double] = js.native
    def indexOf(search: String, fromIndex: Double): ExplicitChain[Double] = js.native
    def indexOf(search: Unit, fromIndex: Double): ExplicitChain[Double] = js.native
    
    // Multipulate
    def insert(): ExplicitChain[String] = js.native
    def insert(toInsert: String): ExplicitChain[String] = js.native
    def insert(toInsert: String, position: Double): ExplicitChain[String] = js.native
    def insert(toInsert: Unit, position: Double): ExplicitChain[String] = js.native
    
    def isAlpha(): ExplicitChain[Boolean] = js.native
    
    def isAlphaDigit(): ExplicitChain[Boolean] = js.native
    
    def isBlank(): ExplicitChain[Boolean] = js.native
    
    def isDigit(): ExplicitChain[Boolean] = js.native
    
    def isEmpty(): ExplicitChain[Boolean] = js.native
    
    def isLowerCase(): ExplicitChain[Boolean] = js.native
    
    def isNumeric(): ExplicitChain[Boolean] = js.native
    
    def isString(): ExplicitChain[Boolean] = js.native
    
    def isUpperCase(): ExplicitChain[Boolean] = js.native
    
    def kebabCase(): ExplicitChain[String] = js.native
    
    def last(): ExplicitChain[String] = js.native
    def last(length: Double): ExplicitChain[String] = js.native
    
    def lastIndexOf(): ExplicitChain[Double] = js.native
    def lastIndexOf(search: String): ExplicitChain[Double] = js.native
    def lastIndexOf(search: String, fromIndex: Double): ExplicitChain[Double] = js.native
    def lastIndexOf(search: Unit, fromIndex: Double): ExplicitChain[Double] = js.native
    
    def latinise(): ExplicitChain[String] = js.native
    
    def lowerCase(): ExplicitChain[String] = js.native
    
    def matches(): ExplicitChain[Boolean] = js.native
    def matches(pattern: String): ExplicitChain[Boolean] = js.native
    def matches(pattern: String, flags: String): ExplicitChain[Boolean] = js.native
    def matches(pattern: Unit, flags: String): ExplicitChain[Boolean] = js.native
    def matches(pattern: RegExp): ExplicitChain[Boolean] = js.native
    def matches(pattern: RegExp, flags: String): ExplicitChain[Boolean] = js.native
    
    def pad(): ExplicitChain[String] = js.native
    def pad(length: Double): ExplicitChain[String] = js.native
    def pad(length: Double, pad: String): ExplicitChain[String] = js.native
    def pad(length: Unit, pad: String): ExplicitChain[String] = js.native
    
    def padLeft(): ExplicitChain[String] = js.native
    def padLeft(length: Double): ExplicitChain[String] = js.native
    def padLeft(length: Double, pad: String): ExplicitChain[String] = js.native
    def padLeft(length: Unit, pad: String): ExplicitChain[String] = js.native
    
    def padRight(): ExplicitChain[String] = js.native
    def padRight(length: Double): ExplicitChain[String] = js.native
    def padRight(length: Double, pad: String): ExplicitChain[String] = js.native
    def padRight(length: Unit, pad: String): ExplicitChain[String] = js.native
    
    def prune(): ExplicitChain[String] = js.native
    def prune(length: Double): ExplicitChain[String] = js.native
    def prune(length: Double, end: String): ExplicitChain[String] = js.native
    def prune(length: Unit, end: String): ExplicitChain[String] = js.native
    
    def repeat(): ExplicitChain[String] = js.native
    def repeat(times: Double): ExplicitChain[String] = js.native
    
    def replace(): ExplicitChain[String] = js.native
    def replace(pattern: String): ExplicitChain[String] = js.native
    def replace(pattern: String, replacement: String): ExplicitChain[String] = js.native
    def replace(pattern: String, replacement: ReplacementFunction): ExplicitChain[String] = js.native
    def replace(pattern: Unit, replacement: String): ExplicitChain[String] = js.native
    def replace(pattern: Unit, replacement: ReplacementFunction): ExplicitChain[String] = js.native
    def replace(pattern: RegExp): ExplicitChain[String] = js.native
    def replace(pattern: RegExp, replacement: String): ExplicitChain[String] = js.native
    def replace(pattern: RegExp, replacement: ReplacementFunction): ExplicitChain[String] = js.native
    
    def replaceAll(): ExplicitChain[String] = js.native
    def replaceAll(pattern: String): ExplicitChain[String] = js.native
    def replaceAll(pattern: String, replacement: String): ExplicitChain[String] = js.native
    def replaceAll(pattern: String, replacement: ReplacementFunction): ExplicitChain[String] = js.native
    def replaceAll(pattern: Unit, replacement: String): ExplicitChain[String] = js.native
    def replaceAll(pattern: Unit, replacement: ReplacementFunction): ExplicitChain[String] = js.native
    def replaceAll(pattern: RegExp): ExplicitChain[String] = js.native
    def replaceAll(pattern: RegExp, replacement: String): ExplicitChain[String] = js.native
    def replaceAll(pattern: RegExp, replacement: ReplacementFunction): ExplicitChain[String] = js.native
    
    def reverse(): ExplicitChain[String] = js.native
    
    def reverseGrapheme(): ExplicitChain[String] = js.native
    
    def search(): ExplicitChain[Double] = js.native
    def search(pattern: String): ExplicitChain[Double] = js.native
    def search(pattern: String, fromIndex: Double): ExplicitChain[Double] = js.native
    def search(pattern: Unit, fromIndex: Double): ExplicitChain[Double] = js.native
    def search(pattern: RegExp): ExplicitChain[Double] = js.native
    def search(pattern: RegExp, fromIndex: Double): ExplicitChain[Double] = js.native
    
    def slice(): ExplicitChain[String] = js.native
    def slice(start: Double): ExplicitChain[String] = js.native
    def slice(start: Double, end: Double): ExplicitChain[String] = js.native
    def slice(start: Unit, end: Double): ExplicitChain[String] = js.native
    
    def slugify(): ExplicitChain[String] = js.native
    
    def snakeCase(): ExplicitChain[String] = js.native
    
    def splice(): ExplicitChain[String] = js.native
    def splice(start: Double): ExplicitChain[String] = js.native
    def splice(start: Double, deleteCount: Double): ExplicitChain[String] = js.native
    def splice(start: Double, deleteCount: Double, toAdd: String): ExplicitChain[String] = js.native
    def splice(start: Double, deleteCount: Unit, toAdd: String): ExplicitChain[String] = js.native
    def splice(start: Unit, deleteCount: Double): ExplicitChain[String] = js.native
    def splice(start: Unit, deleteCount: Double, toAdd: String): ExplicitChain[String] = js.native
    def splice(start: Unit, deleteCount: Unit, toAdd: String): ExplicitChain[String] = js.native
    
    def split(): ExplicitChain[js.Array[String]] = js.native
    def split(separator: String): ExplicitChain[js.Array[String]] = js.native
    def split(separator: String, limit: Double): ExplicitChain[js.Array[String]] = js.native
    def split(separator: Unit, limit: Double): ExplicitChain[js.Array[String]] = js.native
    def split(separator: RegExp): ExplicitChain[js.Array[String]] = js.native
    def split(separator: RegExp, limit: Double): ExplicitChain[js.Array[String]] = js.native
    
    // Format
    def sprintf(replacements: js.Any*): ExplicitChain[String] = js.native
    
    def startsWith(): ExplicitChain[Boolean] = js.native
    def startsWith(start: String): ExplicitChain[Boolean] = js.native
    def startsWith(start: String, position: Double): ExplicitChain[Boolean] = js.native
    def startsWith(start: Unit, position: Double): ExplicitChain[Boolean] = js.native
    
    // Strip
    def stripBom(): ExplicitChain[String] = js.native
    
    def stripTags(): ExplicitChain[String] = js.native
    def stripTags(allowbleTags: String): ExplicitChain[String] = js.native
    def stripTags(allowbleTags: String, replacement: String): ExplicitChain[String] = js.native
    def stripTags(allowbleTags: js.Array[String]): ExplicitChain[String] = js.native
    def stripTags(allowbleTags: js.Array[String], replacement: String): ExplicitChain[String] = js.native
    def stripTags(allowbleTags: Unit, replacement: String): ExplicitChain[String] = js.native
    
    def substr(): ExplicitChain[String] = js.native
    def substr(start: Double): ExplicitChain[String] = js.native
    def substr(start: Double, length: Double): ExplicitChain[String] = js.native
    def substr(start: Unit, length: Double): ExplicitChain[String] = js.native
    
    def substring(): ExplicitChain[String] = js.native
    def substring(start: Double): ExplicitChain[String] = js.native
    def substring(start: Double, end: Double): ExplicitChain[String] = js.native
    def substring(start: Unit, end: Double): ExplicitChain[String] = js.native
    
    def swapCase(): ExplicitChain[String] = js.native
    
    def thru[U](changer: js.Function1[/* subjects */ T, U]): ExplicitChain[U] = js.native
    
    def titleCase(): ExplicitChain[String] = js.native
    def titleCase(ignoreWordsopt: js.Array[String]): ExplicitChain[String] = js.native
    
    def tr(): ExplicitChain[String] = js.native
    def tr(from: String): ExplicitChain[String] = js.native
    def tr(from: String, to: String): ExplicitChain[String] = js.native
    def tr(from: StringDictionary[String]): ExplicitChain[String] = js.native
    def tr(from: Unit, to: String): ExplicitChain[String] = js.native
    
    def trim(): ExplicitChain[String] = js.native
    def trim(whitespace: String): ExplicitChain[String] = js.native
    
    def trimLeft(): ExplicitChain[String] = js.native
    def trimLeft(whitespace: String): ExplicitChain[String] = js.native
    
    def trimRight(): ExplicitChain[String] = js.native
    def trimRight(whitespace: String): ExplicitChain[String] = js.native
    
    def truncate(): ExplicitChain[String] = js.native
    def truncate(length: Double): ExplicitChain[String] = js.native
    def truncate(length: Double, end: String): ExplicitChain[String] = js.native
    def truncate(length: Unit, end: String): ExplicitChain[String] = js.native
    
    def unescapeHtml(): ExplicitChain[String] = js.native
    
    def upperCase(): ExplicitChain[String] = js.native
    
    // Chain
    def value(): T = js.native
    
    def vprintf(replacements: js.Any*): ExplicitChain[String] = js.native
    
    def wordWrap(): ExplicitChain[String] = js.native
    def wordWrap(options: WordWrapOptions): ExplicitChain[String] = js.native
    
    def words(): ExplicitChain[js.Array[String]] = js.native
    def words(pattern: String): ExplicitChain[js.Array[String]] = js.native
    def words(pattern: String, flag: String): ExplicitChain[js.Array[String]] = js.native
    def words(pattern: Unit, flag: String): ExplicitChain[js.Array[String]] = js.native
    def words(pattern: RegExp): ExplicitChain[js.Array[String]] = js.native
    def words(pattern: RegExp, flag: String): ExplicitChain[js.Array[String]] = js.native
  }
  
  @js.native
  trait ReplacementFunction extends StObject {
    
    def apply(`match`: String, groups: String*): String = js.native
    def apply(`match`: Unit, groups: String*): String = js.native
  }
  
  @js.native
  trait VocaStatic extends StObject {
    
    // Chain
    def apply(subject: js.Any): Chain = js.native
    
    // Case
    def camelCase(): String = js.native
    def camelCase(subject: String): String = js.native
    
    def capitalize(): String = js.native
    def capitalize(subject: String): String = js.native
    def capitalize(subject: String, restToLower: Boolean): String = js.native
    def capitalize(subject: Unit, restToLower: Boolean): String = js.native
    
    def chain[T](subject: T): ExplicitChain[T] = js.native
    
    // Chop
    def charAt(): String = js.native
    def charAt(subject: String): String = js.native
    def charAt(subject: String, position: Double): String = js.native
    def charAt(subject: Unit, position: Double): String = js.native
    
    // Split
    def chars(): js.Array[String] = js.native
    def chars(subject: String): js.Array[String] = js.native
    
    def codePointAt(): String = js.native
    def codePointAt(subject: String): String = js.native
    def codePointAt(subject: String, position: Double): String = js.native
    def codePointAt(subject: Unit, position: Double): String = js.native
    
    def codePoints(): js.Array[Double] = js.native
    def codePoints(subject: String): js.Array[Double] = js.native
    
    // Count
    def count(): Double = js.native
    def count(subject: String): Double = js.native
    
    def countGraphemes(): Double = js.native
    def countGraphemes(subject: String): Double = js.native
    
    def countSubstrings(): Double = js.native
    def countSubstrings(subject: String): Double = js.native
    def countSubstrings(subject: String, substring: String): Double = js.native
    def countSubstrings(subject: Unit, substring: String): Double = js.native
    
    def countWhere(): Double = js.native
    def countWhere(subject: String): Double = js.native
    def countWhere(subject: String, predicate: Unit, context: js.Any): Double = js.native
    def countWhere(subject: String, predicate: CountPredicate): Double = js.native
    def countWhere(subject: String, predicate: CountPredicate, context: js.Any): Double = js.native
    def countWhere(subject: Unit, predicate: Unit, context: js.Any): Double = js.native
    def countWhere(subject: Unit, predicate: CountPredicate): Double = js.native
    def countWhere(subject: Unit, predicate: CountPredicate, context: js.Any): Double = js.native
    
    def countWords(): Double = js.native
    def countWords(subject: String): Double = js.native
    def countWords(subject: String, pattern: String): Double = js.native
    def countWords(subject: String, pattern: String, flags: String): Double = js.native
    def countWords(subject: String, pattern: Unit, flags: String): Double = js.native
    def countWords(subject: String, pattern: RegExp): Double = js.native
    def countWords(subject: String, pattern: RegExp, flags: String): Double = js.native
    def countWords(subject: Unit, pattern: String): Double = js.native
    def countWords(subject: Unit, pattern: String, flags: String): Double = js.native
    def countWords(subject: Unit, pattern: Unit, flags: String): Double = js.native
    def countWords(subject: Unit, pattern: RegExp): Double = js.native
    def countWords(subject: Unit, pattern: RegExp, flags: String): Double = js.native
    
    def decapitalize(): String = js.native
    def decapitalize(subject: String): String = js.native
    
    // Query
    def endsWith(): Boolean = js.native
    def endsWith(subject: String): Boolean = js.native
    def endsWith(subject: String, end: String): Boolean = js.native
    def endsWith(subject: String, end: String, position: Double): Boolean = js.native
    def endsWith(subject: String, end: Unit, position: Double): Boolean = js.native
    def endsWith(subject: Unit, end: String): Boolean = js.native
    def endsWith(subject: Unit, end: String, position: Double): Boolean = js.native
    def endsWith(subject: Unit, end: Unit, position: Double): Boolean = js.native
    
    // Escape
    def escapeHtml(): String = js.native
    def escapeHtml(subject: String): String = js.native
    
    def escapeRegExp(): String = js.native
    def escapeRegExp(subject: String): String = js.native
    
    def first(): String = js.native
    def first(subject: String): String = js.native
    def first(subject: String, length: Double): String = js.native
    def first(subject: Unit, length: Double): String = js.native
    
    def graphemeAt(): String = js.native
    def graphemeAt(subject: String): String = js.native
    def graphemeAt(subject: String, position: Double): String = js.native
    def graphemeAt(subject: Unit, position: Double): String = js.native
    
    def graphemes(): js.Array[String] = js.native
    def graphemes(subject: String): js.Array[String] = js.native
    
    def includes(): Boolean = js.native
    def includes(subject: String): Boolean = js.native
    def includes(subject: String, search: String): Boolean = js.native
    def includes(subject: String, search: String, position: Double): Boolean = js.native
    def includes(subject: String, search: Unit, position: Double): Boolean = js.native
    def includes(subject: Unit, search: String): Boolean = js.native
    def includes(subject: Unit, search: String, position: Double): Boolean = js.native
    def includes(subject: Unit, search: Unit, position: Double): Boolean = js.native
    
    // Index
    def indexOf(): Double = js.native
    def indexOf(subject: String): Double = js.native
    def indexOf(subject: String, search: String): Double = js.native
    def indexOf(subject: String, search: String, fromIndex: Double): Double = js.native
    def indexOf(subject: String, search: Unit, fromIndex: Double): Double = js.native
    def indexOf(subject: Unit, search: String): Double = js.native
    def indexOf(subject: Unit, search: String, fromIndex: Double): Double = js.native
    def indexOf(subject: Unit, search: Unit, fromIndex: Double): Double = js.native
    
    // Manipulate
    def insert(): String = js.native
    def insert(subject: String): String = js.native
    def insert(subject: String, toInsert: String): String = js.native
    def insert(subject: String, toInsert: String, position: Double): String = js.native
    def insert(subject: String, toInsert: Unit, position: Double): String = js.native
    def insert(subject: Unit, toInsert: String): String = js.native
    def insert(subject: Unit, toInsert: String, position: Double): String = js.native
    def insert(subject: Unit, toInsert: Unit, position: Double): String = js.native
    
    def isAlpha(): Boolean = js.native
    def isAlpha(subject: String): Boolean = js.native
    
    def isAlphaDigit(): Boolean = js.native
    def isAlphaDigit(subject: String): Boolean = js.native
    
    def isBlank(): Boolean = js.native
    def isBlank(subject: String): Boolean = js.native
    
    def isDigit(): Boolean = js.native
    def isDigit(subject: String): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    def isEmpty(subject: String): Boolean = js.native
    
    def isLowerCase(): Boolean = js.native
    def isLowerCase(subject: String): Boolean = js.native
    
    def isNumeric(): Boolean = js.native
    def isNumeric(subject: String): Boolean = js.native
    
    def isString(): Boolean = js.native
    def isString(subject: js.Any): Boolean = js.native
    
    def isUpperCase(): Boolean = js.native
    def isUpperCase(subject: String): Boolean = js.native
    
    def kebabCase(): String = js.native
    def kebabCase(subject: String): String = js.native
    
    def last(): String = js.native
    def last(subject: String): String = js.native
    def last(subject: String, length: Double): String = js.native
    def last(subject: Unit, length: Double): String = js.native
    
    def lastIndexOf(): Double = js.native
    def lastIndexOf(subject: String): Double = js.native
    def lastIndexOf(subject: String, search: String): Double = js.native
    def lastIndexOf(subject: String, search: String, fromIndex: Double): Double = js.native
    def lastIndexOf(subject: String, search: Unit, fromIndex: Double): Double = js.native
    def lastIndexOf(subject: Unit, search: String): Double = js.native
    def lastIndexOf(subject: Unit, search: String, fromIndex: Double): Double = js.native
    def lastIndexOf(subject: Unit, search: Unit, fromIndex: Double): Double = js.native
    
    def latinise(): String = js.native
    def latinise(subject: String): String = js.native
    
    def lowerCase(): String = js.native
    def lowerCase(subject: String): String = js.native
    
    def matches(): Boolean = js.native
    def matches(subject: String): Boolean = js.native
    def matches(subject: String, pattern: String): Boolean = js.native
    def matches(subject: String, pattern: String, flags: String): Boolean = js.native
    def matches(subject: String, pattern: Unit, flags: String): Boolean = js.native
    def matches(subject: String, pattern: RegExp): Boolean = js.native
    def matches(subject: String, pattern: RegExp, flags: String): Boolean = js.native
    def matches(subject: Unit, pattern: String): Boolean = js.native
    def matches(subject: Unit, pattern: String, flags: String): Boolean = js.native
    def matches(subject: Unit, pattern: Unit, flags: String): Boolean = js.native
    def matches(subject: Unit, pattern: RegExp): Boolean = js.native
    def matches(subject: Unit, pattern: RegExp, flags: String): Boolean = js.native
    
    // Util
    def noConflict(): VocaStatic = js.native
    
    def pad(): String = js.native
    def pad(subject: String): String = js.native
    def pad(subject: String, length: Double): String = js.native
    def pad(subject: String, length: Double, pad: String): String = js.native
    def pad(subject: String, length: Unit, pad: String): String = js.native
    def pad(subject: Unit, length: Double): String = js.native
    def pad(subject: Unit, length: Double, pad: String): String = js.native
    def pad(subject: Unit, length: Unit, pad: String): String = js.native
    
    def padLeft(): String = js.native
    def padLeft(subject: String): String = js.native
    def padLeft(subject: String, length: Double): String = js.native
    def padLeft(subject: String, length: Double, pad: String): String = js.native
    def padLeft(subject: String, length: Unit, pad: String): String = js.native
    def padLeft(subject: Unit, length: Double): String = js.native
    def padLeft(subject: Unit, length: Double, pad: String): String = js.native
    def padLeft(subject: Unit, length: Unit, pad: String): String = js.native
    
    def padRight(): String = js.native
    def padRight(subject: String): String = js.native
    def padRight(subject: String, length: Double): String = js.native
    def padRight(subject: String, length: Double, pad: String): String = js.native
    def padRight(subject: String, length: Unit, pad: String): String = js.native
    def padRight(subject: Unit, length: Double): String = js.native
    def padRight(subject: Unit, length: Double, pad: String): String = js.native
    def padRight(subject: Unit, length: Unit, pad: String): String = js.native
    
    def prune(): String = js.native
    def prune(subject: String): String = js.native
    def prune(subject: String, length: Double): String = js.native
    def prune(subject: String, length: Double, end: String): String = js.native
    def prune(subject: String, length: Unit, end: String): String = js.native
    def prune(subject: Unit, length: Double): String = js.native
    def prune(subject: Unit, length: Double, end: String): String = js.native
    def prune(subject: Unit, length: Unit, end: String): String = js.native
    
    def repeat(): String = js.native
    def repeat(subject: String): String = js.native
    def repeat(subject: String, times: Double): String = js.native
    def repeat(subject: Unit, times: Double): String = js.native
    
    def replace(): String = js.native
    def replace(subject: String): String = js.native
    def replace(subject: String, pattern: String): String = js.native
    def replace(subject: String, pattern: String, replacement: String): String = js.native
    def replace(subject: String, pattern: String, replacement: ReplacementFunction): String = js.native
    def replace(subject: String, pattern: Unit, replacement: String): String = js.native
    def replace(subject: String, pattern: Unit, replacement: ReplacementFunction): String = js.native
    def replace(subject: String, pattern: RegExp): String = js.native
    def replace(subject: String, pattern: RegExp, replacement: String): String = js.native
    def replace(subject: String, pattern: RegExp, replacement: ReplacementFunction): String = js.native
    def replace(subject: Unit, pattern: String): String = js.native
    def replace(subject: Unit, pattern: String, replacement: String): String = js.native
    def replace(subject: Unit, pattern: String, replacement: ReplacementFunction): String = js.native
    def replace(subject: Unit, pattern: Unit, replacement: String): String = js.native
    def replace(subject: Unit, pattern: Unit, replacement: ReplacementFunction): String = js.native
    def replace(subject: Unit, pattern: RegExp): String = js.native
    def replace(subject: Unit, pattern: RegExp, replacement: String): String = js.native
    def replace(subject: Unit, pattern: RegExp, replacement: ReplacementFunction): String = js.native
    
    def replaceAll(): String = js.native
    def replaceAll(subject: String): String = js.native
    def replaceAll(subject: String, pattern: String): String = js.native
    def replaceAll(subject: String, pattern: String, replacement: String): String = js.native
    def replaceAll(subject: String, pattern: String, replacement: ReplacementFunction): String = js.native
    def replaceAll(subject: String, pattern: Unit, replacement: String): String = js.native
    def replaceAll(subject: String, pattern: Unit, replacement: ReplacementFunction): String = js.native
    def replaceAll(subject: String, pattern: RegExp): String = js.native
    def replaceAll(subject: String, pattern: RegExp, replacement: String): String = js.native
    def replaceAll(subject: String, pattern: RegExp, replacement: ReplacementFunction): String = js.native
    def replaceAll(subject: Unit, pattern: String): String = js.native
    def replaceAll(subject: Unit, pattern: String, replacement: String): String = js.native
    def replaceAll(subject: Unit, pattern: String, replacement: ReplacementFunction): String = js.native
    def replaceAll(subject: Unit, pattern: Unit, replacement: String): String = js.native
    def replaceAll(subject: Unit, pattern: Unit, replacement: ReplacementFunction): String = js.native
    def replaceAll(subject: Unit, pattern: RegExp): String = js.native
    def replaceAll(subject: Unit, pattern: RegExp, replacement: String): String = js.native
    def replaceAll(subject: Unit, pattern: RegExp, replacement: ReplacementFunction): String = js.native
    
    def reverse(): String = js.native
    def reverse(subject: String): String = js.native
    
    def reverseGrapheme(): String = js.native
    def reverseGrapheme(subject: String): String = js.native
    
    def search(): Double = js.native
    def search(subject: String): Double = js.native
    def search(subject: String, pattern: String): Double = js.native
    def search(subject: String, pattern: String, fromIndex: Double): Double = js.native
    def search(subject: String, pattern: Unit, fromIndex: Double): Double = js.native
    def search(subject: String, pattern: RegExp): Double = js.native
    def search(subject: String, pattern: RegExp, fromIndex: Double): Double = js.native
    def search(subject: Unit, pattern: String): Double = js.native
    def search(subject: Unit, pattern: String, fromIndex: Double): Double = js.native
    def search(subject: Unit, pattern: Unit, fromIndex: Double): Double = js.native
    def search(subject: Unit, pattern: RegExp): Double = js.native
    def search(subject: Unit, pattern: RegExp, fromIndex: Double): Double = js.native
    
    def slice(): String = js.native
    def slice(subject: String): String = js.native
    def slice(subject: String, start: Double): String = js.native
    def slice(subject: String, start: Double, end: Double): String = js.native
    def slice(subject: String, start: Unit, end: Double): String = js.native
    def slice(subject: Unit, start: Double): String = js.native
    def slice(subject: Unit, start: Double, end: Double): String = js.native
    def slice(subject: Unit, start: Unit, end: Double): String = js.native
    
    def slugify(): String = js.native
    def slugify(subject: String): String = js.native
    
    def snakeCase(): String = js.native
    def snakeCase(subject: String): String = js.native
    
    def splice(): String = js.native
    def splice(subject: String): String = js.native
    def splice(subject: String, start: Double): String = js.native
    def splice(subject: String, start: Double, deleteCount: Double): String = js.native
    def splice(subject: String, start: Double, deleteCount: Double, toAdd: String): String = js.native
    def splice(subject: String, start: Double, deleteCount: Unit, toAdd: String): String = js.native
    def splice(subject: String, start: Unit, deleteCount: Double): String = js.native
    def splice(subject: String, start: Unit, deleteCount: Double, toAdd: String): String = js.native
    def splice(subject: String, start: Unit, deleteCount: Unit, toAdd: String): String = js.native
    def splice(subject: Unit, start: Double): String = js.native
    def splice(subject: Unit, start: Double, deleteCount: Double): String = js.native
    def splice(subject: Unit, start: Double, deleteCount: Double, toAdd: String): String = js.native
    def splice(subject: Unit, start: Double, deleteCount: Unit, toAdd: String): String = js.native
    def splice(subject: Unit, start: Unit, deleteCount: Double): String = js.native
    def splice(subject: Unit, start: Unit, deleteCount: Double, toAdd: String): String = js.native
    def splice(subject: Unit, start: Unit, deleteCount: Unit, toAdd: String): String = js.native
    
    def split(): js.Array[String] = js.native
    def split(subject: String): js.Array[String] = js.native
    def split(subject: String, separator: String): js.Array[String] = js.native
    def split(subject: String, separator: String, limit: Double): js.Array[String] = js.native
    def split(subject: String, separator: Unit, limit: Double): js.Array[String] = js.native
    def split(subject: String, separator: RegExp): js.Array[String] = js.native
    def split(subject: String, separator: RegExp, limit: Double): js.Array[String] = js.native
    def split(subject: Unit, separator: String): js.Array[String] = js.native
    def split(subject: Unit, separator: String, limit: Double): js.Array[String] = js.native
    def split(subject: Unit, separator: Unit, limit: Double): js.Array[String] = js.native
    def split(subject: Unit, separator: RegExp): js.Array[String] = js.native
    def split(subject: Unit, separator: RegExp, limit: Double): js.Array[String] = js.native
    
    // Format
    def sprintf(format: String, replacements: js.Any*): String = js.native
    def sprintf(format: Unit, replacements: js.Any*): String = js.native
    
    def startsWith(): Boolean = js.native
    def startsWith(subject: String): Boolean = js.native
    def startsWith(subject: String, start: String): Boolean = js.native
    def startsWith(subject: String, start: String, position: Double): Boolean = js.native
    def startsWith(subject: String, start: Unit, position: Double): Boolean = js.native
    def startsWith(subject: Unit, start: String): Boolean = js.native
    def startsWith(subject: Unit, start: String, position: Double): Boolean = js.native
    def startsWith(subject: Unit, start: Unit, position: Double): Boolean = js.native
    
    // Strip
    def stripBom(): String = js.native
    def stripBom(subject: String): String = js.native
    
    def stripTags(): String = js.native
    def stripTags(subject: String): String = js.native
    def stripTags(subject: String, allowbleTags: String): String = js.native
    def stripTags(subject: String, allowbleTags: String, replacement: String): String = js.native
    def stripTags(subject: String, allowbleTags: js.Array[String]): String = js.native
    def stripTags(subject: String, allowbleTags: js.Array[String], replacement: String): String = js.native
    def stripTags(subject: String, allowbleTags: Unit, replacement: String): String = js.native
    def stripTags(subject: Unit, allowbleTags: String): String = js.native
    def stripTags(subject: Unit, allowbleTags: String, replacement: String): String = js.native
    def stripTags(subject: Unit, allowbleTags: js.Array[String]): String = js.native
    def stripTags(subject: Unit, allowbleTags: js.Array[String], replacement: String): String = js.native
    def stripTags(subject: Unit, allowbleTags: Unit, replacement: String): String = js.native
    
    def substr(): String = js.native
    def substr(subject: String): String = js.native
    def substr(subject: String, start: Double): String = js.native
    def substr(subject: String, start: Double, length: Double): String = js.native
    def substr(subject: String, start: Unit, length: Double): String = js.native
    def substr(subject: Unit, start: Double): String = js.native
    def substr(subject: Unit, start: Double, length: Double): String = js.native
    def substr(subject: Unit, start: Unit, length: Double): String = js.native
    
    def substring(): String = js.native
    def substring(subject: String): String = js.native
    def substring(subject: String, start: Double): String = js.native
    def substring(subject: String, start: Double, end: Double): String = js.native
    def substring(subject: String, start: Unit, end: Double): String = js.native
    def substring(subject: Unit, start: Double): String = js.native
    def substring(subject: Unit, start: Double, end: Double): String = js.native
    def substring(subject: Unit, start: Unit, end: Double): String = js.native
    
    def swapCase(): String = js.native
    def swapCase(subject: String): String = js.native
    
    def titleCase(): String = js.native
    def titleCase(subject: String): String = js.native
    def titleCase(subject: String, ignoreWords: js.Array[String]): String = js.native
    def titleCase(subject: Unit, ignoreWords: js.Array[String]): String = js.native
    
    def tr(): String = js.native
    def tr(subject: String): String = js.native
    def tr(subject: String, from: String): String = js.native
    def tr(subject: String, from: String, to: String): String = js.native
    def tr(subject: String, from: StringDictionary[String]): String = js.native
    def tr(subject: String, from: Unit, to: String): String = js.native
    def tr(subject: Unit, from: String): String = js.native
    def tr(subject: Unit, from: String, to: String): String = js.native
    def tr(subject: Unit, from: StringDictionary[String]): String = js.native
    def tr(subject: Unit, from: Unit, to: String): String = js.native
    
    def trim(): String = js.native
    def trim(subject: String): String = js.native
    def trim(subject: String, whitespace: String): String = js.native
    def trim(subject: Unit, whitespace: String): String = js.native
    
    def trimLeft(): String = js.native
    def trimLeft(subject: String): String = js.native
    def trimLeft(subject: String, whitespace: String): String = js.native
    def trimLeft(subject: Unit, whitespace: String): String = js.native
    
    def trimRight(): String = js.native
    def trimRight(subject: String): String = js.native
    def trimRight(subject: String, whitespace: String): String = js.native
    def trimRight(subject: Unit, whitespace: String): String = js.native
    
    def truncate(): String = js.native
    def truncate(subject: String): String = js.native
    def truncate(subject: String, length: Double): String = js.native
    def truncate(subject: String, length: Double, end: String): String = js.native
    def truncate(subject: String, length: Unit, end: String): String = js.native
    def truncate(subject: Unit, length: Double): String = js.native
    def truncate(subject: Unit, length: Double, end: String): String = js.native
    def truncate(subject: Unit, length: Unit, end: String): String = js.native
    
    def unescapeHtml(): String = js.native
    def unescapeHtml(subject: String): String = js.native
    
    def upperCase(): String = js.native
    def upperCase(subject: String): String = js.native
    
    var version: String = js.native
    
    def vprintf(format: String, replacements: js.Any*): String = js.native
    def vprintf(format: Unit, replacements: js.Any*): String = js.native
    
    def wordWrap(): String = js.native
    def wordWrap(subject: String): String = js.native
    def wordWrap(subject: String, options: WordWrapOptions): String = js.native
    def wordWrap(subject: Unit, options: WordWrapOptions): String = js.native
    
    def words(): js.Array[String] = js.native
    def words(subject: String): js.Array[String] = js.native
    def words(subject: String, pattern: String): js.Array[String] = js.native
    def words(subject: String, pattern: String, flag: String): js.Array[String] = js.native
    def words(subject: String, pattern: Unit, flag: String): js.Array[String] = js.native
    def words(subject: String, pattern: RegExp): js.Array[String] = js.native
    def words(subject: String, pattern: RegExp, flag: String): js.Array[String] = js.native
    def words(subject: Unit, pattern: String): js.Array[String] = js.native
    def words(subject: Unit, pattern: String, flag: String): js.Array[String] = js.native
    def words(subject: Unit, pattern: Unit, flag: String): js.Array[String] = js.native
    def words(subject: Unit, pattern: RegExp): js.Array[String] = js.native
    def words(subject: Unit, pattern: RegExp, flag: String): js.Array[String] = js.native
  }
  
  trait WordWrapOptions extends StObject {
    
    var cut: js.UndefOr[Boolean] = js.undefined
    
    var indent: js.UndefOr[String] = js.undefined
    
    var newLine: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object WordWrapOptions {
    
    @scala.inline
    def apply(): WordWrapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WordWrapOptions]
    }
    
    @scala.inline
    implicit class WordWrapOptionsMutableBuilder[Self <: WordWrapOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCut(value: Boolean): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCutUndefined: Self = StObject.set(x, "cut", js.undefined)
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setNewLine(value: String): Self = StObject.set(x, "newLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewLineUndefined: Self = StObject.set(x, "newLine", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type _To = VocaStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: VocaStatic = ^
}
