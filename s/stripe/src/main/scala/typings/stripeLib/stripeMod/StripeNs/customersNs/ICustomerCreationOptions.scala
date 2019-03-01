package typings
package stripeLib.stripeMod.StripeNs.customersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomerCreationOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
    * An integer amount in cents that is the starting account balance for your customer. A negative amount represents a credit that
    * will be used before attempting any charges to the customer's card; a positive amount will be added to the next invoice.
    */
  var account_balance: js.UndefOr[scala.Double] = js.undefined
  /**
    * If you provide a coupon code, the customer will have a discount applied on all recurring charges. Charges you create through the
    * API will not have the discount.
    */
  var coupon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An arbitrary string that you can attach to a customer object. It is displayed alongside the customer in the dashboard. This can
    * be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Customer's email address. It's displayed alongside the customer in your dashboard and can be useful for searching and tracking.
    * This can be unset by updating the value to null and then saving.
    */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The identifier of the plan to subscribe the customer to. If provided, the returned customer object will have a list of subscriptions
    * that the customer is currently subscribed to. If you subscribe a customer to a plan without a free trial, the customer must have a
    * valid card as well.
    */
  var plan: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The quantity you'd like to apply to the subscription you're creating (if you pass in a plan). For example, if your plan is
    * 10 cents/user/month, and your customer has 5 users, you could pass 5 as the quantity to have the customer charged 50 cents
    * (5 x 10 cents) monthly. Defaults to 1 if not set. Only applies when the plan parameter is also provided.
    */
  var quantity: js.UndefOr[scala.Double] = js.undefined
  var shipping: js.UndefOr[stripeLib.stripeMod.StripeNs.IShippingInformation] = js.undefined
  /**
    * The source can either be a token, like the ones returned by our Stripe.js, or
    * a dictionary containing a user’s credit card details.
    */
  var source: js.UndefOr[stripeLib.stripeMod.StripeNs.sourcesNs.ISourceCreationOptionsExtended] = js.undefined
  /**
    * A positive decimal (with at most two decimal places) between 1 and 100.
    * This represents the percentage of the subscription invoice subtotal that
    * will be calculated and added as tax to the final amount each billing period.
    * For example, a plan which charges $10/month with a tax_percent of 20.0
    * will charge $12 per invoice. Can only be used if a plan is provided.
    */
  var tax_percent: js.UndefOr[scala.Double] = js.undefined
  /**
    * Unix timestamp representing the end of the trial period the customer will get before being charged. If set, trial_end will
    * override the default trial period of the plan the customer is being subscribed to. The special value now can be provided to
    * end the customer's trial immediately. Only applies when the plan parameter is also provided.
    */
  var trial_end: js.UndefOr[scala.Double | stripeLib.stripeLibStrings.now] = js.undefined
}

object ICustomerCreationOptions {
  @scala.inline
  def apply(
    account_balance: scala.Int | scala.Double = null,
    coupon: java.lang.String = null,
    description: java.lang.String = null,
    email: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    metadata: stripeLib.stripeMod.StripeNs.IOptionsMetadata = null,
    plan: java.lang.String = null,
    quantity: scala.Int | scala.Double = null,
    shipping: stripeLib.stripeMod.StripeNs.IShippingInformation = null,
    source: stripeLib.stripeMod.StripeNs.sourcesNs.ISourceCreationOptionsExtended = null,
    tax_percent: scala.Int | scala.Double = null,
    trial_end: scala.Double | stripeLib.stripeLibStrings.now = null
  ): ICustomerCreationOptions = {
    val __obj = js.Dynamic.literal()
    if (account_balance != null) __obj.updateDynamic("account_balance")(account_balance.asInstanceOf[js.Any])
    if (coupon != null) __obj.updateDynamic("coupon")(coupon)
    if (description != null) __obj.updateDynamic("description")(description)
    if (email != null) __obj.updateDynamic("email")(email)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (plan != null) __obj.updateDynamic("plan")(plan)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (tax_percent != null) __obj.updateDynamic("tax_percent")(tax_percent.asInstanceOf[js.Any])
    if (trial_end != null) __obj.updateDynamic("trial_end")(trial_end.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomerCreationOptions]
  }
}

