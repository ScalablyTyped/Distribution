package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.anon.Indices
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/topk", JSImport.Namespace)
@js.native
object topkMod extends js.Object {
  
  @js.native
  object topk extends js.Object {
    
    def apply[T /* <: Tensor[Rank] */](x: T): Indices[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, k: js.UndefOr[scala.Nothing], sorted: Boolean): Indices[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, k: Double): Indices[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, k: Double, sorted: Boolean): Indices[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike): Indices[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, k: js.UndefOr[scala.Nothing], sorted: Boolean): Indices[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, k: Double): Indices[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, k: Double, sorted: Boolean): Indices[T] = js.native
  }
}
