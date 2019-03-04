package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationBacklogStatus extends js.Object {
  var channel: java.lang.String
  var maxUnprocessedNotificationAgeMs: scala.Double
  var publisher: java.lang.String
  var timeSinceLastProcessedNotificationMs: scala.Double
  var unprocessedNotifications: scala.Double
}

object NotificationBacklogStatus {
  @scala.inline
  def apply(
    channel: java.lang.String,
    maxUnprocessedNotificationAgeMs: scala.Double,
    publisher: java.lang.String,
    timeSinceLastProcessedNotificationMs: scala.Double,
    unprocessedNotifications: scala.Double
  ): NotificationBacklogStatus = {
    val __obj = js.Dynamic.literal(channel = channel, maxUnprocessedNotificationAgeMs = maxUnprocessedNotificationAgeMs, publisher = publisher, timeSinceLastProcessedNotificationMs = timeSinceLastProcessedNotificationMs, unprocessedNotifications = unprocessedNotifications)
  
    __obj.asInstanceOf[NotificationBacklogStatus]
  }
}

