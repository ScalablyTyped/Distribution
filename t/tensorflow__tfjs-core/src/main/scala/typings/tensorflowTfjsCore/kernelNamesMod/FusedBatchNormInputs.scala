package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x' | 'scale' | 'offset' | 'mean' | 'variance'> */
trait FusedBatchNormInputs extends StObject {
  
  var mean: js.UndefOr[js.Any] = js.undefined
  
  var offset: js.UndefOr[js.Any] = js.undefined
  
  var scale: js.UndefOr[js.Any] = js.undefined
  
  var variance: js.UndefOr[js.Any] = js.undefined
  
  var x: js.UndefOr[js.Any] = js.undefined
}
object FusedBatchNormInputs {
  
  inline def apply(): FusedBatchNormInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FusedBatchNormInputs]
  }
  
  extension [Self <: FusedBatchNormInputs](x: Self) {
    
    inline def setMean(value: js.Any): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
    
    inline def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
    
    inline def setOffset(value: js.Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setScale(value: js.Any): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setVariance(value: js.Any): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    inline def setVarianceUndefined: Self = StObject.set(x, "variance", js.undefined)
    
    inline def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
