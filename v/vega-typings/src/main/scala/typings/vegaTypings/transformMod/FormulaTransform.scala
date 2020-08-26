package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.formula
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormulaTransform extends _Transforms {
  var as: String | SignalRef = js.native
  var expr: ExprString = js.native
  var initonly: js.UndefOr[Boolean] = js.native
  var `type`: formula = js.native
}

object FormulaTransform {
  @scala.inline
  def apply(as: String | SignalRef, expr: ExprString, `type`: formula): FormulaTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormulaTransform]
  }
  @scala.inline
  implicit class FormulaTransformOps[Self <: FormulaTransform] (val x: Self) extends AnyVal {
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
    def setAs(value: String | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpr(value: ExprString): Self = this.set("expr", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: formula): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitonly(value: Boolean): Self = this.set("initonly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitonly: Self = this.set("initonly", js.undefined)
  }
  
}

