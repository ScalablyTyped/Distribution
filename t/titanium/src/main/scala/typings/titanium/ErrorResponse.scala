package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties used in any event or callback which needs to report a success or failure.
  */
trait ErrorResponse extends js.Object {
  /**
    * Error code. Returns 0 if `success` is `true`.
    */
  var code: js.UndefOr[Double] = js.undefined
  /**
    * Error message, if any returned.
    */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates if the operation succeeded.
    */
  var success: js.UndefOr[Boolean] = js.undefined
}

object ErrorResponse {
  @scala.inline
  def apply(
    code: js.UndefOr[Double] = js.undefined,
    error: java.lang.String = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): ErrorResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorResponse]
  }
}

