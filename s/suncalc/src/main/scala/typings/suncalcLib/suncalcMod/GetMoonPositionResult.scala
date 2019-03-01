package typings
package suncalcLib.suncalcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMoonPositionResult extends js.Object {
  var altitude: scala.Double
  var azimuth: scala.Double
  var distance: scala.Double
  var parallacticAngle: scala.Double
}

object GetMoonPositionResult {
  @scala.inline
  def apply(
    altitude: scala.Double,
    azimuth: scala.Double,
    distance: scala.Double,
    parallacticAngle: scala.Double
  ): GetMoonPositionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("altitude")(altitude)
    __obj.updateDynamic("azimuth")(azimuth)
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("parallacticAngle")(parallacticAngle)
    __obj.asInstanceOf[GetMoonPositionResult]
  }
}

