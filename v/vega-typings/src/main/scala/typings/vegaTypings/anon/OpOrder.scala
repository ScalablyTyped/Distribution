package typings.vegaTypings.anon

import typings.vegaTypings.scaleMod.SortOrder
import typings.vegaTypings.scaleMod._UnionSortField
import typings.vegaTypings.vegaTypingsStrings.count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpOrder extends _UnionSortField {
  var op: count
  var order: js.UndefOr[SortOrder] = js.undefined
}

object OpOrder {
  @scala.inline
  def apply(op: count, order: SortOrder = null): OpOrder = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpOrder]
  }
}

