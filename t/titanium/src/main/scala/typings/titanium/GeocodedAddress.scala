package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object representing a place, returned in the callback from the
  * [reverseGeocoder](Titanium.Geolocation.reverseGeocoder) method.
  */
@js.native
trait GeocodedAddress extends js.Object {
  
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
  implicit class GeocodedAddressOps[Self <: GeocodedAddress] (val x: Self) extends AnyVal {
    
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
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
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
