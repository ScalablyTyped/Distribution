package typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Passed to the event handler that is invoked when the system revokes extended execution. */
trait ExtendedExecutionForegroundRevokedEventArgs extends js.Object {
  /** Gets the reason extended execution was revoked. */
  var reason: ExtendedExecutionForegroundRevokedReason
}

object ExtendedExecutionForegroundRevokedEventArgs {
  @scala.inline
  def apply(reason: ExtendedExecutionForegroundRevokedReason): ExtendedExecutionForegroundRevokedEventArgs = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedExecutionForegroundRevokedEventArgs]
  }
}

