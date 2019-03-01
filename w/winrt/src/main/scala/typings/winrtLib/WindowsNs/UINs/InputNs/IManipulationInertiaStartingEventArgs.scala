package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IManipulationInertiaStartingEventArgs extends js.Object {
  var cumulative: ManipulationDelta
  var delta: ManipulationDelta
  var pointerDeviceType: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType
  var position: winrtLib.WindowsNs.FoundationNs.Point
  var velocities: ManipulationVelocities
}

object IManipulationInertiaStartingEventArgs {
  @scala.inline
  def apply(
    cumulative: ManipulationDelta,
    delta: ManipulationDelta,
    pointerDeviceType: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType,
    position: winrtLib.WindowsNs.FoundationNs.Point,
    velocities: ManipulationVelocities
  ): IManipulationInertiaStartingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cumulative")(cumulative)
    __obj.updateDynamic("delta")(delta)
    __obj.updateDynamic("pointerDeviceType")(pointerDeviceType)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("velocities")(velocities)
    __obj.asInstanceOf[IManipulationInertiaStartingEventArgs]
  }
}

