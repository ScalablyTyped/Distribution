package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHoldingEventArgs extends js.Object {
  var holdingState: HoldingState
  var pointerDeviceType: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType
  var position: winrtLib.WindowsNs.FoundationNs.Point
}

object IHoldingEventArgs {
  @scala.inline
  def apply(
    holdingState: HoldingState,
    pointerDeviceType: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType,
    position: winrtLib.WindowsNs.FoundationNs.Point
  ): IHoldingEventArgs = {
    val __obj = js.Dynamic.literal(holdingState = holdingState, pointerDeviceType = pointerDeviceType, position = position)
  
    __obj.asInstanceOf[IHoldingEventArgs]
  }
}

