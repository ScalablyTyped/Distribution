package typings.stripe.mod.paymentIntents

import typings.stripe.mod.setupIntents.ISetupIntentTransferData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPaymentIntentCaptureOptions extends StObject {
  
  /**
    * The amount to capture (in cents) from the PaymentIntent, which must be less than or equal to the original amount. Any additional amount will be automatically refunded. Defaults to the full `amount_capturable` if not provided.
    */
  var amount_to_capture: js.UndefOr[Double] = js.native
  
  /**
    * The amount of the application fee (if any) that will be applied to the payment and transferred to the application owner’s Stripe account. To use an application fee, the request must be made on behalf of another account, using the `Stripe-Account` header or an OAuth key.
    */
  var application_fee_amount: js.UndefOr[Double] = js.native
  
  /**
    * The account (if any) for which the funds of the PaymentIntent are intended. Used with connected accounts.
    */
  var on_behalf_of: js.UndefOr[String] = js.native
  
  /**
    * The data with which to automatically create a Transfer when the payment is finalized. Used with connected accounts.
    */
  var transfer_data: js.UndefOr[ISetupIntentTransferData] = js.native
}
object IPaymentIntentCaptureOptions {
  
  @scala.inline
  def apply(): IPaymentIntentCaptureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaymentIntentCaptureOptions]
  }
  
  @scala.inline
  implicit class IPaymentIntentCaptureOptionsMutableBuilder[Self <: IPaymentIntentCaptureOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount_to_capture(value: Double): Self = StObject.set(x, "amount_to_capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount_to_captureUndefined: Self = StObject.set(x, "amount_to_capture", js.undefined)
    
    @scala.inline
    def setApplication_fee_amount(value: Double): Self = StObject.set(x, "application_fee_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication_fee_amountUndefined: Self = StObject.set(x, "application_fee_amount", js.undefined)
    
    @scala.inline
    def setOn_behalf_of(value: String): Self = StObject.set(x, "on_behalf_of", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn_behalf_ofUndefined: Self = StObject.set(x, "on_behalf_of", js.undefined)
    
    @scala.inline
    def setTransfer_data(value: ISetupIntentTransferData): Self = StObject.set(x, "transfer_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransfer_dataUndefined: Self = StObject.set(x, "transfer_data", js.undefined)
  }
}
