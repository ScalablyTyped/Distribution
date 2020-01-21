package typings.twilioNotifications.connectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioNotifications.twilioNotificationsStrings.token
  - typings.twilioNotifications.twilioNotificationsStrings.notificationId
  - typings.twilioNotifications.twilioNotificationsStrings.messageType
*/
trait UpdateReason extends js.Object

object UpdateReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def messageType: typings.twilioNotifications.twilioNotificationsStrings.messageType = this.cast("messageType")
  @scala.inline
  def notificationId: typings.twilioNotifications.twilioNotificationsStrings.notificationId = this.cast("notificationId")
  @scala.inline
  def token: typings.twilioNotifications.twilioNotificationsStrings.token = this.cast("token")
}

