package typings.winrt.WindowsNs.UINs.InputNs

import typings.winrt.WindowsNs.DevicesNs.InputNs.PointerDeviceType
import typings.winrt.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IManipulationUpdatedEventArgs extends js.Object {
  var cumulative: ManipulationDelta
  var delta: ManipulationDelta
  var pointerDeviceType: PointerDeviceType
  var position: Point
  var velocities: ManipulationVelocities
}

object IManipulationUpdatedEventArgs {
  @scala.inline
  def apply(
    cumulative: ManipulationDelta,
    delta: ManipulationDelta,
    pointerDeviceType: PointerDeviceType,
    position: Point,
    velocities: ManipulationVelocities
  ): IManipulationUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(cumulative = cumulative, delta = delta, pointerDeviceType = pointerDeviceType, position = position, velocities = velocities)
  
    __obj.asInstanceOf[IManipulationUpdatedEventArgs]
  }
}

