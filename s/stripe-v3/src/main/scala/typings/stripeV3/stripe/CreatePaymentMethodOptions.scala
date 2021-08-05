package typings.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePaymentMethodOptions extends StObject {
  
  /**
    * Billing information associated with the PaymentMethod
    * that may be used or required by particular types of
    * payment methods.
    */
  var billing_details: js.UndefOr[BillingDetails] = js.undefined
  
  var metadata: js.UndefOr[Metadata] = js.undefined
}
object CreatePaymentMethodOptions {
  
  inline def apply(): CreatePaymentMethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePaymentMethodOptions]
  }
  
  extension [Self <: CreatePaymentMethodOptions](x: Self) {
    
    inline def setBilling_details(value: BillingDetails): Self = StObject.set(x, "billing_details", value.asInstanceOf[js.Any])
    
    inline def setBilling_detailsUndefined: Self = StObject.set(x, "billing_details", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
