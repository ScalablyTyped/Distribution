package typings
package stripeLib.stripeMod.payoutsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPayoutListOptions
  extends stripeLib.stripeMod.IListOptionsCreated {
  var arrival_date: js.UndefOr[java.lang.String | stripeLib.stripeMod.IDateFilter] = js.undefined
  var destination: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[
    stripeLib.stripeLibStrings.canceled | stripeLib.stripeLibStrings.failed | stripeLib.stripeLibStrings.paid | stripeLib.stripeLibStrings.pending
  ] = js.undefined
}

object IPayoutListOptions {
  @scala.inline
  def apply(
    arrival_date: java.lang.String | stripeLib.stripeMod.IDateFilter = null,
    created: java.lang.String | stripeLib.stripeMod.IDateFilter = null,
    destination: java.lang.String = null,
    ending_before: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    starting_after: java.lang.String = null,
    status: stripeLib.stripeLibStrings.canceled | stripeLib.stripeLibStrings.failed | stripeLib.stripeLibStrings.paid | stripeLib.stripeLibStrings.pending = null
  ): IPayoutListOptions = {
    val __obj = js.Dynamic.literal()
    if (arrival_date != null) __obj.updateDynamic("arrival_date")(arrival_date.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPayoutListOptions]
  }
}

