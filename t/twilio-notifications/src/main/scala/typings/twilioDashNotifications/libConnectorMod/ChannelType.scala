package typings.twilioDashNotifications.libConnectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashNotifications.twilioDashNotificationsStrings.twilsock
  - typings.twilioDashNotifications.twilioDashNotificationsStrings.gcm
  - typings.twilioDashNotifications.twilioDashNotificationsStrings.fcm
  - typings.twilioDashNotifications.twilioDashNotificationsStrings.apn
*/
trait ChannelType extends js.Object

object ChannelType {
  @scala.inline
  def apn: typings.twilioDashNotifications.twilioDashNotificationsStrings.apn = this.cast("apn")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fcm: typings.twilioDashNotifications.twilioDashNotificationsStrings.fcm = this.cast("fcm")
  @scala.inline
  def gcm: typings.twilioDashNotifications.twilioDashNotificationsStrings.gcm = this.cast("gcm")
  @scala.inline
  def twilsock: typings.twilioDashNotifications.twilioDashNotificationsStrings.twilsock = this.cast("twilsock")
}

