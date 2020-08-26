package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.System.VirtualKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAcceleratorKeyEventArgs extends ICoreWindowEventArgs {
  var eventType: CoreAcceleratorKeyEventType = js.native
  var keyStatus: CorePhysicalKeyStatus = js.native
  var virtualKey: VirtualKey = js.native
}

object IAcceleratorKeyEventArgs {
  @scala.inline
  def apply(
    eventType: CoreAcceleratorKeyEventType,
    handled: Boolean,
    keyStatus: CorePhysicalKeyStatus,
    virtualKey: VirtualKey
  ): IAcceleratorKeyEventArgs = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], keyStatus = keyStatus.asInstanceOf[js.Any], virtualKey = virtualKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAcceleratorKeyEventArgs]
  }
  @scala.inline
  implicit class IAcceleratorKeyEventArgsOps[Self <: IAcceleratorKeyEventArgs] (val x: Self) extends AnyVal {
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
    def setEventType(value: CoreAcceleratorKeyEventType): Self = this.set("eventType", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyStatus(value: CorePhysicalKeyStatus): Self = this.set("keyStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualKey(value: VirtualKey): Self = this.set("virtualKey", value.asInstanceOf[js.Any])
  }
  
}

