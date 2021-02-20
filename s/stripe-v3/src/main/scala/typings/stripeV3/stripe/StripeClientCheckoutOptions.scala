package typings.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripeClientCheckoutOptions extends StObject {
  
  var billingAddressCollection: js.UndefOr[billingAddressCollectionType] = js.native
  
  var cancelUrl: String = js.native
  
  var clientReferenceId: js.UndefOr[String] = js.native
  
  var customerEmail: js.UndefOr[String] = js.native
  
  var items: js.Array[StripeCheckoutItem] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var successUrl: String = js.native
}
object StripeClientCheckoutOptions {
  
  @scala.inline
  def apply(cancelUrl: String, items: js.Array[StripeCheckoutItem], successUrl: String): StripeClientCheckoutOptions = {
    val __obj = js.Dynamic.literal(cancelUrl = cancelUrl.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], successUrl = successUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeClientCheckoutOptions]
  }
  
  @scala.inline
  implicit class StripeClientCheckoutOptionsMutableBuilder[Self <: StripeClientCheckoutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingAddressCollection(value: billingAddressCollectionType): Self = StObject.set(x, "billingAddressCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingAddressCollectionUndefined: Self = StObject.set(x, "billingAddressCollection", js.undefined)
    
    @scala.inline
    def setCancelUrl(value: String): Self = StObject.set(x, "cancelUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientReferenceId(value: String): Self = StObject.set(x, "clientReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientReferenceIdUndefined: Self = StObject.set(x, "clientReferenceId", js.undefined)
    
    @scala.inline
    def setCustomerEmail(value: String): Self = StObject.set(x, "customerEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerEmailUndefined: Self = StObject.set(x, "customerEmail", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[StripeCheckoutItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: StripeCheckoutItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setSuccessUrl(value: String): Self = StObject.set(x, "successUrl", value.asInstanceOf[js.Any])
  }
}
