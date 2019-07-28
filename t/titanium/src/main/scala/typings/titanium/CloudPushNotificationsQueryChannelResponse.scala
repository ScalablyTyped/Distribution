package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the callback when a request finishes successfully.
  */
trait CloudPushNotificationsQueryChannelResponse extends js.Object {
  /**
  	 * Error code, if any returned.
  	 */
  var code: js.UndefOr[Double] = js.undefined
  /**
  	 * Indicates whether the request failed.
  	 */
  var error: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var message: js.UndefOr[String] = js.undefined
  /**
  	 * Meta data, if any returned.
  	 */
  var meta: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Array of `push_channel` names, if any exist.
  	 */
  var push_channels: js.UndefOr[js.Array[String]] = js.undefined
  /**
  	 * Indicates whether the request succeeded.
  	 */
  var success: js.UndefOr[Boolean] = js.undefined
}

object CloudPushNotificationsQueryChannelResponse {
  @scala.inline
  def apply(
    code: Int | Double = null,
    error: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    meta: js.Any = null,
    push_channels: js.Array[String] = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): CloudPushNotificationsQueryChannelResponse = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (message != null) __obj.updateDynamic("message")(message)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (push_channels != null) __obj.updateDynamic("push_channels")(push_channels)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[CloudPushNotificationsQueryChannelResponse]
  }
}

