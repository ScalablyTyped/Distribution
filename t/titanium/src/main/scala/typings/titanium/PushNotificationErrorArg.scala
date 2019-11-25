package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object passed to the
  * [registerForPushNotifications](Titanium.Network.registerForPushNotifications) error callback.
  */
trait PushNotificationErrorArg extends js.Object {
  /**
  	 * Error code. Returns a non-zero value.
  	 */
  var code: js.UndefOr[Double] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var error: js.UndefOr[String] = js.undefined
  /**
  	 * Indicates if the operation succeeded. Returns `false`.
  	 */
  var success: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The value of this string is always "remote".
  	 */
  var `type`: js.UndefOr[String] = js.undefined
}

object PushNotificationErrorArg {
  @scala.inline
  def apply(
    code: Int | Double = null,
    error: String = null,
    success: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): PushNotificationErrorArg = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNotificationErrorArg]
  }
}

