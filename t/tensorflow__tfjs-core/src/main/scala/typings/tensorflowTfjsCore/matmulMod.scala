package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import typings.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/matmul", JSImport.Namespace)
@js.native
object matmulMod extends js.Object {
  val dot: js.Function2[/* t1 */ Tensor[Rank] | TensorLike, /* t2 */ Tensor[Rank] | TensorLike, Tensor[Rank]] = js.native
  val outerProduct: js.Function2[/* v1 */ Tensor1D | TensorLike, /* v2 */ Tensor1D | TensorLike, Tensor2D] = js.native
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
  
}

