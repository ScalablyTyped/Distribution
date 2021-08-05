package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTensorMod.Tensor5D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conv3dTransposeMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv3d_transpose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: same_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: same_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
}
