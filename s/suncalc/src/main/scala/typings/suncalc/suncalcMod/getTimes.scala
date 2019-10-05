package typings.suncalc.suncalcMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("suncalc", "getTimes")
@js.native
object getTimes extends js.Object {
  def apply(date: Date, latitude: Double, longitude: Double): GetTimesResult = js.native
}

