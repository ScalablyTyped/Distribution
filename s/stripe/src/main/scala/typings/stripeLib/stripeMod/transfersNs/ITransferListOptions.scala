package typings
package stripeLib.stripeMod.transfersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransferListOptions
  extends stripeLib.stripeMod.IListOptionsCreated {
  var date: js.UndefOr[stripeLib.stripeMod.IDateFilter] = js.undefined
  /**
    * Only return transfers for the destination specified by this
    * account ID.
    */
  var destination: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Only return transfers with the specified transfer group.
    */
  var transfer_group: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object ITransferListOptions {
  @scala.inline
  def apply(
    created: java.lang.String | stripeLib.stripeMod.IDateFilter = null,
    date: stripeLib.stripeMod.IDateFilter = null,
    destination: java.lang.String = null,
    ending_before: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    starting_after: java.lang.String = null,
    transfer_group: java.lang.String = null
  ): ITransferListOptions = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    if (transfer_group != null) __obj.updateDynamic("transfer_group")(transfer_group)
    __obj.asInstanceOf[ITransferListOptions]
  }
}

