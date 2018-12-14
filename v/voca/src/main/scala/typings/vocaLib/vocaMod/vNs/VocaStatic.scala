package typings
package vocaLib.vocaMod.vNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VocaStatic extends js.Object {
  var version: java.lang.String = js.native
  // Chain
  def apply(subject: js.Any): Chain = js.native
  // Case
  def camelCase(): java.lang.String = js.native
  // Case
  def camelCase(subject: java.lang.String): java.lang.String = js.native
  def capitalize(): java.lang.String = js.native
  def capitalize(subject: java.lang.String): java.lang.String = js.native
  def capitalize(subject: java.lang.String, restToLower: scala.Boolean): java.lang.String = js.native
  def chain[T](subject: T): ExplicitChain[T] = js.native
  // Chop
  def charAt(): java.lang.String = js.native
  // Chop
  def charAt(subject: java.lang.String): java.lang.String = js.native
  // Chop
  def charAt(subject: java.lang.String, position: scala.Double): java.lang.String = js.native
  // Split
  def chars(): js.Array[java.lang.String] = js.native
  // Split
  def chars(subject: java.lang.String): js.Array[java.lang.String] = js.native
  def codePointAt(): java.lang.String = js.native
  def codePointAt(subject: java.lang.String): java.lang.String = js.native
  def codePointAt(subject: java.lang.String, position: scala.Double): java.lang.String = js.native
  def codePoints(): js.Array[scala.Double] = js.native
  def codePoints(subject: java.lang.String): js.Array[scala.Double] = js.native
  // Count
  def count(): scala.Double = js.native
  // Count
  def count(subject: java.lang.String): scala.Double = js.native
  def countGraphemes(): scala.Double = js.native
  def countGraphemes(subject: java.lang.String): scala.Double = js.native
  def countSubstrings(): scala.Double = js.native
  def countSubstrings(subject: java.lang.String): scala.Double = js.native
  def countSubstrings(subject: java.lang.String, substring: java.lang.String): scala.Double = js.native
  def countWhere(): scala.Double = js.native
  def countWhere(subject: java.lang.String): scala.Double = js.native
  def countWhere(subject: java.lang.String, predicate: CountPredicate): scala.Double = js.native
  def countWhere(subject: java.lang.String, predicate: CountPredicate, context: js.Any): scala.Double = js.native
  def countWords(): scala.Double = js.native
  def countWords(subject: java.lang.String): scala.Double = js.native
  def countWords(subject: java.lang.String, pattern: java.lang.String): scala.Double = js.native
  def countWords(subject: java.lang.String, pattern: java.lang.String, flags: java.lang.String): scala.Double = js.native
  def countWords(subject: java.lang.String, pattern: stdLib.RegExp): scala.Double = js.native
  def countWords(subject: java.lang.String, pattern: stdLib.RegExp, flags: java.lang.String): scala.Double = js.native
  def decapitalize(): java.lang.String = js.native
  def decapitalize(subject: java.lang.String): java.lang.String = js.native
  // Query
  def endsWith(): scala.Boolean = js.native
  // Query
  def endsWith(subject: java.lang.String): scala.Boolean = js.native
  // Query
  def endsWith(subject: java.lang.String, end: java.lang.String): scala.Boolean = js.native
  // Query
  def endsWith(subject: java.lang.String, end: java.lang.String, position: scala.Double): scala.Boolean = js.native
  // Escape
  def escapeHtml(): java.lang.String = js.native
  // Escape
  def escapeHtml(subject: java.lang.String): java.lang.String = js.native
  def escapeRegExp(): java.lang.String = js.native
  def escapeRegExp(subject: java.lang.String): java.lang.String = js.native
  def first(): java.lang.String = js.native
  def first(subject: java.lang.String): java.lang.String = js.native
  def first(subject: java.lang.String, length: scala.Double): java.lang.String = js.native
  def graphemeAt(): java.lang.String = js.native
  def graphemeAt(subject: java.lang.String): java.lang.String = js.native
  def graphemeAt(subject: java.lang.String, position: scala.Double): java.lang.String = js.native
  def graphemes(): js.Array[java.lang.String] = js.native
  def graphemes(subject: java.lang.String): js.Array[java.lang.String] = js.native
  def includes(): scala.Boolean = js.native
  def includes(subject: java.lang.String): scala.Boolean = js.native
  def includes(subject: java.lang.String, search: java.lang.String): scala.Boolean = js.native
  def includes(subject: java.lang.String, search: java.lang.String, position: scala.Double): scala.Boolean = js.native
  // Index
  def indexOf(): scala.Double = js.native
  // Index
  def indexOf(subject: java.lang.String): scala.Double = js.native
  // Index
  def indexOf(subject: java.lang.String, search: java.lang.String): scala.Double = js.native
  // Index
  def indexOf(subject: java.lang.String, search: java.lang.String, fromIndex: scala.Double): scala.Double = js.native
  // Manipulate
  def insert(): java.lang.String = js.native
  // Manipulate
  def insert(subject: java.lang.String): java.lang.String = js.native
  // Manipulate
  def insert(subject: java.lang.String, toInsert: java.lang.String): java.lang.String = js.native
  // Manipulate
  def insert(subject: java.lang.String, toInsert: java.lang.String, position: scala.Double): java.lang.String = js.native
  def isAlpha(): scala.Boolean = js.native
  def isAlpha(subject: java.lang.String): scala.Boolean = js.native
  def isAlphaDigit(): scala.Boolean = js.native
  def isAlphaDigit(subject: java.lang.String): scala.Boolean = js.native
  def isBlank(): scala.Boolean = js.native
  def isBlank(subject: java.lang.String): scala.Boolean = js.native
  def isDigit(): scala.Boolean = js.native
  def isDigit(subject: java.lang.String): scala.Boolean = js.native
  def isEmpty(): scala.Boolean = js.native
  def isEmpty(subject: java.lang.String): scala.Boolean = js.native
  def isLowerCase(): scala.Boolean = js.native
  def isLowerCase(subject: java.lang.String): scala.Boolean = js.native
  def isNumeric(): scala.Boolean = js.native
  def isNumeric(subject: java.lang.String): scala.Boolean = js.native
  def isString(): scala.Boolean = js.native
  def isString(subject: js.Any): scala.Boolean = js.native
  def isUpperCase(): scala.Boolean = js.native
  def isUpperCase(subject: java.lang.String): scala.Boolean = js.native
  def kebabCase(): java.lang.String = js.native
  def kebabCase(subject: java.lang.String): java.lang.String = js.native
  def last(): java.lang.String = js.native
  def last(subject: java.lang.String): java.lang.String = js.native
  def last(subject: java.lang.String, length: scala.Double): java.lang.String = js.native
  def lastIndexOf(): scala.Double = js.native
  def lastIndexOf(subject: java.lang.String): scala.Double = js.native
  def lastIndexOf(subject: java.lang.String, search: java.lang.String): scala.Double = js.native
  def lastIndexOf(subject: java.lang.String, search: java.lang.String, fromIndex: scala.Double): scala.Double = js.native
  def latinise(): java.lang.String = js.native
  def latinise(subject: java.lang.String): java.lang.String = js.native
  def lowerCase(): java.lang.String = js.native
  def lowerCase(subject: java.lang.String): java.lang.String = js.native
  def matches(): scala.Boolean = js.native
  def matches(subject: java.lang.String): scala.Boolean = js.native
  def matches(subject: java.lang.String, pattern: java.lang.String): scala.Boolean = js.native
  def matches(subject: java.lang.String, pattern: java.lang.String, flags: java.lang.String): scala.Boolean = js.native
  def matches(subject: java.lang.String, pattern: stdLib.RegExp): scala.Boolean = js.native
  def matches(subject: java.lang.String, pattern: stdLib.RegExp, flags: java.lang.String): scala.Boolean = js.native
  // Util
  def noConflict(): VocaStatic = js.native
  def pad(): java.lang.String = js.native
  def pad(subject: java.lang.String): java.lang.String = js.native
  def pad(subject: java.lang.String, length: scala.Double): java.lang.String = js.native
  def pad(subject: java.lang.String, length: scala.Double, pad: java.lang.String): java.lang.String = js.native
  def padLeft(): java.lang.String = js.native
  def padLeft(subject: java.lang.String): java.lang.String = js.native
  def padLeft(subject: java.lang.String, length: scala.Double): java.lang.String = js.native
  def padLeft(subject: java.lang.String, length: scala.Double, pad: java.lang.String): java.lang.String = js.native
  def padRight(): java.lang.String = js.native
  def padRight(subject: java.lang.String): java.lang.String = js.native
  def padRight(subject: java.lang.String, length: scala.Double): java.lang.String = js.native
  def padRight(subject: java.lang.String, length: scala.Double, pad: java.lang.String): java.lang.String = js.native
  def prune(): java.lang.String = js.native
  def prune(subject: java.lang.String): java.lang.String = js.native
  def prune(subject: java.lang.String, length: scala.Double): java.lang.String = js.native
  def prune(subject: java.lang.String, length: scala.Double, end: java.lang.String): java.lang.String = js.native
  def repeat(): java.lang.String = js.native
  def repeat(subject: java.lang.String): java.lang.String = js.native
  def repeat(subject: java.lang.String, times: scala.Double): java.lang.String = js.native
  def replace(): java.lang.String = js.native
  def replace(subject: java.lang.String): java.lang.String = js.native
  def replace(subject: java.lang.String, pattern: java.lang.String): java.lang.String = js.native
  def replace(subject: java.lang.String, pattern: java.lang.String, replacement: java.lang.String): java.lang.String = js.native
  def replace(subject: java.lang.String, pattern: java.lang.String, replacement: ReplacementFunction): java.lang.String = js.native
  def replace(subject: java.lang.String, pattern: stdLib.RegExp): java.lang.String = js.native
  def replace(subject: java.lang.String, pattern: stdLib.RegExp, replacement: java.lang.String): java.lang.String = js.native
  def replace(subject: java.lang.String, pattern: stdLib.RegExp, replacement: ReplacementFunction): java.lang.String = js.native
  def replaceAll(): java.lang.String = js.native
  def replaceAll(subject: java.lang.String): java.lang.String = js.native
  def replaceAll(subject: java.lang.String, pattern: java.lang.String): java.lang.String = js.native
  def replaceAll(subject: java.lang.String, pattern: java.lang.String, replacement: java.lang.String): java.lang.String = js.native
  def replaceAll(subject: java.lang.String, pattern: java.lang.String, replacement: ReplacementFunction): java.lang.String = js.native
  def replaceAll(subject: java.lang.String, pattern: stdLib.RegExp): java.lang.String = js.native
  def replaceAll(subject: java.lang.String, pattern: stdLib.RegExp, replacement: java.lang.String): java.lang.String = js.native
  def replaceAll(subject: java.lang.String, pattern: stdLib.RegExp, replacement: ReplacementFunction): java.lang.String = js.native
  def reverse(): java.lang.String = js.native
  def reverse(subject: java.lang.String): java.lang.String = js.native
  def reverseGrapheme(): java.lang.String = js.native
  def reverseGrapheme(subject: java.lang.String): java.lang.String = js.native
  def search(): scala.Double = js.native
  def search(subject: java.lang.String): scala.Double = js.native
  def search(subject: java.lang.String, pattern: java.lang.String): scala.Double = js.native
  def search(subject: java.lang.String, pattern: java.lang.String, fromIndex: scala.Double): scala.Double = js.native
  def search(subject: java.lang.String, pattern: stdLib.RegExp): scala.Double = js.native
  def search(subject: java.lang.String, pattern: stdLib.RegExp, fromIndex: scala.Double): scala.Double = js.native
  def slice(): java.lang.String = js.native
  def slice(subject: java.lang.String): java.lang.String = js.native
  def slice(subject: java.lang.String, start: scala.Double): java.lang.String = js.native
  def slice(subject: java.lang.String, start: scala.Double, end: scala.Double): java.lang.String = js.native
  def slugify(): java.lang.String = js.native
  def slugify(subject: java.lang.String): java.lang.String = js.native
  def snakeCase(): java.lang.String = js.native
  def snakeCase(subject: java.lang.String): java.lang.String = js.native
  def splice(): java.lang.String = js.native
  def splice(subject: java.lang.String): java.lang.String = js.native
  def splice(subject: java.lang.String, start: scala.Double): java.lang.String = js.native
  def splice(subject: java.lang.String, start: scala.Double, deleteCount: scala.Double): java.lang.String = js.native
  def splice(subject: java.lang.String, start: scala.Double, deleteCount: scala.Double, toAdd: java.lang.String): java.lang.String = js.native
  def split(): js.Array[java.lang.String] = js.native
  def split(subject: java.lang.String): js.Array[java.lang.String] = js.native
  def split(subject: java.lang.String, separator: java.lang.String): js.Array[java.lang.String] = js.native
  def split(subject: java.lang.String, separator: java.lang.String, limit: scala.Double): js.Array[java.lang.String] = js.native
  def split(subject: java.lang.String, separator: stdLib.RegExp): js.Array[java.lang.String] = js.native
  def split(subject: java.lang.String, separator: stdLib.RegExp, limit: scala.Double): js.Array[java.lang.String] = js.native
  // Format
  def sprintf(): java.lang.String = js.native
  // Format
  def sprintf(format: java.lang.String, replacements: js.Any*): java.lang.String = js.native
  def startsWith(): scala.Boolean = js.native
  def startsWith(subject: java.lang.String): scala.Boolean = js.native
  def startsWith(subject: java.lang.String, start: java.lang.String): scala.Boolean = js.native
  def startsWith(subject: java.lang.String, start: java.lang.String, position: scala.Double): scala.Boolean = js.native
  // Strip
  def stripBom(): java.lang.String = js.native
  // Strip
  def stripBom(subject: java.lang.String): java.lang.String = js.native
  def stripTags(): java.lang.String = js.native
  def stripTags(subject: java.lang.String): java.lang.String = js.native
  def stripTags(subject: java.lang.String, allowbleTags: java.lang.String): java.lang.String = js.native
  def stripTags(subject: java.lang.String, allowbleTags: java.lang.String, replacement: java.lang.String): java.lang.String = js.native
  def stripTags(subject: java.lang.String, allowbleTags: js.Array[java.lang.String]): java.lang.String = js.native
  def stripTags(subject: java.lang.String, allowbleTags: js.Array[java.lang.String], replacement: java.lang.String): java.lang.String = js.native
  def substr(): java.lang.String = js.native
  def substr(subject: java.lang.String): java.lang.String = js.native
  def substr(subject: java.lang.String, start: scala.Double): java.lang.String = js.native
  def substr(subject: java.lang.String, start: scala.Double, length: scala.Double): java.lang.String = js.native
  def substring(): java.lang.String = js.native
  def substring(subject: java.lang.String): java.lang.String = js.native
  def substring(subject: java.lang.String, start: scala.Double): java.lang.String = js.native
  def substring(subject: java.lang.String, start: scala.Double, end: scala.Double): java.lang.String = js.native
  def swapCase(): java.lang.String = js.native
  def swapCase(subject: java.lang.String): java.lang.String = js.native
  def titleCase(): java.lang.String = js.native
  def titleCase(subject: java.lang.String): java.lang.String = js.native
  def titleCase(subject: java.lang.String, ignoreWords: js.Array[java.lang.String]): java.lang.String = js.native
  def tr(): java.lang.String = js.native
  def tr(subject: java.lang.String): java.lang.String = js.native
  def tr(subject: java.lang.String, from: java.lang.String): java.lang.String = js.native
  def tr(subject: java.lang.String, from: java.lang.String, to: java.lang.String): java.lang.String = js.native
  def tr(subject: java.lang.String, from: org.scalablytyped.runtime.StringDictionary[java.lang.String]): java.lang.String = js.native
  def trim(): java.lang.String = js.native
  def trim(subject: java.lang.String): java.lang.String = js.native
  def trim(subject: java.lang.String, whitespace: java.lang.String): java.lang.String = js.native
  def trimLeft(): java.lang.String = js.native
  def trimLeft(subject: java.lang.String): java.lang.String = js.native
  def trimLeft(subject: java.lang.String, whitespace: java.lang.String): java.lang.String = js.native
  def trimRight(): java.lang.String = js.native
  def trimRight(subject: java.lang.String): java.lang.String = js.native
  def trimRight(subject: java.lang.String, whitespace: java.lang.String): java.lang.String = js.native
  def truncate(): java.lang.String = js.native
  def truncate(subject: java.lang.String): java.lang.String = js.native
  def truncate(subject: java.lang.String, length: scala.Double): java.lang.String = js.native
  def truncate(subject: java.lang.String, length: scala.Double, end: java.lang.String): java.lang.String = js.native
  def unescapeHtml(): java.lang.String = js.native
  def unescapeHtml(subject: java.lang.String): java.lang.String = js.native
  def upperCase(): java.lang.String = js.native
  def upperCase(subject: java.lang.String): java.lang.String = js.native
  def vprintf(): java.lang.String = js.native
  def vprintf(format: java.lang.String, replacements: js.Any*): java.lang.String = js.native
  def wordWrap(): java.lang.String = js.native
  def wordWrap(subject: java.lang.String): java.lang.String = js.native
  def wordWrap(subject: java.lang.String, options: WordWrapOptions): java.lang.String = js.native
  def words(): js.Array[java.lang.String] = js.native
  def words(subject: java.lang.String): js.Array[java.lang.String] = js.native
  def words(subject: java.lang.String, pattern: java.lang.String): js.Array[java.lang.String] = js.native
  def words(subject: java.lang.String, pattern: java.lang.String, flag: java.lang.String): js.Array[java.lang.String] = js.native
  def words(subject: java.lang.String, pattern: stdLib.RegExp): js.Array[java.lang.String] = js.native
  def words(subject: java.lang.String, pattern: stdLib.RegExp, flag: java.lang.String): js.Array[java.lang.String] = js.native
}

