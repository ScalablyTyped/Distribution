package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'indices' | 'updates'> */
trait ScatterNdInputs extends StObject {
  
  var indices: js.UndefOr[js.Any] = js.undefined
  
  var updates: js.UndefOr[js.Any] = js.undefined
}
object ScatterNdInputs {
  
  @scala.inline
  def apply(): ScatterNdInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScatterNdInputs]
  }
  
  @scala.inline
  implicit class ScatterNdInputsMutableBuilder[Self <: ScatterNdInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndices(value: js.Any): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    @scala.inline
    def setUpdates(value: js.Any): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatesUndefined: Self = StObject.set(x, "updates", js.undefined)
  }
}
