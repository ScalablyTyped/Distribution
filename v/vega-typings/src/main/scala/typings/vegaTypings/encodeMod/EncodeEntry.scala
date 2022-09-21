package typings.vegaTypings.encodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.vegaTypings.anon.Test
import typings.vegaTypings.configMod.Cursor
import typings.vegaTypings.configMod.StrokeCap
import typings.vegaTypings.configMod.StrokeJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodeEntry
  extends StObject
     with /* k */ StringDictionary[js.UndefOr[ProductionRule[ArbitraryValueRef]]] {
  
  /**
    * A boolean flag indicating if [ARIA attributes](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) should be included (SVG output only).
    * If `false`, the "aria-hidden" attribute will be set on the output SVG element, removing the mark item from the ARIA accessibility tree.
    */
  var aria: js.UndefOr[ProductionRule[BooleanValueRef]] = js.undefined
  
  /**
    * Sets the type of user interface element of the mark item for [ARIA accessibility](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) (SVG output only).
    * If specified, this property determines the "role" attribute.
    * Warning: this property is experimental and may be changed in the future.
    */
  var ariaRole: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  
  /**
    * A human-readable, author-localized description for the role of the mark item for [ARIA accessibility](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) (SVG output only).
    * If specified, this property determines the "aria-roledescription" attribute.
    * Warning: this property is experimental and may be changed in the future.
    */
  var ariaRoleDescription: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  
  var blend: js.UndefOr[ProductionRule[ScaledValueRef[Blend]]] = js.undefined
  
  var cursor: js.UndefOr[ProductionRule[ScaledValueRef[Cursor]]] = js.undefined
  
  /**
    * A text description of the mark item for [ARIA accessibility](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) (SVG output only).
    * If specified, this property determines the ["aria-label" attribute](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/ARIA_Techniques/Using_the_aria-label_attribute).
    */
  var description: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  
  var fill: js.UndefOr[ProductionRule[ColorValueRef]] = js.undefined
  
  var fillOpacity: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var height: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var opacity: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var stroke: js.UndefOr[ProductionRule[ColorValueRef]] = js.undefined
  
  var strokeCap: js.UndefOr[ProductionRule[ScaledValueRef[StrokeCap]]] = js.undefined
  
  var strokeDash: js.UndefOr[ProductionRule[ScaledValueRef[js.Array[Double]]]] = js.undefined
  
  var strokeDashOffset: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var strokeJoin: js.UndefOr[ProductionRule[ScaledValueRef[StrokeJoin]]] = js.undefined
  
  var strokeMiterLimit: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var strokeOpacity: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var strokeWidth: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var tooltip: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  
  var width: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var x: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var x2: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var xc: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var y: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var y2: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var yc: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var zindex: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
}
object EncodeEntry {
  
