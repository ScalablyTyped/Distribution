package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.bilinear
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.constant
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.nearest
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.reflect
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.wrap
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTensorMod.Tensor5D
import typings.tensorflowTfjsCore.distTensorMod.Tensor6D
import typings.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.distTypesMod.Rank.R2
import typings.tensorflowTfjsCore.distTypesMod.Rank.R3
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.distTypesMod.Rank.R5
import typings.tensorflowTfjsCore.distTypesMod.Rank.R6
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofimage extends StObject {
  
  def cropAndResize(image: Tensor4D, boxes: Tensor2D, boxInd: Tensor1D, cropSize: js.Tuple2[Double, Double]): Tensor4D = js.native
  def cropAndResize(
    image: Tensor4D,
    boxes: Tensor2D,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest
  ): Tensor4D = js.native
  def cropAndResize(
    image: Tensor4D,
    boxes: Tensor2D,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest,
    extrapolationValue: Double
  ): Tensor4D = js.native
  def cropAndResize(
    image: Tensor4D,
    boxes: Tensor2D,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: Unit,
    extrapolationValue: Double
  ): Tensor4D = js.native
  def cropAndResize(image: Tensor4D, boxes: Tensor2D, boxInd: TensorLike, cropSize: js.Tuple2[Double, Double]): Tensor4D = js.native
  def cropAndResize(
    image: Tensor4D,
    boxes: Tensor2D,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest
  ): Tensor4D = js.native
  def cropAndResize(
    image: Tensor4D,
    boxes: Tensor2D,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest,
    extrapolationValue: Double
  ): Tensor4D = js.native
  def cropAndResize(
    image: Tensor4D,
    boxes: Tensor2D,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: Unit,
    extrapolationValue: Double
  ): Tensor4D = js.native
  def cropAndResize(image: Tensor4D, boxes: TensorLike, boxInd: Tensor1D, cropSize: js.Tuple2[Double, Double]): Tensor4D = js.native
  def cropAndResize(
    image: Tensor4D,
    boxes: TensorLike,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest
  ): Tensor4D = js.native
  def cropAndResize(
    image: Tensor4D,
    boxes: TensorLike,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest,
    extrapolationValue: Double
  ): Tensor4D = js.native
  def cropAndResize(
    image: Tensor4D,
    boxes: TensorLike,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: Unit,
    extrapolationValue: Double
  ): Tensor4D = js.native
  def cropAndResize(image: Tensor4D, boxes: TensorLike, boxInd: TensorLike, cropSize: js.Tuple2[Double, Double]): Tensor4D = js.native
  def cropAndResize(
    image: Tensor4D,
    boxes: TensorLike,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest
  ): Tensor4D = js.native
  def cropAndResize(
    image: Tensor4D,
    boxes: TensorLike,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest,
    extrapolationValue: Double
  ): Tensor4D = js.native
  def cropAndResize(
    image: Tensor4D,
    boxes: TensorLike,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: Unit,
    extrapolationValue: Double
  ): Tensor4D = js.native
  def cropAndResize(image: TensorLike, boxes: Tensor2D, boxInd: Tensor1D, cropSize: js.Tuple2[Double, Double]): Tensor4D = js.native
  def cropAndResize(
    image: TensorLike,
    boxes: Tensor2D,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest
  ): Tensor4D = js.native
  def cropAndResize(
    image: TensorLike,
    boxes: Tensor2D,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest,
    extrapolationValue: Double
  ): Tensor4D = js.native
  def cropAndResize(
    image: TensorLike,
    boxes: Tensor2D,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: Unit,
    extrapolationValue: Double
  ): Tensor4D = js.native
  def cropAndResize(image: TensorLike, boxes: Tensor2D, boxInd: TensorLike, cropSize: js.Tuple2[Double, Double]): Tensor4D = js.native
  def cropAndResize(
    image: TensorLike,
    boxes: Tensor2D,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest
  ): Tensor4D = js.native
  def cropAndResize(
    image: TensorLike,
    boxes: Tensor2D,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest,
    extrapolationValue: Double
  ): Tensor4D = js.native
  def cropAndResize(
    image: TensorLike,
    boxes: Tensor2D,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: Unit,
    extrapolationValue: Double
  ): Tensor4D = js.native
  def cropAndResize(image: TensorLike, boxes: TensorLike, boxInd: Tensor1D, cropSize: js.Tuple2[Double, Double]): Tensor4D = js.native
  def cropAndResize(
    image: TensorLike,
    boxes: TensorLike,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest
  ): Tensor4D = js.native
  def cropAndResize(
    image: TensorLike,
    boxes: TensorLike,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest,
    extrapolationValue: Double
  ): Tensor4D = js.native
  def cropAndResize(
    image: TensorLike,
    boxes: TensorLike,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: Unit,
    extrapolationValue: Double
  ): Tensor4D = js.native
  def cropAndResize(image: TensorLike, boxes: TensorLike, boxInd: TensorLike, cropSize: js.Tuple2[Double, Double]): Tensor4D = js.native
  def cropAndResize(
    image: TensorLike,
    boxes: TensorLike,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest
  ): Tensor4D = js.native
  def cropAndResize(
    image: TensorLike,
    boxes: TensorLike,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest,
    extrapolationValue: Double
  ): Tensor4D = js.native
  def cropAndResize(
    image: TensorLike,
    boxes: TensorLike,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: Unit,
    extrapolationValue: Double
  ): Tensor4D = js.native
  
  def flipLeftRight(image: Tensor4D): Tensor4D = js.native
  def flipLeftRight(image: TensorLike): Tensor4D = js.native
  
  def grayscaleToRGB(image: typings.tensorflowTfjsCore.distTensorMod.Tensor[R2 | R3 | R4 | R5 | R6]): typings.tensorflowTfjsCore.distTensorMod.Tensor[R2] = js.native
  def grayscaleToRGB[T /* <: Tensor2D | Tensor3D | Tensor4D | Tensor5D | Tensor6D */](image: TensorLike): T = js.native
  
  def nonMaxSuppression(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double): Tensor1D = js.native
  def nonMaxSuppression(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): Tensor1D = js.native
  def nonMaxSuppression(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): Tensor1D = js.native
  def nonMaxSuppression(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): Tensor1D = js.native
  def nonMaxSuppression(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double): Tensor1D = js.native
  def nonMaxSuppression(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): Tensor1D = js.native
  def nonMaxSuppression(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): Tensor1D = js.native
  def nonMaxSuppression(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): Tensor1D = js.native
  def nonMaxSuppression(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double): Tensor1D = js.native
  def nonMaxSuppression(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): Tensor1D = js.native
  def nonMaxSuppression(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): Tensor1D = js.native
  def nonMaxSuppression(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): Tensor1D = js.native
  def nonMaxSuppression(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double): Tensor1D = js.native
  def nonMaxSuppression(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): Tensor1D = js.native
  def nonMaxSuppression(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): Tensor1D = js.native
  def nonMaxSuppression(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): Tensor1D = js.native
  
  def nonMaxSuppressionAsync(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double): js.Promise[Tensor1D] = js.native
  def nonMaxSuppressionAsync(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): js.Promise[Tensor1D] = js.native
  def nonMaxSuppressionAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[Tensor1D] = js.native
  def nonMaxSuppressionAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[Tensor1D] = js.native
  def nonMaxSuppressionAsync(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double): js.Promise[Tensor1D] = js.native
  def nonMaxSuppressionAsync(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): js.Promise[Tensor1D] = js.native
  def nonMaxSuppressionAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[Tensor1D] = js.native
  def nonMaxSuppressionAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[Tensor1D] = js.native
  def nonMaxSuppressionAsync(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double): js.Promise[Tensor1D] = js.native
  def nonMaxSuppressionAsync(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): js.Promise[Tensor1D] = js.native
  def nonMaxSuppressionAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[Tensor1D] = js.native
  def nonMaxSuppressionAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[Tensor1D] = js.native
  def nonMaxSuppressionAsync(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double): js.Promise[Tensor1D] = js.native
  def nonMaxSuppressionAsync(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): js.Promise[Tensor1D] = js.native
  def nonMaxSuppressionAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[Tensor1D] = js.native
  def nonMaxSuppressionAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[Tensor1D] = js.native
  
  def nonMaxSuppressionPadded(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = js.native
  def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = js.native
  
  def nonMaxSuppressionPaddedAsync(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = js.native
  
  def nonMaxSuppressionWithScore(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): NamedTensorMap = js.native
  def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): NamedTensorMap = js.native
  
  def nonMaxSuppressionWithScoreAsync(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = js.native
  
  def resizeBilinear(images: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4], size: js.Tuple2[Double, Double]): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def resizeBilinear(
    images: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def resizeBilinear(
    images: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean,
    halfPixelCenters: Boolean
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def resizeBilinear(
    images: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    size: js.Tuple2[Double, Double],
    alignCorners: Unit,
    halfPixelCenters: Boolean
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def resizeBilinear[T_2 /* <: Tensor3D | Tensor4D */](images: TensorLike, size: js.Tuple2[Double, Double]): T_2 = js.native
  def resizeBilinear[T_2 /* <: Tensor3D | Tensor4D */](images: TensorLike, size: js.Tuple2[Double, Double], alignCorners: Boolean): T_2 = js.native
  def resizeBilinear[T_2 /* <: Tensor3D | Tensor4D */](
    images: TensorLike,
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean,
    halfPixelCenters: Boolean
  ): T_2 = js.native
  def resizeBilinear[T_2 /* <: Tensor3D | Tensor4D */](images: TensorLike, size: js.Tuple2[Double, Double], alignCorners: Unit, halfPixelCenters: Boolean): T_2 = js.native
  
  def resizeNearestNeighbor(images: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4], size: js.Tuple2[Double, Double]): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def resizeNearestNeighbor(
    images: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def resizeNearestNeighbor(
    images: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean,
    halfPixelCenters: Boolean
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def resizeNearestNeighbor(
    images: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    size: js.Tuple2[Double, Double],
    alignCorners: Unit,
    halfPixelCenters: Boolean
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def resizeNearestNeighbor[T_1 /* <: Tensor3D | Tensor4D */](images: TensorLike, size: js.Tuple2[Double, Double]): T_1 = js.native
  def resizeNearestNeighbor[T_1 /* <: Tensor3D | Tensor4D */](images: TensorLike, size: js.Tuple2[Double, Double], alignCorners: Boolean): T_1 = js.native
  def resizeNearestNeighbor[T_1 /* <: Tensor3D | Tensor4D */](
    images: TensorLike,
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean,
    halfPixelCenters: Boolean
  ): T_1 = js.native
  def resizeNearestNeighbor[T_1 /* <: Tensor3D | Tensor4D */](images: TensorLike, size: js.Tuple2[Double, Double], alignCorners: Unit, halfPixelCenters: Boolean): T_1 = js.native
  
  def rotateWithOffset(image: Tensor4D, radians: Double): Tensor4D = js.native
  def rotateWithOffset(image: Tensor4D, radians: Double, fillValue: js.Tuple3[Double, Double, Double]): Tensor4D = js.native
  def rotateWithOffset(
    image: Tensor4D,
    radians: Double,
    fillValue: js.Tuple3[Double, Double, Double],
    center: js.Tuple2[Double, Double]
  ): Tensor4D = js.native
  def rotateWithOffset(image: Tensor4D, radians: Double, fillValue: js.Tuple3[Double, Double, Double], center: Double): Tensor4D = js.native
  def rotateWithOffset(image: Tensor4D, radians: Double, fillValue: Double): Tensor4D = js.native
  def rotateWithOffset(image: Tensor4D, radians: Double, fillValue: Double, center: js.Tuple2[Double, Double]): Tensor4D = js.native
  def rotateWithOffset(image: Tensor4D, radians: Double, fillValue: Double, center: Double): Tensor4D = js.native
  def rotateWithOffset(image: Tensor4D, radians: Double, fillValue: Unit, center: js.Tuple2[Double, Double]): Tensor4D = js.native
  def rotateWithOffset(image: Tensor4D, radians: Double, fillValue: Unit, center: Double): Tensor4D = js.native
  def rotateWithOffset(image: TensorLike, radians: Double): Tensor4D = js.native
  def rotateWithOffset(image: TensorLike, radians: Double, fillValue: js.Tuple3[Double, Double, Double]): Tensor4D = js.native
  def rotateWithOffset(
    image: TensorLike,
    radians: Double,
    fillValue: js.Tuple3[Double, Double, Double],
    center: js.Tuple2[Double, Double]
  ): Tensor4D = js.native
  def rotateWithOffset(image: TensorLike, radians: Double, fillValue: js.Tuple3[Double, Double, Double], center: Double): Tensor4D = js.native
  def rotateWithOffset(image: TensorLike, radians: Double, fillValue: Double): Tensor4D = js.native
  def rotateWithOffset(image: TensorLike, radians: Double, fillValue: Double, center: js.Tuple2[Double, Double]): Tensor4D = js.native
  def rotateWithOffset(image: TensorLike, radians: Double, fillValue: Double, center: Double): Tensor4D = js.native
  def rotateWithOffset(image: TensorLike, radians: Double, fillValue: Unit, center: js.Tuple2[Double, Double]): Tensor4D = js.native
  def rotateWithOffset(image: TensorLike, radians: Double, fillValue: Unit, center: Double): Tensor4D = js.native
  
  def threshold(image: Tensor3D): Tensor3D = js.native
  def threshold(image: Tensor3D, method: String): Tensor3D = js.native
  def threshold(image: Tensor3D, method: String, inverted: Boolean): Tensor3D = js.native
  def threshold(image: Tensor3D, method: String, inverted: Boolean, threshValue: Double): Tensor3D = js.native
  def threshold(image: Tensor3D, method: String, inverted: Unit, threshValue: Double): Tensor3D = js.native
  def threshold(image: Tensor3D, method: Unit, inverted: Boolean): Tensor3D = js.native
  def threshold(image: Tensor3D, method: Unit, inverted: Boolean, threshValue: Double): Tensor3D = js.native
  def threshold(image: Tensor3D, method: Unit, inverted: Unit, threshValue: Double): Tensor3D = js.native
  def threshold(image: TensorLike): Tensor3D = js.native
  def threshold(image: TensorLike, method: String): Tensor3D = js.native
  def threshold(image: TensorLike, method: String, inverted: Boolean): Tensor3D = js.native
  def threshold(image: TensorLike, method: String, inverted: Boolean, threshValue: Double): Tensor3D = js.native
  def threshold(image: TensorLike, method: String, inverted: Unit, threshValue: Double): Tensor3D = js.native
  def threshold(image: TensorLike, method: Unit, inverted: Boolean): Tensor3D = js.native
  def threshold(image: TensorLike, method: Unit, inverted: Boolean, threshValue: Double): Tensor3D = js.native
  def threshold(image: TensorLike, method: Unit, inverted: Unit, threshValue: Double): Tensor3D = js.native
  
  def transform(
    image: TensorLike | Tensor4D,
    transforms: TensorLike | Tensor2D,
    interpolation: js.UndefOr[bilinear | nearest],
    fillMode: js.UndefOr[reflect | nearest | constant | wrap],
    fillValue: js.UndefOr[Double],
    outputShape: js.UndefOr[js.Tuple2[Double, Double]]
  ): Tensor4D = js.native
}
