package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/mat_mul", JSImport.Namespace)
@js.native
object opsMatMulMod extends js.Object {
  
  @js.native
  object matMul extends js.Object {
    
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank], transposeA: js.UndefOr[scala.Nothing], transposeB: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank], transposeA: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank], transposeA: Boolean, transposeB: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike, transposeA: js.UndefOr[scala.Nothing], transposeB: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike, transposeA: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike, transposeA: Boolean, transposeB: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank], transposeA: js.UndefOr[scala.Nothing], transposeB: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank], transposeA: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank], transposeA: Boolean, transposeB: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike, transposeA: js.UndefOr[scala.Nothing], transposeB: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike, transposeA: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike, transposeA: Boolean, transposeB: Boolean): T = js.native
  }
}
