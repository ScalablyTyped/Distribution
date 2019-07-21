package typings
package unlDashCoreLib.unlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var elevation: scala.Double
  var elevationType: ElevationType
  var lat: scala.Double
  var lon: scala.Double
}

object Point {
  @scala.inline
  def apply(elevation: scala.Double, elevationType: ElevationType, lat: scala.Double, lon: scala.Double): Point = {
    val __obj = js.Dynamic.literal(elevation = elevation, elevationType = elevationType, lat = lat, lon = lon)
  
    __obj.asInstanceOf[Point]
  }
}

