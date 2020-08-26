package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.NumericDataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import typings.tensorflowTfjsCore.tensorMod.Tensor2D
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "kernel_impls")
@js.native
object kernelImpls extends js.Object {
  def nonMaxSuppressionV3(
    boxes: TypedArray,
    scores: TypedArray,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): Tensor1D = js.native
  def nonMaxSuppressionV5(
    boxes: TypedArray,
    scores: TypedArray,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): NamedTensorMap = js.native
  def split[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: T, sizeSplits: js.Array[Double], axis: Double): js.Array[T] = js.native
  def tile[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](xBuf: typings.tensorflowTfjsCore.tensorMod.TensorBuffer[R, DataType], reps: js.Array[Double]): Tensor[R] = js.native
  def topkImpl[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: TypedArray, xShape: js.Array[Double], xDtype: NumericDataType, k: Double, sorted: Boolean): js.Tuple2[T, T] = js.native
  def whereImpl(condShape: js.Array[Double], condVals: TypedArray): Tensor2D = js.native
}

