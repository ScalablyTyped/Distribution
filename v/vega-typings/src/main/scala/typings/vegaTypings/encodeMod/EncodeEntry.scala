package typings.vegaTypings.encodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.vegaTypings.anon.Test
import typings.vegaTypings.configMod.Cursor
import typings.vegaTypings.configMod.StrokeCap
import typings.vegaTypings.configMod.StrokeJoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncodeEntry
  extends /* k */ StringDictionary[js.UndefOr[ProductionRule[ArbitraryValueRef]]] {
  /**
    * A boolean flag indicating if [ARIA attributes](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) should be included (SVG output only).
    * If `false`, the "aria-hidden" attribute will be set on the output SVG element, removing the mark item from the ARIA accessibility tree.
    */
  var aria: js.UndefOr[ProductionRule[BooleanValueRef]] = js.native
  /**
    * Sets the type of user interface element of the mark item for [ARIA accessibility](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) (SVG output only).
    * If specified, this property determines the "role" attribute.
    * Warning: this property is experimental and may be changed in the future.
    */
  var ariaRole: js.UndefOr[ProductionRule[StringValueRef]] = js.native
  /**
    * A human-readable, author-localized description for the role of the mark item for [ARIA accessibility](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) (SVG output only).
    * If specified, this property determines the "aria-roledescription" attribute.
    * Warning: this property is experimental and may be changed in the future.
    */
  var ariaRoleDescription: js.UndefOr[ProductionRule[StringValueRef]] = js.native
  var blend: js.UndefOr[ProductionRule[ScaledValueRef[Blend]]] = js.native
  var cursor: js.UndefOr[ProductionRule[ScaledValueRef[Cursor]]] = js.native
  /**
    * A text description of the mark item for [ARIA accessibility](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) (SVG output only).
    * If specified, this property determines the ["aria-label" attribute](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/ARIA_Techniques/Using_the_aria-label_attribute).
    */
  var description: js.UndefOr[ProductionRule[StringValueRef]] = js.native
  var fill: js.UndefOr[ProductionRule[ColorValueRef]] = js.native
  var fillOpacity: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var height: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var opacity: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var stroke: js.UndefOr[ProductionRule[ColorValueRef]] = js.native
  var strokeCap: js.UndefOr[ProductionRule[ScaledValueRef[StrokeCap]]] = js.native
  var strokeDash: js.UndefOr[ProductionRule[ScaledValueRef[js.Array[Double]]]] = js.native
  var strokeDashOffset: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var strokeJoin: js.UndefOr[ProductionRule[ScaledValueRef[StrokeJoin]]] = js.native
  var strokeMiterLimit: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var strokeOpacity: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var strokeWidth: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var tooltip: js.UndefOr[ProductionRule[StringValueRef]] = js.native
  var width: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var x: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var x2: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var xc: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var y: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var y2: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var yc: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  var zindex: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
}

