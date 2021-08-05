package typings.stripe.mod.paymentIntents

import typings.stripe.stripeStrings.automatic
import typings.stripe.stripeStrings.manual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPaymentIntentCreationOptions
  extends StObject
     with IPaymentIntentUpdateOptions {
  
  /**
    * Capture method of this PaymentIntent.
    */
  var capture_method: js.UndefOr[automatic | manual] = js.undefined
  
  /**
    * Attempt to confirm this PaymentIntent immediately. If the payment method attached is a card, a return_url must be provided in case additional authentication is required.
    */
  var confirm: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to use the publishable key automatic method, or the secret key manual method
    */
  var confirmation_method: js.UndefOr[automatic | manual] = js.undefined
  
  /**
    * Set to true to indicate that the customer is not in your checkout flow during this payment attempt, and therefore is unable to authenticate. This parameter is intended for scenarios where you collect card details and charge them later.
    */
  var off_session: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Stripe account ID for which these funds are intended.
    */
  var on_behalf_of: js.UndefOr[String] = js.undefined
  
  /**
    * Payment-method-specific configuration for this PaymentIntent.
    */
  var payment_method_options: js.UndefOr[IPaymentMethodOptions] = js.undefined
  
  /**
    * The URL to redirect your customer back to after they authenticate or cancel their payment on the payment method’s app or site. If you’d prefer to redirect to a mobile application, you can alternatively supply an application URI scheme. This param can only be used if `confirm=true`.
    */
  var return_url: js.UndefOr[String] = js.undefined
  
  /**
    * The parameters used to automatically create a Transfer when the payment succeeds.
    */
  @JSName("transfer_data")
  var transfer_data_IPaymentIntentCreationOptions: js.UndefOr[IPaymentIntentTransferData] = js.undefined
}
object IPaymentIntentCreationOptions {
  
  inline def apply(): IPaymentIntentCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaymentIntentCreationOptions]
  }
  
  extension [Self <: IPaymentIntentCreationOptions](x: Self) {
    
    inline def setCapture_method(value: automatic | manual): Self = StObject.set(x, "capture_method", value.asInstanceOf[js.Any])
    
    inline def setCapture_methodUndefined: Self = StObject.set(x, "capture_method", js.undefined)
    
    inline def setConfirm(value: Boolean): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    
    inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
    
    inline def setConfirmation_method(value: automatic | manual): Self = StObject.set(x, "confirmation_method", value.asInstanceOf[js.Any])
    
    inline def setConfirmation_methodUndefined: Self = StObject.set(x, "confirmation_method", js.undefined)
    
    inline def setOff_session(value: Boolean): Self = StObject.set(x, "off_session", value.asInstanceOf[js.Any])
    
    inline def setOff_sessionUndefined: Self = StObject.set(x, "off_session", js.undefined)
    
    inline def setOn_behalf_of(value: String): Self = StObject.set(x, "on_behalf_of", value.asInstanceOf[js.Any])
    
    inline def setOn_behalf_ofUndefined: Self = StObject.set(x, "on_behalf_of", js.undefined)
    
    inline def setPayment_method_options(value: IPaymentMethodOptions): Self = StObject.set(x, "payment_method_options", value.asInstanceOf[js.Any])
    
    inline def setPayment_method_optionsUndefined: Self = StObject.set(x, "payment_method_options", js.undefined)
    
    inline def setReturn_url(value: String): Self = StObject.set(x, "return_url", value.asInstanceOf[js.Any])
    
    inline def setReturn_urlUndefined: Self = StObject.set(x, "return_url", js.undefined)
    
    inline def setTransfer_data(value: IPaymentIntentTransferData): Self = StObject.set(x, "transfer_data", value.asInstanceOf[js.Any])
    
    inline def setTransfer_dataUndefined: Self = StObject.set(x, "transfer_data", js.undefined)
  }
}
