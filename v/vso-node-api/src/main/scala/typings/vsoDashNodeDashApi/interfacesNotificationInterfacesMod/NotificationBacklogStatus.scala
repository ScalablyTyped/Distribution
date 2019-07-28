package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationBacklogStatus extends js.Object {
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
    val __obj = js.Dynamic.literal(channel = channel, maxUnprocessedNotificationAgeMs = maxUnprocessedNotificationAgeMs, publisher = publisher, timeSinceLastProcessedNotificationMs = timeSinceLastProcessedNotificationMs, unprocessedNotifications = unprocessedNotifications)
  
    __obj.asInstanceOf[NotificationBacklogStatus]
  }
}

