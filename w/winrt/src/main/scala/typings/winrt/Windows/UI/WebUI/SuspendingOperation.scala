package typings.winrt.Windows.UI.WebUI

import typings.std.Date
import typings.winrt.Windows.ApplicationModel.ISuspendingOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.SuspendingOperation")
@js.native
class SuspendingOperation () extends ISuspendingOperation {
  /* CompleteClass */
  override var deadline: Date = js.native
  /* CompleteClass */
  override def getDeferral(): typings.winrt.Windows.ApplicationModel.SuspendingDeferral = js.native
}

