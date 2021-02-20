package typings.strman

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("strman", "append")
  @js.native
  def append(value: String, appends: String*): String = js.native
  
  @JSImport("strman", "appendArray")
  @js.native
  def appendArray(value: String, appends: js.Array[String]): String = js.native
  
  @JSImport("strman", "at")
  @js.native
  def at(value: String, index: Double): String = js.native
  
  @JSImport("strman", "base64decode")
  @js.native
  def base64decode(value: String): String = js.native
  
  @JSImport("strman", "base64encode")
  @js.native
  def base64encode(value: String): String = js.native
  
  @JSImport("strman", "between")
  @js.native
  def between(value: String, start: String, end: String): js.Array[String] = js.native
  
  @JSImport("strman", "binDecode")
  @js.native
  def binDecode(value: String): String = js.native
  
  @JSImport("strman", "binEncode")
  @js.native
  def binEncode(value: String): String = js.native
  
  @JSImport("strman", "chars")
  @js.native
  def chars(value: String): js.Array[String] = js.native
  
  @JSImport("strman", "collapseWhitespace")
  @js.native
  def collapseWhitespace(value: String): String = js.native
  
  @JSImport("strman", "compare")
  @js.native
  def compare(stringA: String, stringB: String): Double = js.native
  
  @JSImport("strman", "contains")
  @js.native
  def contains(value: String, needle: String): Boolean = js.native
  @JSImport("strman", "contains")
  @js.native
  def contains(value: String, needle: String, caseSensitive: Boolean): Boolean = js.native
  
  @JSImport("strman", "containsAll")
  @js.native
  def containsAll(value: String, needle: js.Array[String]): Boolean = js.native
  @JSImport("strman", "containsAll")
  @js.native
  def containsAll(value: String, needle: js.Array[String], caseSensitive: Boolean): Boolean = js.native
  
  @JSImport("strman", "containsAny")
  @js.native
  def containsAny(value: String, needle: js.Array[String]): Boolean = js.native
  @JSImport("strman", "containsAny")
  @js.native
  def containsAny(value: String, needle: js.Array[String], caseSensitive: Boolean): Boolean = js.native
  
  @JSImport("strman", "countSubstr")
  @js.native
  def countSubstr(value: String, substr: String): Double = js.native
  @JSImport("strman", "countSubstr")
  @js.native
  def countSubstr(value: String, substr: String, caseSensitive: js.UndefOr[scala.Nothing], allowOverlapping: Boolean): Double = js.native
  @JSImport("strman", "countSubstr")
  @js.native
  def countSubstr(value: String, substr: String, caseSensitive: Boolean): Double = js.native
  @JSImport("strman", "countSubstr")
  @js.native
  def countSubstr(value: String, substr: String, caseSensitive: Boolean, allowOverlapping: Boolean): Double = js.native
  
  @JSImport("strman", "decDecode")
  @js.native
  def decDecode(value: String): String = js.native
  
  @JSImport("strman", "decEncode")
  @js.native
  def decEncode(value: String): String = js.native
  
  @JSImport("strman", "endsWith")
  @js.native
  def endsWith(value: String, search: String): Boolean = js.native
  @JSImport("strman", "endsWith")
  @js.native
  def endsWith(value: String, search: String, position: js.UndefOr[scala.Nothing], caseSensitive: Boolean): Boolean = js.native
  @JSImport("strman", "endsWith")
  @js.native
  def endsWith(value: String, search: String, position: Double): Boolean = js.native
  @JSImport("strman", "endsWith")
  @js.native
  def endsWith(value: String, search: String, position: Double, caseSensitive: Boolean): Boolean = js.native
  
  @JSImport("strman", "ensureLeft")
  @js.native
  def ensureLeft(value: String, substr: String): String = js.native
  @JSImport("strman", "ensureLeft")
  @js.native
  def ensureLeft(value: String, substr: String, caseSensitive: Boolean): String = js.native
  
  @JSImport("strman", "ensureRight")
  @js.native
  def ensureRight(value: String, substr: String): String = js.native
  @JSImport("strman", "ensureRight")
  @js.native
  def ensureRight(value: String, substr: String, caseSensitive: Boolean): String = js.native
  
  @JSImport("strman", "equal")
  @js.native
  def equal(stringA: String, stringB: String): Boolean = js.native
  
  @JSImport("strman", "first")
  @js.native
  def first(value: String, n: Double): String = js.native
  
  @JSImport("strman", "format")
  @js.native
  def format(value: String, params: String*): String = js.native
  
  @JSImport("strman", "hexDecode")
  @js.native
  def hexDecode(value: String): String = js.native
  
  @JSImport("strman", "hexEncode")
  @js.native
  def hexEncode(value: String): String = js.native
  
  @JSImport("strman", "htmlDecode")
  @js.native
  def htmlDecode(value: String): String = js.native
  
  @JSImport("strman", "htmlEncode")
  @js.native
  def htmlEncode(value: String): String = js.native
  
  @JSImport("strman", "inequal")
  @js.native
  def inequal(stringA: String, stringB: String): Boolean = js.native
  
  @JSImport("strman", "insert")
  @js.native
  def insert(value: String, substr: String, position: Double): String = js.native
  
  @JSImport("strman", "isLowerCase")
  @js.native
  def isLowerCase(value: String): Boolean = js.native
  
  @JSImport("strman", "isString")
  @js.native
  def isString(value: js.Any): Boolean = js.native
  
  @JSImport("strman", "isUpperCase")
  @js.native
  def isUpperCase(value: String): Boolean = js.native
  
  @JSImport("strman", "last")
  @js.native
  def last(value: String, n: Double): String = js.native
  
  @JSImport("strman", "lastIndexOf")
  @js.native
  def lastIndexOf(value: String, needle: String): String = js.native
  @JSImport("strman", "lastIndexOf")
  @js.native
  def lastIndexOf(value: String, needle: String, offset: js.UndefOr[scala.Nothing], caseSensitive: Boolean): String = js.native
  @JSImport("strman", "lastIndexOf")
  @js.native
  def lastIndexOf(value: String, needle: String, offset: Double): String = js.native
  @JSImport("strman", "lastIndexOf")
  @js.native
  def lastIndexOf(value: String, needle: String, offset: Double, caseSensitive: Boolean): String = js.native
  
  @JSImport("strman", "leftPad")
  @js.native
  def leftPad(value: String, length: Double): String = js.native
  @JSImport("strman", "leftPad")
  @js.native
  def leftPad(value: String, length: Double, char: String): String = js.native
  
  @JSImport("strman", "leftTrim")
  @js.native
  def leftTrim(value: String): String = js.native
  @JSImport("strman", "leftTrim")
  @js.native
  def leftTrim(value: String, char: String): String = js.native
  
  @JSImport("strman", "prepend")
  @js.native
  def prepend(value: String, prepends: String*): String = js.native
  
  @JSImport("strman", "prependArray")
  @js.native
  def prependArray(value: String, prepends: js.Array[String]): String = js.native
  
  @JSImport("strman", "removeEmptyStrings")
  @js.native
  def removeEmptyStrings(strings: js.Array[js.UndefOr[String | Null]]): js.Array[String] = js.native
  
  @JSImport("strman", "removeLeft")
  @js.native
  def removeLeft(value: String, prefix: String): String = js.native
  @JSImport("strman", "removeLeft")
  @js.native
  def removeLeft(value: String, prefix: String, caseSensitive: Boolean): String = js.native
  
  @JSImport("strman", "removeNonWords")
  @js.native
  def removeNonWords(value: String): String = js.native
  @JSImport("strman", "removeNonWords")
  @js.native
  def removeNonWords(value: String, replaced: String): String = js.native
  
  @JSImport("strman", "removeRight")
  @js.native
  def removeRight(value: String, suffix: String): String = js.native
  @JSImport("strman", "removeRight")
  @js.native
  def removeRight(value: String, suffix: String, caseSensitive: Boolean): String = js.native
  
  @JSImport("strman", "removeSpaces")
  @js.native
  def removeSpaces(value: String): String = js.native
  @JSImport("strman", "removeSpaces")
  @js.native
  def removeSpaces(value: String, replaced: String): String = js.native
  
  @JSImport("strman", "repeat")
  @js.native
  def repeat(string: String, multiplier: Double): String = js.native
  
  @JSImport("strman", "replace")
  @js.native
  def replace(value: String, search: String, newValue: String): String = js.native
  @JSImport("strman", "replace")
  @js.native
  def replace(
    value: String,
    search: String,
    newValue: String,
    caseSensitive: js.UndefOr[scala.Nothing],
    multiline: Boolean
  ): String = js.native
  @JSImport("strman", "replace")
  @js.native
  def replace(value: String, search: String, newValue: String, caseSensitive: Boolean): String = js.native
  @JSImport("strman", "replace")
  @js.native
  def replace(value: String, search: String, newValue: String, caseSensitive: Boolean, multiline: Boolean): String = js.native
  
  @JSImport("strman", "reverse")
  @js.native
  def reverse(value: String): String = js.native
  
  @JSImport("strman", "rightPad")
  @js.native
  def rightPad(value: String, length: Double): String = js.native
  @JSImport("strman", "rightPad")
  @js.native
  def rightPad(value: String, length: Double, char: String): String = js.native
  
  @JSImport("strman", "rightTrim")
  @js.native
  def rightTrim(value: String): String = js.native
  @JSImport("strman", "rightTrim")
  @js.native
  def rightTrim(value: String, char: String): String = js.native
  
  @JSImport("strman", "safeTruncate")
  @js.native
  def safeTruncate(value: String, length: Double): String = js.native
  @JSImport("strman", "safeTruncate")
  @js.native
  def safeTruncate(value: String, length: Double, append: String): String = js.native
  
  @JSImport("strman", "shuffle")
  @js.native
  def shuffle(value: String): String = js.native
  
  @JSImport("strman", "slice")
  @js.native
  def slice(value: String, beginSlice: Double, endSlice: Double): String = js.native
  
  @JSImport("strman", "slugify")
  @js.native
  def slugify(value: String): String = js.native
  
  @JSImport("strman", "split")
  @js.native
  def split(value: String, separator: String): js.Array[String] = js.native
  @JSImport("strman", "split")
  @js.native
  def split(value: String, separator: String, limit: Double): js.Array[String] = js.native
  
  @JSImport("strman", "startsWith")
  @js.native
  def startsWith(value: String, search: String): Boolean = js.native
  @JSImport("strman", "startsWith")
  @js.native
  def startsWith(value: String, search: String, position: js.UndefOr[scala.Nothing], caseSensitive: Boolean): Boolean = js.native
  @JSImport("strman", "startsWith")
  @js.native
  def startsWith(value: String, search: String, position: Double): Boolean = js.native
  @JSImport("strman", "startsWith")
  @js.native
  def startsWith(value: String, search: String, position: Double, caseSensitive: Boolean): Boolean = js.native
  
  @JSImport("strman", "substr")
  @js.native
  def substr(value: String, start: Double, length: Double): String = js.native
  
  @JSImport("strman", "surround")
  @js.native
  def surround(value: String, substr: String): String = js.native
  @JSImport("strman", "surround")
  @js.native
  def surround(value: String, substr: String, substrRight: String): String = js.native
  
  @JSImport("strman", "toCamelCase")
  @js.native
  def toCamelCase(value: String): String = js.native
  
  @JSImport("strman", "toDecamelize")
  @js.native
  def toDecamelize(value: String): String = js.native
  
  @JSImport("strman", "toKebabCase")
  @js.native
  def toKebabCase(value: String): String = js.native
  
  @JSImport("strman", "toLowerCase")
  @js.native
  def toLowerCase(value: String): String = js.native
  
  @JSImport("strman", "toSnakeCase")
  @js.native
  def toSnakeCase(value: String): String = js.native
  
  @JSImport("strman", "toStudlyCaps")
  @js.native
  def toStudlyCaps(value: String): String = js.native
  
  @JSImport("strman", "toUpperCase")
  @js.native
  def toUpperCase(value: String): String = js.native
  
  @JSImport("strman", "transliterate")
  @js.native
  def transliterate(value: String): String = js.native
  
  @JSImport("strman", "trim")
  @js.native
  def trim(value: String): String = js.native
  @JSImport("strman", "trim")
  @js.native
  def trim(value: String, char: String): String = js.native
  
  @JSImport("strman", "truncate")
  @js.native
  def truncate(value: String, length: Double): String = js.native
  @JSImport("strman", "truncate")
  @js.native
  def truncate(value: String, length: Double, append: String): String = js.native
  
  @JSImport("strman", "urlDecode")
  @js.native
  def urlDecode(value: String): String = js.native
  
  @JSImport("strman", "urlEncode")
  @js.native
  def urlEncode(value: String): String = js.native
}
