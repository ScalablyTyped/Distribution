package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/compare", JSImport.Namespace)
@js.native
object compareMod extends js.Object {
  @js.native
  object equal extends js.Object {
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  }
  
  @js.native
  object equalStrict extends js.Object {
    def apply[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  }
  
  @js.native
  object greater extends js.Object {
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  }
  
  @js.native
  object greaterEqual extends js.Object {
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  }
  
  @js.native
  object greaterEqualStrict extends js.Object {
    def apply[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  }
  
  @js.native
  object greaterStrict extends js.Object {
    def apply[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  }
  
  @js.native
  object less extends js.Object {
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  }
  
  @js.native
  object lessEqual extends js.Object {
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  }
  
  @js.native
  object lessEqualStrict extends js.Object {
    def apply[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  }
  
  @js.native
  object lessStrict extends js.Object {
    def apply[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  }
  
  @js.native
  object notEqual extends js.Object {
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  }
  
  @js.native
  object notEqualStrict extends js.Object {
    def apply[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  }
  
}

