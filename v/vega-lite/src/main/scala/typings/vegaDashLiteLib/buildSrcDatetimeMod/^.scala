package typings
package vegaDashLiteLib.buildSrcDatetimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/datetime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DAYS: js.Array[java.lang.String] = js.native
  val MONTHS: js.Array[java.lang.String] = js.native
  val SHORT_DAYS: js.Array[java.lang.String] = js.native
  val SHORT_MONTHS: js.Array[java.lang.String] = js.native
  def dateTimeExpr(d: DateTime): java.lang.String = js.native
  def dateTimeExpr(d: DateTimeExpr): java.lang.String = js.native
  def dateTimeExpr(d: DateTimeExpr, normalize: scala.Boolean): java.lang.String = js.native
  def dateTimeExpr(d: DateTime, normalize: scala.Boolean): java.lang.String = js.native
  def isDateTime(o: js.Any): /* is vega-lite.vega-lite/build/src/datetime.DateTime */ scala.Boolean = js.native
}

