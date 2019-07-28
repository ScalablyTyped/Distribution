package typings.tzDashOffset.tzDashOffsetMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tz-offset", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def offsetOf(timezone: Timezone): Double = js.native
  def removeOffset(date: Date): Double = js.native
  def timeAt(date: Date, timezone: Timezone): Date = js.native
}

