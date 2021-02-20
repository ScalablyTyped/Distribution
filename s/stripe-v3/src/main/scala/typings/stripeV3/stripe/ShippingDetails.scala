package typings.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShippingDetails extends StObject {
  
  /** Shipping address. */
  var address: ShippingDetailsAddress = js.native
  
  /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
  var carrier: js.UndefOr[String] = js.native
  
  /** Recipient name. */
  var name: String = js.native
  
  /** Recipient phone (including extension). */
  var phone: js.UndefOr[String] = js.native
  
  /**
    * The tracking number for a physical product, obtained from the delivery service.
    * If multiple tracking numbers were generated for this purchase, please separate them with commas.
    */
  var tracking_number: js.UndefOr[String] = js.native
}
object ShippingDetails {
  
  @scala.inline
  def apply(address: ShippingDetailsAddress, name: String): ShippingDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingDetails]
  }
  
  @scala.inline
  implicit class ShippingDetailsMutableBuilder[Self <: ShippingDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: ShippingDetailsAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    @scala.inline
    def setTracking_number(value: String): Self = StObject.set(x, "tracking_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracking_numberUndefined: Self = StObject.set(x, "tracking_number", js.undefined)
  }
}
