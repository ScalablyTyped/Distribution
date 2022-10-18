package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsMovingAverageMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/moving_average", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Double, step: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Double, step: Double, zeroDebias: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any], zeroDebias.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Double, step: Unit, zeroDebias: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any], zeroDebias.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Double, step: Scalar): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Double, step: Scalar, zeroDebias: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any], zeroDebias.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Scalar): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Scalar, step: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Scalar, step: Double, zeroDebias: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any], zeroDebias.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Scalar, step: Unit, zeroDebias: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any], zeroDebias.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Scalar, step: Scalar): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Scalar, step: Scalar, zeroDebias: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any], zeroDebias.asInstanceOf[js.Any])).asInstanceOf[T]
}
