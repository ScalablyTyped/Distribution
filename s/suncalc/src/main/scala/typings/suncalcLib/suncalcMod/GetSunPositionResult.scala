package typings
package suncalcLib.suncalcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSunPositionResult extends js.Object {
  var altitude: scala.Double
  var azimuth: scala.Double
}

object GetSunPositionResult {
  @scala.inline
  def apply(altitude: scala.Double, azimuth: scala.Double): GetSunPositionResult = {
    val __obj = js.Dynamic.literal(altitude = altitude, azimuth = azimuth)
  
    __obj.asInstanceOf[GetSunPositionResult]
  }
}

