package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object representing a place, returned in the callback from the
  * [reverseGeocoder](Titanium.Geolocation.reverseGeocoder) method.
  */
@js.native
trait GeocodedAddress extends StObject {
  
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
    * Latitude of the geocoded point.
    */
  var latitude: js.UndefOr[Double] = js.native
  
  /**
    * Longitude of the geocoded point.
    */
  var longitude: js.UndefOr[Double] = js.native
  
  /**
    * Postal code
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
object GeocodedAddress {
  
  @scala.inline
  def apply(): GeocodedAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocodedAddress]
  }
  
  @scala.inline
  implicit class GeocodedAddressMutableBuilder[Self <: GeocodedAddress] (val x: Self) extends AnyVal {
    
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
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
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
