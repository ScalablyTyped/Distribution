package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcEncodeEntry
  extends StObject
     with EncodeEntry {
  
  var cornerRadius: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var endAngle: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var innerRadius: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var outerRadius: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var padAngle: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var startAngle: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
}
object ArcEncodeEntry {
  
  inline def apply(): ArcEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcEncodeEntry]
  }
  
  extension [Self <: ArcEncodeEntry](x: Self) {
    
    inline def setCornerRadius(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setCornerRadiusVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "cornerRadius", js.Array(value :_*))
    
    inline def setEndAngle(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    inline def setEndAngleVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "endAngle", js.Array(value :_*))
    
    inline def setInnerRadius(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    inline def setInnerRadiusVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "innerRadius", js.Array(value :_*))
    
    inline def setOuterRadius(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
    
    inline def setOuterRadiusUndefined: Self = StObject.set(x, "outerRadius", js.undefined)
    
    inline def setOuterRadiusVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "outerRadius", js.Array(value :_*))
    
    inline def setPadAngle(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
    
    inline def setPadAngleUndefined: Self = StObject.set(x, "padAngle", js.undefined)
    
    inline def setPadAngleVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "padAngle", js.Array(value :_*))
    
    inline def setStartAngle(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    inline def setStartAngleVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "startAngle", js.Array(value :_*))
  }
}
