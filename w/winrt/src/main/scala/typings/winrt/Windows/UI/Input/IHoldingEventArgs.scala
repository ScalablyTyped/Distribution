package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Devices.Input.PointerDeviceType
import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHoldingEventArgs extends js.Object {
  var holdingState: HoldingState = js.native
  var pointerDeviceType: PointerDeviceType = js.native
  var position: Point = js.native
}

object IHoldingEventArgs {
  @scala.inline
  def apply(holdingState: HoldingState, pointerDeviceType: PointerDeviceType, position: Point): IHoldingEventArgs = {
    val __obj = js.Dynamic.literal(holdingState = holdingState.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHoldingEventArgs]
  }
  @scala.inline
  implicit class IHoldingEventArgsOps[Self <: IHoldingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHoldingState(value: HoldingState): Self = this.set("holdingState", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointerDeviceType(value: PointerDeviceType): Self = this.set("pointerDeviceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Point): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

