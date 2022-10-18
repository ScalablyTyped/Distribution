package typings.tensorflowTfjsConverter

import typings.tensorflowTfjsConverter.distDataTypesMod.NamedTensorsMap
import typings.tensorflowTfjsConverter.distDataTypesMod.TensorArrayMap
import typings.tensorflowTfjsConverter.distDataTypesMod.TensorListMap
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExecutorTypesMod {
  
  trait FunctionExecutor extends StObject {
    
    def executeFunctionAsync(inputs: js.Array[Tensor[Rank]], tensorArrayMap: TensorArrayMap, tensorListMap: TensorListMap): js.Promise[js.Array[Tensor[Rank]]]
    
    var weightMap: NamedTensorsMap
  }
  object FunctionExecutor {
    
    inline def apply(
      executeFunctionAsync: (js.Array[Tensor[Rank]], TensorArrayMap, TensorListMap) => js.Promise[js.Array[Tensor[Rank]]],
      weightMap: NamedTensorsMap
    ): FunctionExecutor = {
      val __obj = js.Dynamic.literal(executeFunctionAsync = js.Any.fromFunction3(executeFunctionAsync), weightMap = weightMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionExecutor]
    }
    
    extension [Self <: FunctionExecutor](x: Self) {
      
      inline def setExecuteFunctionAsync(
        value: (js.Array[Tensor[Rank]], TensorArrayMap, TensorListMap) => js.Promise[js.Array[Tensor[Rank]]]
      ): Self = StObject.set(x, "executeFunctionAsync", js.Any.fromFunction3(value))
      
      inline def setWeightMap(value: NamedTensorsMap): Self = StObject.set(x, "weightMap", value.asInstanceOf[js.Any])
    }
  }
}
