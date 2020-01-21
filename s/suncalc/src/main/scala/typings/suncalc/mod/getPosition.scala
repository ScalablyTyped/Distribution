package typings.suncalc.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("suncalc", "getPosition")
@js.native
object getPosition extends js.Object {
  def apply(timeAndDate: Date, latitude: Double, longitude: Double): GetSunPositionResult = js.native
}

