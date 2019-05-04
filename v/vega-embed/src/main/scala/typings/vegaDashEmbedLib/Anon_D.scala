package typings
package vegaDashEmbedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_D extends js.Object {
  val DAYS: js.Array[java.lang.String] = js.native
  val MONTHS: js.Array[java.lang.String] = js.native
  val SHORT_DAYS: js.Array[java.lang.String] = js.native
  val SHORT_MONTHS: js.Array[java.lang.String] = js.native
  def dateTimeExpr(d: vegaDashLiteLib.buildSrcDatetimeMod.DateTime): java.lang.String = js.native
  def dateTimeExpr(d: vegaDashLiteLib.buildSrcDatetimeMod.DateTimeExpr): java.lang.String = js.native
  def dateTimeExpr(d: vegaDashLiteLib.buildSrcDatetimeMod.DateTimeExpr, normalize: scala.Boolean): java.lang.String = js.native
  def dateTimeExpr(d: vegaDashLiteLib.buildSrcDatetimeMod.DateTime, normalize: scala.Boolean): java.lang.String = js.native
  def isDateTime(o: js.Any): /* is vega-lite.vega-lite/build/src/datetime.DateTime */ scala.Boolean = js.native
}

