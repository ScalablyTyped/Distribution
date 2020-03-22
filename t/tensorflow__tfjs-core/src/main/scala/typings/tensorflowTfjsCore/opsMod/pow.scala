package typings.tensorflowTfjsCore.opsMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "pow")
@js.native
object pow extends js.Object {
  def apply[T /* <: Tensor[Rank] */](base: TensorLike, exp: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](base: TensorLike, exp: Tensor[Rank]): T = js.native
  def apply[T /* <: Tensor[Rank] */](base: Tensor[Rank], exp: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](base: Tensor[Rank], exp: Tensor[Rank]): T = js.native
}

