package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the [getCurrentPosition](Titanium.Geolocation.getCurrentPosition) callback.
  */
trait LocationResults extends js.Object {
  /**
  	 * Error code. Returns 0 if `success` is `true`.
  	 */
  var code: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * If `success` is true, actual location data for this update.
  	 */
  var coords: js.UndefOr[LocationCoordinates] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * If `success` is true, object describing the location provider generating this update.
  	 */
  var provider: js.UndefOr[LocationProviderDict] = js.undefined
  /**
  	 * Indicates if the operation succeeded.
  	 */
  var success: js.UndefOr[scala.Boolean] = js.undefined
}

object LocationResults {
  @scala.inline
  def apply(
    code: scala.Int | scala.Double = null,
    coords: LocationCoordinates = null,
    error: java.lang.String = null,
    provider: LocationProviderDict = null,
    success: js.UndefOr[scala.Boolean] = js.undefined
  ): LocationResults = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (coords != null) __obj.updateDynamic("coords")(coords)
    if (error != null) __obj.updateDynamic("error")(error)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[LocationResults]
  }
}

