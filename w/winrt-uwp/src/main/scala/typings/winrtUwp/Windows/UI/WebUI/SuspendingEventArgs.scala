package typings.winrtUwp.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for an app suspension event. */
trait SuspendingEventArgs extends js.Object {
  /** Gets the app suspension operation. */
  var suspendingOperation: typings.winrtUwp.Windows.ApplicationModel.SuspendingOperation
}

object SuspendingEventArgs {
  @scala.inline
  def apply(suspendingOperation: typings.winrtUwp.Windows.ApplicationModel.SuspendingOperation): SuspendingEventArgs = {
    val __obj = js.Dynamic.literal(suspendingOperation = suspendingOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspendingEventArgs]
  }
}

