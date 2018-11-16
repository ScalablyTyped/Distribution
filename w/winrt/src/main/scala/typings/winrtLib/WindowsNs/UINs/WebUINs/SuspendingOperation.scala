package typings
package winrtLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.SuspendingOperation")
@js.native
class SuspendingOperation ()
  extends winrtLib.WindowsNs.ApplicationModelNs.ISuspendingOperation {
  /* CompleteClass */
  override var deadline: stdLib.Date = js.native
  /* CompleteClass */
  override def getDeferral(): winrtLib.WindowsNs.ApplicationModelNs.SuspendingDeferral = js.native
}

