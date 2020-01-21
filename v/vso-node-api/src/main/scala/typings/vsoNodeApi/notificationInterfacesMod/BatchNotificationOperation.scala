package typings.vsoNodeApi.notificationInterfacesMod

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
    val __obj = js.Dynamic.literal(notificationOperation = notificationOperation.asInstanceOf[js.Any], notificationQueryConditions = notificationQueryConditions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchNotificationOperation]
  }
}