  inline def apply(): EncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodeEntry]
  }
  
  extension [Self <: EncodeEntry](x: Self) {
    
    inline def setAria(value: ProductionRule[BooleanValueRef]): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
    
    inline def setAriaRole(value: ProductionRule[StringValueRef]): Self = StObject.set(x, "ariaRole", value.asInstanceOf[js.Any])
    
    inline def setAriaRoleDescription(value: ProductionRule[StringValueRef]): Self = StObject.set(x, "ariaRoleDescription", value.asInstanceOf[js.Any])
    
    inline def setAriaRoleDescriptionUndefined: Self = StObject.set(x, "ariaRoleDescription", js.undefined)
    
    inline def setAriaRoleDescriptionVarargs(value: (Test & StringValueRef)*): Self = StObject.set(x, "ariaRoleDescription", js.Array(value*))
    
    inline def setAriaRoleUndefined: Self = StObject.set(x, "ariaRole", js.undefined)
    
    inline def setAriaRoleVarargs(value: (Test & StringValueRef)*): Self = StObject.set(x, "ariaRole", js.Array(value*))
    
    inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
    
    inline def setAriaVarargs(value: (Test & BooleanValueRef)*): Self = StObject.set(x, "aria", js.Array(value*))
    
    inline def setBlend(value: ProductionRule[ScaledValueRef[Blend]]): Self = StObject.set(x, "blend", value.asInstanceOf[js.Any])
    
    inline def setBlendUndefined: Self = StObject.set(x, "blend", js.undefined)
    
    inline def setBlendVarargs(value: (Test & ScaledValueRef[Blend])*): Self = StObject.set(x, "blend", js.Array(value*))
    
    inline def setCursor(value: ProductionRule[ScaledValueRef[Cursor]]): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setCursorVarargs(value: (Test & ScaledValueRef[Cursor])*): Self = StObject.set(x, "cursor", js.Array(value*))
    
    inline def setDescription(value: ProductionRule[StringValueRef]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDescriptionVarargs(value: (Test & StringValueRef)*): Self = StObject.set(x, "description", js.Array(value*))
    
    inline def setFill(value: ProductionRule[ColorValueRef]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillOpacity(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setFillOpacityVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "fillOpacity", js.Array(value*))
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFillVarargs(value: (Test & ColorValueRef)*): Self = StObject.set(x, "fill", js.Array(value*))
    
    inline def setHeight(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHeightVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "height", js.Array(value*))
    
    inline def setOpacity(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOpacityVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "opacity", js.Array(value*))
    
    inline def setStroke(value: ProductionRule[ColorValueRef]): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeCap(value: ProductionRule[ScaledValueRef[StrokeCap]]): Self = StObject.set(x, "strokeCap", value.asInstanceOf[js.Any])
    
    inline def setStrokeCapUndefined: Self = StObject.set(x, "strokeCap", js.undefined)
    
    inline def setStrokeCapVarargs(value: (Test & ScaledValueRef[StrokeCap])*): Self = StObject.set(x, "strokeCap", js.Array(value*))
    
    inline def setStrokeDash(value: ProductionRule[ScaledValueRef[js.Array[Double]]]): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
    
    inline def setStrokeDashOffset(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "strokeDashOffset", value.asInstanceOf[js.Any])
    
    inline def setStrokeDashOffsetUndefined: Self = StObject.set(x, "strokeDashOffset", js.undefined)
    
    inline def setStrokeDashOffsetVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "strokeDashOffset", js.Array(value*))
    
    inline def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
    
    inline def setStrokeDashVarargs(value: (Test & ScaledValueRef[js.Array[Double]])*): Self = StObject.set(x, "strokeDash", js.Array(value*))
    
    inline def setStrokeJoin(value: ProductionRule[ScaledValueRef[StrokeJoin]]): Self = StObject.set(x, "strokeJoin", value.asInstanceOf[js.Any])
    
    inline def setStrokeJoinUndefined: Self = StObject.set(x, "strokeJoin", js.undefined)
    
    inline def setStrokeJoinVarargs(value: (Test & ScaledValueRef[StrokeJoin])*): Self = StObject.set(x, "strokeJoin", js.Array(value*))
    
    inline def setStrokeMiterLimit(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "strokeMiterLimit", value.asInstanceOf[js.Any])
    
    inline def setStrokeMiterLimitUndefined: Self = StObject.set(x, "strokeMiterLimit", js.undefined)
    
    inline def setStrokeMiterLimitVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "strokeMiterLimit", js.Array(value*))
    
    inline def setStrokeOpacity(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokeOpacityVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "strokeOpacity", js.Array(value*))
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStrokeVarargs(value: (Test & ColorValueRef)*): Self = StObject.set(x, "stroke", js.Array(value*))
    
    inline def setStrokeWidth(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    inline def setStrokeWidthVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "strokeWidth", js.Array(value*))
    
    inline def setTooltip(value: ProductionRule[StringValueRef]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTooltipVarargs(value: (Test & StringValueRef)*): Self = StObject.set(x, "tooltip", js.Array(value*))
    
    inline def setWidth(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWidthVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "width", js.Array(value*))
    
    inline def setX(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX2(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    inline def setX2Varargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "x2", js.Array(value*))
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setXVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "x", js.Array(value*))
    
    inline def setXc(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "xc", value.asInstanceOf[js.Any])
    
    inline def setXcUndefined: Self = StObject.set(x, "xc", js.undefined)
    
    inline def setXcVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "xc", js.Array(value*))
    
    inline def setY(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY2(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    
    inline def setY2Varargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "y2", js.Array(value*))
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setYVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "y", js.Array(value*))
    
    inline def setYc(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "yc", value.asInstanceOf[js.Any])
    
    inline def setYcUndefined: Self = StObject.set(x, "yc", js.undefined)
    
    inline def setYcVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "yc", js.Array(value*))
    
    inline def setZindex(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
    
    inline def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    
    inline def setZindexVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "zindex", js.Array(value*))
  }
}
