package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'starts' | 'limits' | 'deltas'> */
trait RaggedRangeInputs extends StObject {
  
  var deltas: js.UndefOr[scala.Any] = js.undefined
  
  var limits: js.UndefOr[scala.Any] = js.undefined
  
  var starts: js.UndefOr[scala.Any] = js.undefined
}
object RaggedRangeInputs {
  
  inline def apply(): RaggedRangeInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RaggedRangeInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RaggedRangeInputs] (val x: Self) extends AnyVal {
    
    inline def setDeltas(value: scala.Any): Self = StObject.set(x, "deltas", value.asInstanceOf[js.Any])
    
    inline def setDeltasUndefined: Self = StObject.set(x, "deltas", js.undefined)
    
    inline def setLimits(value: scala.Any): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    inline def setStarts(value: scala.Any): Self = StObject.set(x, "starts", value.asInstanceOf[js.Any])
    
    inline def setStartsUndefined: Self = StObject.set(x, "starts", js.undefined)
  }
}
