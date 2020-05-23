package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object passed to the
  * [registerForPushNotifications](Titanium.Network.registerForPushNotifications) success callback.
  */
trait PushNotificationSuccessArg extends SuccessResponse {
  /**
    * The device token which this device was registered for.
    */
  var deviceToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The value of this string is always "remote".
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object PushNotificationSuccessArg {
  @scala.inline
  def apply(
    code: js.UndefOr[Double] = js.undefined,
    deviceToken: java.lang.String = null,
    error: java.lang.String = null,
    success: js.UndefOr[Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): PushNotificationSuccessArg = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.get.asInstanceOf[js.Any])
    if (deviceToken != null) __obj.updateDynamic("deviceToken")(deviceToken.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNotificationSuccessArg]
  }
}

