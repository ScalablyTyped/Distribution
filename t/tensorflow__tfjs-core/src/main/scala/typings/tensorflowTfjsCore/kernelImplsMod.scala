package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTensorMod.TensorBuffer
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.NumericDataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelImplsMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/kernel_impls", "nonMaxSuppressionV3Impl")
  @js.native
  def nonMaxSuppressionV3Impl(
    boxes: TypedArray,
    scores: TypedArray,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): Tensor1D = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/kernel_impls", "nonMaxSuppressionV4Impl")
  @js.native
  def nonMaxSuppressionV4Impl(
    boxes: TypedArray,
    scores: TypedArray,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/kernel_impls", "nonMaxSuppressionV5Impl")
  @js.native
  def nonMaxSuppressionV5Impl(
    boxes: TypedArray,
    scores: TypedArray,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): NamedTensorMap = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/kernel_impls", "split")
  @js.native
  def split[T /* <: Tensor[Rank] */](x: T, sizeSplits: js.Array[Double], axis: Double): js.Array[T] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/kernel_impls", "tile")
  @js.native
  def tile[R /* <: Rank */](xBuf: TensorBuffer[R, DataType], reps: js.Array[Double]): Tensor[R] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/kernel_impls", "topkImpl")
  @js.native
  def topkImpl[T /* <: Tensor[Rank] */](x: TypedArray, xShape: js.Array[Double], xDtype: NumericDataType, k: Double, sorted: Boolean): js.Tuple2[T, T] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/kernel_impls", "whereImpl")
  @js.native
  def whereImpl(condShape: js.Array[Double], condVals: TypedArray): Tensor2D = js.native
}
