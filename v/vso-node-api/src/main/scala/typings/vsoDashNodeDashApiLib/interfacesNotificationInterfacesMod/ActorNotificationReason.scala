package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActorNotificationReason extends NotificationReason {
  var matchedRoles: js.Array[java.lang.String]
}

object ActorNotificationReason {
  @scala.inline
  def apply(
    matchedRoles: js.Array[java.lang.String],
    notificationReasonType: NotificationReasonType,
    targetIdentities: js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef]
  ): ActorNotificationReason = {
    val __obj = js.Dynamic.literal(matchedRoles = matchedRoles, notificationReasonType = notificationReasonType, targetIdentities = targetIdentities)
  
    __obj.asInstanceOf[ActorNotificationReason]
  }
}

