package typings
package titaniumLib

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

