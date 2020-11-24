package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchNotificationOperation extends js.Object {
  
  var notificationOperation: NotificationOperation = js.native
  
  var notificationQueryConditions: js.Array[NotificationQueryCondition] = js.native
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
  
  @scala.inline
  implicit class BatchNotificationOperationOps[Self <: BatchNotificationOperation] (val x: Self) extends AnyVal {
    
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
    def setNotificationOperation(value: NotificationOperation): Self = this.set("notificationOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationQueryConditionsVarargs(value: NotificationQueryCondition*): Self = this.set("notificationQueryConditions", js.Array(value :_*))
    
    @scala.inline
    def setNotificationQueryConditions(value: js.Array[NotificationQueryCondition]): Self = this.set("notificationQueryConditions", value.asInstanceOf[js.Any])
  }
}
