package typings
package stripeLib.stripeMod.StripeNs.subscriptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionUpdateItem extends js.Object {
  /**
    * Delete all usage for a given subscription item. Only allowed when deleted is set to true and the current plan’s
    * usage_type is metered.
    */
  var clear_usage: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Delete the specified item if set to true.
    */
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * SubscriptionItem to update.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set of key/value pairs that you can attach to an object. It can be useful for storing additional information about
    * the object in a structured format.
    */
  var metadata: js.UndefOr[stripeLib.stripeMod.StripeNs.IOptionsMetadata] = js.undefined
  /**
    * Plan ID for this item.
    */
  var plan: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Quantity for this item.
    */
  var quantity: js.UndefOr[scala.Double] = js.undefined
}

