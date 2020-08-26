package typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Passed to the event handler that is invoked when the system revokes extended execution. */
@js.native
trait ExtendedExecutionForegroundRevokedEventArgs extends js.Object {
  /** Gets the reason extended execution was revoked. */
  var reason: ExtendedExecutionForegroundRevokedReason = js.native
}

object ExtendedExecutionForegroundRevokedEventArgs {
  @scala.inline
  def apply(reason: ExtendedExecutionForegroundRevokedReason): ExtendedExecutionForegroundRevokedEventArgs = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedExecutionForegroundRevokedEventArgs]
  }
  @scala.inline
  implicit class ExtendedExecutionForegroundRevokedEventArgsOps[Self <: ExtendedExecutionForegroundRevokedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReason(value: ExtendedExecutionForegroundRevokedReason): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}

