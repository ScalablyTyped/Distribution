package typings.tensorflowTfjs.mod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.Rank.R3
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "localResponseNormalization")
@js.native
object localResponseNormalization extends js.Object {
  
  def apply(x: Tensor[R3 | R4]): Tensor[R3] = js.native
  def apply(
    x: Tensor[R3 | R4],
    depthRadius: js.UndefOr[scala.Nothing],
    bias: js.UndefOr[scala.Nothing],
    alpha: js.UndefOr[scala.Nothing],
    beta: Double
  ): Tensor[R3] = js.native
  def apply(
    x: Tensor[R3 | R4],
    depthRadius: js.UndefOr[scala.Nothing],
    bias: js.UndefOr[scala.Nothing],
    alpha: Double
  ): Tensor[R3] = js.native
  def apply(
    x: Tensor[R3 | R4],
    depthRadius: js.UndefOr[scala.Nothing],
    bias: js.UndefOr[scala.Nothing],
    alpha: Double,
    beta: Double
  ): Tensor[R3] = js.native
  def apply(x: Tensor[R3 | R4], depthRadius: js.UndefOr[scala.Nothing], bias: Double): Tensor[R3] = js.native
  def apply(
    x: Tensor[R3 | R4],
    depthRadius: js.UndefOr[scala.Nothing],
    bias: Double,
    alpha: js.UndefOr[scala.Nothing],
    beta: Double
  ): Tensor[R3] = js.native
  def apply(x: Tensor[R3 | R4], depthRadius: js.UndefOr[scala.Nothing], bias: Double, alpha: Double): Tensor[R3] = js.native
  def apply(
    x: Tensor[R3 | R4],
    depthRadius: js.UndefOr[scala.Nothing],
    bias: Double,
    alpha: Double,
    beta: Double
  ): Tensor[R3] = js.native
  def apply(x: Tensor[R3 | R4], depthRadius: Double): Tensor[R3] = js.native
  def apply(
    x: Tensor[R3 | R4],
    depthRadius: Double,
    bias: js.UndefOr[scala.Nothing],
    alpha: js.UndefOr[scala.Nothing],
    beta: Double
  ): Tensor[R3] = js.native
  def apply(x: Tensor[R3 | R4], depthRadius: Double, bias: js.UndefOr[scala.Nothing], alpha: Double): Tensor[R3] = js.native
  def apply(
    x: Tensor[R3 | R4],
    depthRadius: Double,
    bias: js.UndefOr[scala.Nothing],
    alpha: Double,
    beta: Double
  ): Tensor[R3] = js.native
  def apply(x: Tensor[R3 | R4], depthRadius: Double, bias: Double): Tensor[R3] = js.native
  def apply(
    x: Tensor[R3 | R4],
    depthRadius: Double,
    bias: Double,
    alpha: js.UndefOr[scala.Nothing],
    beta: Double
  ): Tensor[R3] = js.native
  def apply(x: Tensor[R3 | R4], depthRadius: Double, bias: Double, alpha: Double): Tensor[R3] = js.native
  def apply(x: Tensor[R3 | R4], depthRadius: Double, bias: Double, alpha: Double, beta: Double): Tensor[R3] = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    depthRadius: js.UndefOr[scala.Nothing],
    bias: js.UndefOr[scala.Nothing],
    alpha: js.UndefOr[scala.Nothing],
    beta: Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    depthRadius: js.UndefOr[scala.Nothing],
    bias: js.UndefOr[scala.Nothing],
    alpha: Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    depthRadius: js.UndefOr[scala.Nothing],
    bias: js.UndefOr[scala.Nothing],
    alpha: Double,
    beta: Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: js.UndefOr[scala.Nothing], bias: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    depthRadius: js.UndefOr[scala.Nothing],
    bias: Double,
    alpha: js.UndefOr[scala.Nothing],
    beta: Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: js.UndefOr[scala.Nothing], bias: Double, alpha: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: js.UndefOr[scala.Nothing], bias: Double, alpha: Double, beta: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    depthRadius: Double,
    bias: js.UndefOr[scala.Nothing],
    alpha: js.UndefOr[scala.Nothing],
    beta: Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double, bias: js.UndefOr[scala.Nothing], alpha: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double, bias: js.UndefOr[scala.Nothing], alpha: Double, beta: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double, bias: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double, bias: Double, alpha: js.UndefOr[scala.Nothing], beta: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double, bias: Double, alpha: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double, bias: Double, alpha: Double, beta: Double): T = js.native
}
