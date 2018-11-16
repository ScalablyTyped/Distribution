package typings
package winrtLib.WindowsNs.ApplicationModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.SuspendingOperation")
@js.native
class SuspendingOperation () extends ISuspendingOperation {
  /* CompleteClass */
  override var deadline: stdLib.Date = js.native
  /* CompleteClass */
  override def getDeferral(): SuspendingDeferral = js.native
}

