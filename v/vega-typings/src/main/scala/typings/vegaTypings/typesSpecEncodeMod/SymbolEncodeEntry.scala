package typings.vegaTypings.typesSpecEncodeMod

import typings.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolEncodeEntry
  extends StObject
     with EncodeEntry {
  
  var angle: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var shape: js.UndefOr[ProductionRule[ScaledValueRef[SymbolShape]]] = js.undefined
  
  var size: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
}
object SymbolEncodeEntry {
  
  inline def apply(): SymbolEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymbolEncodeEntry]
  }
  
  extension [Self <: SymbolEncodeEntry](x: Self) {
    
    inline def setAngle(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setAngleVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "angle", js.Array(value*))
    
    inline def setShape(value: ProductionRule[ScaledValueRef[SymbolShape]]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setShapeVarargs(value: (Test & ScaledValueRef[SymbolShape])*): Self = StObject.set(x, "shape", js.Array(value*))
    
    inline def setSize(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSizeVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "size", js.Array(value*))
  }
}
