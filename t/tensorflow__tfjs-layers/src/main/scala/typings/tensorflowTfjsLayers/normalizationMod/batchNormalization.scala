package typings.tensorflowTfjsLayers.normalizationMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "batchNormalization")
@js.native
object batchNormalization extends js.Object {
  def apply(x: Tensor_[Rank], mean: Tensor_[Rank], variance: Tensor_[Rank]): Tensor_[Rank] = js.native
  def apply(x: Tensor_[Rank], mean: Tensor_[Rank], variance: Tensor_[Rank], beta: Tensor_[Rank]): Tensor_[Rank] = js.native
  def apply(
    x: Tensor_[Rank],
    mean: Tensor_[Rank],
    variance: Tensor_[Rank],
    beta: Tensor_[Rank],
    gamma: Tensor_[Rank]
  ): Tensor_[Rank] = js.native
  def apply(
    x: Tensor_[Rank],
    mean: Tensor_[Rank],
    variance: Tensor_[Rank],
    beta: Tensor_[Rank],
    gamma: Tensor_[Rank],
    epsilon: Double
  ): Tensor_[Rank] = js.native
}

