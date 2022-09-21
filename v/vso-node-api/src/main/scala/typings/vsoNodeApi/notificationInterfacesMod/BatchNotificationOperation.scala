package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchNotificationOperation extends StObject {
  
  var notificationOperation: NotificationOperation
  
  var notificationQueryConditions: js.Array[NotificationQueryCondition]
}
object BatchNotificationOperation {
  
  inline def apply(
    notificationOperation: NotificationOperation,
    notificationQueryConditions: js.Array[NotificationQueryCondition]
  ): BatchNotificationOperation = {
    val __obj = js.Dynamic.literal(notificationOperation = notificationOperation.asInstanceOf[js.Any], notificationQueryConditions = notificationQueryConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchNotificationOperation]
  }
  
  extension [Self <: BatchNotificationOperation](x: Self) {
    
    inline def setNotificationOperation(value: NotificationOperation): Self = StObject.set(x, "notificationOperation", value.asInstanceOf[js.Any])
    
    inline def setNotificationQueryConditions(value: js.Array[NotificationQueryCondition]): Self = StObject.set(x, "notificationQueryConditions", value.asInstanceOf[js.Any])
    
    inline def setNotificationQueryConditionsVarargs(value: NotificationQueryCondition*): Self = StObject.set(x, "notificationQueryConditions", js.Array(value*))
  }
}
