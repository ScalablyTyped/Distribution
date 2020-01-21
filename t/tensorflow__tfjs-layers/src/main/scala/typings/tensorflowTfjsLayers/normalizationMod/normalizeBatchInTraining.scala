package typings.tensorflowTfjsLayers.normalizationMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "normalizeBatchInTraining")
@js.native
object normalizeBatchInTraining extends js.Object {
  def apply(x: Tensor_[Rank], gamma: Tensor_[Rank], beta: Tensor_[Rank], reductionAxes: js.Array[Double]): js.Tuple3[Tensor_[Rank], Tensor_[Rank], Tensor_[Rank]] = js.native
  def apply(
    x: Tensor_[Rank],
    gamma: Tensor_[Rank],
    beta: Tensor_[Rank],
    reductionAxes: js.Array[Double],
    epsilon: Double
  ): js.Tuple3[Tensor_[Rank], Tensor_[Rank], Tensor_[Rank]] = js.native
}

