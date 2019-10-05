package typings.winrt.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Input.MouseDevice")
@js.native
class MouseDevice () extends IMouseDevice {
  /* CompleteClass */
  override var onmousemoved: js.Any = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Input.MouseDevice")
@js.native
object MouseDevice extends js.Object {
  def getForCurrentView(): MouseDevice = js.native
}

