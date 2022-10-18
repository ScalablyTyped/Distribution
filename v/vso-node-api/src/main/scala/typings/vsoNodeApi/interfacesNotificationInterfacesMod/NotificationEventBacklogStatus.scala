package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationEventBacklogStatus extends StObject {
  
  var eventBacklogStatus: js.Array[EventBacklogStatus]
  
  var notificationBacklogStatus: js.Array[NotificationBacklogStatus]
}
object NotificationEventBacklogStatus {
  
  inline def apply(
    eventBacklogStatus: js.Array[EventBacklogStatus],
    notificationBacklogStatus: js.Array[NotificationBacklogStatus]
  ): NotificationEventBacklogStatus = {
    val __obj = js.Dynamic.literal(eventBacklogStatus = eventBacklogStatus.asInstanceOf[js.Any], notificationBacklogStatus = notificationBacklogStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventBacklogStatus]
  }
  
  extension [Self <: NotificationEventBacklogStatus](x: Self) {
    
    inline def setEventBacklogStatus(value: js.Array[EventBacklogStatus]): Self = StObject.set(x, "eventBacklogStatus", value.asInstanceOf[js.Any])
    
    inline def setEventBacklogStatusVarargs(value: EventBacklogStatus*): Self = StObject.set(x, "eventBacklogStatus", js.Array(value*))
    
    inline def setNotificationBacklogStatus(value: js.Array[NotificationBacklogStatus]): Self = StObject.set(x, "notificationBacklogStatus", value.asInstanceOf[js.Any])
    
    inline def setNotificationBacklogStatusVarargs(value: NotificationBacklogStatus*): Self = StObject.set(x, "notificationBacklogStatus", js.Array(value*))
  }
}
