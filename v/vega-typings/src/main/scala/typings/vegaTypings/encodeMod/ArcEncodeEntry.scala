package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcEncodeEntry extends EncodeEntry {
  var cornerRadius: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var endAngle: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var innerRadius: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var outerRadius: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var padAngle: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var startAngle: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
}

object ArcEncodeEntry {
  @scala.inline
  def apply(): ArcEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcEncodeEntry]
  }
  @scala.inline
  implicit class ArcEncodeEntryOps[Self <: ArcEncodeEntry] (val x: Self) extends AnyVal {
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
    def setCornerRadiusVarargs(value: (Test with NumericValueRef)*): Self = this.set("cornerRadius", js.Array(value :_*))
    @scala.inline
    def setCornerRadius(value: ProductionRule[NumericValueRef]): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    @scala.inline
    def setEndAngleVarargs(value: (Test with NumericValueRef)*): Self = this.set("endAngle", js.Array(value :_*))
    @scala.inline
    def setEndAngle(value: ProductionRule[NumericValueRef]): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    @scala.inline
    def setInnerRadiusVarargs(value: (Test with NumericValueRef)*): Self = this.set("innerRadius", js.Array(value :_*))
    @scala.inline
    def setInnerRadius(value: ProductionRule[NumericValueRef]): Self = this.set("innerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRadius: Self = this.set("innerRadius", js.undefined)
    @scala.inline
    def setOuterRadiusVarargs(value: (Test with NumericValueRef)*): Self = this.set("outerRadius", js.Array(value :_*))
    @scala.inline
    def setOuterRadius(value: ProductionRule[NumericValueRef]): Self = this.set("outerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOuterRadius: Self = this.set("outerRadius", js.undefined)
    @scala.inline
    def setPadAngleVarargs(value: (Test with NumericValueRef)*): Self = this.set("padAngle", js.Array(value :_*))
    @scala.inline
    def setPadAngle(value: ProductionRule[NumericValueRef]): Self = this.set("padAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadAngle: Self = this.set("padAngle", js.undefined)
    @scala.inline
    def setStartAngleVarargs(value: (Test with NumericValueRef)*): Self = this.set("startAngle", js.Array(value :_*))
    @scala.inline
    def setStartAngle(value: ProductionRule[NumericValueRef]): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
  }
  
}

