package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineEncodeEntry
  extends StObject
     with EncodeEntry
     with DefinedProperty {
  
  var interpolate: js.UndefOr[ProductionRule[ScaledValueRef[Interpolate]]] = js.undefined
  
  var tension: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
}
object LineEncodeEntry {
  
  inline def apply(): LineEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineEncodeEntry]
  }
  
  extension [Self <: LineEncodeEntry](x: Self) {
    
    inline def setInterpolate(value: ProductionRule[ScaledValueRef[Interpolate]]): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
    
    inline def setInterpolateVarargs(value: (Test & ScaledValueRef[Interpolate])*): Self = StObject.set(x, "interpolate", js.Array(value :_*))
    
    inline def setTension(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
    
    inline def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
    
    inline def setTensionVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "tension", js.Array(value :_*))
  }
}
