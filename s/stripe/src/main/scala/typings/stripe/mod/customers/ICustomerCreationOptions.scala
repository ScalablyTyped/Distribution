package typings.stripe.mod.customers

import typings.stripe.anon.Type
import typings.stripe.mod.IAddress
import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IShippingInformation
import typings.stripe.mod.cards.ICardSourceCreationOptionsExtended
import typings.stripe.stripeStrings.exempt
import typings.stripe.stripeStrings.none
import typings.stripe.stripeStrings.now
import typings.stripe.stripeStrings.reverse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomerCreationOptions extends IDataOptionsWithMetadata {
  /**
    * This field has been renamed to balance and will be removed in a future API version.
    * @deprecated
    */
  var account_balance: js.UndefOr[Double] = js.native
  var address: js.UndefOr[IAddress] = js.native
  /***
    * An integer amount in cents that represents the customer’s current balance, which affect the
    * customer’s future invoices. A negative amount represents a credit that decreases the amount
    * due on an invoice; a positive amount increases the amount due on an invoice.
    */
  var balance: js.UndefOr[Double] = js.native
  /**
    * If you provide a coupon code, the customer will have a discount applied on all recurring charges. Charges you create through the
    * API will not have the discount.
    */
  var coupon: js.UndefOr[String] = js.native
  /**
    * An arbitrary string that you can attach to a customer object. It is displayed alongside the customer in the dashboard. This can
    * be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Customer's email address. It's displayed alongside the customer in your dashboard and can be useful for searching and tracking.
    * This can be unset by updating the value to null and then saving.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The prefix for the customer used to generate unique invoice numbers. Must be 3–12 uppercase letters or numbers.
    */
  var invoice_prefix: js.UndefOr[String] = js.native
  /**
    * Default invoice settings for this customer.
    */
  var invoice_settings: js.UndefOr[ICustomerInvoiceSettings | Null] = js.native
  /**
    * The customer’s full name or business name. This can be unset by updating the value to null and then saving.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID of the PaymentMethod to attach to the customer.
    */
  var payment_method: js.UndefOr[String] = js.native
  /**
    * The customer’s phone number. This can be unset by updating the value to null and then saving.
    */
  var phone: js.UndefOr[String] = js.native
  /**
    * The identifier of the plan to subscribe the customer to. If provided, the returned customer object will have a list of subscriptions
    * that the customer is currently subscribed to. If you subscribe a customer to a plan without a free trial, the customer must have a
    * valid card as well.
    */
  var plan: js.UndefOr[String] = js.native
  /**
    * Customer’s preferred languages, ordered by preference. This can be unset by updating the value to null and then saving.
    */
  var preferred_locales: js.UndefOr[js.Array[String]] = js.native
  /**
    * The quantity you'd like to apply to the subscription you're creating (if you pass in a plan). For example, if your plan is
    * 10 cents/user/month, and your customer has 5 users, you could pass 5 as the quantity to have the customer charged 50 cents
    * (5 x 10 cents) monthly. Defaults to 1 if not set. Only applies when the plan parameter is also provided.
    */
  var quantity: js.UndefOr[Double] = js.native
  var shipping: js.UndefOr[IShippingInformation] = js.native
  /**
    * The source can either be a token, like the ones returned by our Stripe.js, or
    * a dictionary containing a user’s credit card details.
    */
  var source: js.UndefOr[String | ICardSourceCreationOptionsExtended] = js.native
  /**
    * The customer’s tax exemption. One of none, exempt, or reverse.
    */
  var tax_exempt: js.UndefOr[none | exempt | reverse] = js.native
  /**
    * The customer’s tax IDs.
    */
  var tax_id_data: js.UndefOr[js.Array[Type]] = js.native
  /**
    * @deprecated
    */
  var tax_info: js.UndefOr[js.Any] = js.native
  /**
    * A positive decimal (with at most two decimal places) between 1 and 100.
    * This represents the percentage of the subscription invoice subtotal that
    * will be calculated and added as tax to the final amount each billing period.
    * For example, a plan which charges $10/month with a tax_percent of 20.0
    * will charge $12 per invoice. Can only be used if a plan is provided.
    */
  var tax_percent: js.UndefOr[Double] = js.native
  /**
    * Unix timestamp representing the end of the trial period the customer will get before being charged. If set, trial_end will
    * override the default trial period of the plan the customer is being subscribed to. The special value now can be provided to
    * end the customer's trial immediately. Only applies when the plan parameter is also provided.
    */
  var trial_end: js.UndefOr[Double | now] = js.native
}

object ICustomerCreationOptions {
  @scala.inline
  def apply(): ICustomerCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICustomerCreationOptions]
  }
  @scala.inline
  implicit class ICustomerCreationOptionsOps[Self <: ICustomerCreationOptions] (val x: Self) extends AnyVal {
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
    def setAccount_balance(value: Double): Self = this.set("account_balance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount_balance: Self = this.set("account_balance", js.undefined)
    @scala.inline
    def setAddress(value: IAddress): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setBalance(value: Double): Self = this.set("balance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBalance: Self = this.set("balance", js.undefined)
    @scala.inline
    def setCoupon(value: String): Self = this.set("coupon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoupon: Self = this.set("coupon", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setInvoice_prefix(value: String): Self = this.set("invoice_prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvoice_prefix: Self = this.set("invoice_prefix", js.undefined)
    @scala.inline
    def setInvoice_settings(value: ICustomerInvoiceSettings): Self = this.set("invoice_settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvoice_settings: Self = this.set("invoice_settings", js.undefined)
    @scala.inline
    def setInvoice_settingsNull: Self = this.set("invoice_settings", null)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPayment_method(value: String): Self = this.set("payment_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_method: Self = this.set("payment_method", js.undefined)
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    @scala.inline
    def setPlan(value: String): Self = this.set("plan", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlan: Self = this.set("plan", js.undefined)
    @scala.inline
    def setPreferred_localesVarargs(value: String*): Self = this.set("preferred_locales", js.Array(value :_*))
    @scala.inline
    def setPreferred_locales(value: js.Array[String]): Self = this.set("preferred_locales", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferred_locales: Self = this.set("preferred_locales", js.undefined)
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    @scala.inline
    def setShipping(value: IShippingInformation): Self = this.set("shipping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipping: Self = this.set("shipping", js.undefined)
    @scala.inline
    def setSource(value: String | ICardSourceCreationOptionsExtended): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setTax_exempt(value: none | exempt | reverse): Self = this.set("tax_exempt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTax_exempt: Self = this.set("tax_exempt", js.undefined)
    @scala.inline
    def setTax_id_dataVarargs(value: Type*): Self = this.set("tax_id_data", js.Array(value :_*))
    @scala.inline
    def setTax_id_data(value: js.Array[Type]): Self = this.set("tax_id_data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTax_id_data: Self = this.set("tax_id_data", js.undefined)
    @scala.inline
    def setTax_info(value: js.Any): Self = this.set("tax_info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTax_info: Self = this.set("tax_info", js.undefined)
    @scala.inline
    def setTax_percent(value: Double): Self = this.set("tax_percent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTax_percent: Self = this.set("tax_percent", js.undefined)
    @scala.inline
    def setTrial_end(value: Double | now): Self = this.set("trial_end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrial_end: Self = this.set("trial_end", js.undefined)
  }
  
}

