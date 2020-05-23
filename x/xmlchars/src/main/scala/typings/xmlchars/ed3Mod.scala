package typings.xmlchars

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlchars/xmlns/1.0/ed3", JSImport.Namespace)
@js.native
object ed3Mod extends js.Object {
  val NC_NAME_CHAR: String = js.native
  val NC_NAME_CHAR_RE: RegExp = js.native
  val NC_NAME_RE: RegExp = js.native
  val NC_NAME_START_CHAR: /* "A-Z_a-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\uD800\\uDC00-\\uDB7F\\uDFFF" */ String = js.native
  val NC_NAME_START_CHAR_RE: RegExp = js.native
  def isNCNameChar(c: Double): Boolean = js.native
  def isNCNameStartChar(c: Double): Boolean = js.native
}

