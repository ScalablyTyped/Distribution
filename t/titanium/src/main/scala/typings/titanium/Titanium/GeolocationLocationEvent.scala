package typings.titanium.Titanium

import typings.titanium.LocationCoordinates
import typings.titanium.LocationProviderDict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a location update is received.
  */
@js.native
trait GeolocationLocationEvent extends GeolocationBaseEvent {
  
  /**
    * if `success` is false, the error code if available.
    */
  var code: Double = js.native
  
  /**
    * If `success` is true, actual location data for this update.
    */
  var coords: LocationCoordinates = js.native
  
  /**
    * If `success` is false, a string describing the error.
    */
  var error: String = js.native
  
  /**
    * If `success` is true, object describing the location provider generating this update.
    */
  var provider: LocationProviderDict = js.native
  
  /**
    * Indicates if location data was successfully retrieved.
    */
  var success: Boolean = js.native
}
object GeolocationLocationEvent {
  
  @scala.inline
  def apply(
    code: Double,
    coords: LocationCoordinates,
    error: String,
    provider: LocationProviderDict,
    source: Geolocation,
    success: Boolean
  ): GeolocationLocationEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], coords = coords.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationLocationEvent]
  }
  
  @scala.inline
  implicit class GeolocationLocationEventOps[Self <: GeolocationLocationEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoords(value: LocationCoordinates): Self = this.set("coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: LocationProviderDict): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
}
