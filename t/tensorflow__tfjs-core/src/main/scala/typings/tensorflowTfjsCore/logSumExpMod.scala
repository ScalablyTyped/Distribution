package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logSumExpMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/log_sum_exp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
}
