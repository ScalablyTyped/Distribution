package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avgPoolBackpropMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/avg_pool_backprop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def avgPoolBackprop[T /* <: Tensor3D | Tensor4D */](
    dy: T | TensorLike,
    input: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolBackprop")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPoolBackprop[T /* <: Tensor3D | Tensor4D */](
    dy: T | TensorLike,
    input: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolBackprop")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPoolBackprop[T /* <: Tensor3D | Tensor4D */](
    dy: T | TensorLike,
    input: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolBackprop")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPoolBackprop[T /* <: Tensor3D | Tensor4D */](
    dy: T | TensorLike,
    input: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolBackprop")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPoolBackprop[T /* <: Tensor3D | Tensor4D */](
    dy: T | TensorLike,
    input: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: same_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolBackprop")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPoolBackprop[T /* <: Tensor3D | Tensor4D */](
    dy: T | TensorLike,
    input: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolBackprop")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPoolBackprop[T /* <: Tensor3D | Tensor4D */](
    dy: T | TensorLike,
    input: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolBackprop")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPoolBackprop[T /* <: Tensor3D | Tensor4D */](
    dy: T | TensorLike,
    input: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: same_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolBackprop")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPoolBackprop[T /* <: Tensor3D | Tensor4D */](
    dy: T | TensorLike,
    input: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolBackprop")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPoolBackprop[T /* <: Tensor3D | Tensor4D */](dy: T | TensorLike, input: T | TensorLike, filterSize: Double, strides: Double, pad: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolBackprop")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPoolBackprop[T /* <: Tensor3D | Tensor4D */](dy: T | TensorLike, input: T | TensorLike, filterSize: Double, strides: Double, pad: same_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolBackprop")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPoolBackprop[T /* <: Tensor3D | Tensor4D */](dy: T | TensorLike, input: T | TensorLike, filterSize: Double, strides: Double, pad: valid_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolBackprop")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
}
