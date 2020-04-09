package typings.tensorflowTfjsCore.opsMod

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "maxPoolWithArgmax")
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

