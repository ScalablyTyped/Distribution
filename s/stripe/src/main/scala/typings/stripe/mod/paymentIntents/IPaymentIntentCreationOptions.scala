package typings.stripe.mod.paymentIntents

import typings.stripe.stripeStrings.automatic
import typings.stripe.stripeStrings.manual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPaymentIntentCreationOptions extends IPaymentIntentUpdateOptions {
  
  /**
    * Capture method of this PaymentIntent.
    */
  var capture_method: js.UndefOr[automatic | manual] = js.native
  
  /**
    * Attempt to confirm this PaymentIntent immediately. If the payment method attached is a card, a return_url must be provided in case additional authentication is required.
    */
  var confirm: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to use the publishable key automatic method, or the secret key manual method
    */
  var confirmation_method: js.UndefOr[automatic | manual] = js.native
  
  /**
    * Set to true to indicate that the customer is not in your checkout flow during this payment attempt, and therefore is unable to authenticate. This parameter is intended for scenarios where you collect card details and charge them later.
    */
  var off_session: js.UndefOr[Boolean] = js.native
  
  /**
    * The Stripe account ID for which these funds are intended.
    */
  var on_behalf_of: js.UndefOr[String] = js.native
  
  /**
    * Payment-method-specific configuration for this PaymentIntent.
    */
  var payment_method_options: js.UndefOr[IPaymentMethodOptions] = js.native
  
  /**
    * The URL to redirect your customer back to after they authenticate or cancel their payment on the payment method’s app or site. If you’d prefer to redirect to a mobile application, you can alternatively supply an application URI scheme. This param can only be used if `confirm=true`.
    */
  var return_url: js.UndefOr[String] = js.native
  
  /**
    * The parameters used to automatically create a Transfer when the payment succeeds.
    */
  @JSName("transfer_data")
  var transfer_data_IPaymentIntentCreationOptions: js.UndefOr[IPaymentIntentTransferData] = js.native
}
object IPaymentIntentCreationOptions {
  
  @scala.inline
  def apply(): IPaymentIntentCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaymentIntentCreationOptions]
  }
  
  @scala.inline
  implicit class IPaymentIntentCreationOptionsOps[Self <: IPaymentIntentCreationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCapture_method(value: automatic | manual): Self = this.set("capture_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapture_method: Self = this.set("capture_method", js.undefined)
    
    @scala.inline
    def setConfirm(value: Boolean): Self = this.set("confirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirm: Self = this.set("confirm", js.undefined)
    
    @scala.inline
    def setConfirmation_method(value: automatic | manual): Self = this.set("confirmation_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmation_method: Self = this.set("confirmation_method", js.undefined)
    
    @scala.inline
    def setOff_session(value: Boolean): Self = this.set("off_session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOff_session: Self = this.set("off_session", js.undefined)
    
    @scala.inline
    def setOn_behalf_of(value: String): Self = this.set("on_behalf_of", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOn_behalf_of: Self = this.set("on_behalf_of", js.undefined)
    
    @scala.inline
    def setPayment_method_options(value: IPaymentMethodOptions): Self = this.set("payment_method_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayment_method_options: Self = this.set("payment_method_options", js.undefined)
    
    @scala.inline
    def setReturn_url(value: String): Self = this.set("return_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturn_url: Self = this.set("return_url", js.undefined)
    
    @scala.inline
    def setTransfer_data(value: IPaymentIntentTransferData): Self = this.set("transfer_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransfer_data: Self = this.set("transfer_data", js.undefined)
  }
}
