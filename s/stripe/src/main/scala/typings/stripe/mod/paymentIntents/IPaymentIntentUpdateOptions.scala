package typings.stripe.mod.paymentIntents

import typings.stripe.anon.`0`
import typings.stripe.mod.IOptionsMetadata
import typings.stripe.mod.IShippingInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPaymentIntentUpdateOptions extends js.Object {
  /**
    * Amount intended to be collected by this PaymentIntent (in cents).
    */
  var amount: js.UndefOr[Double] = js.native
  /**
    * The amount of the application fee in cents (if any) that will be applied to the payment and transferred to the application owner’s Stripe account. To use an application fee, the request must be made on behalf of another account, using the `Stripe-Account` header or an OAuth key.
    */
  var application_fee_amount: js.UndefOr[Double] = js.native
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * ID of the customer this PaymentIntent is for if one exists.
    */
  var customer: js.UndefOr[String] = js.native
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users. This can be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[String | Null] = js.native
  /**
    * A set of key/value pairs that you can attach to an object. It can be
    * useful for storing additional information about the object in a structured
    * format. You can unset an individual key by setting its value to null and
    * then saving. To clear all keys, set metadata to null, then save.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
  /**
    * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object) to attach to this PaymentIntent.
    */
  var payment_method: js.UndefOr[String] = js.native
  /**
    * The list of payment method types that this PaymentIntent is allowed to use.
    */
  var payment_method_types: js.UndefOr[js.Array[PaymentIntentPaymentMethodType]] = js.native
  /**
    * Email address that the receipt for the resulting payment will be sent to.
    */
  var receipt_email: js.UndefOr[String] = js.native
  /**
    * Set to `true` to save this PaymentIntent’s payment method to the associated Customer, if the payment method is not already attached. This parameter only applies to the payment method passed in the same request or the current payment method attached to the PaymentIntent and must be specified again if a new payment method is added.
    */
  var save_payment_method: js.UndefOr[Boolean] = js.native
  /**
    * Indicates that you intend to make future payments with this PaymentIntent’s payment method.
    */
  var setup_future_usage: js.UndefOr[PaymentIntentFutureUsageType] = js.native
  /**
    * Shipping information for this PaymentIntent.
    */
  var shipping: js.UndefOr[IShippingInformation] = js.native
  /**
    * Extra information about a PaymentIntent. This will appear on your customer’s statement when this PaymentIntent succeeds in creating a charge.
    */
  var statement_descriptor: js.UndefOr[String] = js.native
  /**
    * Provides information about a card payment that customers see on their statements. Concatenated with the prefix (shortened descriptor) or statement descriptor that’s set on the account to form the complete statement descriptor.
    */
  var statement_descriptor_suffix: js.UndefOr[String] = js.native
  /**
    * The parameters used to automatically create a Transfer when the payment succeeds.
    */
  var transfer_data: js.UndefOr[`0`] = js.native
  /**
    * A string that identifies the resulting payment as part of a group.
    */
  var transfer_group: js.UndefOr[String] = js.native
}

object IPaymentIntentUpdateOptions {
  @scala.inline
  def apply(): IPaymentIntentUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaymentIntentUpdateOptions]
  }
  @scala.inline
  implicit class IPaymentIntentUpdateOptionsOps[Self <: IPaymentIntentUpdateOptions] (val x: Self) extends AnyVal {
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setApplication_fee_amount(value: Double): Self = this.set("application_fee_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplication_fee_amount: Self = this.set("application_fee_amount", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
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
    def setPayment_method(value: String): Self = this.set("payment_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_method: Self = this.set("payment_method", js.undefined)
    @scala.inline
    def setPayment_method_typesVarargs(value: PaymentIntentPaymentMethodType*): Self = this.set("payment_method_types", js.Array(value :_*))
    @scala.inline
    def setPayment_method_types(value: js.Array[PaymentIntentPaymentMethodType]): Self = this.set("payment_method_types", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_method_types: Self = this.set("payment_method_types", js.undefined)
    @scala.inline
    def setReceipt_email(value: String): Self = this.set("receipt_email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceipt_email: Self = this.set("receipt_email", js.undefined)
    @scala.inline
    def setSave_payment_method(value: Boolean): Self = this.set("save_payment_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSave_payment_method: Self = this.set("save_payment_method", js.undefined)
    @scala.inline
    def setSetup_future_usage(value: PaymentIntentFutureUsageType): Self = this.set("setup_future_usage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetup_future_usage: Self = this.set("setup_future_usage", js.undefined)
    @scala.inline
    def setShipping(value: IShippingInformation): Self = this.set("shipping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipping: Self = this.set("shipping", js.undefined)
    @scala.inline
    def setStatement_descriptor(value: String): Self = this.set("statement_descriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatement_descriptor: Self = this.set("statement_descriptor", js.undefined)
    @scala.inline
    def setStatement_descriptor_suffix(value: String): Self = this.set("statement_descriptor_suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatement_descriptor_suffix: Self = this.set("statement_descriptor_suffix", js.undefined)
    @scala.inline
    def setTransfer_data(value: `0`): Self = this.set("transfer_data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransfer_data: Self = this.set("transfer_data", js.undefined)
    @scala.inline
    def setTransfer_group(value: String): Self = this.set("transfer_group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransfer_group: Self = this.set("transfer_group", js.undefined)
  }
  
}

