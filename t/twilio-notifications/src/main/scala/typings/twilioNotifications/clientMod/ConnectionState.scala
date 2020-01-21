package typings.twilioNotifications.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioNotifications.twilioNotificationsStrings.connecting
  - typings.twilioNotifications.twilioNotificationsStrings.connected
  - typings.twilioNotifications.twilioNotificationsStrings.disconnecting
  - typings.twilioNotifications.twilioNotificationsStrings.disconnected
  - typings.twilioNotifications.twilioNotificationsStrings.denied
*/
trait ConnectionState extends js.Object

object ConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typings.twilioNotifications.twilioNotificationsStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typings.twilioNotifications.twilioNotificationsStrings.connecting = this.cast("connecting")
  @scala.inline
  def denied: typings.twilioNotifications.twilioNotificationsStrings.denied = this.cast("denied")
  @scala.inline
  def disconnected: typings.twilioNotifications.twilioNotificationsStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def disconnecting: typings.twilioNotifications.twilioNotificationsStrings.disconnecting = this.cast("disconnecting")
}

