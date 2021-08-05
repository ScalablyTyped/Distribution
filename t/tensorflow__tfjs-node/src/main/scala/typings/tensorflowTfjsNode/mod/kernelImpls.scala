package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.NumericDataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelImpls {
  
  @JSImport("@tensorflow/tfjs-node", "kernel_impls")
  @js.native
  val ^ : js.Any = js.native
  
  inline def nonMaxSuppressionV3Impl(
    boxes: TypedArray,
    scores: TypedArray,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionV3Impl")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  
  inline def nonMaxSuppressionV4Impl(
    boxes: TypedArray,
    scores: TypedArray,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionV4Impl")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  
  inline def nonMaxSuppressionV5Impl(
    boxes: TypedArray,
    scores: TypedArray,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionV5Impl")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  
  inline def split[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: T, sizeSplits: js.Array[Double], axis: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], sizeSplits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def tile[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](xBuf: typings.tensorflowTfjsCore.distTensorMod.TensorBuffer[R, DataType], reps: js.Array[Double]): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tile")(xBuf.asInstanceOf[js.Any], reps.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  inline def topkImpl[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: TypedArray, xShape: js.Array[Double], xDtype: NumericDataType, k: Double, sorted: Boolean): js.Tuple2[T, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("topkImpl")(x.asInstanceOf[js.Any], xShape.asInstanceOf[js.Any], xDtype.asInstanceOf[js.Any], k.asInstanceOf[js.Any], sorted.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, T]]
  
  inline def whereImpl(condShape: js.Array[Double], condVals: TypedArray): Tensor2D = (^.asInstanceOf[js.Dynamic].applyDynamic("whereImpl")(condShape.asInstanceOf[js.Any], condVals.asInstanceOf[js.Any])).asInstanceOf[Tensor2D]
}
