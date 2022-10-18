package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'condition' | 't' | 'e'> */
trait SelectInputs extends StObject {
  
  var condition: js.UndefOr[scala.Any] = js.undefined
  
  var e: js.UndefOr[scala.Any] = js.undefined
  
  var t: js.UndefOr[scala.Any] = js.undefined
}
object SelectInputs {
  
  inline def apply(): SelectInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectInputs]
  }
  
  extension [Self <: SelectInputs](x: Self) {
    
    inline def setCondition(value: scala.Any): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setE(value: scala.Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
    
    inline def setT(value: scala.Any): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
  }
}
