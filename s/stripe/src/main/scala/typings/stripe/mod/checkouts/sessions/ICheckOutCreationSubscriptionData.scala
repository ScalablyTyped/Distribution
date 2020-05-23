package typings.stripe.mod.checkouts.sessions

import typings.stripe.mod.IMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckOutCreationSubscriptionData extends js.Object {
  /**
    * A non-negative decimal between 0 and 100, with at most two decimal places.
    * This represents the percentage of the subscription invoice subtotal that will be transferred to the application owner’s Stripe account.
    */
  var application_fee_percent: js.UndefOr[Double] = js.undefined
  /**
    * A list of items, each with an attached plan, that the customer is subscribing to. Use this parameter for subscriptions. To create one-time payments, use line_items.
    */
  var items: js.Array[ICheckOutCreationSubscriptionDataItem]
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[IMetadata] = js.undefined
  /**
    * Unix timestamp representing the end of the trial period the customer will get before being charged for the first time. Has to be at least 48 hours in the future.
    */
  var trial_end: js.UndefOr[Double] = js.undefined
  /**
    * Integer representing the number of trial period days before the customer is charged for the first time. Has to be at least 1.
    */
  var trial_period_days: js.UndefOr[Double] = js.undefined
}

object ICheckOutCreationSubscriptionData {
  @scala.inline
  def apply(
    items: js.Array[ICheckOutCreationSubscriptionDataItem],
    application_fee_percent: js.UndefOr[Double] = js.undefined,
    metadata: IMetadata = null,
    trial_end: js.UndefOr[Double] = js.undefined,
    trial_period_days: js.UndefOr[Double] = js.undefined
  ): ICheckOutCreationSubscriptionData = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (!js.isUndefined(application_fee_percent)) __obj.updateDynamic("application_fee_percent")(application_fee_percent.get.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(trial_end)) __obj.updateDynamic("trial_end")(trial_end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trial_period_days)) __obj.updateDynamic("trial_period_days")(trial_period_days.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckOutCreationSubscriptionData]
  }
}

