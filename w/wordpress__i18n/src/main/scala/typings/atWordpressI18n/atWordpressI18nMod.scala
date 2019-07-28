package typings.atWordpressI18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/i18n", JSImport.Namespace)
@js.native
object atWordpressI18nMod extends js.Object {
  def __(text: String): String = js.native
  def __(text: String, domain: String): String = js.native
  def _n(single: String, plural: String, n: Double): String = js.native
  def _n(single: String, plural: String, n: Double, domain: String): String = js.native
  def _nx(single: String, plural: String, n: Double, context: String): String = js.native
  def _nx(single: String, plural: String, n: Double, context: String, domain: String): String = js.native
  def _x(text: String, context: String): String = js.native
  def _x(text: String, context: String, domain: String): String = js.native
  def setLocaleData(data: js.Any): Unit = js.native
  def setLocaleData(data: js.Any, domain: String): Unit = js.native
  def sprintf(format: String, args: js.Any*): String = js.native
}

