package typings.xmlchars

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmlchars/xml/1.1/ed2", JSImport.Namespace)
@js.native
object ed2Mod extends js.Object {
  
  val CHAR: /* "\\u0001-\\uD7FF\\uE000-\\uFFFD\\uD800\\uDC00-\\uDBFF\\uDFFF" */ String = js.native
  
  val CHAR_RE: RegExp = js.native
  
  val NAME_CHAR: String = js.native
  
  val NAME_CHAR_RE: RegExp = js.native
  
  val NAME_RE: RegExp = js.native
  
  val NAME_START_CHAR: /* ":A-Z_a-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\uD800\\uDC00-\\uDB7F\\uDFFF" */ String = js.native
  
  val NAME_START_CHAR_RE: RegExp = js.native
  
  val NMTOKEN_RE: RegExp = js.native
  
  val RESTRICTED_CHAR: /* "\\u0001-\b\\u000B\f\\u000E-\\u001F-\\u0084\\u0086-\\u009F" */ String = js.native
  
  val RESTRICTED_CHAR_RE: RegExp = js.native
  
  val S: /* " \t\r\n" */ String = js.native
  
  val S_LIST: js.Array[Double] = js.native
  
  val S_RE: RegExp = js.native
  
  def isChar(c: Double): Boolean = js.native
  
  def isCharAndNotRestricted(c: Double): Boolean = js.native
  
  def isNameChar(c: Double): Boolean = js.native
  
  def isNameStartChar(c: Double): Boolean = js.native
  
  def isRestrictedChar(c: Double): Boolean = js.native
  
  def isS(c: Double): Boolean = js.native
}