object EncodeEntry {
  @scala.inline
  def apply(): EncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodeEntry]
  }
  @scala.inline
  implicit class EncodeEntryOps[Self <: EncodeEntry] (val x: Self) extends AnyVal {
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
    def setAriaVarargs(value: (Test with BooleanValueRef)*): Self = this.set("aria", js.Array(value :_*))
    @scala.inline
    def setAria(value: ProductionRule[BooleanValueRef]): Self = this.set("aria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAria: Self = this.set("aria", js.undefined)
    @scala.inline
    def setAriaRoleVarargs(value: (Test with StringValueRef)*): Self = this.set("ariaRole", js.Array(value :_*))
    @scala.inline
    def setAriaRole(value: ProductionRule[StringValueRef]): Self = this.set("ariaRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaRole: Self = this.set("ariaRole", js.undefined)
    @scala.inline
    def setAriaRoleDescriptionVarargs(value: (Test with StringValueRef)*): Self = this.set("ariaRoleDescription", js.Array(value :_*))
    @scala.inline
    def setAriaRoleDescription(value: ProductionRule[StringValueRef]): Self = this.set("ariaRoleDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaRoleDescription: Self = this.set("ariaRoleDescription", js.undefined)
    @scala.inline
    def setBlendVarargs(value: (Test with ScaledValueRef[Blend])*): Self = this.set("blend", js.Array(value :_*))
    @scala.inline
    def setBlend(value: ProductionRule[ScaledValueRef[Blend]]): Self = this.set("blend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlend: Self = this.set("blend", js.undefined)
    @scala.inline
    def setCursorVarargs(value: (Test with ScaledValueRef[Cursor])*): Self = this.set("cursor", js.Array(value :_*))
    @scala.inline
    def setCursor(value: ProductionRule[ScaledValueRef[Cursor]]): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setDescriptionVarargs(value: (Test with StringValueRef)*): Self = this.set("description", js.Array(value :_*))
    @scala.inline
    def setDescription(value: ProductionRule[StringValueRef]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFillVarargs(value: (Test with ColorValueRef)*): Self = this.set("fill", js.Array(value :_*))
    @scala.inline
    def setFill(value: ProductionRule[ColorValueRef]): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFillOpacityVarargs(value: (Test with NumericValueRef)*): Self = this.set("fillOpacity", js.Array(value :_*))
    @scala.inline
    def setFillOpacity(value: ProductionRule[NumericValueRef]): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setHeightVarargs(value: (Test with NumericValueRef)*): Self = this.set("height", js.Array(value :_*))
    @scala.inline
    def setHeight(value: ProductionRule[NumericValueRef]): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setOpacityVarargs(value: (Test with NumericValueRef)*): Self = this.set("opacity", js.Array(value :_*))
    @scala.inline
    def setOpacity(value: ProductionRule[NumericValueRef]): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setStrokeVarargs(value: (Test with ColorValueRef)*): Self = this.set("stroke", js.Array(value :_*))
    @scala.inline
    def setStroke(value: ProductionRule[ColorValueRef]): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStrokeCapVarargs(value: (Test with ScaledValueRef[StrokeCap])*): Self = this.set("strokeCap", js.Array(value :_*))
    @scala.inline
    def setStrokeCap(value: ProductionRule[ScaledValueRef[StrokeCap]]): Self = this.set("strokeCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeCap: Self = this.set("strokeCap", js.undefined)
    @scala.inline
    def setStrokeDashVarargs(value: (Test with ScaledValueRef[js.Array[Double]])*): Self = this.set("strokeDash", js.Array(value :_*))
    @scala.inline
    def setStrokeDash(value: ProductionRule[ScaledValueRef[js.Array[Double]]]): Self = this.set("strokeDash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeDash: Self = this.set("strokeDash", js.undefined)
    @scala.inline
    def setStrokeDashOffsetVarargs(value: (Test with NumericValueRef)*): Self = this.set("strokeDashOffset", js.Array(value :_*))
    @scala.inline
    def setStrokeDashOffset(value: ProductionRule[NumericValueRef]): Self = this.set("strokeDashOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeDashOffset: Self = this.set("strokeDashOffset", js.undefined)
    @scala.inline
    def setStrokeJoinVarargs(value: (Test with ScaledValueRef[StrokeJoin])*): Self = this.set("strokeJoin", js.Array(value :_*))
    @scala.inline
    def setStrokeJoin(value: ProductionRule[ScaledValueRef[StrokeJoin]]): Self = this.set("strokeJoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeJoin: Self = this.set("strokeJoin", js.undefined)
    @scala.inline
    def setStrokeMiterLimitVarargs(value: (Test with NumericValueRef)*): Self = this.set("strokeMiterLimit", js.Array(value :_*))
    @scala.inline
    def setStrokeMiterLimit(value: ProductionRule[NumericValueRef]): Self = this.set("strokeMiterLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeMiterLimit: Self = this.set("strokeMiterLimit", js.undefined)
    @scala.inline
    def setStrokeOpacityVarargs(value: (Test with NumericValueRef)*): Self = this.set("strokeOpacity", js.Array(value :_*))
    @scala.inline
    def setStrokeOpacity(value: ProductionRule[NumericValueRef]): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    @scala.inline
    def setStrokeWidthVarargs(value: (Test with NumericValueRef)*): Self = this.set("strokeWidth", js.Array(value :_*))
    @scala.inline
    def setStrokeWidth(value: ProductionRule[NumericValueRef]): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    @scala.inline
    def setTooltipVarargs(value: (Test with StringValueRef)*): Self = this.set("tooltip", js.Array(value :_*))
    @scala.inline
    def setTooltip(value: ProductionRule[StringValueRef]): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setWidthVarargs(value: (Test with NumericValueRef)*): Self = this.set("width", js.Array(value :_*))
    @scala.inline
    def setWidth(value: ProductionRule[NumericValueRef]): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setXVarargs(value: (Test with NumericValueRef)*): Self = this.set("x", js.Array(value :_*))
    @scala.inline
    def setX(value: ProductionRule[NumericValueRef]): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setX2Varargs(value: (Test with NumericValueRef)*): Self = this.set("x2", js.Array(value :_*))
    @scala.inline
    def setX2(value: ProductionRule[NumericValueRef]): Self = this.set("x2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX2: Self = this.set("x2", js.undefined)
    @scala.inline
    def setXcVarargs(value: (Test with NumericValueRef)*): Self = this.set("xc", js.Array(value :_*))
    @scala.inline
    def setXc(value: ProductionRule[NumericValueRef]): Self = this.set("xc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXc: Self = this.set("xc", js.undefined)
    @scala.inline
    def setYVarargs(value: (Test with NumericValueRef)*): Self = this.set("y", js.Array(value :_*))
    @scala.inline
    def setY(value: ProductionRule[NumericValueRef]): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    @scala.inline
    def setY2Varargs(value: (Test with NumericValueRef)*): Self = this.set("y2", js.Array(value :_*))
    @scala.inline
    def setY2(value: ProductionRule[NumericValueRef]): Self = this.set("y2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY2: Self = this.set("y2", js.undefined)
    @scala.inline
    def setYcVarargs(value: (Test with NumericValueRef)*): Self = this.set("yc", js.Array(value :_*))
    @scala.inline
    def setYc(value: ProductionRule[NumericValueRef]): Self = this.set("yc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYc: Self = this.set("yc", js.undefined)
    @scala.inline
    def setZindexVarargs(value: (Test with NumericValueRef)*): Self = this.set("zindex", js.Array(value :_*))
    @scala.inline
    def setZindex(value: ProductionRule[NumericValueRef]): Self = this.set("zindex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZindex: Self = this.set("zindex", js.undefined)
  }
  
}

