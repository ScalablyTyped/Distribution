package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddControlNotificationOptions extends js.Object {
  /**
    * A collection of actions
    */
  var actions: js.UndefOr[js.Array[ControlNotificationAction]] = js.undefined
  /**
    * The message to display in the notification.
    * In the current release, only the first message specified in this array will be displayed.
    */
  var messages: js.Array[java.lang.String]
  /**
    * Defines the type of notification.
    */
  var notificationLevel: js.UndefOr[NotificationLevel] = js.undefined
  /**
    * The ID to use to clear this notification when using the clearNotification method.
    */
  var uniqueId: java.lang.String
}

object AddControlNotificationOptions {
  @scala.inline
  def apply(
    messages: js.Array[java.lang.String],
    uniqueId: java.lang.String,
    actions: js.Array[ControlNotificationAction] = null,
    notificationLevel: NotificationLevel = null
  ): AddControlNotificationOptions = {
    val __obj = js.Dynamic.literal(messages = messages, uniqueId = uniqueId)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (notificationLevel != null) __obj.updateDynamic("notificationLevel")(notificationLevel)
    __obj.asInstanceOf[AddControlNotificationOptions]
  }
}

