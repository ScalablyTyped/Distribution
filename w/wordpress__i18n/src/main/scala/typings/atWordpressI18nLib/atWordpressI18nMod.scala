package typings
package atWordpressI18nLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/i18n", JSImport.Namespace)
@js.native
object atWordpressI18nMod extends js.Object {
  def __(text: java.lang.String): java.lang.String = js.native
  def __(text: java.lang.String, domain: java.lang.String): java.lang.String = js.native
  def _n(single: java.lang.String, plural: java.lang.String, n: scala.Double): java.lang.String = js.native
  def _n(single: java.lang.String, plural: java.lang.String, n: scala.Double, domain: java.lang.String): java.lang.String = js.native
  def _nx(single: java.lang.String, plural: java.lang.String, n: scala.Double, context: java.lang.String): java.lang.String = js.native
  def _nx(
    single: java.lang.String,
    plural: java.lang.String,
    n: scala.Double,
    context: java.lang.String,
    domain: java.lang.String
  ): java.lang.String = js.native
  def _x(text: java.lang.String, context: java.lang.String): java.lang.String = js.native
  def _x(text: java.lang.String, context: java.lang.String, domain: java.lang.String): java.lang.String = js.native
  def setLocaleData(data: js.Any): scala.Unit = js.native
  def setLocaleData(data: js.Any, domain: java.lang.String): scala.Unit = js.native
  def sprintf(format: java.lang.String, args: js.Any*): java.lang.String = js.native
}

