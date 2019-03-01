package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastDismissedEventArgs extends js.Object {
  var reason: ToastDismissalReason
}

object IToastDismissedEventArgs {
  @scala.inline
  def apply(reason: ToastDismissalReason): IToastDismissedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[IToastDismissedEventArgs]
  }
}

