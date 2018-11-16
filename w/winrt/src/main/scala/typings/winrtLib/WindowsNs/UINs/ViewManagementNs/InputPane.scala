package typings
package winrtLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.ViewManagement.InputPane")
@js.native
class InputPane () extends IInputPane {
  /* CompleteClass */
  override var occludedRect: winrtLib.WindowsNs.FoundationNs.Rect = js.native
  /* CompleteClass */
  override var onhiding: js.Any = js.native
  /* CompleteClass */
  override var onshowing: js.Any = js.native
}

@JSGlobal("Windows.UI.ViewManagement.InputPane")
@js.native
object InputPane extends js.Object {
  def getForCurrentView(): winrtLib.WindowsNs.UINs.ViewManagementNs.InputPane = js.native
}

