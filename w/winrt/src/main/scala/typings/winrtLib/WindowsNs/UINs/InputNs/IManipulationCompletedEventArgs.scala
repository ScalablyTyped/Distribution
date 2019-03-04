package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IManipulationCompletedEventArgs extends js.Object {
  var cumulative: ManipulationDelta
  var pointerDeviceType: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType
  var position: winrtLib.WindowsNs.FoundationNs.Point
  var velocities: ManipulationVelocities
}

object IManipulationCompletedEventArgs {
  @scala.inline
  def apply(
    cumulative: ManipulationDelta,
    pointerDeviceType: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType,
    position: winrtLib.WindowsNs.FoundationNs.Point,
    velocities: ManipulationVelocities
  ): IManipulationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(cumulative = cumulative, pointerDeviceType = pointerDeviceType, position = position, velocities = velocities)
  
    __obj.asInstanceOf[IManipulationCompletedEventArgs]
  }
}

