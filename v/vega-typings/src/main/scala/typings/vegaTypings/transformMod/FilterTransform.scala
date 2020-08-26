package typings.vegaTypings.transformMod

import typings.vegaTypings.vegaTypingsStrings.filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterTransform extends _Transforms {
  var expr: ExprString = js.native
  var `type`: filter = js.native
}

object FilterTransform {
  @scala.inline
  def apply(expr: ExprString, `type`: filter): FilterTransform = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterTransform]
  }
  @scala.inline
  implicit class FilterTransformOps[Self <: FilterTransform] (val x: Self) extends AnyVal {
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
    def setExpr(value: ExprString): Self = this.set("expr", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: filter): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

