package typings
package stripeLib.stripeMod.invoicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItemReason extends js.Object {
  /**
    * The IDs of the line items that triggered the threshold invoice.
    */
  var line_item_ids: js.Array[java.lang.String]
  /**
    * The quantity threshold boundary that applied to the given line item.
    */
  var usage_gte: scala.Double
}

object IItemReason {
  @scala.inline
  def apply(line_item_ids: js.Array[java.lang.String], usage_gte: scala.Double): IItemReason = {
    val __obj = js.Dynamic.literal(line_item_ids = line_item_ids, usage_gte = usage_gte)
  
    __obj.asInstanceOf[IItemReason]
  }
}

