package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "complex")
@js.native
object complex extends js.Object {
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](real: T, imag: T): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](real: T, imag: TensorLike): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](real: TensorLike, imag: T): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](real: TensorLike, imag: TensorLike): T = js.native
}

