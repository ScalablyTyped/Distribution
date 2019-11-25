package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the [getCurrentHeading](Titanium.Geolocation.getCurrentHeading) callback.
  */
trait HeadingResponse extends js.Object {
  /**
  	 * Error code.
  	 */
  var code: js.UndefOr[Double] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var error: js.UndefOr[String] = js.undefined
  /**
  	 * If `success` is true, the actual heading data.
  	 */
  var heading: js.UndefOr[HeadingData] = js.undefined
  /**
  	 * Indicates a successful operation.
  	 */
  var success: js.UndefOr[Boolean] = js.undefined
}

object HeadingResponse {
  @scala.inline
  def apply(
    code: Int | Double = null,
    error: String = null,
    heading: HeadingData = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): HeadingResponse = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadingResponse]
  }
}

