package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the [getCurrentPosition](Titanium.Geolocation.getCurrentPosition) callback.
  */
@js.native
trait LocationResults extends ErrorResponse {
  /**
    * If `success` is true, actual location data for this update.
    */
  var coords: js.UndefOr[LocationCoordinates] = js.native
  /**
    * If `success` is true, object describing the location provider generating this update.
    */
  var provider: js.UndefOr[LocationProviderDict] = js.native
}

object LocationResults {
  @scala.inline
  def apply(): LocationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationResults]
  }
  @scala.inline
  implicit class LocationResultsOps[Self <: LocationResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCoords(value: LocationCoordinates): Self = this.set("coords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoords: Self = this.set("coords", js.undefined)
    @scala.inline
    def setProvider(value: LocationProviderDict): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
  }
  
}

