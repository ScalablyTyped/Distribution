package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object passed to the
  * [registerForPushNotifications](Titanium.Network.registerForPushNotifications) error callback.
  */
trait PushNotificationErrorArg extends FailureResponse {
  /**
  	 * The value of this string is always "remote".
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object PushNotificationErrorArg {
  @scala.inline
  def apply(
    code: Int | Double = null,
    error: java.lang.String = null,
    success: js.UndefOr[Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): PushNotificationErrorArg = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNotificationErrorArg]
  }
}

