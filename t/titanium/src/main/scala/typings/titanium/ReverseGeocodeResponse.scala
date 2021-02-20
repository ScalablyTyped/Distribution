package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object returned in the callback from the
  * [reverseGeocoder](Titanium.Geolocation.reverseGeocoder) method.
  */
@js.native
trait ReverseGeocodeResponse extends ErrorResponse {
  
  /**
    * An array of reverse-geocoded addresses matching the requested location.
    */
  var places: js.UndefOr[js.Array[GeocodedAddress]] = js.native
}
object ReverseGeocodeResponse {
  
  @scala.inline
  def apply(): ReverseGeocodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReverseGeocodeResponse]
  }
  
  @scala.inline
  implicit class ReverseGeocodeResponseMutableBuilder[Self <: ReverseGeocodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaces(value: js.Array[GeocodedAddress]): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacesUndefined: Self = StObject.set(x, "places", js.undefined)
    
    @scala.inline
    def setPlacesVarargs(value: GeocodedAddress*): Self = StObject.set(x, "places", js.Array(value :_*))
  }
}
