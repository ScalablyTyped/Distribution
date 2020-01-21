package typings.tensorflowTfjsLayers.trainingTensorsMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "sliceArraysByIndices")
@js.native
object sliceArraysByIndices extends js.Object {
  def apply(arrays: js.Array[Tensor_[Rank]], indices: Tensor1D): Tensor_[Rank] | js.Array[Tensor_[Rank]] = js.native
  def apply(arrays: Tensor_[Rank], indices: Tensor1D): Tensor_[Rank] | js.Array[Tensor_[Rank]] = js.native
}

