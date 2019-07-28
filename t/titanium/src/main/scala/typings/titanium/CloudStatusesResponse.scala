package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the callback when a request finishes successfully or erroneously.
  */
trait CloudStatusesResponse extends js.Object {
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
  	 * Set of `statuses` objects, if any exist.
  	 */
  var statuses: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Indicates whether the request succeeded.
  	 */
  var success: js.UndefOr[Boolean] = js.undefined
}

object CloudStatusesResponse {
  @scala.inline
  def apply(
    code: Int | Double = null,
    error: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    meta: js.Any = null,
    statuses: js.Array[_] = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): CloudStatusesResponse = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (message != null) __obj.updateDynamic("message")(message)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (statuses != null) __obj.updateDynamic("statuses")(statuses)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[CloudStatusesResponse]
  }
}

