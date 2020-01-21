package typings.stripe.mod.subscriptions

import typings.stripe.AnonUsagegte
import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionCreationItem extends js.Object {
  /**
    * Define thresholds at which an invoice will be sent, and the related subscription advanced to a new billing period.
    */
  var billing_thresholds: js.UndefOr[AnonUsagegte] = js.undefined
  /**
    * A set of key/value pairs that you can attach to an object. It can be useful for storing
    * additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
  /**
    * Plan ID for this item.
    */
  var plan: String
  /**
    * Quantity for this item.
    */
  var quantity: js.UndefOr[Double] = js.undefined
}

object ISubscriptionCreationItem {
  @scala.inline
  def apply(
    plan: String,
    billing_thresholds: AnonUsagegte = null,
    metadata: IOptionsMetadata = null,
    quantity: Int | Double = null
  ): ISubscriptionCreationItem = {
    val __obj = js.Dynamic.literal(plan = plan.asInstanceOf[js.Any])
    if (billing_thresholds != null) __obj.updateDynamic("billing_thresholds")(billing_thresholds.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionCreationItem]
  }
}

