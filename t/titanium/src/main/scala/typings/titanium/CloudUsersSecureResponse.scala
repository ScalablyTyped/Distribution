package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the callback when a request finishes successfully or erroneously.
  */
trait CloudUsersSecureResponse extends js.Object {
  /**
  	 * Identifies the current access token when using 3-Legged OAuth.
  	 */
  var accessToken: js.UndefOr[String] = js.undefined
  /**
  	 * Error code, if any returned.
  	 */
  var code: js.UndefOr[Double] = js.undefined
  /**
  	 * Indicates whether the request failed.
  	 */
  var error: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Indicates the number of seconds before the access token expires.
  	 */
  var expiresIn: js.UndefOr[Double] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var message: js.UndefOr[String] = js.undefined
  /**
  	 * Meta data, if any returned.
  	 */
  var meta: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Indicates whether the request succeeded.
  	 */
  var success: js.UndefOr[Boolean] = js.undefined
}

object CloudUsersSecureResponse {
  @scala.inline
  def apply(
    accessToken: String = null,
    code: Int | Double = null,
    error: js.UndefOr[Boolean] = js.undefined,
    expiresIn: Int | Double = null,
    message: String = null,
    meta: js.Any = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): CloudUsersSecureResponse = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[CloudUsersSecureResponse]
  }
}

