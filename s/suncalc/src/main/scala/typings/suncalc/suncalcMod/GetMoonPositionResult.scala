package typings.suncalc.suncalcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMoonPositionResult extends js.Object {
  var altitude: Double
  var azimuth: Double
  var distance: Double
  var parallacticAngle: Double
}

object GetMoonPositionResult {
  @scala.inline
  def apply(altitude: Double, azimuth: Double, distance: Double, parallacticAngle: Double): GetMoonPositionResult = {
    val __obj = js.Dynamic.literal(altitude = altitude, azimuth = azimuth, distance = distance, parallacticAngle = parallacticAngle)
  
    __obj.asInstanceOf[GetMoonPositionResult]
  }
}

