package typings
package titaniumLib

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
  var code: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The data payload received from the YQL.
  	 */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Error message, if any returned. Use `error` instead
  	 */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Indicates if the operation succeeded.
  	 */
  var success: js.UndefOr[scala.Boolean] = js.undefined
}

object YQLResponse {
  @scala.inline
  def apply(
    code: scala.Int | scala.Double = null,
    data: js.Any = null,
    error: java.lang.String = null,
    message: java.lang.String = null,
    success: js.UndefOr[scala.Boolean] = js.undefined
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

