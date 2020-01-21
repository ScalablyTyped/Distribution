package typings.tensorflowTfjsCore.unaryOpsMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/unary_ops", "erf")
@js.native
object erf extends js.Object {
  def apply[T /* <: Tensor[Rank] */](x: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
}

