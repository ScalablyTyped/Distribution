package typings.vegaTypings.anon

import typings.vegaTypings.scaleMod.ScaleField
import typings.vegaTypings.scaleMod.SortOrder
import typings.vegaTypings.scaleMod._SortField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Op extends _SortField {
  var field: js.UndefOr[ScaleField] = js.native
  var op: ScaleField = js.native
  var order: js.UndefOr[SortOrder] = js.native
}

object Op {
  @scala.inline
  def apply(op: ScaleField): Op = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[Op]
  }
  @scala.inline
  implicit class OpOps[Self <: Op] (val x: Self) extends AnyVal {
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
    def setOp(value: ScaleField): Self = this.set("op", value.asInstanceOf[js.Any])
    @scala.inline
    def setField(value: ScaleField): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setOrder(value: SortOrder): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
  }
  
}

