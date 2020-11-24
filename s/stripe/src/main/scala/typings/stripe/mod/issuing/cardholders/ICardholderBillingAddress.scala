package typings.stripe.mod.issuing.cardholders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICardholderBillingAddress extends js.Object {
  
  /**
    * City/District/Suburb/Town/Village.
    */
  var city: String = js.native
  
  /**
    * 2-letter country code.
    */
  var country: String = js.native
  
  /**
    * Address line 1 (Street address/PO Box/Company name).
    */
  var line1: String = js.native
  
  /**
    * Address line 2 (Apartment/Suite/Unit/Building).
    */
  var line2: js.UndefOr[String] = js.native
  
  /**
    * ZIP or postal code.
    */
  var postal_code: String = js.native
  
  /**
    * State/County/Province/Region.
    */
  var state: js.UndefOr[String] = js.native
}
object ICardholderBillingAddress {
  
  @scala.inline
  def apply(city: String, country: String, line1: String, postal_code: String): ICardholderBillingAddress = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], line1 = line1.asInstanceOf[js.Any], postal_code = postal_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardholderBillingAddress]
  }
  
  @scala.inline
  implicit class ICardholderBillingAddressOps[Self <: ICardholderBillingAddress] (val x: Self) extends AnyVal {
    
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine1(value: String): Self = this.set("line1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostal_code(value: String): Self = this.set("postal_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine2(value: String): Self = this.set("line2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine2: Self = this.set("line2", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
