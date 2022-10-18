package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x' | 'weights'> */
trait DenseBincountInputs extends StObject {
  
  var weights: js.UndefOr[scala.Any] = js.undefined
  
  var x: js.UndefOr[scala.Any] = js.undefined
}
object DenseBincountInputs {
  
  inline def apply(): DenseBincountInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DenseBincountInputs]
  }
  
  extension [Self <: DenseBincountInputs](x: Self) {
    
    inline def setWeights(value: scala.Any): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
    
    inline def setWeightsUndefined: Self = StObject.set(x, "weights", js.undefined)
    
    inline def setX(value: scala.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
