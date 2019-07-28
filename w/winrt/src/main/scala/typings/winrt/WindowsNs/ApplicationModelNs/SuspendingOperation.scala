package typings.winrt.WindowsNs.ApplicationModelNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.SuspendingOperation")
@js.native
class SuspendingOperation () extends ISuspendingOperation {
  /* CompleteClass */
  override var deadline: Date = js.native
  /* CompleteClass */
  override def getDeferral(): SuspendingDeferral = js.native
}

