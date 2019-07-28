package typings.winrt.WindowsNs.UINs.InputNs

import typings.winrt.WindowsNs.DevicesNs.InputNs.PointerDeviceType
import typings.winrt.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IManipulationCompletedEventArgs extends js.Object {
  var cumulative: ManipulationDelta
  var pointerDeviceType: PointerDeviceType
  var position: Point
  var velocities: ManipulationVelocities
}

object IManipulationCompletedEventArgs {
  @scala.inline
  def apply(
    cumulative: ManipulationDelta,
    pointerDeviceType: PointerDeviceType,
    position: Point,
    velocities: ManipulationVelocities
  ): IManipulationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(cumulative = cumulative, pointerDeviceType = pointerDeviceType, position = position, velocities = velocities)
  
    __obj.asInstanceOf[IManipulationCompletedEventArgs]
  }
}

