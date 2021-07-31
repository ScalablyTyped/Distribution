package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEncodeEntry
  extends StObject
     with EncodeEntry
     with AlignProperty
     with ThetaProperty {
  
  var angle: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var baseline: js.UndefOr[ProductionRule[TextBaselineValueRef]] = js.undefined
  
  var dir: js.UndefOr[ProductionRule[ScaledValueRef[TextDirection]]] = js.undefined
  
  var dx: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var dy: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var ellipsis: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  
  var font: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  
  var fontSize: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var fontStyle: js.UndefOr[ProductionRule[FontStyleValueRef]] = js.undefined
  
  var fontWeight: js.UndefOr[ProductionRule[FontWeightValueRef]] = js.undefined
  
  var limit: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var lineBreak: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  
  /**
    * The height, in pixels, of each line of text in a multi-line text mark or a text mark with `"line-top"` or `"line-bottom"` baseline.
    */
  var lineHeight: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var radius: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var text: js.UndefOr[ProductionRule[TextValueRef]] = js.undefined
}
object TextEncodeEntry {
  
  @scala.inline
  def apply(): TextEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextEncodeEntry]
  }
  
  @scala.inline
  implicit class TextEncodeEntryMutableBuilder[Self <: TextEncodeEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setAngleVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "angle", js.Array(value :_*))
    
    @scala.inline
    def setBaseline(value: ProductionRule[TextBaselineValueRef]): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    @scala.inline
    def setBaselineVarargs(value: (Test & TextBaselineValueRef)*): Self = StObject.set(x, "baseline", js.Array(value :_*))
    
    @scala.inline
    def setDir(value: ProductionRule[ScaledValueRef[TextDirection]]): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setDirVarargs(value: (Test & ScaledValueRef[TextDirection])*): Self = StObject.set(x, "dir", js.Array(value :_*))
    
    @scala.inline
    def setDx(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    @scala.inline
    def setDxVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "dx", js.Array(value :_*))
    
    @scala.inline
    def setDy(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    @scala.inline
    def setDyVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "dy", js.Array(value :_*))
    
    @scala.inline
    def setEllipsis(value: ProductionRule[StringValueRef]): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    @scala.inline
    def setEllipsisVarargs(value: (Test & StringValueRef)*): Self = StObject.set(x, "ellipsis", js.Array(value :_*))
    
    @scala.inline
    def setFont(value: ProductionRule[StringValueRef]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontSizeVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "fontSize", js.Array(value :_*))
    
    @scala.inline
    def setFontStyle(value: ProductionRule[FontStyleValueRef]): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontStyleVarargs(value: (Test & FontStyleValueRef)*): Self = StObject.set(x, "fontStyle", js.Array(value :_*))
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setFontVarargs(value: (Test & StringValueRef)*): Self = StObject.set(x, "font", js.Array(value :_*))
    
    @scala.inline
    def setFontWeight(value: ProductionRule[FontWeightValueRef]): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setFontWeightVarargs(value: (Test & FontWeightValueRef)*): Self = StObject.set(x, "fontWeight", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setLimitVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "limit", js.Array(value :_*))
    
    @scala.inline
    def setLineBreak(value: ProductionRule[StringValueRef]): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
    
    @scala.inline
    def setLineBreakVarargs(value: (Test & StringValueRef)*): Self = StObject.set(x, "lineBreak", js.Array(value :_*))
    
    @scala.inline
    def setLineHeight(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    @scala.inline
    def setLineHeightVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "lineHeight", js.Array(value :_*))
    
    @scala.inline
    def setRadius(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setRadiusVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "radius", js.Array(value :_*))
    
    @scala.inline
    def setText(value: ProductionRule[TextValueRef]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTextVarargs(value: (Test & TextValueRef)*): Self = StObject.set(x, "text", js.Array(value :_*))
  }
}
