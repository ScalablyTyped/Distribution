package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchNotificationOperation extends js.Object {
  var notificationOperation: NotificationOperation
  var notificationQueryConditions: js.Array[NotificationQueryCondition]
}

object BatchNotificationOperation {
  @scala.inline
  def apply(
    notificationOperation: NotificationOperation,
    notificationQueryConditions: js.Array[NotificationQueryCondition]
  ): BatchNotificationOperation = {
    val __obj = js.Dynamic.literal(notificationOperation = notificationOperation, notificationQueryConditions = notificationQueryConditions)
  
    __obj.asInstanceOf[BatchNotificationOperation]
  }
}

