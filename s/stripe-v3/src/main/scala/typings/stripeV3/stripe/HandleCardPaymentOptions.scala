package typings.stripeV3.stripe

import typings.stripeV3.anon.Billingdetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleCardPaymentOptions extends StObject {
  
  /**
    * Use this parameter to supply additional data relevant to
    * the payment method, such as billing details
    */
  var payment_method_data: js.UndefOr[Billingdetails] = js.undefined
  
  /**
    * Email address that the receipt for the resulting payment will be sent to.
    */
  var receipt_email: js.UndefOr[String] = js.undefined
  
  /**
    * If the PaymentIntent is associated with a customer and this parameter
    * is set to true, the provided payment method will be attached to the
    * customer. Default is false.
    */
  var save_payment_method: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The shipping details for the payment, if collected. [Recommended]
    */
  var shipping: js.UndefOr[ShippingDetails] = js.undefined
}
object HandleCardPaymentOptions {
  
  @scala.inline
  def apply(): HandleCardPaymentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleCardPaymentOptions]
  }
  
  @scala.inline
  implicit class HandleCardPaymentOptionsMutableBuilder[Self <: HandleCardPaymentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayment_method_data(value: Billingdetails): Self = StObject.set(x, "payment_method_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_method_dataUndefined: Self = StObject.set(x, "payment_method_data", js.undefined)
    
    @scala.inline
    def setReceipt_email(value: String): Self = StObject.set(x, "receipt_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceipt_emailUndefined: Self = StObject.set(x, "receipt_email", js.undefined)
    
    @scala.inline
    def setSave_payment_method(value: Boolean): Self = StObject.set(x, "save_payment_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave_payment_methodUndefined: Self = StObject.set(x, "save_payment_method", js.undefined)
    
    @scala.inline
    def setShipping(value: ShippingDetails): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
  }
}
