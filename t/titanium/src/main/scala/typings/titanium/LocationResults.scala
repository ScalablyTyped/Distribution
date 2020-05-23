package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the [getCurrentPosition](Titanium.Geolocation.getCurrentPosition) callback.
  */
trait LocationResults extends ErrorResponse {
  /**
    * If `success` is true, actual location data for this update.
    */
  var coords: js.UndefOr[LocationCoordinates] = js.undefined
  /**
    * If `success` is true, object describing the location provider generating this update.
    */
  var provider: js.UndefOr[LocationProviderDict] = js.undefined
}

object LocationResults {
  @scala.inline
  def apply(
    code: js.UndefOr[Double] = js.undefined,
    coords: LocationCoordinates = null,
    error: java.lang.String = null,
    provider: LocationProviderDict = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): LocationResults = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.get.asInstanceOf[js.Any])
    if (coords != null) __obj.updateDynamic("coords")(coords.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationResults]
  }
}

