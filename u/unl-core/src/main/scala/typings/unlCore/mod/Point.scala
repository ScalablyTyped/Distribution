package typings.unlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Point extends js.Object {
  var elevation: Double = js.native
  var elevationType: ElevationType = js.native
  var lat: Double = js.native
  var lon: Double = js.native
}

object Point {
  @scala.inline
  def apply(elevation: Double, elevationType: ElevationType, lat: Double, lon: Double): Point = {
    val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any], elevationType = elevationType.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
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
    def setElevation(value: Double): Self = this.set("elevation", value.asInstanceOf[js.Any])
    @scala.inline
    def setElevationType(value: ElevationType): Self = this.set("elevationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setLat(value: Double): Self = this.set("lat", value.asInstanceOf[js.Any])
    @scala.inline
    def setLon(value: Double): Self = this.set("lon", value.asInstanceOf[js.Any])
  }
  
}

