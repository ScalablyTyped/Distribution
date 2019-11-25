package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The parameter passed to the `error` callback of <PreviewImageOptions>.
  */
trait PreviewImageError extends js.Object {
  /**
  	 * Error code, if applicable.
  	 */
  var code: js.UndefOr[Double] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var error: js.UndefOr[String] = js.undefined
  /**
  	 * Description of the error.
  	 */
  var message: js.UndefOr[String] = js.undefined
  /**
  	 * Indicates if the operation succeeded. Returns `false`.
  	 */
  var success: js.UndefOr[Boolean] = js.undefined
}

object PreviewImageError {
  @scala.inline
  def apply(
    code: Int | Double = null,
    error: String = null,
    message: String = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): PreviewImageError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewImageError]
  }
}

