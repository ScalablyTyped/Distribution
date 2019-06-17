package typings
package stripeLib.stripeMod.subscriptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionCreationItem extends js.Object {
  /**
    * Define thresholds at which an invoice will be sent, and the related subscription advanced to a new billing period.
    */
  var billing_thresholds: js.UndefOr[stripeLib.Anon_Usagegte] = js.undefined
  /**
    * A set of key/value pairs that you can attach to an object. It can be useful for storing
    * additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[stripeLib.stripeMod.IOptionsMetadata] = js.undefined
  /**
    * Plan ID for this item.
    */
  var plan: java.lang.String
  /**
    * Quantity for this item.
    */
  var quantity: js.UndefOr[scala.Double] = js.undefined
}

object ISubscriptionCreationItem {
  @scala.inline
  def apply(
    plan: java.lang.String,
    billing_thresholds: stripeLib.Anon_Usagegte = null,
    metadata: stripeLib.stripeMod.IOptionsMetadata = null,
    quantity: scala.Int | scala.Double = null
  ): ISubscriptionCreationItem = {
    val __obj = js.Dynamic.literal(plan = plan)
    if (billing_thresholds != null) __obj.updateDynamic("billing_thresholds")(billing_thresholds)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionCreationItem]
  }
}

