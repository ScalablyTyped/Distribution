package typings.vegaDashEmbed

import typings.vegaDashLite.buildSrcDatetimeMod.DateTime
import typings.vegaDashLite.buildSrcDatetimeMod.DateTimeExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofdatetime extends js.Object {
  val DAYS: js.Array[String] = js.native
  val MONTHS: js.Array[String] = js.native
  val SHORT_DAYS: js.Array[String] = js.native
  val SHORT_MONTHS: js.Array[String] = js.native
  def dateTimeExpr(d: DateTime): String = js.native
  def dateTimeExpr(d: DateTimeExpr): String = js.native
  def dateTimeExpr(d: DateTimeExpr, normalize: Boolean): String = js.native
  def dateTimeExpr(d: DateTime, normalize: Boolean): String = js.native
  def isDateTime(o: js.Any): /* is vega-lite.vega-lite/build/src/datetime.DateTime */ Boolean = js.native
}

