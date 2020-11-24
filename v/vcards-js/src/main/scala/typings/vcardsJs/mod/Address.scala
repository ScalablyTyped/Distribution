package typings.vcardsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Address extends js.Object {
  
  /**
    * City
    */
  var city: String = js.native
  
  /**
    * Country or region
    */
  var countryRegion: String = js.native
  
  /**
    * Represents the actual text that should be put on the mailing label when delivering a physical package
    */
  var label: String = js.native
  
  /**
    * Postal code
    */
  var postalCode: String = js.native
  
  /**
    * State or province
    */
  var stateProvince: String = js.native
  
  /**
    * Street address
    */
  var street: String = js.native
}
object Address {
  
  @scala.inline
  def apply(
    city: String,
    countryRegion: String,
    label: String,
    postalCode: String,
    stateProvince: String,
    street: String
  ): Address = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], countryRegion = countryRegion.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], stateProvince = stateProvince.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
    
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
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryRegion(value: String): Self = this.set("countryRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateProvince(value: String): Self = this.set("stateProvince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreet(value: String): Self = this.set("street", value.asInstanceOf[js.Any])
  }
}
