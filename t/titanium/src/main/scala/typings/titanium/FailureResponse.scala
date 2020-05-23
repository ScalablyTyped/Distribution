package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties used in any event or callback which needs to report a failure.
  */
trait FailureResponse extends ErrorResponse

object FailureResponse {
  @scala.inline
  def apply(
    code: js.UndefOr[Double] = js.undefined,
    error: java.lang.String = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): FailureResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailureResponse]
  }
}

