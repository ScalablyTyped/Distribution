package typings.stripe.stripeMod.customers

import typings.stripe.Anon_Type
import typings.stripe.stripeMod.IAddress
import typings.stripe.stripeMod.IDataOptionsWithMetadata
import typings.stripe.stripeMod.IOptionsMetadata
import typings.stripe.stripeMod.IShippingInformation
import typings.stripe.stripeMod.cards.ICardSourceCreationOptionsExtended
import typings.stripe.stripeStrings.exempt
import typings.stripe.stripeStrings.none
import typings.stripe.stripeStrings.now
import typings.stripe.stripeStrings.reverse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomerCreationOptions extends IDataOptionsWithMetadata {
  /**
    * This field has been renamed to balance and will be removed in a future API version.
    * @deprecated
    */
  var account_balance: js.UndefOr[Double] = js.undefined
  var address: js.UndefOr[IAddress] = js.undefined
  /***
    * An integer amount in cents that represents the customer’s current balance, which affect the
    * customer’s future invoices. A negative amount represents a credit that decreases the amount
    * due on an invoice; a positive amount increases the amount due on an invoice.
    */
  var balance: js.UndefOr[Double] = js.undefined
  /**
    * If you provide a coupon code, the customer will have a discount applied on all recurring charges. Charges you create through the
    * API will not have the discount.
    */
  var coupon: js.UndefOr[String] = js.undefined
  /**
    * An arbitrary string that you can attach to a customer object. It is displayed alongside the customer in the dashboard. This can
    * be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Customer's email address. It's displayed alongside the customer in your dashboard and can be useful for searching and tracking.
    * This can be unset by updating the value to null and then saving.
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * The prefix for the customer used to generate unique invoice numbers. Must be 3–12 uppercase letters or numbers.
    */
  var invoice_prefix: js.UndefOr[String] = js.undefined
  /**
    * Default invoice settings for this customer.
    */
  var invoice_settings: js.UndefOr[ICustomerInvoiceSettings | Null] = js.undefined
  /**
    * The customer’s full name or business name. This can be unset by updating the value to null and then saving.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The ID of the PaymentMethod to attach to the customer.
    */
  var payment_method: js.UndefOr[String] = js.undefined
  /**
    * The customer’s phone number. This can be unset by updating the value to null and then saving.
    */
  var phone: js.UndefOr[String] = js.undefined
  /**
    * The identifier of the plan to subscribe the customer to. If provided, the returned customer object will have a list of subscriptions
    * that the customer is currently subscribed to. If you subscribe a customer to a plan without a free trial, the customer must have a
    * valid card as well.
    */
  var plan: js.UndefOr[String] = js.undefined
  /**
    * Customer’s preferred languages, ordered by preference. This can be unset by updating the value to null and then saving.
    */
  var preferred_locales: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The quantity you'd like to apply to the subscription you're creating (if you pass in a plan). For example, if your plan is
    * 10 cents/user/month, and your customer has 5 users, you could pass 5 as the quantity to have the customer charged 50 cents
    * (5 x 10 cents) monthly. Defaults to 1 if not set. Only applies when the plan parameter is also provided.
    */
  var quantity: js.UndefOr[Double] = js.undefined
  var shipping: js.UndefOr[IShippingInformation] = js.undefined
  /**
    * The source can either be a token, like the ones returned by our Stripe.js, or
    * a dictionary containing a user’s credit card details.
    */
  var source: js.UndefOr[String | ICardSourceCreationOptionsExtended] = js.undefined
  /**
    * The customer’s tax exemption. One of none, exempt, or reverse.
    */
  var tax_exempt: js.UndefOr[none | exempt | reverse] = js.undefined
  /**
    * The customer’s tax IDs.
    */
  var tax_id_data: js.UndefOr[js.Array[Anon_Type]] = js.undefined
  /**
    * @deprecated
    */
  var tax_info: js.UndefOr[js.Any] = js.undefined
  /**
    * A positive decimal (with at most two decimal places) between 1 and 100.
    * This represents the percentage of the subscription invoice subtotal that
    * will be calculated and added as tax to the final amount each billing period.
    * For example, a plan which charges $10/month with a tax_percent of 20.0
    * will charge $12 per invoice. Can only be used if a plan is provided.
    */
  var tax_percent: js.UndefOr[Double] = js.undefined
  /**
    * Unix timestamp representing the end of the trial period the customer will get before being charged. If set, trial_end will
    * override the default trial period of the plan the customer is being subscribed to. The special value now can be provided to
    * end the customer's trial immediately. Only applies when the plan parameter is also provided.
    */
  var trial_end: js.UndefOr[Double | now] = js.undefined
}

object ICustomerCreationOptions {
  @scala.inline
  def apply(
    account_balance: Int | Double = null,
    address: IAddress = null,
    balance: Int | Double = null,
    coupon: String = null,
    description: String = null,
    email: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    invoice_prefix: String = null,
    invoice_settings: ICustomerInvoiceSettings = null,
    metadata: IOptionsMetadata = null,
    name: String = null,
    payment_method: String = null,
    phone: String = null,
    plan: String = null,
    preferred_locales: js.Array[String] = null,
    quantity: Int | Double = null,
    shipping: IShippingInformation = null,
    source: String | ICardSourceCreationOptionsExtended = null,
    tax_exempt: none | exempt | reverse = null,
    tax_id_data: js.Array[Anon_Type] = null,
    tax_info: js.Any = null,
    tax_percent: Int | Double = null,
    trial_end: Double | now = null
  ): ICustomerCreationOptions = {
    val __obj = js.Dynamic.literal()
    if (account_balance != null) __obj.updateDynamic("account_balance")(account_balance.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (balance != null) __obj.updateDynamic("balance")(balance.asInstanceOf[js.Any])
    if (coupon != null) __obj.updateDynamic("coupon")(coupon.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (invoice_prefix != null) __obj.updateDynamic("invoice_prefix")(invoice_prefix.asInstanceOf[js.Any])
    if (invoice_settings != null) __obj.updateDynamic("invoice_settings")(invoice_settings.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (plan != null) __obj.updateDynamic("plan")(plan.asInstanceOf[js.Any])
    if (preferred_locales != null) __obj.updateDynamic("preferred_locales")(preferred_locales.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (tax_exempt != null) __obj.updateDynamic("tax_exempt")(tax_exempt.asInstanceOf[js.Any])
    if (tax_id_data != null) __obj.updateDynamic("tax_id_data")(tax_id_data.asInstanceOf[js.Any])
    if (tax_info != null) __obj.updateDynamic("tax_info")(tax_info.asInstanceOf[js.Any])
    if (tax_percent != null) __obj.updateDynamic("tax_percent")(tax_percent.asInstanceOf[js.Any])
    if (trial_end != null) __obj.updateDynamic("trial_end")(trial_end.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomerCreationOptions]
  }
}

