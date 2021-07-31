package typings.tensorflowTfjsConverter

import typings.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import typings.tensorflowTfjsConverter.typesMod.TensorArrayMap
import typings.tensorflowTfjsConverter.typesMod.TensorListMap
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executorTypesMod {
  
  trait FunctionExecutor extends StObject {
    
    def executeFunctionAsync(inputs: js.Array[Tensor[Rank]], tensorArrayMap: TensorArrayMap, tensorListMap: TensorListMap): js.Promise[js.Array[Tensor[Rank]]]
    
    var weightMap: NamedTensorsMap
  }
  object FunctionExecutor {
    
    @scala.inline
    def apply(
      executeFunctionAsync: (js.Array[Tensor[Rank]], TensorArrayMap, TensorListMap) => js.Promise[js.Array[Tensor[Rank]]],
      weightMap: NamedTensorsMap
    ): FunctionExecutor = {
      val __obj = js.Dynamic.literal(executeFunctionAsync = js.Any.fromFunction3(executeFunctionAsync), weightMap = weightMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionExecutor]
    }
    
    @scala.inline
    implicit class FunctionExecutorMutableBuilder[Self <: FunctionExecutor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecuteFunctionAsync(
        value: (js.Array[Tensor[Rank]], TensorArrayMap, TensorListMap) => js.Promise[js.Array[Tensor[Rank]]]
      ): Self = StObject.set(x, "executeFunctionAsync", js.Any.fromFunction3(value))
      
      @scala.inline
      def setWeightMap(value: NamedTensorsMap): Self = StObject.set(x, "weightMap", value.asInstanceOf[js.Any])
    }
  }
}
