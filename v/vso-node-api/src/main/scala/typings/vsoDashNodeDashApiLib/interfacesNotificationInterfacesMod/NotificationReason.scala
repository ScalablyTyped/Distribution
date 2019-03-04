package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationReason extends js.Object {
  var notificationReasonType: NotificationReasonType
  var targetIdentities: js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef]
}

object NotificationReason {
  @scala.inline
  def apply(
    notificationReasonType: NotificationReasonType,
    targetIdentities: js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef]
  ): NotificationReason = {
    val __obj = js.Dynamic.literal(notificationReasonType = notificationReasonType, targetIdentities = targetIdentities)
  
    __obj.asInstanceOf[NotificationReason]
  }
}

