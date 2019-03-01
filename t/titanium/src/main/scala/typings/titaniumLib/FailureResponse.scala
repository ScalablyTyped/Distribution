package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties used in any event or callback which needs to report a failure.
  */
trait FailureResponse extends js.Object {
  /**
  	 * Error code. Returns a non-zero value.
  	 */
  var code: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Indicates if the operation succeeded. Returns `false`.
  	 */
  var success: js.UndefOr[scala.Boolean] = js.undefined
}

object FailureResponse {
  @scala.inline
  def apply(
    code: scala.Int | scala.Double = null,
    error: java.lang.String = null,
    success: js.UndefOr[scala.Boolean] = js.undefined
  ): FailureResponse = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[FailureResponse]
  }
}

