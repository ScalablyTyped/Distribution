package typings.titanium

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
  implicit class ForwardGeocodeResponseOps[Self <: ForwardGeocodeResponse] (val x: Self) extends AnyVal {
    
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
    def setAccuracy(value: Double): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccuracy: Self = this.set("accuracy", js.undefined)
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    
    @scala.inline
    def setCountry_code(value: String): Self = this.set("country_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry_code: Self = this.set("country_code", js.undefined)
    
    @scala.inline
    def setDisplayAddress(value: String): Self = this.set("displayAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayAddress: Self = this.set("displayAddress", js.undefined)
    
    @scala.inline
    def setLatitude(value: String): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: String): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    
    @scala.inline
    def setRegion1(value: String): Self = this.set("region1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion1: Self = this.set("region1", js.undefined)
    
    @scala.inline
    def setRegion2(value: String): Self = this.set("region2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion2: Self = this.set("region2", js.undefined)
    
    @scala.inline
    def setStreet(value: String): Self = this.set("street", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreet: Self = this.set("street", js.undefined)
    
    @scala.inline
    def setStreet1(value: String): Self = this.set("street1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreet1: Self = this.set("street1", js.undefined)
  }
}
