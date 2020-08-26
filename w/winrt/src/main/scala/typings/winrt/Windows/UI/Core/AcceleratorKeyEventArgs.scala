package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.System.VirtualKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceleratorKeyEventArgs extends IAcceleratorKeyEventArgs

object AcceleratorKeyEventArgs {
  @scala.inline
  def apply(
    eventType: CoreAcceleratorKeyEventType,
    handled: Boolean,
    keyStatus: CorePhysicalKeyStatus,
    virtualKey: VirtualKey
  ): AcceleratorKeyEventArgs = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], keyStatus = keyStatus.asInstanceOf[js.Any], virtualKey = virtualKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceleratorKeyEventArgs]
  }
}

