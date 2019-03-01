package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyEventArgs extends ICoreWindowEventArgs {
  var keyStatus: CorePhysicalKeyStatus
  var virtualKey: winrtLib.WindowsNs.SystemNs.VirtualKey
}

object IKeyEventArgs {
  @scala.inline
  def apply(
    handled: scala.Boolean,
    keyStatus: CorePhysicalKeyStatus,
    virtualKey: winrtLib.WindowsNs.SystemNs.VirtualKey
  ): IKeyEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handled")(handled)
    __obj.updateDynamic("keyStatus")(keyStatus)
    __obj.updateDynamic("virtualKey")(virtualKey)
    __obj.asInstanceOf[IKeyEventArgs]
  }
}

