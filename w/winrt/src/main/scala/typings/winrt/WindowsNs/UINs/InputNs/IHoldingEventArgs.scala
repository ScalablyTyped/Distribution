package typings.winrt.WindowsNs.UINs.InputNs

import typings.winrt.WindowsNs.DevicesNs.InputNs.PointerDeviceType
import typings.winrt.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHoldingEventArgs extends js.Object {
  var holdingState: HoldingState
  var pointerDeviceType: PointerDeviceType
  var position: Point
}

object IHoldingEventArgs {
  @scala.inline
  def apply(holdingState: HoldingState, pointerDeviceType: PointerDeviceType, position: Point): IHoldingEventArgs = {
    val __obj = js.Dynamic.literal(holdingState = holdingState, pointerDeviceType = pointerDeviceType, position = position)
  
    __obj.asInstanceOf[IHoldingEventArgs]
  }
}

