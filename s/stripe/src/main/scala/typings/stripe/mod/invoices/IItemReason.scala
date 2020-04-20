package typings.stripe.mod.invoices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItemReason extends js.Object {
  /**
    * The IDs of the line items that triggered the threshold invoice.
    */
  var line_item_ids: js.Array[String]
  /**
    * The quantity threshold boundary that applied to the given line item.
    */
  var usage_gte: Double
}

object IItemReason {
  @scala.inline
  def apply(line_item_ids: js.Array[String], usage_gte: Double): IItemReason = {
    val __obj = js.Dynamic.literal(line_item_ids = line_item_ids.asInstanceOf[js.Any], usage_gte = usage_gte.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemReason]
  }
}

