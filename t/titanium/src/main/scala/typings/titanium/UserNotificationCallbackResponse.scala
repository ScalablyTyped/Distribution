package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when receiving pending or local notifications
  * in <Titanium.App.iOS.UserNotificationCenter.getPendingNotifications> and
  * <Titanium.App.iOS.UserNotificationCenter.getDeliveredNotifications>.
  */
trait UserNotificationCallbackResponse extends js.Object {
  /**
  	 * An array of identifiers used to create notifications.
  	 */
  var notifications: js.UndefOr[js.Array[UserNotificationDictionary]] = js.undefined
}

object UserNotificationCallbackResponse {
  @scala.inline
  def apply(notifications: js.Array[UserNotificationDictionary] = null): UserNotificationCallbackResponse = {
    val __obj = js.Dynamic.literal()
    if (notifications != null) __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserNotificationCallbackResponse]
  }
}

