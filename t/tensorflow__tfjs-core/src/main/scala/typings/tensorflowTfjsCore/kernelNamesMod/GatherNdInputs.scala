package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'params' | 'indices'> */
trait GatherNdInputs extends StObject {
  
  var indices: js.UndefOr[js.Any] = js.undefined
  
  var params: js.UndefOr[js.Any] = js.undefined
}
object GatherNdInputs {
  
  @scala.inline
  def apply(): GatherNdInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatherNdInputs]
  }
  
  @scala.inline
  implicit class GatherNdInputsMutableBuilder[Self <: GatherNdInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndices(value: js.Any): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
