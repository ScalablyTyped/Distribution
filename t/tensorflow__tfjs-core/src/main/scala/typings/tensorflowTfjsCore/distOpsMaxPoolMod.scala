package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distOpsConvUtilMod.ExplicitPadding
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsMaxPoolMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/max_pool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: same_ | valid_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: same_ | valid_,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: Double,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: ExplicitPadding): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: ExplicitPadding,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: same_ | valid_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: ExplicitPadding): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: same_ | valid_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: Double,
    pad: same_ | valid_,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: Double,
    pad: Double,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: ExplicitPadding): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: Double,
    pad: ExplicitPadding,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
}
