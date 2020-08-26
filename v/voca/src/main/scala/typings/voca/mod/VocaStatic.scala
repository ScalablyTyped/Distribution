package typings.voca.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VocaStatic extends js.Object {
  var version: String = js.native
  // Chain
  def apply(subject: js.Any): Chain = js.native
  // Case
  def camelCase(): String = js.native
  def camelCase(subject: String): String = js.native
  def capitalize(): String = js.native
  def capitalize(subject: js.UndefOr[scala.Nothing], restToLower: Boolean): String = js.native
  def capitalize(subject: String): String = js.native
  def capitalize(subject: String, restToLower: Boolean): String = js.native
  def chain[T](subject: T): ExplicitChain[T] = js.native
  // Chop
  def charAt(): String = js.native
  def charAt(subject: js.UndefOr[scala.Nothing], position: Double): String = js.native
  def charAt(subject: String): String = js.native
  def charAt(subject: String, position: Double): String = js.native
  // Split
  def chars(): js.Array[String] = js.native
  def chars(subject: String): js.Array[String] = js.native
  def codePointAt(): String = js.native
  def codePointAt(subject: js.UndefOr[scala.Nothing], position: Double): String = js.native
  def codePointAt(subject: String): String = js.native
  def codePointAt(subject: String, position: Double): String = js.native
  def codePoints(): js.Array[Double] = js.native
  def codePoints(subject: String): js.Array[Double] = js.native
  // Count
  def count(): Double = js.native
  def count(subject: String): Double = js.native
  def countGraphemes(): Double = js.native
  def countGraphemes(subject: String): Double = js.native
  def countSubstrings(): Double = js.native
  def countSubstrings(subject: js.UndefOr[scala.Nothing], substring: String): Double = js.native
  def countSubstrings(subject: String): Double = js.native
  def countSubstrings(subject: String, substring: String): Double = js.native
  def countWhere(): Double = js.native
  def countWhere(subject: js.UndefOr[scala.Nothing], predicate: js.UndefOr[scala.Nothing], context: js.Any): Double = js.native
  def countWhere(subject: js.UndefOr[scala.Nothing], predicate: CountPredicate): Double = js.native
  def countWhere(subject: js.UndefOr[scala.Nothing], predicate: CountPredicate, context: js.Any): Double = js.native
  def countWhere(subject: String): Double = js.native
  def countWhere(subject: String, predicate: js.UndefOr[scala.Nothing], context: js.Any): Double = js.native
  def countWhere(subject: String, predicate: CountPredicate): Double = js.native
  def countWhere(subject: String, predicate: CountPredicate, context: js.Any): Double = js.native
  def countWords(): Double = js.native
  def countWords(subject: js.UndefOr[scala.Nothing], pattern: js.UndefOr[scala.Nothing], flags: String): Double = js.native
  def countWords(subject: js.UndefOr[scala.Nothing], pattern: String): Double = js.native
  def countWords(subject: js.UndefOr[scala.Nothing], pattern: String, flags: String): Double = js.native
  def countWords(subject: js.UndefOr[scala.Nothing], pattern: RegExp): Double = js.native
  def countWords(subject: js.UndefOr[scala.Nothing], pattern: RegExp, flags: String): Double = js.native
  def countWords(subject: String): Double = js.native
  def countWords(subject: String, pattern: js.UndefOr[scala.Nothing], flags: String): Double = js.native
  def countWords(subject: String, pattern: String): Double = js.native
  def countWords(subject: String, pattern: String, flags: String): Double = js.native
  def countWords(subject: String, pattern: RegExp): Double = js.native
  def countWords(subject: String, pattern: RegExp, flags: String): Double = js.native
  def decapitalize(): String = js.native
  def decapitalize(subject: String): String = js.native
  // Query
  def endsWith(): Boolean = js.native
  def endsWith(subject: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], position: Double): Boolean = js.native
  def endsWith(subject: js.UndefOr[scala.Nothing], end: String): Boolean = js.native
  def endsWith(subject: js.UndefOr[scala.Nothing], end: String, position: Double): Boolean = js.native
  def endsWith(subject: String): Boolean = js.native
  def endsWith(subject: String, end: js.UndefOr[scala.Nothing], position: Double): Boolean = js.native
  def endsWith(subject: String, end: String): Boolean = js.native
  def endsWith(subject: String, end: String, position: Double): Boolean = js.native
  // Escape
  def escapeHtml(): String = js.native
  def escapeHtml(subject: String): String = js.native
  def escapeRegExp(): String = js.native
  def escapeRegExp(subject: String): String = js.native
  def first(): String = js.native
  def first(subject: js.UndefOr[scala.Nothing], length: Double): String = js.native
  def first(subject: String): String = js.native
  def first(subject: String, length: Double): String = js.native
  def graphemeAt(): String = js.native
  def graphemeAt(subject: js.UndefOr[scala.Nothing], position: Double): String = js.native
  def graphemeAt(subject: String): String = js.native
  def graphemeAt(subject: String, position: Double): String = js.native
  def graphemes(): js.Array[String] = js.native
  def graphemes(subject: String): js.Array[String] = js.native
  def includes(): Boolean = js.native
  def includes(subject: js.UndefOr[scala.Nothing], search: js.UndefOr[scala.Nothing], position: Double): Boolean = js.native
  def includes(subject: js.UndefOr[scala.Nothing], search: String): Boolean = js.native
  def includes(subject: js.UndefOr[scala.Nothing], search: String, position: Double): Boolean = js.native
  def includes(subject: String): Boolean = js.native
  def includes(subject: String, search: js.UndefOr[scala.Nothing], position: Double): Boolean = js.native
  def includes(subject: String, search: String): Boolean = js.native
  def includes(subject: String, search: String, position: Double): Boolean = js.native
  // Index
  def indexOf(): Double = js.native
  def indexOf(subject: js.UndefOr[scala.Nothing], search: js.UndefOr[scala.Nothing], fromIndex: Double): Double = js.native
  def indexOf(subject: js.UndefOr[scala.Nothing], search: String): Double = js.native
  def indexOf(subject: js.UndefOr[scala.Nothing], search: String, fromIndex: Double): Double = js.native
  def indexOf(subject: String): Double = js.native
  def indexOf(subject: String, search: js.UndefOr[scala.Nothing], fromIndex: Double): Double = js.native
  def indexOf(subject: String, search: String): Double = js.native
  def indexOf(subject: String, search: String, fromIndex: Double): Double = js.native
  // Manipulate
  def insert(): String = js.native
  def insert(subject: js.UndefOr[scala.Nothing], toInsert: js.UndefOr[scala.Nothing], position: Double): String = js.native
  def insert(subject: js.UndefOr[scala.Nothing], toInsert: String): String = js.native
  def insert(subject: js.UndefOr[scala.Nothing], toInsert: String, position: Double): String = js.native
  def insert(subject: String): String = js.native
  def insert(subject: String, toInsert: js.UndefOr[scala.Nothing], position: Double): String = js.native
  def insert(subject: String, toInsert: String): String = js.native
  def insert(subject: String, toInsert: String, position: Double): String = js.native
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
  def last(subject: js.UndefOr[scala.Nothing], length: Double): String = js.native
  def last(subject: String): String = js.native
  def last(subject: String, length: Double): String = js.native
  def lastIndexOf(): Double = js.native
  def lastIndexOf(subject: js.UndefOr[scala.Nothing], search: js.UndefOr[scala.Nothing], fromIndex: Double): Double = js.native
  def lastIndexOf(subject: js.UndefOr[scala.Nothing], search: String): Double = js.native
  def lastIndexOf(subject: js.UndefOr[scala.Nothing], search: String, fromIndex: Double): Double = js.native
  def lastIndexOf(subject: String): Double = js.native
  def lastIndexOf(subject: String, search: js.UndefOr[scala.Nothing], fromIndex: Double): Double = js.native
  def lastIndexOf(subject: String, search: String): Double = js.native
  def lastIndexOf(subject: String, search: String, fromIndex: Double): Double = js.native
  def latinise(): String = js.native
  def latinise(subject: String): String = js.native
  def lowerCase(): String = js.native
  def lowerCase(subject: String): String = js.native
  def matches(): Boolean = js.native
  def matches(subject: js.UndefOr[scala.Nothing], pattern: js.UndefOr[scala.Nothing], flags: String): Boolean = js.native
  def matches(subject: js.UndefOr[scala.Nothing], pattern: String): Boolean = js.native
  def matches(subject: js.UndefOr[scala.Nothing], pattern: String, flags: String): Boolean = js.native
  def matches(subject: js.UndefOr[scala.Nothing], pattern: RegExp): Boolean = js.native
  def matches(subject: js.UndefOr[scala.Nothing], pattern: RegExp, flags: String): Boolean = js.native
  def matches(subject: String): Boolean = js.native
  def matches(subject: String, pattern: js.UndefOr[scala.Nothing], flags: String): Boolean = js.native
  def matches(subject: String, pattern: String): Boolean = js.native
  def matches(subject: String, pattern: String, flags: String): Boolean = js.native
  def matches(subject: String, pattern: RegExp): Boolean = js.native
  def matches(subject: String, pattern: RegExp, flags: String): Boolean = js.native
  // Util
  def noConflict(): VocaStatic = js.native
  def pad(): String = js.native
  def pad(subject: js.UndefOr[scala.Nothing], length: js.UndefOr[scala.Nothing], pad: String): String = js.native
  def pad(subject: js.UndefOr[scala.Nothing], length: Double): String = js.native
  def pad(subject: js.UndefOr[scala.Nothing], length: Double, pad: String): String = js.native
  def pad(subject: String): String = js.native
  def pad(subject: String, length: js.UndefOr[scala.Nothing], pad: String): String = js.native
  def pad(subject: String, length: Double): String = js.native
  def pad(subject: String, length: Double, pad: String): String = js.native
  def padLeft(): String = js.native
  def padLeft(subject: js.UndefOr[scala.Nothing], length: js.UndefOr[scala.Nothing], pad: String): String = js.native
  def padLeft(subject: js.UndefOr[scala.Nothing], length: Double): String = js.native
  def padLeft(subject: js.UndefOr[scala.Nothing], length: Double, pad: String): String = js.native
  def padLeft(subject: String): String = js.native
  def padLeft(subject: String, length: js.UndefOr[scala.Nothing], pad: String): String = js.native
  def padLeft(subject: String, length: Double): String = js.native
  def padLeft(subject: String, length: Double, pad: String): String = js.native
  def padRight(): String = js.native
  def padRight(subject: js.UndefOr[scala.Nothing], length: js.UndefOr[scala.Nothing], pad: String): String = js.native
  def padRight(subject: js.UndefOr[scala.Nothing], length: Double): String = js.native
  def padRight(subject: js.UndefOr[scala.Nothing], length: Double, pad: String): String = js.native
  def padRight(subject: String): String = js.native
  def padRight(subject: String, length: js.UndefOr[scala.Nothing], pad: String): String = js.native
  def padRight(subject: String, length: Double): String = js.native
  def padRight(subject: String, length: Double, pad: String): String = js.native
  def prune(): String = js.native
  def prune(subject: js.UndefOr[scala.Nothing], length: js.UndefOr[scala.Nothing], end: String): String = js.native
  def prune(subject: js.UndefOr[scala.Nothing], length: Double): String = js.native
  def prune(subject: js.UndefOr[scala.Nothing], length: Double, end: String): String = js.native
  def prune(subject: String): String = js.native
  def prune(subject: String, length: js.UndefOr[scala.Nothing], end: String): String = js.native
  def prune(subject: String, length: Double): String = js.native
  def prune(subject: String, length: Double, end: String): String = js.native
  def repeat(): String = js.native
  def repeat(subject: js.UndefOr[scala.Nothing], times: Double): String = js.native
  def repeat(subject: String): String = js.native
  def repeat(subject: String, times: Double): String = js.native
  def replace(): String = js.native
  def replace(subject: js.UndefOr[scala.Nothing], pattern: js.UndefOr[scala.Nothing], replacement: String): String = js.native
  def replace(
    subject: js.UndefOr[scala.Nothing],
    pattern: js.UndefOr[scala.Nothing],
    replacement: ReplacementFunction
  ): String = js.native
  def replace(subject: js.UndefOr[scala.Nothing], pattern: String): String = js.native
  def replace(subject: js.UndefOr[scala.Nothing], pattern: String, replacement: String): String = js.native
  def replace(subject: js.UndefOr[scala.Nothing], pattern: String, replacement: ReplacementFunction): String = js.native
  def replace(subject: js.UndefOr[scala.Nothing], pattern: RegExp): String = js.native
  def replace(subject: js.UndefOr[scala.Nothing], pattern: RegExp, replacement: String): String = js.native
  def replace(subject: js.UndefOr[scala.Nothing], pattern: RegExp, replacement: ReplacementFunction): String = js.native
  def replace(subject: String): String = js.native
  def replace(subject: String, pattern: js.UndefOr[scala.Nothing], replacement: String): String = js.native
  def replace(subject: String, pattern: js.UndefOr[scala.Nothing], replacement: ReplacementFunction): String = js.native
  def replace(subject: String, pattern: String): String = js.native
  def replace(subject: String, pattern: String, replacement: String): String = js.native
  def replace(subject: String, pattern: String, replacement: ReplacementFunction): String = js.native
  def replace(subject: String, pattern: RegExp): String = js.native
  def replace(subject: String, pattern: RegExp, replacement: String): String = js.native
  def replace(subject: String, pattern: RegExp, replacement: ReplacementFunction): String = js.native
  def replaceAll(): String = js.native
  def replaceAll(subject: js.UndefOr[scala.Nothing], pattern: js.UndefOr[scala.Nothing], replacement: String): String = js.native
  def replaceAll(
    subject: js.UndefOr[scala.Nothing],
    pattern: js.UndefOr[scala.Nothing],
    replacement: ReplacementFunction
  ): String = js.native
  def replaceAll(subject: js.UndefOr[scala.Nothing], pattern: String): String = js.native
  def replaceAll(subject: js.UndefOr[scala.Nothing], pattern: String, replacement: String): String = js.native
  def replaceAll(subject: js.UndefOr[scala.Nothing], pattern: String, replacement: ReplacementFunction): String = js.native
  def replaceAll(subject: js.UndefOr[scala.Nothing], pattern: RegExp): String = js.native
  def replaceAll(subject: js.UndefOr[scala.Nothing], pattern: RegExp, replacement: String): String = js.native
  def replaceAll(subject: js.UndefOr[scala.Nothing], pattern: RegExp, replacement: ReplacementFunction): String = js.native
  def replaceAll(subject: String): String = js.native
  def replaceAll(subject: String, pattern: js.UndefOr[scala.Nothing], replacement: String): String = js.native
  def replaceAll(subject: String, pattern: js.UndefOr[scala.Nothing], replacement: ReplacementFunction): String = js.native
  def replaceAll(subject: String, pattern: String): String = js.native
  def replaceAll(subject: String, pattern: String, replacement: String): String = js.native
  def replaceAll(subject: String, pattern: String, replacement: ReplacementFunction): String = js.native
  def replaceAll(subject: String, pattern: RegExp): String = js.native
  def replaceAll(subject: String, pattern: RegExp, replacement: String): String = js.native
  def replaceAll(subject: String, pattern: RegExp, replacement: ReplacementFunction): String = js.native
  def reverse(): String = js.native
  def reverse(subject: String): String = js.native
  def reverseGrapheme(): String = js.native
  def reverseGrapheme(subject: String): String = js.native
  def search(): Double = js.native
  def search(subject: js.UndefOr[scala.Nothing], pattern: js.UndefOr[scala.Nothing], fromIndex: Double): Double = js.native
  def search(subject: js.UndefOr[scala.Nothing], pattern: String): Double = js.native
  def search(subject: js.UndefOr[scala.Nothing], pattern: String, fromIndex: Double): Double = js.native
  def search(subject: js.UndefOr[scala.Nothing], pattern: RegExp): Double = js.native
  def search(subject: js.UndefOr[scala.Nothing], pattern: RegExp, fromIndex: Double): Double = js.native
  def search(subject: String): Double = js.native
  def search(subject: String, pattern: js.UndefOr[scala.Nothing], fromIndex: Double): Double = js.native
  def search(subject: String, pattern: String): Double = js.native
  def search(subject: String, pattern: String, fromIndex: Double): Double = js.native
  def search(subject: String, pattern: RegExp): Double = js.native
  def search(subject: String, pattern: RegExp, fromIndex: Double): Double = js.native
  def slice(): String = js.native
  def slice(subject: js.UndefOr[scala.Nothing], start: js.UndefOr[scala.Nothing], end: Double): String = js.native
  def slice(subject: js.UndefOr[scala.Nothing], start: Double): String = js.native
  def slice(subject: js.UndefOr[scala.Nothing], start: Double, end: Double): String = js.native
  def slice(subject: String): String = js.native
  def slice(subject: String, start: js.UndefOr[scala.Nothing], end: Double): String = js.native
  def slice(subject: String, start: Double): String = js.native
  def slice(subject: String, start: Double, end: Double): String = js.native
  def slugify(): String = js.native
  def slugify(subject: String): String = js.native
  def snakeCase(): String = js.native
  def snakeCase(subject: String): String = js.native
  def splice(): String = js.native
  def splice(
    subject: js.UndefOr[scala.Nothing],
    start: js.UndefOr[scala.Nothing],
    deleteCount: js.UndefOr[scala.Nothing],
    toAdd: String
  ): String = js.native
  def splice(subject: js.UndefOr[scala.Nothing], start: js.UndefOr[scala.Nothing], deleteCount: Double): String = js.native
  def splice(
    subject: js.UndefOr[scala.Nothing],
    start: js.UndefOr[scala.Nothing],
    deleteCount: Double,
    toAdd: String
  ): String = js.native
  def splice(subject: js.UndefOr[scala.Nothing], start: Double): String = js.native
  def splice(
    subject: js.UndefOr[scala.Nothing],
    start: Double,
    deleteCount: js.UndefOr[scala.Nothing],
    toAdd: String
  ): String = js.native
  def splice(subject: js.UndefOr[scala.Nothing], start: Double, deleteCount: Double): String = js.native
  def splice(subject: js.UndefOr[scala.Nothing], start: Double, deleteCount: Double, toAdd: String): String = js.native
  def splice(subject: String): String = js.native
  def splice(
    subject: String,
    start: js.UndefOr[scala.Nothing],
    deleteCount: js.UndefOr[scala.Nothing],
    toAdd: String
  ): String = js.native
  def splice(subject: String, start: js.UndefOr[scala.Nothing], deleteCount: Double): String = js.native
  def splice(subject: String, start: js.UndefOr[scala.Nothing], deleteCount: Double, toAdd: String): String = js.native
  def splice(subject: String, start: Double): String = js.native
  def splice(subject: String, start: Double, deleteCount: js.UndefOr[scala.Nothing], toAdd: String): String = js.native
  def splice(subject: String, start: Double, deleteCount: Double): String = js.native
  def splice(subject: String, start: Double, deleteCount: Double, toAdd: String): String = js.native
  def split(): js.Array[String] = js.native
  def split(subject: js.UndefOr[scala.Nothing], separator: js.UndefOr[scala.Nothing], limit: Double): js.Array[String] = js.native
  def split(subject: js.UndefOr[scala.Nothing], separator: String): js.Array[String] = js.native
  def split(subject: js.UndefOr[scala.Nothing], separator: String, limit: Double): js.Array[String] = js.native
  def split(subject: js.UndefOr[scala.Nothing], separator: RegExp): js.Array[String] = js.native
  def split(subject: js.UndefOr[scala.Nothing], separator: RegExp, limit: Double): js.Array[String] = js.native
  def split(subject: String): js.Array[String] = js.native
  def split(subject: String, separator: js.UndefOr[scala.Nothing], limit: Double): js.Array[String] = js.native
  def split(subject: String, separator: String): js.Array[String] = js.native
  def split(subject: String, separator: String, limit: Double): js.Array[String] = js.native
  def split(subject: String, separator: RegExp): js.Array[String] = js.native
  def split(subject: String, separator: RegExp, limit: Double): js.Array[String] = js.native
  def sprintf(format: js.UndefOr[scala.Nothing], replacements: js.Any*): String = js.native
  // Format
  def sprintf(format: String, replacements: js.Any*): String = js.native
  def startsWith(): Boolean = js.native
  def startsWith(subject: js.UndefOr[scala.Nothing], start: js.UndefOr[scala.Nothing], position: Double): Boolean = js.native
  def startsWith(subject: js.UndefOr[scala.Nothing], start: String): Boolean = js.native
  def startsWith(subject: js.UndefOr[scala.Nothing], start: String, position: Double): Boolean = js.native
  def startsWith(subject: String): Boolean = js.native
  def startsWith(subject: String, start: js.UndefOr[scala.Nothing], position: Double): Boolean = js.native
  def startsWith(subject: String, start: String): Boolean = js.native
  def startsWith(subject: String, start: String, position: Double): Boolean = js.native
  // Strip
  def stripBom(): String = js.native
  def stripBom(subject: String): String = js.native
  def stripTags(): String = js.native
  def stripTags(subject: js.UndefOr[scala.Nothing], allowbleTags: js.UndefOr[scala.Nothing], replacement: String): String = js.native
  def stripTags(subject: js.UndefOr[scala.Nothing], allowbleTags: String): String = js.native
  def stripTags(subject: js.UndefOr[scala.Nothing], allowbleTags: String, replacement: String): String = js.native
  def stripTags(subject: js.UndefOr[scala.Nothing], allowbleTags: js.Array[String]): String = js.native
  def stripTags(subject: js.UndefOr[scala.Nothing], allowbleTags: js.Array[String], replacement: String): String = js.native
  def stripTags(subject: String): String = js.native
  def stripTags(subject: String, allowbleTags: js.UndefOr[scala.Nothing], replacement: String): String = js.native
  def stripTags(subject: String, allowbleTags: String): String = js.native
  def stripTags(subject: String, allowbleTags: String, replacement: String): String = js.native
  def stripTags(subject: String, allowbleTags: js.Array[String]): String = js.native
  def stripTags(subject: String, allowbleTags: js.Array[String], replacement: String): String = js.native
  def substr(): String = js.native
  def substr(subject: js.UndefOr[scala.Nothing], start: js.UndefOr[scala.Nothing], length: Double): String = js.native
  def substr(subject: js.UndefOr[scala.Nothing], start: Double): String = js.native
  def substr(subject: js.UndefOr[scala.Nothing], start: Double, length: Double): String = js.native
  def substr(subject: String): String = js.native
  def substr(subject: String, start: js.UndefOr[scala.Nothing], length: Double): String = js.native
  def substr(subject: String, start: Double): String = js.native
  def substr(subject: String, start: Double, length: Double): String = js.native
  def substring(): String = js.native
  def substring(subject: js.UndefOr[scala.Nothing], start: js.UndefOr[scala.Nothing], end: Double): String = js.native
  def substring(subject: js.UndefOr[scala.Nothing], start: Double): String = js.native
  def substring(subject: js.UndefOr[scala.Nothing], start: Double, end: Double): String = js.native
  def substring(subject: String): String = js.native
  def substring(subject: String, start: js.UndefOr[scala.Nothing], end: Double): String = js.native
  def substring(subject: String, start: Double): String = js.native
  def substring(subject: String, start: Double, end: Double): String = js.native
  def swapCase(): String = js.native
  def swapCase(subject: String): String = js.native
  def titleCase(): String = js.native
  def titleCase(subject: js.UndefOr[scala.Nothing], ignoreWords: js.Array[String]): String = js.native
  def titleCase(subject: String): String = js.native
  def titleCase(subject: String, ignoreWords: js.Array[String]): String = js.native
  def tr(): String = js.native
  def tr(subject: js.UndefOr[scala.Nothing], from: js.UndefOr[scala.Nothing], to: String): String = js.native
  def tr(subject: js.UndefOr[scala.Nothing], from: String): String = js.native
  def tr(subject: js.UndefOr[scala.Nothing], from: String, to: String): String = js.native
  def tr(subject: js.UndefOr[scala.Nothing], from: StringDictionary[String]): String = js.native
  def tr(subject: String): String = js.native
  def tr(subject: String, from: js.UndefOr[scala.Nothing], to: String): String = js.native
  def tr(subject: String, from: String): String = js.native
  def tr(subject: String, from: String, to: String): String = js.native
  def tr(subject: String, from: StringDictionary[String]): String = js.native
  def trim(): String = js.native
  def trim(subject: js.UndefOr[scala.Nothing], whitespace: String): String = js.native
  def trim(subject: String): String = js.native
  def trim(subject: String, whitespace: String): String = js.native
  def trimLeft(): String = js.native
  def trimLeft(subject: js.UndefOr[scala.Nothing], whitespace: String): String = js.native
  def trimLeft(subject: String): String = js.native
  def trimLeft(subject: String, whitespace: String): String = js.native
  def trimRight(): String = js.native
  def trimRight(subject: js.UndefOr[scala.Nothing], whitespace: String): String = js.native
  def trimRight(subject: String): String = js.native
  def trimRight(subject: String, whitespace: String): String = js.native
  def truncate(): String = js.native
  def truncate(subject: js.UndefOr[scala.Nothing], length: js.UndefOr[scala.Nothing], end: String): String = js.native
  def truncate(subject: js.UndefOr[scala.Nothing], length: Double): String = js.native
  def truncate(subject: js.UndefOr[scala.Nothing], length: Double, end: String): String = js.native
  def truncate(subject: String): String = js.native
  def truncate(subject: String, length: js.UndefOr[scala.Nothing], end: String): String = js.native
  def truncate(subject: String, length: Double): String = js.native
  def truncate(subject: String, length: Double, end: String): String = js.native
  def unescapeHtml(): String = js.native
  def unescapeHtml(subject: String): String = js.native
  def upperCase(): String = js.native
  def upperCase(subject: String): String = js.native
  def vprintf(format: js.UndefOr[scala.Nothing], replacements: js.Any*): String = js.native
  def vprintf(format: String, replacements: js.Any*): String = js.native
  def wordWrap(): String = js.native
  def wordWrap(subject: js.UndefOr[scala.Nothing], options: WordWrapOptions): String = js.native
  def wordWrap(subject: String): String = js.native
  def wordWrap(subject: String, options: WordWrapOptions): String = js.native
  def words(): js.Array[String] = js.native
  def words(subject: js.UndefOr[scala.Nothing], pattern: js.UndefOr[scala.Nothing], flag: String): js.Array[String] = js.native
  def words(subject: js.UndefOr[scala.Nothing], pattern: String): js.Array[String] = js.native
  def words(subject: js.UndefOr[scala.Nothing], pattern: String, flag: String): js.Array[String] = js.native
  def words(subject: js.UndefOr[scala.Nothing], pattern: RegExp): js.Array[String] = js.native
  def words(subject: js.UndefOr[scala.Nothing], pattern: RegExp, flag: String): js.Array[String] = js.native
  def words(subject: String): js.Array[String] = js.native
  def words(subject: String, pattern: js.UndefOr[scala.Nothing], flag: String): js.Array[String] = js.native
  def words(subject: String, pattern: String): js.Array[String] = js.native
  def words(subject: String, pattern: String, flag: String): js.Array[String] = js.native
  def words(subject: String, pattern: RegExp): js.Array[String] = js.native
  def words(subject: String, pattern: RegExp, flag: String): js.Array[String] = js.native
}

