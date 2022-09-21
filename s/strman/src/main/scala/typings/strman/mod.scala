package typings.strman

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("strman", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def append(value: String, appends: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("append")(List(value.asInstanceOf[js.Any]).`++`(appends.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def appendArray(value: String, appends: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("appendArray")(value.asInstanceOf[js.Any], appends.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def at(value: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("at")(value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def base64decode(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64decode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def base64encode(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64encode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def between(value: String, start: String, end: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def binDecode(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("binDecode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def binEncode(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("binEncode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def chars(value: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("chars")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def collapseWhitespace(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("collapseWhitespace")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def compare(stringA: String, stringB: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(stringA.asInstanceOf[js.Any], stringB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def contains(value: String, needle: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(value.asInstanceOf[js.Any], needle.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def contains(value: String, needle: String, caseSensitive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(value.asInstanceOf[js.Any], needle.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def containsAll(value: String, needle: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsAll")(value.asInstanceOf[js.Any], needle.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def containsAll(value: String, needle: js.Array[String], caseSensitive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsAll")(value.asInstanceOf[js.Any], needle.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def containsAny(value: String, needle: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsAny")(value.asInstanceOf[js.Any], needle.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def containsAny(value: String, needle: js.Array[String], caseSensitive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsAny")(value.asInstanceOf[js.Any], needle.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def countSubstr(value: String, substr: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("countSubstr")(value.asInstanceOf[js.Any], substr.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def countSubstr(value: String, substr: String, caseSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("countSubstr")(value.asInstanceOf[js.Any], substr.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def countSubstr(value: String, substr: String, caseSensitive: Boolean, allowOverlapping: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("countSubstr")(value.asInstanceOf[js.Any], substr.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any], allowOverlapping.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def countSubstr(value: String, substr: String, caseSensitive: Unit, allowOverlapping: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("countSubstr")(value.asInstanceOf[js.Any], substr.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any], allowOverlapping.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def decDecode(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decDecode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decEncode(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decEncode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def endsWith(value: String, search: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(value.asInstanceOf[js.Any], search.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def endsWith(value: String, search: String, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(value.asInstanceOf[js.Any], search.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def endsWith(value: String, search: String, position: Double, caseSensitive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(value.asInstanceOf[js.Any], search.asInstanceOf[js.Any], position.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def endsWith(value: String, search: String, position: Unit, caseSensitive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(value.asInstanceOf[js.Any], search.asInstanceOf[js.Any], position.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def ensureLeft(value: String, substr: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureLeft")(value.asInstanceOf[js.Any], substr.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def ensureLeft(value: String, substr: String, caseSensitive: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureLeft")(value.asInstanceOf[js.Any], substr.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def ensureRight(value: String, substr: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureRight")(value.asInstanceOf[js.Any], substr.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def ensureRight(value: String, substr: String, caseSensitive: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureRight")(value.asInstanceOf[js.Any], substr.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def equal(stringA: String, stringB: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(stringA.asInstanceOf[js.Any], stringB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def first(value: String, n: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(value.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def format(value: String, params: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(List(value.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def hexDecode(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexDecode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hexEncode(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexEncode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def htmlDecode(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlDecode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def htmlEncode(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlEncode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def inequal(stringA: String, stringB: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inequal")(stringA.asInstanceOf[js.Any], stringB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def insert(value: String, substr: String, position: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(value.asInstanceOf[js.Any], substr.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isLowerCase(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLowerCase")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUpperCase(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUpperCase")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def last(value: String, n: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(value.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def lastIndexOf(value: String, needle: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(value.asInstanceOf[js.Any], needle.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def lastIndexOf(value: String, needle: String, offset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(value.asInstanceOf[js.Any], needle.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def lastIndexOf(value: String, needle: String, offset: Double, caseSensitive: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(value.asInstanceOf[js.Any], needle.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def lastIndexOf(value: String, needle: String, offset: Unit, caseSensitive: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(value.asInstanceOf[js.Any], needle.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def leftPad(value: String, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def leftPad(value: String, length: Double, char: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any], char.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def leftTrim(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("leftTrim")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def leftTrim(value: String, char: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftTrim")(value.asInstanceOf[js.Any], char.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def prepend(value: String, prepends: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prepend")(List(value.asInstanceOf[js.Any]).`++`(prepends.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def prependArray(value: String, prepends: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prependArray")(value.asInstanceOf[js.Any], prepends.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def removeEmptyStrings(strings: js.Array[js.UndefOr[String | Null]]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEmptyStrings")(strings.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def removeLeft(value: String, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeLeft")(value.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def removeLeft(value: String, prefix: String, caseSensitive: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeLeft")(value.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def removeNonWords(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeNonWords")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def removeNonWords(value: String, replaced: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeNonWords")(value.asInstanceOf[js.Any], replaced.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def removeRight(value: String, suffix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeRight")(value.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def removeRight(value: String, suffix: String, caseSensitive: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeRight")(value.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def removeSpaces(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSpaces")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def removeSpaces(value: String, replaced: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeSpaces")(value.asInstanceOf[js.Any], replaced.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def repeat(string: String, multiplier: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(string.asInstanceOf[js.Any], multiplier.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def replace(value: String, search: String, newValue: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(value.asInstanceOf[js.Any], search.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def replace(value: String, search: String, newValue: String, caseSensitive: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(value.asInstanceOf[js.Any], search.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def replace(value: String, search: String, newValue: String, caseSensitive: Boolean, multiline: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(value.asInstanceOf[js.Any], search.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any], multiline.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def replace(value: String, search: String, newValue: String, caseSensitive: Unit, multiline: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(value.asInstanceOf[js.Any], search.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any], multiline.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def reverse(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def rightPad(value: String, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rightPad")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rightPad(value: String, length: Double, char: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rightPad")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any], char.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def rightTrim(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rightTrim")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def rightTrim(value: String, char: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rightTrim")(value.asInstanceOf[js.Any], char.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def safeTruncate(value: String, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("safeTruncate")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def safeTruncate(value: String, length: Double, append: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("safeTruncate")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def shuffle(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def slice(value: String, beginSlice: Double, endSlice: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(value.asInstanceOf[js.Any], beginSlice.asInstanceOf[js.Any], endSlice.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def slugify(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("slugify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def split(value: String, separator: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(value.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def split(value: String, separator: String, limit: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(value.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def startsWith(value: String, search: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(value.asInstanceOf[js.Any], search.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def startsWith(value: String, search: String, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(value.asInstanceOf[js.Any], search.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def startsWith(value: String, search: String, position: Double, caseSensitive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(value.asInstanceOf[js.Any], search.asInstanceOf[js.Any], position.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def startsWith(value: String, search: String, position: Unit, caseSensitive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(value.asInstanceOf[js.Any], search.asInstanceOf[js.Any], position.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def substr(value: String, start: Double, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substr")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def surround(value: String, substr: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("surround")(value.asInstanceOf[js.Any], substr.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def surround(value: String, substr: String, substrRight: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("surround")(value.asInstanceOf[js.Any], substr.asInstanceOf[js.Any], substrRight.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toCamelCase(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toCamelCase")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toDecamelize(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDecamelize")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toKebabCase(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toKebabCase")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toLowerCase(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLowerCase")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toSnakeCase(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toSnakeCase")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toStudlyCaps(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toStudlyCaps")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toUpperCase(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUpperCase")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def transliterate(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transliterate")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def trim(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def trim(value: String, char: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trim")(value.asInstanceOf[js.Any], char.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def truncate(value: String, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def truncate(value: String, length: Double, append: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def urlDecode(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlDecode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def urlEncode(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlEncode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}
