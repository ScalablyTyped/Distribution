package typings.vegaTypings.encodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.vegaTypings.anon.Test
import typings.vegaTypings.configMod.Cursor
import typings.vegaTypings.configMod.StrokeCap
import typings.vegaTypings.configMod.StrokeJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class EncodeEntryMutableBuilder[Self <: EncodeEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAria(value: ProductionRule[BooleanValueRef]): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaRole(value: ProductionRule[StringValueRef]): Self = StObject.set(x, "ariaRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaRoleDescription(value: ProductionRule[StringValueRef]): Self = StObject.set(x, "ariaRoleDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaRoleDescriptionUndefined: Self = StObject.set(x, "ariaRoleDescription", js.undefined)
    
    @scala.inline
    def setAriaRoleDescriptionVarargs(value: (Test with StringValueRef)*): Self = StObject.set(x, "ariaRoleDescription", js.Array(value :_*))
    
    @scala.inline
    def setAriaRoleUndefined: Self = StObject.set(x, "ariaRole", js.undefined)
    
    @scala.inline
    def setAriaRoleVarargs(value: (Test with StringValueRef)*): Self = StObject.set(x, "ariaRole", js.Array(value :_*))
    
    @scala.inline
    def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
    
    @scala.inline
    def setAriaVarargs(value: (Test with BooleanValueRef)*): Self = StObject.set(x, "aria", js.Array(value :_*))
    
    @scala.inline
    def setBlend(value: ProductionRule[ScaledValueRef[Blend]]): Self = StObject.set(x, "blend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendUndefined: Self = StObject.set(x, "blend", js.undefined)
    
    @scala.inline
    def setBlendVarargs(value: (Test with ScaledValueRef[Blend])*): Self = StObject.set(x, "blend", js.Array(value :_*))
    
    @scala.inline
    def setCursor(value: ProductionRule[ScaledValueRef[Cursor]]): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setCursorVarargs(value: (Test with ScaledValueRef[Cursor])*): Self = StObject.set(x, "cursor", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: ProductionRule[StringValueRef]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDescriptionVarargs(value: (Test with StringValueRef)*): Self = StObject.set(x, "description", js.Array(value :_*))
    
    @scala.inline
    def setFill(value: ProductionRule[ColorValueRef]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacity(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setFillOpacityVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "fillOpacity", js.Array(value :_*))
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFillVarargs(value: (Test with ColorValueRef)*): Self = StObject.set(x, "fill", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHeightVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "height", js.Array(value :_*))
    
    @scala.inline
    def setOpacity(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOpacityVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "opacity", js.Array(value :_*))
    
    @scala.inline
    def setStroke(value: ProductionRule[ColorValueRef]): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeCap(value: ProductionRule[ScaledValueRef[StrokeCap]]): Self = StObject.set(x, "strokeCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeCapUndefined: Self = StObject.set(x, "strokeCap", js.undefined)
    
    @scala.inline
    def setStrokeCapVarargs(value: (Test with ScaledValueRef[StrokeCap])*): Self = StObject.set(x, "strokeCap", js.Array(value :_*))
    
    @scala.inline
    def setStrokeDash(value: ProductionRule[ScaledValueRef[js.Array[Double]]]): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDashOffset(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "strokeDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDashOffsetUndefined: Self = StObject.set(x, "strokeDashOffset", js.undefined)
    
    @scala.inline
    def setStrokeDashOffsetVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "strokeDashOffset", js.Array(value :_*))
    
    @scala.inline
    def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
    
    @scala.inline
    def setStrokeDashVarargs(value: (Test with ScaledValueRef[js.Array[Double]])*): Self = StObject.set(x, "strokeDash", js.Array(value :_*))
    
    @scala.inline
    def setStrokeJoin(value: ProductionRule[ScaledValueRef[StrokeJoin]]): Self = StObject.set(x, "strokeJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeJoinUndefined: Self = StObject.set(x, "strokeJoin", js.undefined)
    
    @scala.inline
    def setStrokeJoinVarargs(value: (Test with ScaledValueRef[StrokeJoin])*): Self = StObject.set(x, "strokeJoin", js.Array(value :_*))
    
    @scala.inline
    def setStrokeMiterLimit(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "strokeMiterLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeMiterLimitUndefined: Self = StObject.set(x, "strokeMiterLimit", js.undefined)
    
    @scala.inline
    def setStrokeMiterLimitVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "strokeMiterLimit", js.Array(value :_*))
    
    @scala.inline
    def setStrokeOpacity(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeOpacityVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "strokeOpacity", js.Array(value :_*))
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setStrokeVarargs(value: (Test with ColorValueRef)*): Self = StObject.set(x, "stroke", js.Array(value :_*))
    
    @scala.inline
    def setStrokeWidth(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    @scala.inline
    def setStrokeWidthVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "strokeWidth", js.Array(value :_*))
    
    @scala.inline
    def setTooltip(value: ProductionRule[StringValueRef]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setTooltipVarargs(value: (Test with StringValueRef)*): Self = StObject.set(x, "tooltip", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWidthVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "width", js.Array(value :_*))
    
    @scala.inline
    def setX(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    @scala.inline
    def setX2Varargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "x2", js.Array(value :_*))
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setXVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "x", js.Array(value :_*))
    
    @scala.inline
    def setXc(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "xc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXcUndefined: Self = StObject.set(x, "xc", js.undefined)
    
    @scala.inline
    def setXcVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "xc", js.Array(value :_*))
    
    @scala.inline
    def setY(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    
    @scala.inline
    def setY2Varargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "y2", js.Array(value :_*))
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setYVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "y", js.Array(value :_*))
    
    @scala.inline
    def setYc(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "yc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYcUndefined: Self = StObject.set(x, "yc", js.undefined)
    
    @scala.inline
    def setYcVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "yc", js.Array(value :_*))
    
    @scala.inline
    def setZindex(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    
    @scala.inline
    def setZindexVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "zindex", js.Array(value :_*))
  }
}
