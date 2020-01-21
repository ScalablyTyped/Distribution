package typings.wordpressEscapeHtml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/escape-html", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def escapeAmpersand(value: String): String = js.native
  def escapeAttribute(value: String): String = js.native
  def escapeHTML(value: String): String = js.native
  def escapeLessThan(value: String): String = js.native
  def escapeQuotationMark(value: String): String = js.native
  def isValidAttributeName(name: String): Boolean = js.native
}

