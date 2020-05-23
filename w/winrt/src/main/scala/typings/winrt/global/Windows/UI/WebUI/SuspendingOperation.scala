package typings.winrt.global.Windows.UI.WebUI

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.SuspendingOperation")
@js.native
class SuspendingOperation ()
  extends typings.winrt.Windows.UI.WebUI.SuspendingOperation {
  /* CompleteClass */
  override var deadline: Date = js.native
  /* CompleteClass */
  override def getDeferral(): typings.winrt.Windows.ApplicationModel.SuspendingDeferral = js.native
}

