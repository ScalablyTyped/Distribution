package typings
package vocaLib.vocaMod.vNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExplicitChain[T] extends js.Object {
  // Case
  def camelCase(): ExplicitChain[java.lang.String] = js.native
  def capitalize(): ExplicitChain[java.lang.String] = js.native
  def capitalize(restToLoweropt: scala.Boolean): ExplicitChain[java.lang.String] = js.native
  // Chop
  def charAt(): ExplicitChain[java.lang.String] = js.native
  // Chop
  def charAt(position: scala.Double): ExplicitChain[java.lang.String] = js.native
  // Split
  def chars(): ExplicitChain[js.Array[java.lang.String]] = js.native
  def codePointAt(): ExplicitChain[java.lang.String] = js.native
  def codePointAt(position: scala.Double): ExplicitChain[java.lang.String] = js.native
  def codePoints(): ExplicitChain[js.Array[scala.Double]] = js.native
  // Count
  def count(): ExplicitChain[scala.Double] = js.native
  def countGraphemes(): ExplicitChain[scala.Double] = js.native
  def countSubstrings(): ExplicitChain[scala.Double] = js.native
  def countSubstrings(substring: java.lang.String): ExplicitChain[scala.Double] = js.native
  def countWhere(): ExplicitChain[scala.Double] = js.native
  def countWhere(predicate: CountPredicate): ExplicitChain[scala.Double] = js.native
  def countWhere(predicate: CountPredicate, context: js.Any): ExplicitChain[scala.Double] = js.native
  def countWords(): ExplicitChain[scala.Double] = js.native
  def countWords(pattern: java.lang.String): ExplicitChain[scala.Double] = js.native
  def countWords(pattern: java.lang.String, flags: java.lang.String): ExplicitChain[scala.Double] = js.native
  def countWords(pattern: stdLib.RegExp): ExplicitChain[scala.Double] = js.native
  def countWords(pattern: stdLib.RegExp, flags: java.lang.String): ExplicitChain[scala.Double] = js.native
  def decapitalize(): ExplicitChain[java.lang.String] = js.native
  // Query
  def endsWith(): ExplicitChain[scala.Boolean] = js.native
  // Query
  def endsWith(end: java.lang.String): ExplicitChain[scala.Boolean] = js.native
  // Query
  def endsWith(end: java.lang.String, position: scala.Double): ExplicitChain[scala.Boolean] = js.native
  // Escape
  def escapeHtml(): ExplicitChain[java.lang.String] = js.native
  def escapeRegExp(): ExplicitChain[java.lang.String] = js.native
  def first(): ExplicitChain[java.lang.String] = js.native
  def first(length: scala.Double): ExplicitChain[java.lang.String] = js.native
  def graphemeAt(): ExplicitChain[java.lang.String] = js.native
  def graphemeAt(position: scala.Double): ExplicitChain[java.lang.String] = js.native
  def graphemes(): ExplicitChain[js.Array[java.lang.String]] = js.native
  def includes(): ExplicitChain[scala.Boolean] = js.native
  def includes(search: java.lang.String): ExplicitChain[scala.Boolean] = js.native
  def includes(search: java.lang.String, position: scala.Double): ExplicitChain[scala.Boolean] = js.native
  // Index
  def indexOf(): ExplicitChain[scala.Double] = js.native
  // Index
  def indexOf(search: java.lang.String): ExplicitChain[scala.Double] = js.native
  // Index
  def indexOf(search: java.lang.String, fromIndex: scala.Double): ExplicitChain[scala.Double] = js.native
  // Multipulate
  def insert(): ExplicitChain[java.lang.String] = js.native
  // Multipulate
  def insert(toInsert: java.lang.String): ExplicitChain[java.lang.String] = js.native
  // Multipulate
  def insert(toInsert: java.lang.String, position: scala.Double): ExplicitChain[java.lang.String] = js.native
  def isAlpha(): ExplicitChain[scala.Boolean] = js.native
  def isAlphaDigit(): ExplicitChain[scala.Boolean] = js.native
  def isBlank(): ExplicitChain[scala.Boolean] = js.native
  def isDigit(): ExplicitChain[scala.Boolean] = js.native
  def isEmpty(): ExplicitChain[scala.Boolean] = js.native
  def isLowerCase(): ExplicitChain[scala.Boolean] = js.native
  def isNumeric(): ExplicitChain[scala.Boolean] = js.native
  def isString(): ExplicitChain[scala.Boolean] = js.native
  def isUpperCase(): ExplicitChain[scala.Boolean] = js.native
  def kebabCase(): ExplicitChain[java.lang.String] = js.native
  def last(): ExplicitChain[java.lang.String] = js.native
  def last(length: scala.Double): ExplicitChain[java.lang.String] = js.native
  def lastIndexOf(): ExplicitChain[scala.Double] = js.native
  def lastIndexOf(search: java.lang.String): ExplicitChain[scala.Double] = js.native
  def lastIndexOf(search: java.lang.String, fromIndex: scala.Double): ExplicitChain[scala.Double] = js.native
  def latinise(): ExplicitChain[java.lang.String] = js.native
  def lowerCase(): ExplicitChain[java.lang.String] = js.native
  def matches(): ExplicitChain[scala.Boolean] = js.native
  def matches(pattern: java.lang.String): ExplicitChain[scala.Boolean] = js.native
  def matches(pattern: java.lang.String, flags: java.lang.String): ExplicitChain[scala.Boolean] = js.native
  def matches(pattern: stdLib.RegExp): ExplicitChain[scala.Boolean] = js.native
  def matches(pattern: stdLib.RegExp, flags: java.lang.String): ExplicitChain[scala.Boolean] = js.native
  def pad(): ExplicitChain[java.lang.String] = js.native
  def pad(length: scala.Double): ExplicitChain[java.lang.String] = js.native
  def pad(length: scala.Double, pad: java.lang.String): ExplicitChain[java.lang.String] = js.native
  def padLeft(): ExplicitChain[java.lang.String] = js.native
  def padLeft(length: scala.Double): ExplicitChain[java.lang.String] = js.native
  def padLeft(length: scala.Double, pad: java.lang.String): ExplicitChain[java.lang.String] = js.native
  def padRight(): ExplicitChain[java.lang.String] = js.native
  def padRight(length: scala.Double): ExplicitChain[java.lang.String] = js.native
  def padRight(length: scala.Double, pad: java.lang.String): ExplicitChain[java.lang.String] = js.native
  def prune(): ExplicitChain[java.lang.String] = js.native
  def prune(length: scala.Double): ExplicitChain[java.lang.String] = js.native
  def prune(length: scala.Double, end: java.lang.String): ExplicitChain[java.lang.String] = js.native
  def repeat(): ExplicitChain[java.lang.String] = js.native
  def repeat(times: scala.Double): ExplicitChain[java.lang.String] = js.native
  def replace(): ExplicitChain[java.lang.String] = js.native
  def replace(pattern: java.lang.String): ExplicitChain[java.lang.String] = js.native
  def replace(pattern: java.lang.String, replacement: java.lang.String): ExplicitChain[java.lang.String] = js.native
  def replace(pattern: java.lang.String, replacement: ReplacementFunction): ExplicitChain[java.lang.String] = js.native
  def replace(pattern: stdLib.RegExp): ExplicitChain[java.lang.String] = js.native
  def replace(pattern: stdLib.RegExp, replacement: java.lang.String): ExplicitChain[java.lang.String] = js.native
  def replace(pattern: stdLib.RegExp, replacement: ReplacementFunction): ExplicitChain[java.lang.String] = js.native
  def replaceAll(): ExplicitChain[java.lang.String] = js.native
  def replaceAll(pattern: java.lang.String): ExplicitChain[java.lang.String] = js.native
  def replaceAll(pattern: java.lang.String, replacement: java.lang.String): ExplicitChain[java.lang.String] = js.native
  def replaceAll(pattern: java.lang.String, replacement: ReplacementFunction): ExplicitChain[java.lang.String] = js.native
  def replaceAll(pattern: stdLib.RegExp): ExplicitChain[java.lang.String] = js.native
  def replaceAll(pattern: stdLib.RegExp, replacement: java.lang.String): ExplicitChain[java.lang.String] = js.native
  def replaceAll(pattern: stdLib.RegExp, replacement: ReplacementFunction): ExplicitChain[java.lang.String] = js.native
  def reverse(): ExplicitChain[java.lang.String] = js.native
  def reverseGrapheme(): ExplicitChain[java.lang.String] = js.native
  def search(): ExplicitChain[scala.Double] = js.native
  def search(pattern: java.lang.String): ExplicitChain[scala.Double] = js.native
  def search(pattern: java.lang.String, fromIndex: scala.Double): ExplicitChain[scala.Double] = js.native
  def search(pattern: stdLib.RegExp): ExplicitChain[scala.Double] = js.native
  def search(pattern: stdLib.RegExp, fromIndex: scala.Double): ExplicitChain[scala.Double] = js.native
  def slice(): ExplicitChain[java.lang.String] = js.native
  def slice(start: scala.Double): ExplicitChain[java.lang.String] = js.native
  def slice(start: scala.Double, end: scala.Double): ExplicitChain[java.lang.String] = js.native
  def slugify(): ExplicitChain[java.lang.String] = js.native
  def snakeCase(): ExplicitChain[java.lang.String] = js.native
  def splice(): ExplicitChain[java.lang.String] = js.native
  def splice(start: scala.Double): ExplicitChain[java.lang.String] = js.native
  def splice(start: scala.Double, deleteCount: scala.Double): ExplicitChain[java.lang.String] = js.native
  def splice(start: scala.Double, deleteCount: scala.Double, toAdd: java.lang.String): ExplicitChain[java.lang.String] = js.native
  def split(): ExplicitChain[js.Array[java.lang.String]] = js.native
  def split(separator: java.lang.String): ExplicitChain[js.Array[java.lang.String]] = js.native
  def split(separator: java.lang.String, limit: scala.Double): ExplicitChain[js.Array[java.lang.String]] = js.native
  def split(separator: stdLib.RegExp): ExplicitChain[js.Array[java.lang.String]] = js.native
  def split(separator: stdLib.RegExp, limit: scala.Double): ExplicitChain[js.Array[java.lang.String]] = js.native
  // Format
  def sprintf(replacements: js.Any*): ExplicitChain[java.lang.String] = js.native
  def startsWith(): ExplicitChain[scala.Boolean] = js.native
  def startsWith(start: java.lang.String): ExplicitChain[scala.Boolean] = js.native
  def startsWith(start: java.lang.String, position: scala.Double): ExplicitChain[scala.Boolean] = js.native
  // Strip
  def stripBom(): ExplicitChain[java.lang.String] = js.native
  def stripTags(): ExplicitChain[java.lang.String] = js.native
  def stripTags(allowbleTags: java.lang.String): ExplicitChain[java.lang.String] = js.native
  def stripTags(allowbleTags: java.lang.String, replacement: java.lang.String): ExplicitChain[java.lang.String] = js.native
  def stripTags(allowbleTags: js.Array[java.lang.String]): ExplicitChain[java.lang.String] = js.native
  def stripTags(allowbleTags: js.Array[java.lang.String], replacement: java.lang.String): ExplicitChain[java.lang.String] = js.native
  def substr(): ExplicitChain[java.lang.String] = js.native
  def substr(start: scala.Double): ExplicitChain[java.lang.String] = js.native
  def substr(start: scala.Double, length: scala.Double): ExplicitChain[java.lang.String] = js.native
  def substring(): ExplicitChain[java.lang.String] = js.native
  def substring(start: scala.Double): ExplicitChain[java.lang.String] = js.native
  def substring(start: scala.Double, end: scala.Double): ExplicitChain[java.lang.String] = js.native
  def swapCase(): ExplicitChain[java.lang.String] = js.native
  def thru[U](changer: js.Function1[/* subjects */ T, U]): ExplicitChain[U] = js.native
  def titleCase(): ExplicitChain[java.lang.String] = js.native
  def titleCase(ignoreWordsopt: js.Array[java.lang.String]): ExplicitChain[java.lang.String] = js.native
  def tr(): ExplicitChain[java.lang.String] = js.native
  def tr(from: java.lang.String): ExplicitChain[java.lang.String] = js.native
  def tr(from: java.lang.String, to: java.lang.String): ExplicitChain[java.lang.String] = js.native
  def tr(from: org.scalablytyped.runtime.StringDictionary[java.lang.String]): ExplicitChain[java.lang.String] = js.native
  def trim(): ExplicitChain[java.lang.String] = js.native
  def trim(whitespace: java.lang.String): ExplicitChain[java.lang.String] = js.native
  def trimLeft(): ExplicitChain[java.lang.String] = js.native
  def trimLeft(whitespace: java.lang.String): ExplicitChain[java.lang.String] = js.native
  def trimRight(): ExplicitChain[java.lang.String] = js.native
  def trimRight(whitespace: java.lang.String): ExplicitChain[java.lang.String] = js.native
  def truncate(): ExplicitChain[java.lang.String] = js.native
  def truncate(length: scala.Double): ExplicitChain[java.lang.String] = js.native
  def truncate(length: scala.Double, end: java.lang.String): ExplicitChain[java.lang.String] = js.native
  def unescapeHtml(): ExplicitChain[java.lang.String] = js.native
  def upperCase(): ExplicitChain[java.lang.String] = js.native
  // Chain
  def value(): T = js.native
  def vprintf(replacements: js.Any*): ExplicitChain[java.lang.String] = js.native
  def wordWrap(): ExplicitChain[java.lang.String] = js.native
  def wordWrap(options: WordWrapOptions): ExplicitChain[java.lang.String] = js.native
  def words(): ExplicitChain[js.Array[java.lang.String]] = js.native
  def words(pattern: java.lang.String): ExplicitChain[js.Array[java.lang.String]] = js.native
  def words(pattern: java.lang.String, flag: java.lang.String): ExplicitChain[js.Array[java.lang.String]] = js.native
  def words(pattern: stdLib.RegExp): ExplicitChain[js.Array[java.lang.String]] = js.native
  def words(pattern: stdLib.RegExp, flag: java.lang.String): ExplicitChain[js.Array[java.lang.String]] = js.native
}

