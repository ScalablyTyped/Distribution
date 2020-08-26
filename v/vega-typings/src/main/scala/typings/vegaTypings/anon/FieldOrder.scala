package typings.vegaTypings.anon

import typings.vegaTypings.exprMod.ExprRef
import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.scaleMod.SortOrder
import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldOrder extends Compare {
  var field: js.Array[String | ExprRef | SignalRef] = js.native
  var order: js.UndefOr[js.Array[SortOrder]] = js.native
}

object FieldOrder {
  @scala.inline
  def apply(field: js.Array[String | ExprRef | SignalRef]): FieldOrder = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOrder]
  }
  @scala.inline
  implicit class FieldOrderOps[Self <: FieldOrder] (val x: Self) extends AnyVal {
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
    def setFieldVarargs(value: (String | ExprRef | SignalRef)*): Self = this.set("field", js.Array(value :_*))
    @scala.inline
    def setField(value: js.Array[String | ExprRef | SignalRef]): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrderVarargs(value: SortOrder*): Self = this.set("order", js.Array(value :_*))
    @scala.inline
    def setOrder(value: js.Array[SortOrder]): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
  }
  
}

