package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEncodeEntry
  extends StObject
     with EncodeEntry {
  
  var angle: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var path: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  
  var scaleX: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var scaleY: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
}
object PathEncodeEntry {
  
  inline def apply(): PathEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathEncodeEntry]
  }
  
  extension [Self <: PathEncodeEntry](x: Self) {
    
    inline def setAngle(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setAngleVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "angle", js.Array(value :_*))
    
    inline def setPath(value: ProductionRule[StringValueRef]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: (Test & StringValueRef)*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    inline def setScaleX(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setScaleXVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "scaleX", js.Array(value :_*))
    
    inline def setScaleY(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    inline def setScaleYVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "scaleY", js.Array(value :_*))
  }
}
