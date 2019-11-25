package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationReason extends js.Object {
  var notificationReasonType: NotificationReasonType
  var targetIdentities: js.Array[IdentityRef]
}

object NotificationReason {
  @scala.inline
  def apply(notificationReasonType: NotificationReasonType, targetIdentities: js.Array[IdentityRef]): NotificationReason = {
    val __obj = js.Dynamic.literal(notificationReasonType = notificationReasonType.asInstanceOf[js.Any], targetIdentities = targetIdentities.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotificationReason]
  }
}

