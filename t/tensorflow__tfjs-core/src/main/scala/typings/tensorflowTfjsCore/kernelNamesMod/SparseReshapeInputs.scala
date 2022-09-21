package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'inputIndices' | 'inputShape' | 'newShape'> */
trait SparseReshapeInputs extends StObject {
  
  var inputIndices: js.UndefOr[scala.Any] = js.undefined
  
  var inputShape: js.UndefOr[scala.Any] = js.undefined
  
  var newShape: js.UndefOr[scala.Any] = js.undefined
}
object SparseReshapeInputs {
  
  inline def apply(): SparseReshapeInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparseReshapeInputs]
  }
  
  extension [Self <: SparseReshapeInputs](x: Self) {
    
    inline def setInputIndices(value: scala.Any): Self = StObject.set(x, "inputIndices", value.asInstanceOf[js.Any])
    
    inline def setInputIndicesUndefined: Self = StObject.set(x, "inputIndices", js.undefined)
    
    inline def setInputShape(value: scala.Any): Self = StObject.set(x, "inputShape", value.asInstanceOf[js.Any])
    
    inline def setInputShapeUndefined: Self = StObject.set(x, "inputShape", js.undefined)
    
    inline def setNewShape(value: scala.Any): Self = StObject.set(x, "newShape", value.asInstanceOf[js.Any])
    
    inline def setNewShapeUndefined: Self = StObject.set(x, "newShape", js.undefined)
  }
}
