package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationEventBacklogStatus extends StObject {
  
  var eventBacklogStatus: js.Array[EventBacklogStatus]
  
  var notificationBacklogStatus: js.Array[NotificationBacklogStatus]
}
object NotificationEventBacklogStatus {
  
  @scala.inline
  def apply(
    eventBacklogStatus: js.Array[EventBacklogStatus],
    notificationBacklogStatus: js.Array[NotificationBacklogStatus]
  ): NotificationEventBacklogStatus = {
    val __obj = js.Dynamic.literal(eventBacklogStatus = eventBacklogStatus.asInstanceOf[js.Any], notificationBacklogStatus = notificationBacklogStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventBacklogStatus]
  }
  
  @scala.inline
  implicit class NotificationEventBacklogStatusMutableBuilder[Self <: NotificationEventBacklogStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventBacklogStatus(value: js.Array[EventBacklogStatus]): Self = StObject.set(x, "eventBacklogStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBacklogStatusVarargs(value: EventBacklogStatus*): Self = StObject.set(x, "eventBacklogStatus", js.Array(value :_*))
    
    @scala.inline
    def setNotificationBacklogStatus(value: js.Array[NotificationBacklogStatus]): Self = StObject.set(x, "notificationBacklogStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationBacklogStatusVarargs(value: NotificationBacklogStatus*): Self = StObject.set(x, "notificationBacklogStatus", js.Array(value :_*))
  }
}
