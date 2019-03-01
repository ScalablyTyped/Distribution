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

object PushNotificationConfig {
  @scala.inline
  def apply(
    callback: js.Function1[/* param0 */ PushNotificationData, _] = null,
    error: js.Function1[/* param0 */ PushNotificationErrorArg, _] = null,
    success: js.Function1[/* param0 */ PushNotificationSuccessArg, _] = null,
    types: js.Array[scala.Double] = null
  ): PushNotificationConfig = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (error != null) __obj.updateDynamic("error")(error)
    if (success != null) __obj.updateDynamic("success")(success)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[PushNotificationConfig]
  }
}

