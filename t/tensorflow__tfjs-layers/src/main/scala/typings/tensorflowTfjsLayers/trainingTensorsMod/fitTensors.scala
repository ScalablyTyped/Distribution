package typings.tensorflowTfjsLayers.trainingTensorsMod

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import typings.tensorflowTfjsLayers.baseCallbacksMod.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "fitTensors")
@js.native
object fitTensors extends js.Object {
  def apply(model: js.Any, x: js.Array[Tensor_[Rank]], y: js.Array[Tensor_[Rank]]): js.Promise[History] = js.native
  def apply(model: js.Any, x: js.Array[Tensor_[Rank]], y: js.Array[Tensor_[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
  def apply(model: js.Any, x: js.Array[Tensor_[Rank]], y: StringDictionary[Tensor_[Rank]]): js.Promise[History] = js.native
  def apply(model: js.Any, x: js.Array[Tensor_[Rank]], y: StringDictionary[Tensor_[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
  def apply(model: js.Any, x: js.Array[Tensor_[Rank]], y: Tensor_[Rank]): js.Promise[History] = js.native
  def apply(model: js.Any, x: js.Array[Tensor_[Rank]], y: Tensor_[Rank], args: ModelFitArgs): js.Promise[History] = js.native
  def apply(model: js.Any, x: StringDictionary[Tensor_[Rank]], y: js.Array[Tensor_[Rank]]): js.Promise[History] = js.native
  def apply(model: js.Any, x: StringDictionary[Tensor_[Rank]], y: js.Array[Tensor_[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
  def apply(model: js.Any, x: StringDictionary[Tensor_[Rank]], y: StringDictionary[Tensor_[Rank]]): js.Promise[History] = js.native
  def apply(
    model: js.Any,
    x: StringDictionary[Tensor_[Rank]],
    y: StringDictionary[Tensor_[Rank]],
    args: ModelFitArgs
  ): js.Promise[History] = js.native
  def apply(model: js.Any, x: StringDictionary[Tensor_[Rank]], y: Tensor_[Rank]): js.Promise[History] = js.native
  def apply(model: js.Any, x: StringDictionary[Tensor_[Rank]], y: Tensor_[Rank], args: ModelFitArgs): js.Promise[History] = js.native
  def apply(model: js.Any, x: Tensor_[Rank], y: js.Array[Tensor_[Rank]]): js.Promise[History] = js.native
  def apply(model: js.Any, x: Tensor_[Rank], y: js.Array[Tensor_[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
  def apply(model: js.Any, x: Tensor_[Rank], y: StringDictionary[Tensor_[Rank]]): js.Promise[History] = js.native
  def apply(model: js.Any, x: Tensor_[Rank], y: StringDictionary[Tensor_[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
  def apply(model: js.Any, x: Tensor_[Rank], y: Tensor_[Rank]): js.Promise[History] = js.native
  def apply(model: js.Any, x: Tensor_[Rank], y: Tensor_[Rank], args: ModelFitArgs): js.Promise[History] = js.native
}

