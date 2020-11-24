package typings.tensorflowTfjs.mod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "cumsum")
@js.native
object cumsum extends js.Object {
  
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    axis: js.UndefOr[scala.Nothing],
    exclusive: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    axis: js.UndefOr[scala.Nothing],
    exclusive: Boolean
  ): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    axis: js.UndefOr[scala.Nothing],
    exclusive: Boolean,
    reverse: Boolean
  ): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], axis: Double): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    axis: Double,
    exclusive: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], axis: Double, exclusive: Boolean): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    axis: Double,
    exclusive: Boolean,
    reverse: Boolean
  ): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    x: TensorLike,
    axis: js.UndefOr[scala.Nothing],
    exclusive: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike, axis: js.UndefOr[scala.Nothing], exclusive: Boolean): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike, axis: js.UndefOr[scala.Nothing], exclusive: Boolean, reverse: Boolean): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike, axis: Double): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike, axis: Double, exclusive: js.UndefOr[scala.Nothing], reverse: Boolean): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike, axis: Double, exclusive: Boolean): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike, axis: Double, exclusive: Boolean, reverse: Boolean): T = js.native
}
