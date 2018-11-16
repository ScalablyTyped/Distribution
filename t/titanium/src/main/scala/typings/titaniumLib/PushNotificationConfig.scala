package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Simple object for specifying push notification options to
 * [registerForPushNotifications](Titanium.Network.registerForPushNotifications).
 */

trait PushNotificationConfig extends js.Object {
  /**
  	 * Callback function invoked upon receiving a new push notification.
  	 */
  var callback: js.UndefOr[js.Function1[/* param0 */ PushNotificationData, _]] = js.undefined
  /**
  	 * Callback function called when an error occurs during registration.
  	 */
  var error: js.UndefOr[js.Function1[/* param0 */ PushNotificationErrorArg, _]] = js.undefined
  /**
  	 * Callback function called when the push registration is successfully completed.
  	 */
  var success: js.UndefOr[js.Function1[/* param0 */ PushNotificationSuccessArg, _]] = js.undefined
  /**
  	 * Array of `NOTIFICATION_TYPE` constants that the application would like to receive.
  	 */
  var types: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

