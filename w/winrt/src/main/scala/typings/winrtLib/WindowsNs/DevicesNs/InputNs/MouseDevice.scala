package typings
package winrtLib.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Input.MouseDevice")
@js.native
class MouseDevice () extends IMouseDevice {
  /* CompleteClass */
  override var onmousemoved: js.Any = js.native
}

@JSGlobal("Windows.Devices.Input.MouseDevice")
@js.native
object MouseDevice extends js.Object {
  def getForCurrentView(): winrtLib.WindowsNs.DevicesNs.InputNs.MouseDevice = js.native
}

