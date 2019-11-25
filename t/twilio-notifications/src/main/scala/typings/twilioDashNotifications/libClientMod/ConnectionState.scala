package typings.twilioDashNotifications.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashNotifications.twilioDashNotificationsStrings.connecting
  - typings.twilioDashNotifications.twilioDashNotificationsStrings.connected
  - typings.twilioDashNotifications.twilioDashNotificationsStrings.disconnecting
  - typings.twilioDashNotifications.twilioDashNotificationsStrings.disconnected
  - typings.twilioDashNotifications.twilioDashNotificationsStrings.denied
*/
trait ConnectionState extends js.Object

object ConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typings.twilioDashNotifications.twilioDashNotificationsStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typings.twilioDashNotifications.twilioDashNotificationsStrings.connecting = this.cast("connecting")
  @scala.inline
  def denied: typings.twilioDashNotifications.twilioDashNotificationsStrings.denied = this.cast("denied")
  @scala.inline
  def disconnected: typings.twilioDashNotifications.twilioDashNotificationsStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def disconnecting: typings.twilioDashNotifications.twilioDashNotificationsStrings.disconnecting = this.cast("disconnecting")
}

