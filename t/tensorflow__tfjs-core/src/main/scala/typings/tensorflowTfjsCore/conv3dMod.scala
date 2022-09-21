package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTensorMod.Tensor5D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCDHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NDHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conv3dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv3d", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC,
    dilations: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_,
    dataFormat: Unit,
    dilations: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](x: T | TensorLike, filter: Tensor5D, strides: Double, pad: same_ | valid_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC,
    dilations: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: Unit,
    dilations: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC,
    dilations: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_,
    dataFormat: Unit,
    dilations: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](x: T | TensorLike, filter: TensorLike, strides: Double, pad: same_ | valid_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC,
    dilations: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: Unit,
    dilations: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
}
