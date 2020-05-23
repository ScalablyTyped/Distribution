package typings.winrtUwp.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for an app suspending event. */
trait SuspendingEventArgs extends js.Object {
  /** Gets the app suspending operation. */
  var suspendingOperation: SuspendingOperation
}

object SuspendingEventArgs {
  @scala.inline
  def apply(suspendingOperation: SuspendingOperation): SuspendingEventArgs = {
    val __obj = js.Dynamic.literal(suspendingOperation = suspendingOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspendingEventArgs]
  }
}

