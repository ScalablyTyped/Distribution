package typings.tensorflowTfjsConverter.executorTypesMod

import typings.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionExecutor extends js.Object {
  var weightMap: NamedTensorsMap = js.native
  def executeFunctionAsync(inputs: js.Array[Tensor[Rank]]): js.Promise[js.Array[Tensor[Rank]]] = js.native
}

object FunctionExecutor {
  @scala.inline
  def apply(
    executeFunctionAsync: js.Array[Tensor[Rank]] => js.Promise[js.Array[Tensor[Rank]]],
    weightMap: NamedTensorsMap
  ): FunctionExecutor = {
    val __obj = js.Dynamic.literal(executeFunctionAsync = js.Any.fromFunction1(executeFunctionAsync), weightMap = weightMap.asInstanceOf[js.Any])
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
    def setExecuteFunctionAsync(value: js.Array[Tensor[Rank]] => js.Promise[js.Array[Tensor[Rank]]]): Self = this.set("executeFunctionAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setWeightMap(value: NamedTensorsMap): Self = this.set("weightMap", value.asInstanceOf[js.Any])
  }
  
}

