package typings.tensorflowTfjsConverter.executorTypesMod

import typings.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import typings.tensorflowTfjsConverter.typesMod.TensorArrayMap
import typings.tensorflowTfjsConverter.typesMod.TensorListMap
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionExecutor extends js.Object {
  
  def executeFunctionAsync(inputs: js.Array[Tensor[Rank]], tensorArrayMap: TensorArrayMap, tensorListMap: TensorListMap): js.Promise[js.Array[Tensor[Rank]]] = js.native
  
  var weightMap: NamedTensorsMap = js.native
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
  implicit class FunctionExecutorOps[Self <: FunctionExecutor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExecuteFunctionAsync(
      value: (js.Array[Tensor[Rank]], TensorArrayMap, TensorListMap) => js.Promise[js.Array[Tensor[Rank]]]
    ): Self = this.set("executeFunctionAsync", js.Any.fromFunction3(value))
    
    @scala.inline
    def setWeightMap(value: NamedTensorsMap): Self = this.set("weightMap", value.asInstanceOf[js.Any])
  }
}
