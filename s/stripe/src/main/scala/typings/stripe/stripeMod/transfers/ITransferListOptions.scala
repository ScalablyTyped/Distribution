package typings.stripe.stripeMod.transfers

import typings.stripe.stripeMod.IDateFilter
import typings.stripe.stripeMod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransferListOptions extends IListOptionsCreated {
  var date: js.UndefOr[IDateFilter] = js.undefined
  /**
    * Only return transfers for the destination specified by this
    * account ID.
    */
  var destination: js.UndefOr[String] = js.undefined
  /**
    * Only return transfers with the specified transfer group.
    */
  var transfer_group: js.UndefOr[String | Null] = js.undefined
}

object ITransferListOptions {
  @scala.inline
  def apply(
    created: String | IDateFilter = null,
    date: IDateFilter = null,
    destination: String = null,
    ending_before: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    limit: Int | Double = null,
    starting_after: String = null,
    transfer_group: String = null
  ): ITransferListOptions = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after.asInstanceOf[js.Any])
    if (transfer_group != null) __obj.updateDynamic("transfer_group")(transfer_group.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransferListOptions]
  }
}

