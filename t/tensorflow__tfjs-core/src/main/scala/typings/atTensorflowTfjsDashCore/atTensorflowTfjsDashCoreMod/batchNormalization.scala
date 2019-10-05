package typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "batchNormalization")
@js.native
object batchNormalization extends js.Object {
  def apply[R /* <: Rank */](
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | TensorLike,
    mean: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike,
    variance: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | TensorLike,
    mean: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike,
    variance: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike,
    varianceEpsilon: Double
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | TensorLike,
    mean: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike,
    variance: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike,
    varianceEpsilon: Double,
    scale: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | TensorLike,
    mean: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike,
    variance: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike,
    varianceEpsilon: Double,
    scale: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike,
    offset: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
}

