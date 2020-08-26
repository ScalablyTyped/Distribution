package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "pow")
@js.native
object pow extends js.Object {
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](base: TensorLike, exp: TensorLike): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](base: TensorLike, exp: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](base: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], exp: TensorLike): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    base: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    exp: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): T = js.native
}

