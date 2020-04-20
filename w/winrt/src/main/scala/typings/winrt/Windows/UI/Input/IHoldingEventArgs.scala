package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Devices.Input.PointerDeviceType
import typings.winrt.Windows.Foundation.Point
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
    val __obj = js.Dynamic.literal(holdingState = holdingState.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHoldingEventArgs]
  }
}

