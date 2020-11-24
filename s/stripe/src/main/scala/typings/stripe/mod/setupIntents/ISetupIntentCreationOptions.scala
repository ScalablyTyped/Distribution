package typings.stripe.mod.setupIntents

import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISetupIntentCreationOptions extends js.Object {
  
  /**
    * Set to `true` to attempt to confirm this SetupIntent immediately. This parameter defaults
    * to `false`. If the payment method attached is a card, a return_url may be provided in case
    * additional authentication is required.
    */
  var confirm: js.UndefOr[Boolean] = js.native
  
  /**
    * ID of the Customer this SetupIntent belongs to, if one exists.
    *
    * If present, payment methods used with this SetupIntent can only be attached to this
    * Customer, and payment methods attached to other Customers cannot be used with this
    * SetupIntent.
    */
  var customer: js.UndefOr[String] = js.native
  
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    * This can be unset by updating the value to `null` and then saving.
    */
  var description: js.UndefOr[String | Null] = js.native
  
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing
    * additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
  
  /**
    * The Stripe account ID for which this SetupIntent is created.
    */
  var on_behalf_of: js.UndefOr[String] = js.native
  
  /**
    * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object)
    * to attach to this SetupIntent.
    */
  var payment_method: js.UndefOr[String] = js.native
  
  /**
    * Payment-method-specific configuration for this SetupIntent.
    */
  var payment_method_options: js.UndefOr[ISetupIntentPaymentMethodOptions] = js.native
  
  /**
    * The list of payment method types (e.g. card) that this SetupIntent is allowed to use.
    */
  var payment_method_types: js.UndefOr[js.Array[SetupIntentPaymentMethodType]] = js.native
  
  /**
    * The URL to redirect your customer back to after they authenticate or cancel their payment on
    * the payment method’s app or site. If you’d prefer to redirect to a mobile application, you
    * can alternatively supply an application URI scheme. This parameter can only be used with
    * `confirm=true`.
    */
  var return_url: js.UndefOr[String] = js.native
  
  /**
    * Indicates how the payment method is intended to be used in the future.
    *
    * Use `on_session` if you intend to only reuse the payment method when the customer is in your checkout flow. Use `off_session` if your customer may or may not be in your checkout flow. If not provided, this value defaults to `off_session`.
    */
  var usage: js.UndefOr[SetupIntentUsageType] = js.native
}
object ISetupIntentCreationOptions {
  
  @scala.inline
  def apply(): ISetupIntentCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISetupIntentCreationOptions]
  }
  
  @scala.inline
  implicit class ISetupIntentCreationOptionsOps[Self <: ISetupIntentCreationOptions] (val x: Self) extends AnyVal {
    
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
    def setConfirm(value: Boolean): Self = this.set("confirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirm: Self = this.set("confirm", js.undefined)
    
    @scala.inline
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setMetadata(value: IOptionsMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setOn_behalf_of(value: String): Self = this.set("on_behalf_of", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOn_behalf_of: Self = this.set("on_behalf_of", js.undefined)
    
    @scala.inline
    def setPayment_method(value: String): Self = this.set("payment_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayment_method: Self = this.set("payment_method", js.undefined)
    
    @scala.inline
    def setPayment_method_options(value: ISetupIntentPaymentMethodOptions): Self = this.set("payment_method_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayment_method_options: Self = this.set("payment_method_options", js.undefined)
    
    @scala.inline
    def setPayment_method_typesVarargs(value: SetupIntentPaymentMethodType*): Self = this.set("payment_method_types", js.Array(value :_*))
    
    @scala.inline
    def setPayment_method_types(value: js.Array[SetupIntentPaymentMethodType]): Self = this.set("payment_method_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayment_method_types: Self = this.set("payment_method_types", js.undefined)
    
    @scala.inline
    def setReturn_url(value: String): Self = this.set("return_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturn_url: Self = this.set("return_url", js.undefined)
    
    @scala.inline
    def setUsage(value: SetupIntentUsageType): Self = this.set("usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
  }
}
