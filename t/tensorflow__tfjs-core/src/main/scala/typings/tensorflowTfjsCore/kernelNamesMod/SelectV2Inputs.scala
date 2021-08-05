package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'condition' | 't' | 'e'> */
trait SelectV2Inputs extends StObject {
  
  var condition: js.UndefOr[js.Any] = js.undefined
  
  var e: js.UndefOr[js.Any] = js.undefined
  
  var t: js.UndefOr[js.Any] = js.undefined
}
object SelectV2Inputs {
  
  inline def apply(): SelectV2Inputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectV2Inputs]
  }
  
  extension [Self <: SelectV2Inputs](x: Self) {
    
    inline def setCondition(value: js.Any): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setE(value: js.Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
    
    inline def setT(value: js.Any): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
  }
}
