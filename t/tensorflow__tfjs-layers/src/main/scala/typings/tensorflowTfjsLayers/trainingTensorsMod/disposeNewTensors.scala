package typings.tensorflowTfjsLayers.trainingTensorsMod

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "disposeNewTensors")
@js.native
object disposeNewTensors extends js.Object {
  def apply(tensors: js.Array[Tensor_[Rank]], refTensors: js.Array[Tensor_[Rank]]): Unit = js.native
  def apply(tensors: js.Array[Tensor_[Rank]], refTensors: StringDictionary[Tensor_[Rank]]): Unit = js.native
  def apply(tensors: js.Array[Tensor_[Rank]], refTensors: Tensor_[Rank]): Unit = js.native
  def apply(tensors: StringDictionary[Tensor_[Rank]], refTensors: js.Array[Tensor_[Rank]]): Unit = js.native
  def apply(tensors: StringDictionary[Tensor_[Rank]], refTensors: StringDictionary[Tensor_[Rank]]): Unit = js.native
  def apply(tensors: StringDictionary[Tensor_[Rank]], refTensors: Tensor_[Rank]): Unit = js.native
  def apply(tensors: Tensor_[Rank], refTensors: js.Array[Tensor_[Rank]]): Unit = js.native
  def apply(tensors: Tensor_[Rank], refTensors: StringDictionary[Tensor_[Rank]]): Unit = js.native
  def apply(tensors: Tensor_[Rank], refTensors: Tensor_[Rank]): Unit = js.native
}

