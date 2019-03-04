package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated Use {@link Xrm.Controls.AddControlNotificationOptions} instead.
  */
trait AddControlNotificationOptions
  extends xrmLib.XrmNs.ControlsNs.AddControlNotificationOptions

object AddControlNotificationOptions {
  @scala.inline
  def apply(
    messages: js.Array[java.lang.String],
    uniqueId: java.lang.String,
    actions: js.Array[xrmLib.XrmNs.ControlsNs.ControlNotificationAction] = null,
    notificationLevel: xrmLib.XrmNs.ControlsNs.NotificationLevel = null
  ): AddControlNotificationOptions = {
    val __obj = js.Dynamic.literal(messages = messages, uniqueId = uniqueId)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (notificationLevel != null) __obj.updateDynamic("notificationLevel")(notificationLevel)
    __obj.asInstanceOf[AddControlNotificationOptions]
  }
}

