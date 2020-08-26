package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "softmax")
@js.native
object softmax extends js.Object {
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](logits: T): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](logits: T, dim: Double): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](logits: TensorLike): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](logits: TensorLike, dim: Double): T = js.native
}

