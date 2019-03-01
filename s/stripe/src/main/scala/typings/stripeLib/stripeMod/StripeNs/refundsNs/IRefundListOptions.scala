package typings
package stripeLib.stripeMod.StripeNs.refundsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRefundListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptions {
  /**
    * Only return refunds for the charge specified by this charge ID.
    */
  var charge: js.UndefOr[java.lang.String] = js.undefined
}

object IRefundListOptions {
  @scala.inline
  def apply(
    charge: java.lang.String = null,
    ending_before: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    starting_after: java.lang.String = null
  ): IRefundListOptions = {
    val __obj = js.Dynamic.literal()
    if (charge != null) __obj.updateDynamic("charge")(charge)
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    __obj.asInstanceOf[IRefundListOptions]
  }
}

