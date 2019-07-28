package typings.unlDashCore.unlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounds extends js.Object {
  var elevation: Double
  var elevationType: ElevationType
  @JSName("ne")
  var ne_FBounds: Point
  var sw: Point
}

object Bounds {
  @scala.inline
  def apply(elevation: Double, elevationType: ElevationType, ne: Point, sw: Point): Bounds = {
    val __obj = js.Dynamic.literal(elevation = elevation, elevationType = elevationType, ne = ne, sw = sw)
  
    __obj.asInstanceOf[Bounds]
  }
}

