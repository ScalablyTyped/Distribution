package typings
package stripeLib.stripeMod.StripeNs.usageRecordSummariesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUsageRecordSummariesListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptions {
  /**
    * Only summary items for the given subscription item.
    */
  var subscription_item: java.lang.String
}

object IUsageRecordSummariesListOptions {
  @scala.inline
  def apply(
    subscription_item: java.lang.String,
    ending_before: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    starting_after: java.lang.String = null
  ): IUsageRecordSummariesListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subscription_item")(subscription_item)
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    __obj.asInstanceOf[IUsageRecordSummariesListOptions]
  }
}

