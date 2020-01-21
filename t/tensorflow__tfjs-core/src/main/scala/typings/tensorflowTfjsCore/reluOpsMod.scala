package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/relu_ops", JSImport.Namespace)
@js.native
object reluOpsMod extends js.Object {
  @js.native
  object elu extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  }
  
  @js.native
  object leakyRelu extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, alpha: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, alpha: Double): T = js.native
  }
  
  @js.native
  object prelu extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T, alpha: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, alpha: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, alpha: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, alpha: TensorLike): T = js.native
  }
  
  @js.native
  object relu extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  }
  
  @js.native
  object relu6 extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  }
  
  @js.native
  object selu extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  }
  
}

