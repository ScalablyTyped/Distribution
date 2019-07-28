package typings.winrt.WindowsNs.UINs.CoreNs

import typings.winrt.WindowsNs.SystemNs.VirtualKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAcceleratorKeyEventArgs extends ICoreWindowEventArgs {
  var eventType: CoreAcceleratorKeyEventType
  var keyStatus: CorePhysicalKeyStatus
  var virtualKey: VirtualKey
}

object IAcceleratorKeyEventArgs {
  @scala.inline
  def apply(
    eventType: CoreAcceleratorKeyEventType,
    handled: Boolean,
    keyStatus: CorePhysicalKeyStatus,
    virtualKey: VirtualKey
  ): IAcceleratorKeyEventArgs = {
    val __obj = js.Dynamic.literal(eventType = eventType, handled = handled, keyStatus = keyStatus, virtualKey = virtualKey)
  
    __obj.asInstanceOf[IAcceleratorKeyEventArgs]
  }
}

