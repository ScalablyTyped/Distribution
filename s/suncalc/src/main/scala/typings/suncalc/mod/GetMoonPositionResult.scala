package typings.suncalc.mod

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
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], azimuth = azimuth.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], parallacticAngle = parallacticAngle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetMoonPositionResult]
  }
}

