package typings.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StripeClientCheckoutOptions extends StObject {
  
  var billingAddressCollection: js.UndefOr[billingAddressCollectionType] = js.undefined
  
  var cancelUrl: String
  
  var clientReferenceId: js.UndefOr[String] = js.undefined
  
  var customerEmail: js.UndefOr[String] = js.undefined
  
  var items: js.Array[StripeCheckoutItem]
  
  var locale: js.UndefOr[String] = js.undefined
  
  var successUrl: String
}
object StripeClientCheckoutOptions {
  
  inline def apply(cancelUrl: String, items: js.Array[StripeCheckoutItem], successUrl: String): StripeClientCheckoutOptions = {
    val __obj = js.Dynamic.literal(cancelUrl = cancelUrl.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], successUrl = successUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeClientCheckoutOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StripeClientCheckoutOptions] (val x: Self) extends AnyVal {
    
    inline def setBillingAddressCollection(value: billingAddressCollectionType): Self = StObject.set(x, "billingAddressCollection", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressCollectionUndefined: Self = StObject.set(x, "billingAddressCollection", js.undefined)
    
    inline def setCancelUrl(value: String): Self = StObject.set(x, "cancelUrl", value.asInstanceOf[js.Any])
    
    inline def setClientReferenceId(value: String): Self = StObject.set(x, "clientReferenceId", value.asInstanceOf[js.Any])
    
    inline def setClientReferenceIdUndefined: Self = StObject.set(x, "clientReferenceId", js.undefined)
    
    inline def setCustomerEmail(value: String): Self = StObject.set(x, "customerEmail", value.asInstanceOf[js.Any])
    
    inline def setCustomerEmailUndefined: Self = StObject.set(x, "customerEmail", js.undefined)
    
    inline def setItems(value: js.Array[StripeCheckoutItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: StripeCheckoutItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setSuccessUrl(value: String): Self = StObject.set(x, "successUrl", value.asInstanceOf[js.Any])
  }
}
