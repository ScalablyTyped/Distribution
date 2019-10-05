package typings.atTensorflowTfjsDashLayers.distEngineTrainingUnderscoreTensorsMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "sliceArraysByIndices")
@js.native
object sliceArraysByIndices extends js.Object {
  def apply(arrays: js.Array[Tensor[Rank]], indices: Tensor1D): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  def apply(arrays: Tensor[Rank], indices: Tensor1D): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
}

