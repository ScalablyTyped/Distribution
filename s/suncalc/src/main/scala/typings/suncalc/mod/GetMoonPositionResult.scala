package typings.suncalc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMoonPositionResult extends js.Object {
  var altitude: Double = js.native
  var azimuth: Double = js.native
  var distance: Double = js.native
  var parallacticAngle: Double = js.native
}

object GetMoonPositionResult {
  @scala.inline
  def apply(altitude: Double, azimuth: Double, distance: Double, parallacticAngle: Double): GetMoonPositionResult = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], azimuth = azimuth.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], parallacticAngle = parallacticAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMoonPositionResult]
  }
  @scala.inline
  implicit class GetMoonPositionResultOps[Self <: GetMoonPositionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAltitude(value: Double): Self = this.set("altitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setAzimuth(value: Double): Self = this.set("azimuth", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setParallacticAngle(value: Double): Self = this.set("parallacticAngle", value.asInstanceOf[js.Any])
  }
  
}

