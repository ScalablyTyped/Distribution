package typings.stripe.mod.paymentIntents

import typings.stripe.mod.IAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPaymentIntentDataShipping extends StObject {
  
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
  implicit class IPaymentIntentDataShippingMutableBuilder[Self <: IPaymentIntentDataShipping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: IAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierNull: Self = StObject.set(x, "carrier", null)
    
    @scala.inline
    def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNull: Self = StObject.set(x, "phone", null)
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    @scala.inline
    def setTracking_number(value: String): Self = StObject.set(x, "tracking_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracking_numberNull: Self = StObject.set(x, "tracking_number", null)
    
    @scala.inline
    def setTracking_numberUndefined: Self = StObject.set(x, "tracking_number", js.undefined)
  }
}
