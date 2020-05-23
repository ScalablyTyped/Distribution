package typings.winrtUwp.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the reason that a toast notification is no longer displayed on-screen. */
trait ToastDismissedEventArgs extends js.Object {
  /** Gets the reason that a toast notification is no longer displayed on-screen. */
  var reason: ToastDismissalReason
}

object ToastDismissedEventArgs {
  @scala.inline
  def apply(reason: ToastDismissalReason): ToastDismissedEventArgs = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastDismissedEventArgs]
  }
}

