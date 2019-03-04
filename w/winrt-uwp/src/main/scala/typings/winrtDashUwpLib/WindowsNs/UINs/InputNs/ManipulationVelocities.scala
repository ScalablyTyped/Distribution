package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the velocities of the accumulated transformations for the current interaction. */
trait ManipulationVelocities extends js.Object {
  /** The rotational velocity in degrees per millisecond. */
  var angular: scala.Double
  /** The expansion, or scaling, velocity in DIPs per millisecond. */
  var expansion: scala.Double
  /** The straight line velocity in DIPs per millisecond. */
  var linear: winrtDashUwpLib.WindowsNs.FoundationNs.Point
}

object ManipulationVelocities {
  @scala.inline
  def apply(
    angular: scala.Double,
    expansion: scala.Double,
    linear: winrtDashUwpLib.WindowsNs.FoundationNs.Point
  ): ManipulationVelocities = {
    val __obj = js.Dynamic.literal(angular = angular, expansion = expansion, linear = linear)
  
    __obj.asInstanceOf[ManipulationVelocities]
  }
}

