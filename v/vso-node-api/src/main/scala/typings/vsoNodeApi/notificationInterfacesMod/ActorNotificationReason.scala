package typings.vsoNodeApi.notificationInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActorNotificationReason extends NotificationReason {
  var matchedRoles: js.Array[String]
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
}

