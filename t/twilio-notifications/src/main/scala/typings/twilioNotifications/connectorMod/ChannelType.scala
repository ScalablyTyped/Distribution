package typings.twilioNotifications.connectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioNotifications.twilioNotificationsStrings.twilsock
  - typings.twilioNotifications.twilioNotificationsStrings.gcm
  - typings.twilioNotifications.twilioNotificationsStrings.fcm
  - typings.twilioNotifications.twilioNotificationsStrings.apn
*/
trait ChannelType extends js.Object

object ChannelType {
  @scala.inline
  def apn: typings.twilioNotifications.twilioNotificationsStrings.apn = this.cast("apn")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fcm: typings.twilioNotifications.twilioNotificationsStrings.fcm = this.cast("fcm")
  @scala.inline
  def gcm: typings.twilioNotifications.twilioNotificationsStrings.gcm = this.cast("gcm")
  @scala.inline
  def twilsock: typings.twilioNotifications.twilioNotificationsStrings.twilsock = this.cast("twilsock")
}

