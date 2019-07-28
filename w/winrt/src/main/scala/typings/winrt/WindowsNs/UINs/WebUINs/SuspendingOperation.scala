package typings.winrt.WindowsNs.UINs.WebUINs

import typings.std.Date
import typings.winrt.WindowsNs.ApplicationModelNs.ISuspendingOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.SuspendingOperation")
@js.native
class SuspendingOperation () extends ISuspendingOperation {
  /* CompleteClass */
  override var deadline: Date = js.native
  /* CompleteClass */
  override def getDeferral(): typings.winrt.WindowsNs.ApplicationModelNs.SuspendingDeferral = js.native
}

