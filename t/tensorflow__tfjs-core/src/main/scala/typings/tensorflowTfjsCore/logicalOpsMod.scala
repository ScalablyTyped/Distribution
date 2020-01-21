package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/logical_ops", JSImport.Namespace)
@js.native
object logicalOpsMod extends js.Object {
  val whereAsync: js.Function1[/* condition */ Tensor[Rank] | TensorLike, js.Promise[Tensor2D]] = js.native
  @js.native
  object logicalAnd extends js.Object {
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  }
  
  @js.native
  object logicalNot extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  }
  
  @js.native
  object logicalOr extends js.Object {
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  }
  
  @js.native
  object logicalXor extends js.Object {
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  }
  
  @js.native
  object where extends js.Object {
    def apply[T /* <: Tensor[Rank] */](condition: TensorLike, a: T, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](condition: TensorLike, a: T, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](condition: TensorLike, a: TensorLike, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](condition: TensorLike, a: TensorLike, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](condition: Tensor[Rank], a: T, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](condition: Tensor[Rank], a: T, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](condition: Tensor[Rank], a: TensorLike, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](condition: Tensor[Rank], a: TensorLike, b: TensorLike): T = js.native
  }
  
}

