package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dilation2dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/dilation2d", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filter: Tensor3D, strides: js.Tuple2[Double, Double], pad: same_ | valid_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor3D,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: js.Tuple2[Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor3D,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: js.Tuple2[Double, Double],
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor3D,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor3D,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: Double,
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor3D,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: Unit,
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filter: Tensor3D, strides: Double, pad: same_ | valid_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor3D,
    strides: Double,
    pad: same_ | valid_,
    dilations: js.Tuple2[Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor3D,
    strides: Double,
    pad: same_ | valid_,
    dilations: js.Tuple2[Double, Double],
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filter: Tensor3D, strides: Double, pad: same_ | valid_, dilations: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor3D,
    strides: Double,
    pad: same_ | valid_,
    dilations: Double,
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor3D,
    strides: Double,
    pad: same_ | valid_,
    dilations: Unit,
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filter: TensorLike, strides: js.Tuple2[Double, Double], pad: same_ | valid_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: js.Tuple2[Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: js.Tuple2[Double, Double],
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: Double,
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: Unit,
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filter: TensorLike, strides: Double, pad: same_ | valid_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: same_ | valid_,
    dilations: js.Tuple2[Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: same_ | valid_,
    dilations: js.Tuple2[Double, Double],
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filter: TensorLike, strides: Double, pad: same_ | valid_, dilations: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: same_ | valid_,
    dilations: Double,
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: same_ | valid_,
    dilations: Unit,
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
}
