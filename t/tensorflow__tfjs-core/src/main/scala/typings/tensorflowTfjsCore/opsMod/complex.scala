package typings.tensorflowTfjsCore.opsMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "complex")
@js.native
object complex extends js.Object {
  def apply[T /* <: Tensor[Rank] */](real: T, imag: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](real: T, imag: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](real: TensorLike, imag: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](real: TensorLike, imag: TensorLike): T = js.native
}

