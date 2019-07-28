package typings.atTensorflowTfjsDashCore.distOpsOpsMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "matMul")
@js.native
object matMul extends js.Object {
  def apply[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](a: T, b: T, transposeA: Boolean): T = js.native
  def apply[T /* <: Tensor[Rank] */](a: T, b: T, transposeA: Boolean, transposeB: Boolean): T = js.native
  def apply[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](a: T, b: TensorLike, transposeA: Boolean): T = js.native
  def apply[T /* <: Tensor[Rank] */](a: T, b: TensorLike, transposeA: Boolean, transposeB: Boolean): T = js.native
  def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: T, transposeA: Boolean): T = js.native
  def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: T, transposeA: Boolean, transposeB: Boolean): T = js.native
  def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike, transposeA: Boolean): T = js.native
  def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike, transposeA: Boolean, transposeB: Boolean): T = js.native
}

