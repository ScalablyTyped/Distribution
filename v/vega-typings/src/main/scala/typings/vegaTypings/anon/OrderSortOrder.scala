package typings.vegaTypings.anon

import typings.vegaTypings.scaleMod.SortOrder
import typings.vegaTypings.scaleMod._SortField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderSortOrder extends _SortField {
  var order: SortOrder = js.native
}

object OrderSortOrder {
  @scala.inline
  def apply(order: SortOrder): OrderSortOrder = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderSortOrder]
  }
  @scala.inline
  implicit class OrderSortOrderOps[Self <: OrderSortOrder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOrder(value: SortOrder): Self = this.set("order", value.asInstanceOf[js.Any])
  }
  
}

