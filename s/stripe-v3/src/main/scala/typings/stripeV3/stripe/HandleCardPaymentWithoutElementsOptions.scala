package typings.stripeV3.stripe

import typings.stripeV3.anon.BillingdetailsCard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleCardPaymentWithoutElementsOptions extends HandleCardPaymentOptions {
  
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
  var payment_method_data_HandleCardPaymentWithoutElementsOptions: js.UndefOr[BillingdetailsCard] = js.native
  
  /**
    * Instead of payment_method, the ID of a Source may be passed in.
    * (Note that this is undocumented as of August 2019).
    */
  var source: js.UndefOr[String] = js.native
}
object HandleCardPaymentWithoutElementsOptions {
  
  @scala.inline
  def apply(): HandleCardPaymentWithoutElementsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleCardPaymentWithoutElementsOptions]
  }
  
  @scala.inline
  implicit class HandleCardPaymentWithoutElementsOptionsMutableBuilder[Self <: HandleCardPaymentWithoutElementsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayment_method(value: String): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
    
    @scala.inline
    def setPayment_method_data(value: BillingdetailsCard): Self = StObject.set(x, "payment_method_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_method_dataUndefined: Self = StObject.set(x, "payment_method_data", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
