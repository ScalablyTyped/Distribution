package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object passed to the
  * [registerForPushNotifications](Titanium.Network.registerForPushNotifications) success callback.
  */
trait PushNotificationSuccessArg extends js.Object {
  /**
  	 * Error code. Returns 0.
  	 */
  var code: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The device token which this device was registered for.
  	 */
  var deviceToken: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Indicates if the operation succeeded. Returns `true`.
  	 */
  var success: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The value of this string is always "remote".
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object PushNotificationSuccessArg {
  @scala.inline
  def apply(
    code: scala.Int | scala.Double = null,
    deviceToken: java.lang.String = null,
    error: java.lang.String = null,
    success: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): PushNotificationSuccessArg = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (deviceToken != null) __obj.updateDynamic("deviceToken")(deviceToken)
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PushNotificationSuccessArg]
  }
}

