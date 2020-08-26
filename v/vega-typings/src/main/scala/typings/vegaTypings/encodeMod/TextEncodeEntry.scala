package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEncodeEntry
  extends EncodeEntry
     with AlignProperty
     with ThetaProperty {
  var angle: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var baseline: js.UndefOr[ProductionRule[TextBaselineValueRef]] = js.native
  var dir: js.UndefOr[ProductionRule[ScaledValueRef[TextDirection]]] = js.native
  var dx: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var dy: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var ellipsis: js.UndefOr[ProductionRule[StringValueRef]] = js.native
  var font: js.UndefOr[ProductionRule[StringValueRef]] = js.native
  var fontSize: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var fontStyle: js.UndefOr[ProductionRule[FontStyleValueRef]] = js.native
  var fontWeight: js.UndefOr[ProductionRule[FontWeightValueRef]] = js.native
  var limit: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var lineBreak: js.UndefOr[ProductionRule[StringValueRef]] = js.native
  /**
    * The height, in pixels, of each line of text in a multi-line text mark or a text mark with `"line-top"` or `"line-bottom"` baseline.
    */
  var lineHeight: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var radius: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var text: js.UndefOr[ProductionRule[TextValueRef]] = js.native
}

object TextEncodeEntry {
  @scala.inline
  def apply(): TextEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextEncodeEntry]
  }
  @scala.inline
  implicit class TextEncodeEntryOps[Self <: TextEncodeEntry] (val x: Self) extends AnyVal {
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
    def setAngleVarargs(value: (Test with NumericValueRef)*): Self = this.set("angle", js.Array(value :_*))
    @scala.inline
    def setAngle(value: ProductionRule[NumericValueRef]): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    @scala.inline
    def setBaselineVarargs(value: (Test with TextBaselineValueRef)*): Self = this.set("baseline", js.Array(value :_*))
    @scala.inline
    def setBaseline(value: ProductionRule[TextBaselineValueRef]): Self = this.set("baseline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseline: Self = this.set("baseline", js.undefined)
    @scala.inline
    def setDirVarargs(value: (Test with ScaledValueRef[TextDirection])*): Self = this.set("dir", js.Array(value :_*))
    @scala.inline
    def setDir(value: ProductionRule[ScaledValueRef[TextDirection]]): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setDxVarargs(value: (Test with NumericValueRef)*): Self = this.set("dx", js.Array(value :_*))
    @scala.inline
    def setDx(value: ProductionRule[NumericValueRef]): Self = this.set("dx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDx: Self = this.set("dx", js.undefined)
    @scala.inline
    def setDyVarargs(value: (Test with NumericValueRef)*): Self = this.set("dy", js.Array(value :_*))
    @scala.inline
    def setDy(value: ProductionRule[NumericValueRef]): Self = this.set("dy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDy: Self = this.set("dy", js.undefined)
    @scala.inline
    def setEllipsisVarargs(value: (Test with StringValueRef)*): Self = this.set("ellipsis", js.Array(value :_*))
    @scala.inline
    def setEllipsis(value: ProductionRule[StringValueRef]): Self = this.set("ellipsis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsis: Self = this.set("ellipsis", js.undefined)
    @scala.inline
    def setFontVarargs(value: (Test with StringValueRef)*): Self = this.set("font", js.Array(value :_*))
    @scala.inline
    def setFont(value: ProductionRule[StringValueRef]): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setFontSizeVarargs(value: (Test with NumericValueRef)*): Self = this.set("fontSize", js.Array(value :_*))
    @scala.inline
    def setFontSize(value: ProductionRule[NumericValueRef]): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontStyleVarargs(value: (Test with FontStyleValueRef)*): Self = this.set("fontStyle", js.Array(value :_*))
    @scala.inline
    def setFontStyle(value: ProductionRule[FontStyleValueRef]): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontWeightVarargs(value: (Test with FontWeightValueRef)*): Self = this.set("fontWeight", js.Array(value :_*))
    @scala.inline
    def setFontWeight(value: ProductionRule[FontWeightValueRef]): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setLimitVarargs(value: (Test with NumericValueRef)*): Self = this.set("limit", js.Array(value :_*))
    @scala.inline
    def setLimit(value: ProductionRule[NumericValueRef]): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setLineBreakVarargs(value: (Test with StringValueRef)*): Self = this.set("lineBreak", js.Array(value :_*))
    @scala.inline
    def setLineBreak(value: ProductionRule[StringValueRef]): Self = this.set("lineBreak", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineBreak: Self = this.set("lineBreak", js.undefined)
    @scala.inline
    def setLineHeightVarargs(value: (Test with NumericValueRef)*): Self = this.set("lineHeight", js.Array(value :_*))
    @scala.inline
    def setLineHeight(value: ProductionRule[NumericValueRef]): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    @scala.inline
    def setRadiusVarargs(value: (Test with NumericValueRef)*): Self = this.set("radius", js.Array(value :_*))
    @scala.inline
    def setRadius(value: ProductionRule[NumericValueRef]): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setTextVarargs(value: (Test with TextValueRef)*): Self = this.set("text", js.Array(value :_*))
    @scala.inline
    def setText(value: ProductionRule[TextValueRef]): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

