package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor3D
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import typings.tensorflowTfjsCore.tensorMod.Tensor5D
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCDHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NDHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.avg
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.max
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/pool", JSImport.Namespace)
@js.native
object poolMod extends js.Object {
  @js.native
  object avgPool extends js.Object {
    def apply[T /* <: Tensor3D | Tensor4D */](
      x: T | TensorLike,
      filterSize: (js.Tuple2[Double, Double]) | Double,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_ | Double
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      x: T | TensorLike,
      filterSize: (js.Tuple2[Double, Double]) | Double,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
  }
  
  @js.native
  object avgPool3d extends js.Object {
    def apply[T /* <: Tensor4D | Tensor5D */](
      x: T | TensorLike,
      filterSize: (js.Tuple3[Double, Double, Double]) | Double,
      strides: (js.Tuple3[Double, Double, Double]) | Double,
      pad: valid_ | same_ | Double
    ): T = js.native
    def apply[T /* <: Tensor4D | Tensor5D */](
      x: T | TensorLike,
      filterSize: (js.Tuple3[Double, Double, Double]) | Double,
      strides: (js.Tuple3[Double, Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def apply[T /* <: Tensor4D | Tensor5D */](
      x: T | TensorLike,
      filterSize: (js.Tuple3[Double, Double, Double]) | Double,
      strides: (js.Tuple3[Double, Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dimRoundingMode: floor | round | ceil,
      dataFormat: NDHWC | NCDHW
    ): T = js.native
    def apply[T /* <: Tensor4D | Tensor5D */](
      x: T | TensorLike,
      filterSize: (js.Tuple3[Double, Double, Double]) | Double,
      strides: (js.Tuple3[Double, Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dimRoundingMode: floor | round | ceil,
      dataFormat: NDHWC | NCDHW,
      dilations: (js.Tuple3[Double, Double, Double]) | Double
    ): T = js.native
  }
  
  @js.native
  object maxPool extends js.Object {
    def apply[T /* <: Tensor3D | Tensor4D */](
      x: T | TensorLike,
      filterSize: (js.Tuple2[Double, Double]) | Double,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_ | Double
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      x: T | TensorLike,
      filterSize: (js.Tuple2[Double, Double]) | Double,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
  }
  
  @js.native
  object maxPool3d extends js.Object {
    def apply[T /* <: Tensor4D | Tensor5D */](
      x: T | TensorLike,
      filterSize: (js.Tuple3[Double, Double, Double]) | Double,
      strides: (js.Tuple3[Double, Double, Double]) | Double,
      pad: valid_ | same_ | Double
    ): T = js.native
    def apply[T /* <: Tensor4D | Tensor5D */](
      x: T | TensorLike,
      filterSize: (js.Tuple3[Double, Double, Double]) | Double,
      strides: (js.Tuple3[Double, Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def apply[T /* <: Tensor4D | Tensor5D */](
      x: T | TensorLike,
      filterSize: (js.Tuple3[Double, Double, Double]) | Double,
      strides: (js.Tuple3[Double, Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dimRoundingMode: floor | round | ceil,
      dataFormat: NDHWC | NCDHW
    ): T = js.native
    def apply[T /* <: Tensor4D | Tensor5D */](
      x: T | TensorLike,
      filterSize: (js.Tuple3[Double, Double, Double]) | Double,
      strides: (js.Tuple3[Double, Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dimRoundingMode: floor | round | ceil,
      dataFormat: NDHWC | NCDHW,
      dilations: (js.Tuple3[Double, Double, Double]) | Double
    ): T = js.native
  }
  
  @js.native
  object maxPoolWithArgmax extends js.Object {
    def apply[T /* <: Tensor4D */](
      x: T | TensorLike,
      filterSize: (js.Tuple2[Double, Double]) | Double,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_ | Double
    ): NamedTensorMap = js.native
    def apply[T /* <: Tensor4D */](
      x: T | TensorLike,
      filterSize: (js.Tuple2[Double, Double]) | Double,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      includeBatchInIndex: Boolean
    ): NamedTensorMap = js.native
  }
  
  @js.native
  object pool extends js.Object {
    def apply[T /* <: Tensor3D | Tensor4D */](
      input: T | TensorLike,
      windowShape: (js.Tuple2[Double, Double]) | Double,
      poolingType: avg | max,
      pad: valid_ | same_ | Double
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      input: T | TensorLike,
      windowShape: (js.Tuple2[Double, Double]) | Double,
      poolingType: avg | max,
      pad: valid_ | same_ | Double,
      dilations: (js.Tuple2[Double, Double]) | Double
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      input: T | TensorLike,
      windowShape: (js.Tuple2[Double, Double]) | Double,
      poolingType: avg | max,
      pad: valid_ | same_ | Double,
      dilations: (js.Tuple2[Double, Double]) | Double,
      strides: (js.Tuple2[Double, Double]) | Double
    ): T = js.native
  }
  
}

