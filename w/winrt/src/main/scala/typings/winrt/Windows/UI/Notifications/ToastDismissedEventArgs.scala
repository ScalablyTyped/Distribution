package typings.winrt.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastDismissedEventArgs extends IToastDismissedEventArgs

object ToastDismissedEventArgs {
  @scala.inline
  def apply(reason: ToastDismissalReason): ToastDismissedEventArgs = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastDismissedEventArgs]
  }
}

