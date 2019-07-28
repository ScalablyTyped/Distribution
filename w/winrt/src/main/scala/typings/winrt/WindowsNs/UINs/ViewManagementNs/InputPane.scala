package typings.winrt.WindowsNs.UINs.ViewManagementNs

import typings.winrt.WindowsNs.FoundationNs.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.ViewManagement.InputPane")
@js.native
class InputPane () extends IInputPane {
  /* CompleteClass */
  override var occludedRect: Rect = js.native
  /* CompleteClass */
  override var onhiding: js.Any = js.native
  /* CompleteClass */
  override var onshowing: js.Any = js.native
}

/* static members */
@JSGlobal("Windows.UI.ViewManagement.InputPane")
@js.native
object InputPane extends js.Object {
  def getForCurrentView(): InputPane = js.native
}

