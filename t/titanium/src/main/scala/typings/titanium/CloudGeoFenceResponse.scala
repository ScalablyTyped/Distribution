package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the callback when a request finishes successfully or erroneously.
  */
trait CloudGeoFenceResponse extends js.Object {
  /**
  	 * Error code, if any returned.
  	 */
  var code: js.UndefOr[Double] = js.undefined
  /**
  	 * Indicates whether the request failed.
  	 */
  var error: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Set of geo-fence objects, if any exist.
  	 */
  var geo_fences: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var message: js.UndefOr[String] = js.undefined
  /**
  	 * Meta data, if any returned.
  	 */
  var meta: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Indicates whether the request succeeded.
  	 */
  var success: js.UndefOr[Boolean] = js.undefined
}

object CloudGeoFenceResponse {
  @scala.inline
  def apply(
    code: Int | Double = null,
    error: js.UndefOr[Boolean] = js.undefined,
    geo_fences: js.Array[_] = null,
    message: String = null,
    meta: js.Any = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): CloudGeoFenceResponse = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (geo_fences != null) __obj.updateDynamic("geo_fences")(geo_fences)
    if (message != null) __obj.updateDynamic("message")(message)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[CloudGeoFenceResponse]
  }
}

