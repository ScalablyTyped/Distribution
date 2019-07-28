package typings.winrtDashUwp.WindowsNs.UINs.InputNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the velocities of the accumulated transformations for the current interaction. */
trait ManipulationVelocities extends js.Object {
  /** The rotational velocity in degrees per millisecond. */
  var angular: Double
  /** The expansion, or scaling, velocity in DIPs per millisecond. */
  var expansion: Double
  /** The straight line velocity in DIPs per millisecond. */
  var linear: Point
}

object ManipulationVelocities {
  @scala.inline
  def apply(angular: Double, expansion: Double, linear: Point): ManipulationVelocities = {
    val __obj = js.Dynamic.literal(angular = angular, expansion = expansion, linear = linear)
  
    __obj.asInstanceOf[ManipulationVelocities]
  }
}

