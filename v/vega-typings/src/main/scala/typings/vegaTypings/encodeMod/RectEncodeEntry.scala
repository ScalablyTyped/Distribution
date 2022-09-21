package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RectEncodeEntry
  extends StObject
     with EncodeEntry {
  
  var cornerRadius: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var cornerRadiusBottomLeft: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var cornerRadiusBottomRight: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var cornerRadiusTopLeft: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var cornerRadiusTopRight: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
}
object RectEncodeEntry {
  
  inline def apply(): RectEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectEncodeEntry]
  }
  
  extension [Self <: RectEncodeEntry](x: Self) {
    
    inline def setCornerRadius(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusBottomLeft(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "cornerRadiusBottomLeft", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusBottomLeftUndefined: Self = StObject.set(x, "cornerRadiusBottomLeft", js.undefined)
    
    inline def setCornerRadiusBottomLeftVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "cornerRadiusBottomLeft", js.Array(value*))
    
    inline def setCornerRadiusBottomRight(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "cornerRadiusBottomRight", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusBottomRightUndefined: Self = StObject.set(x, "cornerRadiusBottomRight", js.undefined)
    
    inline def setCornerRadiusBottomRightVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "cornerRadiusBottomRight", js.Array(value*))
    
    inline def setCornerRadiusTopLeft(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "cornerRadiusTopLeft", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusTopLeftUndefined: Self = StObject.set(x, "cornerRadiusTopLeft", js.undefined)
    
    inline def setCornerRadiusTopLeftVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "cornerRadiusTopLeft", js.Array(value*))
    
    inline def setCornerRadiusTopRight(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "cornerRadiusTopRight", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusTopRightUndefined: Self = StObject.set(x, "cornerRadiusTopRight", js.undefined)
    
    inline def setCornerRadiusTopRightVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "cornerRadiusTopRight", js.Array(value*))
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setCornerRadiusVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "cornerRadius", js.Array(value*))
  }
}
