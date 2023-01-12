package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x' | 'scale' | 'offset' | 'mean' | 'variance'> */
trait FusedBatchNormInputs extends StObject {
  
  var mean: js.UndefOr[scala.Any] = js.undefined
  
  var offset: js.UndefOr[scala.Any] = js.undefined
  
  var scale: js.UndefOr[scala.Any] = js.undefined
  
  var variance: js.UndefOr[scala.Any] = js.undefined
  
  var x: js.UndefOr[scala.Any] = js.undefined
}
object FusedBatchNormInputs {
  
  inline def apply(): FusedBatchNormInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FusedBatchNormInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FusedBatchNormInputs] (val x: Self) extends AnyVal {
    
    inline def setMean(value: scala.Any): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
    
    inline def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
    
    inline def setOffset(value: scala.Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setScale(value: scala.Any): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setVariance(value: scala.Any): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    inline def setVarianceUndefined: Self = StObject.set(x, "variance", js.undefined)
    
    inline def setX(value: scala.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
