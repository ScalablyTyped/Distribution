package typings.vegaTypings.scaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SortField extends js.Object

object _SortField {
  @scala.inline
  def AnonOrderSortOrder(order: SortOrder): _SortField = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SortField]
  }
  @scala.inline
  def AnonOp(op: ScaleField, field: ScaleField = null, order: SortOrder = null): _SortField = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SortField]
  }
}

