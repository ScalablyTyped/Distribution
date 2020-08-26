package typings.winrtUwp.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the details of a toast history changed trigger. */
@js.native
trait ToastNotificationHistoryChangedTriggerDetail extends js.Object {
  /** Gets a value representing the kind of change that caused the toast history changed trigger. */
  var changeType: ToastHistoryChangedType = js.native
}

object ToastNotificationHistoryChangedTriggerDetail {
  @scala.inline
  def apply(changeType: ToastHistoryChangedType): ToastNotificationHistoryChangedTriggerDetail = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastNotificationHistoryChangedTriggerDetail]
  }
  @scala.inline
  implicit class ToastNotificationHistoryChangedTriggerDetailOps[Self <: ToastNotificationHistoryChangedTriggerDetail] (val x: Self) extends AnyVal {
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
    def setChangeType(value: ToastHistoryChangedType): Self = this.set("changeType", value.asInstanceOf[js.Any])
  }
  
}

