package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAcceleratorKeyEventArgs extends ICoreWindowEventArgs {
  var eventType: CoreAcceleratorKeyEventType
  var keyStatus: CorePhysicalKeyStatus
  var virtualKey: winrtLib.WindowsNs.SystemNs.VirtualKey
}

object IAcceleratorKeyEventArgs {
  @scala.inline
  def apply(
    eventType: CoreAcceleratorKeyEventType,
    handled: scala.Boolean,
    keyStatus: CorePhysicalKeyStatus,
    virtualKey: winrtLib.WindowsNs.SystemNs.VirtualKey
  ): IAcceleratorKeyEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eventType")(eventType)
    __obj.updateDynamic("handled")(handled)
    __obj.updateDynamic("keyStatus")(keyStatus)
    __obj.updateDynamic("virtualKey")(virtualKey)
    __obj.asInstanceOf[IAcceleratorKeyEventArgs]
  }
}

