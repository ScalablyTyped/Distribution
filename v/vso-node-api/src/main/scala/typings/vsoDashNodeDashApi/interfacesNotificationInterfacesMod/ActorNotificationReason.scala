package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(matchedRoles = matchedRoles, notificationReasonType = notificationReasonType, targetIdentities = targetIdentities)
  
    __obj.asInstanceOf[ActorNotificationReason]
  }
}

