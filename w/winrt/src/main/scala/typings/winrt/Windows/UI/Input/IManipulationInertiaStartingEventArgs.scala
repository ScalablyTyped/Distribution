package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Devices.Input.PointerDeviceType
import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IManipulationInertiaStartingEventArgs extends js.Object {
  var cumulative: ManipulationDelta
  var delta: ManipulationDelta
  var pointerDeviceType: PointerDeviceType
  var position: Point
  var velocities: ManipulationVelocities
}

object IManipulationInertiaStartingEventArgs {
  @scala.inline
  def apply(
    cumulative: ManipulationDelta,
    delta: ManipulationDelta,
    pointerDeviceType: PointerDeviceType,
    position: Point,
    velocities: ManipulationVelocities
  ): IManipulationInertiaStartingEventArgs = {
    val __obj = js.Dynamic.literal(cumulative = cumulative, delta = delta, pointerDeviceType = pointerDeviceType, position = position, velocities = velocities)
  
    __obj.asInstanceOf[IManipulationInertiaStartingEventArgs]
  }
}

