package typings.stripe.mod.paymentIntents

import typings.stripe.anon.`0`
import typings.stripe.mod.IOptionsMetadata
import typings.stripe.mod.IShippingInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPaymentIntentUpdateOptions extends StObject {
  
  /**
    * Amount intended to be collected by this PaymentIntent (in cents).
    */
  var amount: js.UndefOr[Double] = js.undefined
  
  /**
    * The amount of the application fee in cents (if any) that will be applied to the payment and transferred to the application owner’s Stripe account. To use an application fee, the request must be made on behalf of another account, using the `Stripe-Account` header or an OAuth key.
    */
  var application_fee_amount: js.UndefOr[Double] = js.undefined
  
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the customer this PaymentIntent is for if one exists.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users. This can be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A set of key/value pairs that you can attach to an object. It can be
    * useful for storing additional information about the object in a structured
    * format. You can unset an individual key by setting its value to null and
    * then saving. To clear all keys, set metadata to null, then save.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
  
  /**
    * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object) to attach to this PaymentIntent.
    */
  var payment_method: js.UndefOr[String] = js.undefined
  
  /**
    * The list of payment method types that this PaymentIntent is allowed to use.
    */
  var payment_method_types: js.UndefOr[js.Array[PaymentIntentPaymentMethodType]] = js.undefined
  
  /**
    * Email address that the receipt for the resulting payment will be sent to.
    */
  var receipt_email: js.UndefOr[String] = js.undefined
  
  /**
    * Set to `true` to save this PaymentIntent’s payment method to the associated Customer, if the payment method is not already attached. This parameter only applies to the payment method passed in the same request or the current payment method attached to the PaymentIntent and must be specified again if a new payment method is added.
    */
  var save_payment_method: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates that you intend to make future payments with this PaymentIntent’s payment method.
    */
  var setup_future_usage: js.UndefOr[PaymentIntentFutureUsageType] = js.undefined
  
  /**
    * Shipping information for this PaymentIntent.
    */
  var shipping: js.UndefOr[IShippingInformation] = js.undefined
  
  /**
    * Extra information about a PaymentIntent. This will appear on your customer’s statement when this PaymentIntent succeeds in creating a charge.
    */
  var statement_descriptor: js.UndefOr[String] = js.undefined
  
  /**
    * Provides information about a card payment that customers see on their statements. Concatenated with the prefix (shortened descriptor) or statement descriptor that’s set on the account to form the complete statement descriptor.
    */
  var statement_descriptor_suffix: js.UndefOr[String] = js.undefined
  
  /**
    * The parameters used to automatically create a Transfer when the payment succeeds.
    */
  var transfer_data: js.UndefOr[`0`] = js.undefined
  
  /**
    * A string that identifies the resulting payment as part of a group.
    */
  var transfer_group: js.UndefOr[String] = js.undefined
}
object IPaymentIntentUpdateOptions {
  
  @scala.inline
  def apply(): IPaymentIntentUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaymentIntentUpdateOptions]
  }
  
  @scala.inline
  implicit class IPaymentIntentUpdateOptionsMutableBuilder[Self <: IPaymentIntentUpdateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setApplication_fee_amount(value: Double): Self = StObject.set(x, "application_fee_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication_fee_amountUndefined: Self = StObject.set(x, "application_fee_amount", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setMetadata(value: IOptionsMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setPayment_method(value: String): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
    
    @scala.inline
    def setPayment_method_types(value: js.Array[PaymentIntentPaymentMethodType]): Self = StObject.set(x, "payment_method_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_method_typesUndefined: Self = StObject.set(x, "payment_method_types", js.undefined)
    
    @scala.inline
    def setPayment_method_typesVarargs(value: PaymentIntentPaymentMethodType*): Self = StObject.set(x, "payment_method_types", js.Array(value :_*))
    
    @scala.inline
    def setReceipt_email(value: String): Self = StObject.set(x, "receipt_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceipt_emailUndefined: Self = StObject.set(x, "receipt_email", js.undefined)
    
    @scala.inline
    def setSave_payment_method(value: Boolean): Self = StObject.set(x, "save_payment_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave_payment_methodUndefined: Self = StObject.set(x, "save_payment_method", js.undefined)
    
    @scala.inline
    def setSetup_future_usage(value: PaymentIntentFutureUsageType): Self = StObject.set(x, "setup_future_usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetup_future_usageUndefined: Self = StObject.set(x, "setup_future_usage", js.undefined)
    
    @scala.inline
    def setShipping(value: IShippingInformation): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
    
    @scala.inline
    def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement_descriptorUndefined: Self = StObject.set(x, "statement_descriptor", js.undefined)
    
    @scala.inline
    def setStatement_descriptor_suffix(value: String): Self = StObject.set(x, "statement_descriptor_suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement_descriptor_suffixUndefined: Self = StObject.set(x, "statement_descriptor_suffix", js.undefined)
    
    @scala.inline
    def setTransfer_data(value: `0`): Self = StObject.set(x, "transfer_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransfer_dataUndefined: Self = StObject.set(x, "transfer_data", js.undefined)
    
    @scala.inline
    def setTransfer_group(value: String): Self = StObject.set(x, "transfer_group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransfer_groupUndefined: Self = StObject.set(x, "transfer_group", js.undefined)
  }
}
