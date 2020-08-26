package typings.vsoNodeApi.notificationInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationReason extends js.Object {
  var notificationReasonType: NotificationReasonType = js.native
  var targetIdentities: js.Array[IdentityRef] = js.native
}

object NotificationReason {
  @scala.inline
  def apply(notificationReasonType: NotificationReasonType, targetIdentities: js.Array[IdentityRef]): NotificationReason = {
    val __obj = js.Dynamic.literal(notificationReasonType = notificationReasonType.asInstanceOf[js.Any], targetIdentities = targetIdentities.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationReason]
  }
  @scala.inline
  implicit class NotificationReasonOps[Self <: NotificationReason] (val x: Self) extends AnyVal {
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
    def setNotificationReasonType(value: NotificationReasonType): Self = this.set("notificationReasonType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetIdentitiesVarargs(value: IdentityRef*): Self = this.set("targetIdentities", js.Array(value :_*))
    @scala.inline
    def setTargetIdentities(value: js.Array[IdentityRef]): Self = this.set("targetIdentities", value.asInstanceOf[js.Any])
  }
  
}

