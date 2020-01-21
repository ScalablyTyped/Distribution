package typings.tensorflowTfjsLayers.trainingTensorsMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "sliceArrays")
@js.native
object sliceArrays extends js.Object {
  def apply(arrays: js.Array[Tensor_[Rank]], start: Double, stop: Double): Tensor_[Rank] | js.Array[Tensor_[Rank]] = js.native
  def apply(arrays: Tensor_[Rank], start: Double, stop: Double): Tensor_[Rank] | js.Array[Tensor_[Rank]] = js.native
}

