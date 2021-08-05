package typings.stripe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShippingInformation extends StObject {
  
  /**
    * Shipping address.
    */
  var address: IAddress
  
  /**
    * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc.
    */
  var carrier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Recipient name.
    */
  var name: String
  
  /**
    * Recipient phone (including extension).
    */
  var phone: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The tracking number for a physical product, obtained from the delivery service. If multiple
    * tracking numbers were generated for this purchase, please separate them with commas.
    */
  var tracking_number: js.UndefOr[String | Null] = js.undefined
}
object IShippingInformation {
  
  inline def apply(address: IAddress, name: String): IShippingInformation = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShippingInformation]
  }
  
  extension [Self <: IShippingInformation](x: Self) {
    
    inline def setAddress(value: IAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    inline def setCarrierNull: Self = StObject.set(x, "carrier", null)
    
    inline def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneNull: Self = StObject.set(x, "phone", null)
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setTracking_number(value: String): Self = StObject.set(x, "tracking_number", value.asInstanceOf[js.Any])
    
    inline def setTracking_numberNull: Self = StObject.set(x, "tracking_number", null)
    
    inline def setTracking_numberUndefined: Self = StObject.set(x, "tracking_number", js.undefined)
  }
}
