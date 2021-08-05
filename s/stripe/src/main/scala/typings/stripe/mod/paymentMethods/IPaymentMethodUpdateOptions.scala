package typings.stripe.mod.paymentMethods

import typings.stripe.anon.Address
import typings.stripe.anon.Expmonth
import typings.stripe.mod.IMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPaymentMethodUpdateOptions extends StObject {
  
  /** Billing information associated with the PaymentMethod that may be used or required by particular types of payment methods. */
  var billing_details: js.UndefOr[Address] = js.undefined
  
  var card: js.UndefOr[Expmonth] = js.undefined
  
  /** Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. */
  var metadata: js.UndefOr[IMetadata] = js.undefined
}
object IPaymentMethodUpdateOptions {
  
  inline def apply(): IPaymentMethodUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaymentMethodUpdateOptions]
  }
  
  extension [Self <: IPaymentMethodUpdateOptions](x: Self) {
    
    inline def setBilling_details(value: Address): Self = StObject.set(x, "billing_details", value.asInstanceOf[js.Any])
    
    inline def setBilling_detailsUndefined: Self = StObject.set(x, "billing_details", js.undefined)
    
    inline def setCard(value: Expmonth): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
