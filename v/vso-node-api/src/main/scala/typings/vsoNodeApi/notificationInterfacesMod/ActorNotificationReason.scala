package typings.vsoNodeApi.notificationInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActorNotificationReason extends NotificationReason {
  var matchedRoles: js.Array[String] = js.native
}

object ActorNotificationReason {
  @scala.inline
  def apply(
    matchedRoles: js.Array[String],
    notificationReasonType: NotificationReasonType,
    targetIdentities: js.Array[IdentityRef]
  ): ActorNotificationReason = {
    val __obj = js.Dynamic.literal(matchedRoles = matchedRoles.asInstanceOf[js.Any], notificationReasonType = notificationReasonType.asInstanceOf[js.Any], targetIdentities = targetIdentities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActorNotificationReason]
  }
  @scala.inline
  implicit class ActorNotificationReasonOps[Self <: ActorNotificationReason] (val x: Self) extends AnyVal {
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
    def setMatchedRolesVarargs(value: String*): Self = this.set("matchedRoles", js.Array(value :_*))
    @scala.inline
    def setMatchedRoles(value: js.Array[String]): Self = this.set("matchedRoles", value.asInstanceOf[js.Any])
  }
  
}

