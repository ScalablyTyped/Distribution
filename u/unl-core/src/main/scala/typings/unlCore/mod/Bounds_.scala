package typings.unlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounds_ extends js.Object {
  var elevation: Double
  var elevationType: ElevationType
  @JSName("ne")
  var ne_FBounds_ : Point
  var sw: Point
}

object Bounds_ {
  @scala.inline
  def apply(elevation: Double, elevationType: ElevationType, ne: Point, sw: Point): Bounds_ = {
    val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any], elevationType = elevationType.asInstanceOf[js.Any], ne = ne.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Bounds_]
  }
}

