package typings.stripeV3.stripe

import typings.stripeV3.anon.`0`
import typings.stripeV3.stripeV3Strings.off_session
import typings.stripeV3.stripeV3Strings.on_session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data to be sent with the request.
  * Refer to the Payment Intents API for a full list of parameters.
  */
trait ConfirmCardPaymentData extends StObject {
  
  /*
    * Either the id of an existing PaymentMethod,
    * or an object containing data to create a PaymentMethod with.
    * See the use case sections below for details.
    * Recomended
    */
  var payment_method: js.UndefOr[String | `0`] = js.undefined
  
  /**
    * Email address that the receipt for the resulting payment will be sent to.
    */
  var receipt_email: js.UndefOr[String] = js.undefined
  
  /**
    * If you are handling next actions yourself,
    * pass in a return_url. If the subsequent action is redirect_to_url,
    * this URL will be used on the return path for the redirect.
    */
  var return_url: js.UndefOr[String] = js.undefined
  
  /**
    * If the PaymentIntent is associated with a customer and this parameter is set to true,
    * the provided payment method will be attached to the customer. Default is false.
    */
  var save_payment_method: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates that you intend to make future payments with this PaymentIntent's payment method.
    */
  var setup_future_usage: js.UndefOr[on_session | off_session] = js.undefined
  
  /**
    * The shipping details for the payment, if collected.
    * Recomended
    */
  var shipping: js.UndefOr[ShippingDetails] = js.undefined
}
object ConfirmCardPaymentData {
  
  @scala.inline
  def apply(): ConfirmCardPaymentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmCardPaymentData]
  }
  
  @scala.inline
  implicit class ConfirmCardPaymentDataMutableBuilder[Self <: ConfirmCardPaymentData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayment_method(value: String | `0`): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
    
    @scala.inline
    def setReceipt_email(value: String): Self = StObject.set(x, "receipt_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceipt_emailUndefined: Self = StObject.set(x, "receipt_email", js.undefined)
    
    @scala.inline
    def setReturn_url(value: String): Self = StObject.set(x, "return_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_urlUndefined: Self = StObject.set(x, "return_url", js.undefined)
    
    @scala.inline
    def setSave_payment_method(value: Boolean): Self = StObject.set(x, "save_payment_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave_payment_methodUndefined: Self = StObject.set(x, "save_payment_method", js.undefined)
    
    @scala.inline
    def setSetup_future_usage(value: on_session | off_session): Self = StObject.set(x, "setup_future_usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetup_future_usageUndefined: Self = StObject.set(x, "setup_future_usage", js.undefined)
    
    @scala.inline
    def setShipping(value: ShippingDetails): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
  }
}
