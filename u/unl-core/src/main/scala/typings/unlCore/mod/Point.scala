package typings.unlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var elevation: Double
  var elevationType: ElevationType
  var lat: Double
  var lon: Double
}

object Point {
  @scala.inline
  def apply(elevation: Double, elevationType: ElevationType, lat: Double, lon: Double): Point = {
    val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any], elevationType = elevationType.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Point]
  }
}

