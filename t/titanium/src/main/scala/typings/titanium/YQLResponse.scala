package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties passed to a yql callback to report a success or failure.
  */
trait YQLResponse extends js.Object {
  /**
  	 * Error code. Returns 0 if `success` is `true`.
  	 */
  var code: js.UndefOr[Double] = js.undefined
  /**
  	 * The data payload received from the YQL.
  	 */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var error: js.UndefOr[String] = js.undefined
  /**
  	 * Error message, if any returned. Use `error` instead
  	 */
  var message: js.UndefOr[String] = js.undefined
  /**
  	 * Indicates if the operation succeeded.
  	 */
  var success: js.UndefOr[Boolean] = js.undefined
}

object YQLResponse {
  @scala.inline
  def apply(
    code: Int | Double = null,
    data: js.Any = null,
    error: String = null,
    message: String = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): YQLResponse = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (error != null) __obj.updateDynamic("error")(error)
    if (message != null) __obj.updateDynamic("message")(message)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[YQLResponse]
  }
}

