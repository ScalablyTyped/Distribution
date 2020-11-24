package typings.stripe.mod.paymentIntents

import typings.stripe.mod.IAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPaymentIntentDataShipping extends js.Object {
  
  /**
    * Shipping address.
    */
  var address: IAddress = js.native
  
  /**
    * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. This can be unset by updating the value to null and then saving.
    */
  var carrier: js.UndefOr[String | Null] = js.native
  
  /**
    * Recipient name. This can be unset by updating the value to null and then saving.
    */
  var name: String | Null = js.native
  
  /**
    * Recipient phone (including extension). This can be unset by updating the value to null and then saving.
    */
  var phone: js.UndefOr[String | Null] = js.native
  
  /**
    * The tracking number for a physical product, obtained from the delivery service. If multiple tracking numbers were generated for this purchase, please separate them with commas. This can be unset by updating the value to null and then saving.
    */
  var tracking_number: js.UndefOr[String | Null] = js.native
}
object IPaymentIntentDataShipping {
  
  @scala.inline
  def apply(address: IAddress): IPaymentIntentDataShipping = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentIntentDataShipping]
  }
  
  @scala.inline
  implicit class IPaymentIntentDataShippingOps[Self <: IPaymentIntentDataShipping] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: IAddress): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrier(value: String): Self = this.set("carrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrier: Self = this.set("carrier", js.undefined)
    
    @scala.inline
    def setCarrierNull: Self = this.set("carrier", null)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    
    @scala.inline
    def setPhoneNull: Self = this.set("phone", null)
    
    @scala.inline
    def setTracking_number(value: String): Self = this.set("tracking_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTracking_number: Self = this.set("tracking_number", js.undefined)
    
    @scala.inline
    def setTracking_numberNull: Self = this.set("tracking_number", null)
  }
}
