package typings.winrtUwp.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the reason that a toast notification is no longer displayed on-screen. */
@js.native
trait ToastDismissedEventArgs extends js.Object {
  /** Gets the reason that a toast notification is no longer displayed on-screen. */
  var reason: ToastDismissalReason = js.native
}

object ToastDismissedEventArgs {
  @scala.inline
  def apply(reason: ToastDismissalReason): ToastDismissedEventArgs = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastDismissedEventArgs]
  }
  @scala.inline
  implicit class ToastDismissedEventArgsOps[Self <: ToastDismissedEventArgs] (val x: Self) extends AnyVal {
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
    def setReason(value: ToastDismissalReason): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}

