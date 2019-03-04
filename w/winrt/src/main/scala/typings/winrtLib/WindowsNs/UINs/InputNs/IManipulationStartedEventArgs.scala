package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IManipulationStartedEventArgs extends js.Object {
  var cumulative: ManipulationDelta
  var pointerDeviceType: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType
  var position: winrtLib.WindowsNs.FoundationNs.Point
}

object IManipulationStartedEventArgs {
  @scala.inline
  def apply(
    cumulative: ManipulationDelta,
    pointerDeviceType: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType,
    position: winrtLib.WindowsNs.FoundationNs.Point
  ): IManipulationStartedEventArgs = {
    val __obj = js.Dynamic.literal(cumulative = cumulative, pointerDeviceType = pointerDeviceType, position = position)
  
    __obj.asInstanceOf[IManipulationStartedEventArgs]
  }
}

