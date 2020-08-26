package typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the object that is passed as a parameter to the event handler that is invoked when the system revokes background execution. */
@js.native
trait ExtendedExecutionRevokedEventArgs extends js.Object {
  /** Gets the reason background execution was revoked. */
  var reason: ExtendedExecutionRevokedReason = js.native
}

object ExtendedExecutionRevokedEventArgs {
  @scala.inline
  def apply(reason: ExtendedExecutionRevokedReason): ExtendedExecutionRevokedEventArgs = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedExecutionRevokedEventArgs]
  }
  @scala.inline
  implicit class ExtendedExecutionRevokedEventArgsOps[Self <: ExtendedExecutionRevokedEventArgs] (val x: Self) extends AnyVal {
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
    def setReason(value: ExtendedExecutionRevokedReason): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}

