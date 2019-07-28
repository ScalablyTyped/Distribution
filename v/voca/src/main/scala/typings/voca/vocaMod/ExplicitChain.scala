package typings.voca.vocaMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExplicitChain[T] extends js.Object {
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
  def countWhere(predicate: CountPredicate): ExplicitChain[Double] = js.native
  def countWhere(predicate: CountPredicate, context: js.Any): ExplicitChain[Double] = js.native
  def countWords(): ExplicitChain[Double] = js.native
  def countWords(pattern: String): ExplicitChain[Double] = js.native
  def countWords(pattern: String, flags: String): ExplicitChain[Double] = js.native
  def countWords(pattern: RegExp): ExplicitChain[Double] = js.native
  def countWords(pattern: RegExp, flags: String): ExplicitChain[Double] = js.native
  def decapitalize(): ExplicitChain[String] = js.native
  // Query
  def endsWith(): ExplicitChain[Boolean] = js.native
  def endsWith(end: String): ExplicitChain[Boolean] = js.native
  def endsWith(end: String, position: Double): ExplicitChain[Boolean] = js.native
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
  // Index
  def indexOf(): ExplicitChain[Double] = js.native
  def indexOf(search: String): ExplicitChain[Double] = js.native
  def indexOf(search: String, fromIndex: Double): ExplicitChain[Double] = js.native
  // Multipulate
  def insert(): ExplicitChain[String] = js.native
  def insert(toInsert: String): ExplicitChain[String] = js.native
  def insert(toInsert: String, position: Double): ExplicitChain[String] = js.native
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
  def latinise(): ExplicitChain[String] = js.native
  def lowerCase(): ExplicitChain[String] = js.native
  def matches(): ExplicitChain[Boolean] = js.native
  def matches(pattern: String): ExplicitChain[Boolean] = js.native
  def matches(pattern: String, flags: String): ExplicitChain[Boolean] = js.native
  def matches(pattern: RegExp): ExplicitChain[Boolean] = js.native
  def matches(pattern: RegExp, flags: String): ExplicitChain[Boolean] = js.native
  def pad(): ExplicitChain[String] = js.native
  def pad(length: Double): ExplicitChain[String] = js.native
  def pad(length: Double, pad: String): ExplicitChain[String] = js.native
  def padLeft(): ExplicitChain[String] = js.native
  def padLeft(length: Double): ExplicitChain[String] = js.native
  def padLeft(length: Double, pad: String): ExplicitChain[String] = js.native
  def padRight(): ExplicitChain[String] = js.native
  def padRight(length: Double): ExplicitChain[String] = js.native
  def padRight(length: Double, pad: String): ExplicitChain[String] = js.native
  def prune(): ExplicitChain[String] = js.native
  def prune(length: Double): ExplicitChain[String] = js.native
  def prune(length: Double, end: String): ExplicitChain[String] = js.native
  def repeat(): ExplicitChain[String] = js.native
  def repeat(times: Double): ExplicitChain[String] = js.native
  def replace(): ExplicitChain[String] = js.native
  def replace(pattern: String): ExplicitChain[String] = js.native
  def replace(pattern: String, replacement: String): ExplicitChain[String] = js.native
  def replace(pattern: String, replacement: ReplacementFunction): ExplicitChain[String] = js.native
  def replace(pattern: RegExp): ExplicitChain[String] = js.native
  def replace(pattern: RegExp, replacement: String): ExplicitChain[String] = js.native
  def replace(pattern: RegExp, replacement: ReplacementFunction): ExplicitChain[String] = js.native
  def replaceAll(): ExplicitChain[String] = js.native
  def replaceAll(pattern: String): ExplicitChain[String] = js.native
  def replaceAll(pattern: String, replacement: String): ExplicitChain[String] = js.native
  def replaceAll(pattern: String, replacement: ReplacementFunction): ExplicitChain[String] = js.native
  def replaceAll(pattern: RegExp): ExplicitChain[String] = js.native
  def replaceAll(pattern: RegExp, replacement: String): ExplicitChain[String] = js.native
  def replaceAll(pattern: RegExp, replacement: ReplacementFunction): ExplicitChain[String] = js.native
  def reverse(): ExplicitChain[String] = js.native
  def reverseGrapheme(): ExplicitChain[String] = js.native
  def search(): ExplicitChain[Double] = js.native
  def search(pattern: String): ExplicitChain[Double] = js.native
  def search(pattern: String, fromIndex: Double): ExplicitChain[Double] = js.native
  def search(pattern: RegExp): ExplicitChain[Double] = js.native
  def search(pattern: RegExp, fromIndex: Double): ExplicitChain[Double] = js.native
  def slice(): ExplicitChain[String] = js.native
  def slice(start: Double): ExplicitChain[String] = js.native
  def slice(start: Double, end: Double): ExplicitChain[String] = js.native
  def slugify(): ExplicitChain[String] = js.native
  def snakeCase(): ExplicitChain[String] = js.native
  def splice(): ExplicitChain[String] = js.native
  def splice(start: Double): ExplicitChain[String] = js.native
  def splice(start: Double, deleteCount: Double): ExplicitChain[String] = js.native
  def splice(start: Double, deleteCount: Double, toAdd: String): ExplicitChain[String] = js.native
  def split(): ExplicitChain[js.Array[String]] = js.native
  def split(separator: String): ExplicitChain[js.Array[String]] = js.native
  def split(separator: String, limit: Double): ExplicitChain[js.Array[String]] = js.native
  def split(separator: RegExp): ExplicitChain[js.Array[String]] = js.native
  def split(separator: RegExp, limit: Double): ExplicitChain[js.Array[String]] = js.native
  // Format
  def sprintf(replacements: js.Any*): ExplicitChain[String] = js.native
  def startsWith(): ExplicitChain[Boolean] = js.native
  def startsWith(start: String): ExplicitChain[Boolean] = js.native
  def startsWith(start: String, position: Double): ExplicitChain[Boolean] = js.native
  // Strip
  def stripBom(): ExplicitChain[String] = js.native
  def stripTags(): ExplicitChain[String] = js.native
  def stripTags(allowbleTags: String): ExplicitChain[String] = js.native
  def stripTags(allowbleTags: String, replacement: String): ExplicitChain[String] = js.native
  def stripTags(allowbleTags: js.Array[String]): ExplicitChain[String] = js.native
  def stripTags(allowbleTags: js.Array[String], replacement: String): ExplicitChain[String] = js.native
  def substr(): ExplicitChain[String] = js.native
  def substr(start: Double): ExplicitChain[String] = js.native
  def substr(start: Double, length: Double): ExplicitChain[String] = js.native
  def substring(): ExplicitChain[String] = js.native
  def substring(start: Double): ExplicitChain[String] = js.native
  def substring(start: Double, end: Double): ExplicitChain[String] = js.native
  def swapCase(): ExplicitChain[String] = js.native
  def thru[U](changer: js.Function1[/* subjects */ T, U]): ExplicitChain[U] = js.native
  def titleCase(): ExplicitChain[String] = js.native
  def titleCase(ignoreWordsopt: js.Array[String]): ExplicitChain[String] = js.native
  def tr(): ExplicitChain[String] = js.native
  def tr(from: String): ExplicitChain[String] = js.native
  def tr(from: String, to: String): ExplicitChain[String] = js.native
  def tr(from: StringDictionary[String]): ExplicitChain[String] = js.native
  def trim(): ExplicitChain[String] = js.native
  def trim(whitespace: String): ExplicitChain[String] = js.native
  def trimLeft(): ExplicitChain[String] = js.native
  def trimLeft(whitespace: String): ExplicitChain[String] = js.native
  def trimRight(): ExplicitChain[String] = js.native
  def trimRight(whitespace: String): ExplicitChain[String] = js.native
  def truncate(): ExplicitChain[String] = js.native
  def truncate(length: Double): ExplicitChain[String] = js.native
  def truncate(length: Double, end: String): ExplicitChain[String] = js.native
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
  def words(pattern: RegExp): ExplicitChain[js.Array[String]] = js.native
  def words(pattern: RegExp, flag: String): ExplicitChain[js.Array[String]] = js.native
}

