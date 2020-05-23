package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties passed to a yql callback to report a success or failure.
  */
trait YQLResponse extends ErrorResponse {
  /**
    * The data payload received from the YQL.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * Error message, if any returned. Use `error` instead
    * @deprecated
    */
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object YQLResponse {
  @scala.inline
  def apply(
    code: js.UndefOr[Double] = js.undefined,
    data: js.Any = null,
    error: java.lang.String = null,
    message: java.lang.String = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): YQLResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[YQLResponse]
  }
}

