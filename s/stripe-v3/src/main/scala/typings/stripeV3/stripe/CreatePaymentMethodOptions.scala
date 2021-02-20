package typings.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePaymentMethodOptions extends StObject {
  
  /**
    * Billing information associated with the PaymentMethod
    * that may be used or required by particular types of
    * payment methods.
    */
  var billing_details: js.UndefOr[BillingDetails] = js.native
  
  var metadata: js.UndefOr[Metadata] = js.native
}
object CreatePaymentMethodOptions {
  
  @scala.inline
  def apply(): CreatePaymentMethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePaymentMethodOptions]
  }
  
  @scala.inline
  implicit class CreatePaymentMethodOptionsMutableBuilder[Self <: CreatePaymentMethodOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBilling_details(value: BillingDetails): Self = StObject.set(x, "billing_details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBilling_detailsUndefined: Self = StObject.set(x, "billing_details", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
