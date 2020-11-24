package typings.stripejs.shippingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShippingAddress extends js.Object {
  
  /**
    * An array of address line items
    * @example ['185 Berry St.', 'Suite 500', 'P.O. Box 12345']
    */
  var addressLine: js.Array[String] = js.native
  
  /**
    * The name of a city, town, village, etc
    */
  var city: String = js.native
  
  /**
    * Two-letter country code, capitalized
    * NOTE: The codes are specified by the ISO3166 alpha-2
    */
  var country: String = js.native
  
  /**
    * A logical subdivision of a city
    * NOTE: Not present on Apple platforms
    */
  var dependentLocality: String = js.native
  
  /**
    * The phone number of the recipient
    * NOTE: This is only filled if `requestPayerPhone` was set to `true`
    *
    * @see PaymentOptions.requestPayerPhone
    */
  var phone: String = js.native
  
  /**
    * The postal code or ZIP code
    * NOTE: This is known as the PIN code in India
    */
  var postalCode: String = js.native
  
  /**
    * The name of the recipient.
    * NOTE: This might be a person, a business name, or contain “care of” (c/o) instructions
    */
  var recipient: String = js.native
  
  /**
    * The most coarse subdivision of a country
    * NOTE: Depending on the country, this might correspond to a state, a province, an oblast, a prefecture,
    * or something else along these lines.
    */
  var region: String = js.native
  
  /**
    * The sorting code as used in, for example, France
    * NOTE: Not present on Apple platforms
    */
  var sortingCode: String = js.native
}
object ShippingAddress {
  
  @scala.inline
  def apply(
    addressLine: js.Array[String],
    city: String,
    country: String,
    dependentLocality: String,
    phone: String,
    postalCode: String,
    recipient: String,
    region: String,
    sortingCode: String
  ): ShippingAddress = {
    val __obj = js.Dynamic.literal(addressLine = addressLine.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], dependentLocality = dependentLocality.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], sortingCode = sortingCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingAddress]
  }
  
  @scala.inline
  implicit class ShippingAddressOps[Self <: ShippingAddress] (val x: Self) extends AnyVal {
    
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
    def setAddressLineVarargs(value: String*): Self = this.set("addressLine", js.Array(value :_*))
    
    @scala.inline
    def setAddressLine(value: js.Array[String]): Self = this.set("addressLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependentLocality(value: String): Self = this.set("dependentLocality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient(value: String): Self = this.set("recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingCode(value: String): Self = this.set("sortingCode", value.asInstanceOf[js.Any])
  }
}
