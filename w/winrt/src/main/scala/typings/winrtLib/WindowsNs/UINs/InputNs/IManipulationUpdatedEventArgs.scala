package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IManipulationUpdatedEventArgs extends js.Object {
  var cumulative: ManipulationDelta
  var delta: ManipulationDelta
  var pointerDeviceType: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType
  var position: winrtLib.WindowsNs.FoundationNs.Point
  var velocities: ManipulationVelocities
}

object IManipulationUpdatedEventArgs {
  @scala.inline
  def apply(
    cumulative: ManipulationDelta,
    delta: ManipulationDelta,
    pointerDeviceType: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType,
    position: winrtLib.WindowsNs.FoundationNs.Point,
    velocities: ManipulationVelocities
  ): IManipulationUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(cumulative = cumulative, delta = delta, pointerDeviceType = pointerDeviceType, position = position, velocities = velocities)
  
    __obj.asInstanceOf[IManipulationUpdatedEventArgs]
  }
}

