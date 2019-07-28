package typings.suncalc.suncalcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSunPositionResult extends js.Object {
  var altitude: Double
  var azimuth: Double
}

object GetSunPositionResult {
  @scala.inline
  def apply(altitude: Double, azimuth: Double): GetSunPositionResult = {
    val __obj = js.Dynamic.literal(altitude = altitude, azimuth = azimuth)
  
    __obj.asInstanceOf[GetSunPositionResult]
  }
}

