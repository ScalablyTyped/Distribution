package typings.stripeV3.stripe

import typings.stripeV3.anon.BillingdetailsCard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmPaymentIntentWithoutElementsOptions extends ConfirmPaymentIntentOptions {
  
  /**
    * Only one of payment_method_data and payment_method is required.
    * Use payment_method to specify an existing PaymentMethod to use
    * for this payment.
    */
  var payment_method: js.UndefOr[String] = js.native
  
  /**
    * Use this parameter to supply additional data relevant to
    * the payment method, such as billing details
    */
  @JSName("payment_method_data")
  var payment_method_data_ConfirmPaymentIntentWithoutElementsOptions: js.UndefOr[BillingdetailsCard] = js.native
}
object ConfirmPaymentIntentWithoutElementsOptions {
  
  @scala.inline
  def apply(): ConfirmPaymentIntentWithoutElementsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmPaymentIntentWithoutElementsOptions]
  }
  
  @scala.inline
  implicit class ConfirmPaymentIntentWithoutElementsOptionsMutableBuilder[Self <: ConfirmPaymentIntentWithoutElementsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayment_method(value: String): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
    
    @scala.inline
    def setPayment_method_data(value: BillingdetailsCard): Self = StObject.set(x, "payment_method_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_method_dataUndefined: Self = StObject.set(x, "payment_method_data", js.undefined)
  }
}
