package typings.titanium

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
  var code: js.UndefOr[Double] = js.undefined
  /**
  	 * The device token which this device was registered for.
  	 */
  var deviceToken: js.UndefOr[String] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var error: js.UndefOr[String] = js.undefined
  /**
  	 * Indicates if the operation succeeded. Returns `true`.
  	 */
  var success: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The value of this string is always "remote".
  	 */
  var `type`: js.UndefOr[String] = js.undefined
}

object PushNotificationSuccessArg {
  @scala.inline
  def apply(
    code: Int | Double = null,
    deviceToken: String = null,
    error: String = null,
    success: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): PushNotificationSuccessArg = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (deviceToken != null) __obj.updateDynamic("deviceToken")(deviceToken.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNotificationSuccessArg]
  }
}

