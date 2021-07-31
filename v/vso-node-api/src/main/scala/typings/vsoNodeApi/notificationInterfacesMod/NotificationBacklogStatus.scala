package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationBacklogStatus extends StObject {
  
  var channel: String
  
  var maxUnprocessedNotificationAgeMs: Double
  
  var publisher: String
  
  var timeSinceLastProcessedNotificationMs: Double
  
  var unprocessedNotifications: Double
}
object NotificationBacklogStatus {
  
  @scala.inline
  def apply(
    channel: String,
    maxUnprocessedNotificationAgeMs: Double,
    publisher: String,
    timeSinceLastProcessedNotificationMs: Double,
    unprocessedNotifications: Double
  ): NotificationBacklogStatus = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], maxUnprocessedNotificationAgeMs = maxUnprocessedNotificationAgeMs.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], timeSinceLastProcessedNotificationMs = timeSinceLastProcessedNotificationMs.asInstanceOf[js.Any], unprocessedNotifications = unprocessedNotifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationBacklogStatus]
  }
  
  @scala.inline
  implicit class NotificationBacklogStatusMutableBuilder[Self <: NotificationBacklogStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUnprocessedNotificationAgeMs(value: Double): Self = StObject.set(x, "maxUnprocessedNotificationAgeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSinceLastProcessedNotificationMs(value: Double): Self = StObject.set(x, "timeSinceLastProcessedNotificationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedNotifications(value: Double): Self = StObject.set(x, "unprocessedNotifications", value.asInstanceOf[js.Any])
  }
}
