package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object returned in the callback from the
  * [forwardGeocoder](Titanium.Geolocation.forwardGeocoder) method.
  * Note that Android includes a number of extra fields.
  */
@js.native
trait ForwardGeocodeResponse extends ErrorResponse {
  
  /**
    * Estimated accuracy of the geocoding, in meters.
    */
  var accuracy: js.UndefOr[Double] = js.native
  
  /**
    * Full address.
    */
  var address: js.UndefOr[String] = js.native
  
  /**
    * City name.
    */
  var city: js.UndefOr[String] = js.native
  
  /**
    * Country name.
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * Country code.
    */
  var countryCode: js.UndefOr[String] = js.native
  
  /**
    * Country code. Same as `countryCode`.
    */
  var country_code: js.UndefOr[String] = js.native
  
  /**
    * Display address. Identical to `address`.
    */
  var displayAddress: js.UndefOr[String] = js.native
  
  /**
    * Latitude of the geocoded address.
    */
  var latitude: js.UndefOr[String] = js.native
  
  /**
    * Longitude of the geocoded address.
    */
  var longitude: js.UndefOr[String] = js.native
  
  /**
    * Postal code.
    */
  var postalCode: js.UndefOr[String] = js.native
  
  /**
    * First line of region.
    */
  var region1: js.UndefOr[String] = js.native
  
  /**
    * Not used.
    */
  var region2: js.UndefOr[String] = js.native
  
  /**
    * Street name, without street address.
    */
  var street: js.UndefOr[String] = js.native
  
  /**
    * Street name.
    */
  var street1: js.UndefOr[String] = js.native
}
object ForwardGeocodeResponse {
  
  @scala.inline
  def apply(): ForwardGeocodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardGeocodeResponse]
  }
  
  @scala.inline
  implicit class ForwardGeocodeResponseMutableBuilder[Self <: ForwardGeocodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry_codeUndefined: Self = StObject.set(x, "country_code", js.undefined)
    
    @scala.inline
    def setDisplayAddress(value: String): Self = StObject.set(x, "displayAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayAddressUndefined: Self = StObject.set(x, "displayAddress", js.undefined)
    
    @scala.inline
    def setLatitude(value: String): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: String): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    @scala.inline
    def setRegion1(value: String): Self = StObject.set(x, "region1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion1Undefined: Self = StObject.set(x, "region1", js.undefined)
    
    @scala.inline
    def setRegion2(value: String): Self = StObject.set(x, "region2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion2Undefined: Self = StObject.set(x, "region2", js.undefined)
    
    @scala.inline
    def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreet1(value: String): Self = StObject.set(x, "street1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreet1Undefined: Self = StObject.set(x, "street1", js.undefined)
    
    @scala.inline
    def setStreetUndefined: Self = StObject.set(x, "street", js.undefined)
  }
}
