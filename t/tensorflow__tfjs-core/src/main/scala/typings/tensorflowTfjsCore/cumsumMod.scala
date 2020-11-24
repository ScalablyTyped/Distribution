package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/cumsum", JSImport.Namespace)
@js.native
object cumsumMod extends js.Object {
  
  @js.native
  object cumsum extends js.Object {
    
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](
      x: Tensor[Rank],
      axis: js.UndefOr[scala.Nothing],
      exclusive: js.UndefOr[scala.Nothing],
      reverse: Boolean
    ): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.UndefOr[scala.Nothing], exclusive: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.UndefOr[scala.Nothing], exclusive: Boolean, reverse: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: js.UndefOr[scala.Nothing], reverse: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: Boolean, reverse: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](
      x: TensorLike,
      axis: js.UndefOr[scala.Nothing],
      exclusive: js.UndefOr[scala.Nothing],
      reverse: Boolean
    ): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.UndefOr[scala.Nothing], exclusive: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.UndefOr[scala.Nothing], exclusive: Boolean, reverse: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: js.UndefOr[scala.Nothing], reverse: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Boolean, reverse: Boolean): T = js.native
  }
}
