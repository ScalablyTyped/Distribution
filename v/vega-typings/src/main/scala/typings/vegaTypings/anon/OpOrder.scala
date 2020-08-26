package typings.vegaTypings.anon

import typings.vegaTypings.scaleMod.SortOrder
import typings.vegaTypings.scaleMod._UnionSortField
import typings.vegaTypings.vegaTypingsStrings.count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpOrder extends _UnionSortField {
  var op: count = js.native
  var order: js.UndefOr[SortOrder] = js.native
}

object OpOrder {
  @scala.inline
  def apply(op: count): OpOrder = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpOrder]
  }
  @scala.inline
  implicit class OpOrderOps[Self <: OpOrder] (val x: Self) extends AnyVal {
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
    def setOp(value: count): Self = this.set("op", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: SortOrder): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
  }
  
}

