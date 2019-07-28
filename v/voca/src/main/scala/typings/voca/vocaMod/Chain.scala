package typings.voca.vocaMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chain extends js.Object {
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
  def countWhere(predicate: CountPredicate): Double = js.native
  def countWhere(predicate: CountPredicate, context: js.Any): Double = js.native
  def countWords(): Double = js.native
  def countWords(pattern: String): Double = js.native
  def countWords(pattern: String, flags: String): Double = js.native
  def countWords(pattern: RegExp): Double = js.native
  def countWords(pattern: RegExp, flags: String): Double = js.native
  def decapitalize(): Chain = js.native
  // Query
  def endsWith(): Boolean = js.native
  def endsWith(end: String): Boolean = js.native
  def endsWith(end: String, position: Double): Boolean = js.native
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
  // Index
  def indexOf(): Double = js.native
  def indexOf(search: String): Double = js.native
  def indexOf(search: String, fromIndex: Double): Double = js.native
  // Multipulate
  def insert(): Chain = js.native
  def insert(toInsert: String): Chain = js.native
  def insert(toInsert: String, position: Double): Chain = js.native
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
  def latinise(): Chain = js.native
  def lowerCase(): Chain = js.native
  def matches(): Boolean = js.native
  def matches(pattern: String): Boolean = js.native
  def matches(pattern: String, flags: String): Boolean = js.native
  def matches(pattern: RegExp): Boolean = js.native
  def matches(pattern: RegExp, flags: String): Boolean = js.native
  def pad(): Chain = js.native
  def pad(length: Double): Chain = js.native
  def pad(length: Double, pad: String): Chain = js.native
  def padLeft(): Chain = js.native
  def padLeft(length: Double): Chain = js.native
  def padLeft(length: Double, pad: String): Chain = js.native
  def padRight(): Chain = js.native
  def padRight(length: Double): Chain = js.native
  def padRight(length: Double, pad: String): Chain = js.native
  def prune(): Chain = js.native
  def prune(length: Double): Chain = js.native
  def prune(length: Double, end: String): Chain = js.native
  def repeat(): Chain = js.native
  def repeat(times: Double): Chain = js.native
  def replace(): Chain = js.native
  def replace(pattern: String): Chain = js.native
  def replace(pattern: String, replacement: String): Chain = js.native
  def replace(pattern: String, replacement: ReplacementFunction): Chain = js.native
  def replace(pattern: RegExp): Chain = js.native
  def replace(pattern: RegExp, replacement: String): Chain = js.native
  def replace(pattern: RegExp, replacement: ReplacementFunction): Chain = js.native
  def replaceAll(): Chain = js.native
  def replaceAll(pattern: String): Chain = js.native
  def replaceAll(pattern: String, replacement: String): Chain = js.native
  def replaceAll(pattern: String, replacement: ReplacementFunction): Chain = js.native
  def replaceAll(pattern: RegExp): Chain = js.native
  def replaceAll(pattern: RegExp, replacement: String): Chain = js.native
  def replaceAll(pattern: RegExp, replacement: ReplacementFunction): Chain = js.native
  def reverse(): Chain = js.native
  def reverseGrapheme(): Chain = js.native
  def search(): Double = js.native
  def search(pattern: String): Double = js.native
  def search(pattern: String, fromIndex: Double): Double = js.native
  def search(pattern: RegExp): Double = js.native
  def search(pattern: RegExp, fromIndex: Double): Double = js.native
  def slice(): Chain = js.native
  def slice(start: Double): Chain = js.native
  def slice(start: Double, end: Double): Chain = js.native
  def slugify(): Chain = js.native
  def snakeCase(): Chain = js.native
  def splice(): Chain = js.native
  def splice(start: Double): Chain = js.native
  def splice(start: Double, deleteCount: Double): Chain = js.native
  def splice(start: Double, deleteCount: Double, toAdd: String): Chain = js.native
  def split(): js.Array[String] = js.native
  def split(separator: String): js.Array[String] = js.native
  def split(separator: String, limit: Double): js.Array[String] = js.native
  def split(separator: RegExp): js.Array[String] = js.native
  def split(separator: RegExp, limit: Double): js.Array[String] = js.native
  // Format
  def sprintf(replacements: js.Any*): Chain = js.native
  def startsWith(): Boolean = js.native
  def startsWith(start: String): Boolean = js.native
  def startsWith(start: String, position: Double): Boolean = js.native
  // Strip
  def stripBom(): Chain = js.native
  def stripTags(): Chain = js.native
  def stripTags(allowbleTags: String): Chain = js.native
  def stripTags(allowbleTags: String, replacement: String): Chain = js.native
  def stripTags(allowbleTags: js.Array[String]): Chain = js.native
  def stripTags(allowbleTags: js.Array[String], replacement: String): Chain = js.native
  def substr(): Chain = js.native
  def substr(start: Double): Chain = js.native
  def substr(start: Double, length: Double): Chain = js.native
  def substring(): Chain = js.native
  def substring(start: Double): Chain = js.native
  def substring(start: Double, end: Double): Chain = js.native
  def swapCase(): Chain = js.native
  def titleCase(): Chain = js.native
  def titleCase(ignoreWordsopt: js.Array[String]): Chain = js.native
  def tr(): Chain = js.native
  def tr(from: String): Chain = js.native
  def tr(from: String, to: String): Chain = js.native
  def tr(from: StringDictionary[String]): Chain = js.native
  def trim(): Chain = js.native
  def trim(whitespace: String): Chain = js.native
  def trimLeft(): Chain = js.native
  def trimLeft(whitespace: String): Chain = js.native
  def trimRight(): Chain = js.native
  def trimRight(whitespace: String): Chain = js.native
  def truncate(): Chain = js.native
  def truncate(length: Double): Chain = js.native
  def truncate(length: Double, end: String): Chain = js.native
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
  def words(pattern: RegExp): js.Array[String] = js.native
  def words(pattern: RegExp, flag: String): js.Array[String] = js.native
}

