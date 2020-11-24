package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/avg_pool_backprop", JSImport.Namespace)
@js.native
object avgPoolBackpropMod extends js.Object {
  
  @js.native
  object avgPoolBackprop extends js.Object {
    
    def apply[T /* <: Tensor3D | Tensor4D */](
      dy: T,
      input: T,
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: Double
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      dy: T,
      input: T,
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: same_
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      dy: T,
      input: T,
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: valid_
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: T, input: T, filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: T, input: T, filterSize: js.Tuple2[Double, Double], strides: Double, pad: same_): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: T, input: T, filterSize: js.Tuple2[Double, Double], strides: Double, pad: valid_): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: T, input: T, filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: T, input: T, filterSize: Double, strides: js.Tuple2[Double, Double], pad: same_): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: T, input: T, filterSize: Double, strides: js.Tuple2[Double, Double], pad: valid_): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: T, input: T, filterSize: Double, strides: Double, pad: Double): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: T, input: T, filterSize: Double, strides: Double, pad: same_): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: T, input: T, filterSize: Double, strides: Double, pad: valid_): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      dy: T,
      input: TensorLike,
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: Double
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      dy: T,
      input: TensorLike,
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: same_
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      dy: T,
      input: TensorLike,
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: valid_
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: T, input: TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: T, input: TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: same_): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: T, input: TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: valid_): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: T, input: TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: T, input: TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: same_): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: T, input: TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: valid_): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: T, input: TensorLike, filterSize: Double, strides: Double, pad: Double): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: T, input: TensorLike, filterSize: Double, strides: Double, pad: same_): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: T, input: TensorLike, filterSize: Double, strides: Double, pad: valid_): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      dy: TensorLike,
      input: T,
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: Double
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      dy: TensorLike,
      input: T,
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: same_
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      dy: TensorLike,
      input: T,
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: valid_
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: TensorLike, input: T, filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: TensorLike, input: T, filterSize: js.Tuple2[Double, Double], strides: Double, pad: same_): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: TensorLike, input: T, filterSize: js.Tuple2[Double, Double], strides: Double, pad: valid_): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: TensorLike, input: T, filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: TensorLike, input: T, filterSize: Double, strides: js.Tuple2[Double, Double], pad: same_): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: TensorLike, input: T, filterSize: Double, strides: js.Tuple2[Double, Double], pad: valid_): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: TensorLike, input: T, filterSize: Double, strides: Double, pad: Double): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: TensorLike, input: T, filterSize: Double, strides: Double, pad: same_): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: TensorLike, input: T, filterSize: Double, strides: Double, pad: valid_): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      dy: TensorLike,
      input: TensorLike,
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: Double
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      dy: TensorLike,
      input: TensorLike,
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: same_
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      dy: TensorLike,
      input: TensorLike,
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: valid_
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      dy: TensorLike,
      input: TensorLike,
      filterSize: js.Tuple2[Double, Double],
      strides: Double,
      pad: Double
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      dy: TensorLike,
      input: TensorLike,
      filterSize: js.Tuple2[Double, Double],
      strides: Double,
      pad: same_
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      dy: TensorLike,
      input: TensorLike,
      filterSize: js.Tuple2[Double, Double],
      strides: Double,
      pad: valid_
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      dy: TensorLike,
      input: TensorLike,
      filterSize: Double,
      strides: js.Tuple2[Double, Double],
      pad: Double
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      dy: TensorLike,
      input: TensorLike,
      filterSize: Double,
      strides: js.Tuple2[Double, Double],
      pad: same_
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      dy: TensorLike,
      input: TensorLike,
      filterSize: Double,
      strides: js.Tuple2[Double, Double],
      pad: valid_
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: TensorLike, input: TensorLike, filterSize: Double, strides: Double, pad: Double): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: TensorLike, input: TensorLike, filterSize: Double, strides: Double, pad: same_): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](dy: TensorLike, input: TensorLike, filterSize: Double, strides: Double, pad: valid_): T = js.native
  }
}
