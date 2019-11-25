package typings.twilioDashNotifications.libConnectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashNotifications.twilioDashNotificationsStrings.token
  - typings.twilioDashNotifications.twilioDashNotificationsStrings.notificationId
  - typings.twilioDashNotifications.twilioDashNotificationsStrings.messageType
*/
trait UpdateReason extends js.Object

object UpdateReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def messageType: typings.twilioDashNotifications.twilioDashNotificationsStrings.messageType = this.cast("messageType")
  @scala.inline
  def notificationId: typings.twilioDashNotifications.twilioDashNotificationsStrings.notificationId = this.cast("notificationId")
  @scala.inline
  def token: typings.twilioDashNotifications.twilioDashNotificationsStrings.token = this.cast("token")
}

