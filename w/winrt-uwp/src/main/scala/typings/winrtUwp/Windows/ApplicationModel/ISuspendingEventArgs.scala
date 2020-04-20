package typings.winrtUwp.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for an app suspending event. */
trait ISuspendingEventArgs extends js.Object {
  /** Gets the app suspending operation. */
  var suspendingOperation: SuspendingOperation
}

object ISuspendingEventArgs {
  @scala.inline
  def apply(suspendingOperation: SuspendingOperation): ISuspendingEventArgs = {
    val __obj = js.Dynamic.literal(suspendingOperation = suspendingOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuspendingEventArgs]
  }
}

