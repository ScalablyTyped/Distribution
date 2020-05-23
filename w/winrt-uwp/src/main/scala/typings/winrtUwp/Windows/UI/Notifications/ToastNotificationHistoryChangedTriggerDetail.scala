package typings.winrtUwp.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the details of a toast history changed trigger. */
trait ToastNotificationHistoryChangedTriggerDetail extends js.Object {
  /** Gets a value representing the kind of change that caused the toast history changed trigger. */
  var changeType: ToastHistoryChangedType
}

object ToastNotificationHistoryChangedTriggerDetail {
  @scala.inline
  def apply(changeType: ToastHistoryChangedType): ToastNotificationHistoryChangedTriggerDetail = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastNotificationHistoryChangedTriggerDetail]
  }
}

