package typings.winrt.Windows.ApplicationModel

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuspendingOperation extends ISuspendingOperation

object SuspendingOperation {
  @scala.inline
  def apply(deadline: Date, getDeferral: () => SuspendingDeferral): SuspendingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[SuspendingOperation]
  }
}

