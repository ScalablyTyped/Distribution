package typings
package vocaLib.vocaMod.vNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chain extends js.Object {
  // Case
  def camelCase(): Chain = js.native
  def capitalize(): Chain = js.native
  def capitalize(restToLoweropt: scala.Boolean): Chain = js.native
  def chain(): ExplicitChain[java.lang.String] = js.native
  // Chop
  def charAt(): Chain = js.native
  def charAt(position: scala.Double): Chain = js.native
  // Split
  def chars(): js.Array[java.lang.String] = js.native
  def codePointAt(): Chain = js.native
  def codePointAt(position: scala.Double): Chain = js.native
  def codePoints(): js.Array[scala.Double] = js.native
  // Count
  def count(): scala.Double = js.native
  def countGraphemes(): scala.Double = js.native
  def countSubstrings(): scala.Double = js.native
  def countSubstrings(substring: java.lang.String): scala.Double = js.native
  def countWhere(): scala.Double = js.native
  def countWhere(predicate: CountPredicate): scala.Double = js.native
  def countWhere(predicate: CountPredicate, context: js.Any): scala.Double = js.native
  def countWords(): scala.Double = js.native
  def countWords(pattern: java.lang.String): scala.Double = js.native
  def countWords(pattern: java.lang.String, flags: java.lang.String): scala.Double = js.native
  def countWords(pattern: stdLib.RegExp): scala.Double = js.native
  def countWords(pattern: stdLib.RegExp, flags: java.lang.String): scala.Double = js.native
  def decapitalize(): Chain = js.native
  // Query
  def endsWith(): scala.Boolean = js.native
  def endsWith(end: java.lang.String): scala.Boolean = js.native
  def endsWith(end: java.lang.String, position: scala.Double): scala.Boolean = js.native
  // Escape
  def escapeHtml(): Chain = js.native
  def escapeRegExp(): Chain = js.native
  def first(): Chain = js.native
  def first(length: scala.Double): Chain = js.native
  def graphemeAt(): Chain = js.native
  def graphemeAt(position: scala.Double): Chain = js.native
  def graphemes(): js.Array[java.lang.String] = js.native
  def includes(): scala.Boolean = js.native
  def includes(search: java.lang.String): scala.Boolean = js.native
  def includes(search: java.lang.String, position: scala.Double): scala.Boolean = js.native
  // Index
  def indexOf(): scala.Double = js.native
  def indexOf(search: java.lang.String): scala.Double = js.native
  def indexOf(search: java.lang.String, fromIndex: scala.Double): scala.Double = js.native
  // Multipulate
  def insert(): Chain = js.native
  def insert(toInsert: java.lang.String): Chain = js.native
  def insert(toInsert: java.lang.String, position: scala.Double): Chain = js.native
  def isAlpha(): scala.Boolean = js.native
  def isAlphaDigit(): scala.Boolean = js.native
  def isBlank(): scala.Boolean = js.native
  def isDigit(): scala.Boolean = js.native
  def isEmpty(): scala.Boolean = js.native
  def isLowerCase(): scala.Boolean = js.native
  def isNumeric(): scala.Boolean = js.native
  def isString(): scala.Boolean = js.native
  def isUpperCase(): scala.Boolean = js.native
  def kebabCase(): Chain = js.native
  def last(): Chain = js.native
  def last(length: scala.Double): Chain = js.native
  def lastIndexOf(): scala.Double = js.native
  def lastIndexOf(search: java.lang.String): scala.Double = js.native
  def lastIndexOf(search: java.lang.String, fromIndex: scala.Double): scala.Double = js.native
  def latinise(): Chain = js.native
  def lowerCase(): Chain = js.native
  def matches(): scala.Boolean = js.native
  def matches(pattern: java.lang.String): scala.Boolean = js.native
  def matches(pattern: java.lang.String, flags: java.lang.String): scala.Boolean = js.native
  def matches(pattern: stdLib.RegExp): scala.Boolean = js.native
  def matches(pattern: stdLib.RegExp, flags: java.lang.String): scala.Boolean = js.native
  def pad(): Chain = js.native
  def pad(length: scala.Double): Chain = js.native
  def pad(length: scala.Double, pad: java.lang.String): Chain = js.native
  def padLeft(): Chain = js.native
  def padLeft(length: scala.Double): Chain = js.native
  def padLeft(length: scala.Double, pad: java.lang.String): Chain = js.native
  def padRight(): Chain = js.native
  def padRight(length: scala.Double): Chain = js.native
  def padRight(length: scala.Double, pad: java.lang.String): Chain = js.native
  def prune(): Chain = js.native
  def prune(length: scala.Double): Chain = js.native
  def prune(length: scala.Double, end: java.lang.String): Chain = js.native
  def repeat(): Chain = js.native
  def repeat(times: scala.Double): Chain = js.native
  def replace(): Chain = js.native
  def replace(pattern: java.lang.String): Chain = js.native
  def replace(pattern: java.lang.String, replacement: java.lang.String): Chain = js.native
  def replace(pattern: java.lang.String, replacement: ReplacementFunction): Chain = js.native
  def replace(pattern: stdLib.RegExp): Chain = js.native
  def replace(pattern: stdLib.RegExp, replacement: java.lang.String): Chain = js.native
  def replace(pattern: stdLib.RegExp, replacement: ReplacementFunction): Chain = js.native
  def replaceAll(): Chain = js.native
  def replaceAll(pattern: java.lang.String): Chain = js.native
  def replaceAll(pattern: java.lang.String, replacement: java.lang.String): Chain = js.native
  def replaceAll(pattern: java.lang.String, replacement: ReplacementFunction): Chain = js.native
  def replaceAll(pattern: stdLib.RegExp): Chain = js.native
  def replaceAll(pattern: stdLib.RegExp, replacement: java.lang.String): Chain = js.native
  def replaceAll(pattern: stdLib.RegExp, replacement: ReplacementFunction): Chain = js.native
  def reverse(): Chain = js.native
  def reverseGrapheme(): Chain = js.native
  def search(): scala.Double = js.native
  def search(pattern: java.lang.String): scala.Double = js.native
  def search(pattern: java.lang.String, fromIndex: scala.Double): scala.Double = js.native
  def search(pattern: stdLib.RegExp): scala.Double = js.native
  def search(pattern: stdLib.RegExp, fromIndex: scala.Double): scala.Double = js.native
  def slice(): Chain = js.native
  def slice(start: scala.Double): Chain = js.native
  def slice(start: scala.Double, end: scala.Double): Chain = js.native
  def slugify(): Chain = js.native
  def snakeCase(): Chain = js.native
  def splice(): Chain = js.native
  def splice(start: scala.Double): Chain = js.native
  def splice(start: scala.Double, deleteCount: scala.Double): Chain = js.native
  def splice(start: scala.Double, deleteCount: scala.Double, toAdd: java.lang.String): Chain = js.native
  def split(): js.Array[java.lang.String] = js.native
  def split(separator: java.lang.String): js.Array[java.lang.String] = js.native
  def split(separator: java.lang.String, limit: scala.Double): js.Array[java.lang.String] = js.native
  def split(separator: stdLib.RegExp): js.Array[java.lang.String] = js.native
  def split(separator: stdLib.RegExp, limit: scala.Double): js.Array[java.lang.String] = js.native
  // Format
  def sprintf(replacements: js.Any*): Chain = js.native
  def startsWith(): scala.Boolean = js.native
  def startsWith(start: java.lang.String): scala.Boolean = js.native
  def startsWith(start: java.lang.String, position: scala.Double): scala.Boolean = js.native
  // Strip
  def stripBom(): Chain = js.native
  def stripTags(): Chain = js.native
  def stripTags(allowbleTags: java.lang.String): Chain = js.native
  def stripTags(allowbleTags: java.lang.String, replacement: java.lang.String): Chain = js.native
  def stripTags(allowbleTags: js.Array[java.lang.String]): Chain = js.native
  def stripTags(allowbleTags: js.Array[java.lang.String], replacement: java.lang.String): Chain = js.native
  def substr(): Chain = js.native
  def substr(start: scala.Double): Chain = js.native
  def substr(start: scala.Double, length: scala.Double): Chain = js.native
  def substring(): Chain = js.native
  def substring(start: scala.Double): Chain = js.native
  def substring(start: scala.Double, end: scala.Double): Chain = js.native
  def swapCase(): Chain = js.native
  def titleCase(): Chain = js.native
  def titleCase(ignoreWordsopt: js.Array[java.lang.String]): Chain = js.native
  def tr(): Chain = js.native
  def tr(from: java.lang.String): Chain = js.native
  def tr(from: java.lang.String, to: java.lang.String): Chain = js.native
  def tr(from: org.scalablytyped.runtime.StringDictionary[java.lang.String]): Chain = js.native
  def trim(): Chain = js.native
  def trim(whitespace: java.lang.String): Chain = js.native
  def trimLeft(): Chain = js.native
  def trimLeft(whitespace: java.lang.String): Chain = js.native
  def trimRight(): Chain = js.native
  def trimRight(whitespace: java.lang.String): Chain = js.native
  def truncate(): Chain = js.native
  def truncate(length: scala.Double): Chain = js.native
  def truncate(length: scala.Double, end: java.lang.String): Chain = js.native
  def unescapeHtml(): Chain = js.native
  def upperCase(): Chain = js.native
  // Chain
  def value(): java.lang.String = js.native
  def vprintf(replacements: js.Any*): Chain = js.native
  def wordWrap(): Chain = js.native
  def wordWrap(options: WordWrapOptions): Chain = js.native
  def words(): js.Array[java.lang.String] = js.native
  def words(pattern: java.lang.String): js.Array[java.lang.String] = js.native
  def words(pattern: java.lang.String, flag: java.lang.String): js.Array[java.lang.String] = js.native
  def words(pattern: stdLib.RegExp): js.Array[java.lang.String] = js.native
  def words(pattern: stdLib.RegExp, flag: java.lang.String): js.Array[java.lang.String] = js.native
}

