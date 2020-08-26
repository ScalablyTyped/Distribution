package typings.winrt.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuspendingEventArgs extends ISuspendingEventArgs

object SuspendingEventArgs {
  @scala.inline
  def apply(suspendingOperation: SuspendingOperation): SuspendingEventArgs = {
    val __obj = js.Dynamic.literal(suspendingOperation = suspendingOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspendingEventArgs]
  }
}

