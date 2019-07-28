package typings.stripe.stripeMod.customersNs

import typings.stripe.stripeMod.IAddress
import typings.stripe.stripeMod.IDataOptionsWithMetadata
import typings.stripe.stripeMod.IOptionsMetadata
import typings.stripe.stripeMod.IShippingInformation
import typings.stripe.stripeMod.cardsNs.ICardSourceCreationOptionsExtended
import typings.stripe.stripeStrings.now
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomerCreationOptions extends IDataOptionsWithMetadata {
  /**
    * An integer amount in cents that is the starting account balance for your customer. A negative amount represents a credit that
    * will be used before attempting any charges to the customer's card; a positive amount will be added to the next invoice.
    */
  var account_balance: js.UndefOr[Double] = js.undefined
  var address: js.UndefOr[IAddress] = js.undefined
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
    * The customer’s full name or business name. This can be unset by updating the value to null and then saving.
    */
  var name: js.UndefOr[String] = js.undefined
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
    coupon: String = null,
    description: String = null,
    email: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null,
    name: String = null,
    phone: String = null,
    plan: String = null,
    quantity: Int | Double = null,
    shipping: IShippingInformation = null,
    source: String | ICardSourceCreationOptionsExtended = null,
    tax_percent: Int | Double = null,
    trial_end: Double | now = null
  ): ICustomerCreationOptions = {
    val __obj = js.Dynamic.literal()
    if (account_balance != null) __obj.updateDynamic("account_balance")(account_balance.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address)
    if (coupon != null) __obj.updateDynamic("coupon")(coupon)
    if (description != null) __obj.updateDynamic("description")(description)
    if (email != null) __obj.updateDynamic("email")(email)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (plan != null) __obj.updateDynamic("plan")(plan)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (tax_percent != null) __obj.updateDynamic("tax_percent")(tax_percent.asInstanceOf[js.Any])
    if (trial_end != null) __obj.updateDynamic("trial_end")(trial_end.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomerCreationOptions]
  }
}

