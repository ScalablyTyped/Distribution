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
    val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any], elevationType = elevationType.asInstanceOf[js.Any], ne = ne.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Bounds]
  }
}

@JSImport("unl-core", "bounds")
@js.native
object bounds extends js.Object {
  def apply(geohash: String): Bounds = js.native
}

