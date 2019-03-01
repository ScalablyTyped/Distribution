package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the callback when a request finishes successfully or erroneously.
  */
trait CloudFriendRequestsResponse extends js.Object {
  /**
  	 * Error code, if any returned.
  	 */
  var code: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Indicates whether the request failed.
  	 */
  var error: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Set of `user` objects, if any exist.
  	 */
  var friend_requests: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Meta data, if any returned.
  	 */
  var meta: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Indicates whether the request succeeded.
  	 */
  var success: js.UndefOr[scala.Boolean] = js.undefined
}

object CloudFriendRequestsResponse {
  @scala.inline
  def apply(
    code: scala.Int | scala.Double = null,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    friend_requests: js.Array[_] = null,
    message: java.lang.String = null,
    meta: js.Any = null,
    success: js.UndefOr[scala.Boolean] = js.undefined
  ): CloudFriendRequestsResponse = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (friend_requests != null) __obj.updateDynamic("friend_requests")(friend_requests)
    if (message != null) __obj.updateDynamic("message")(message)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[CloudFriendRequestsResponse]
  }
}

