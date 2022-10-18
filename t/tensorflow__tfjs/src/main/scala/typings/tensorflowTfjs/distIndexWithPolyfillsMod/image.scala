package typings.tensorflowTfjs.distIndexWithPolyfillsMod

import typings.tensorflowTfjs.tensorflowTfjsStrings.bilinear
import typings.tensorflowTfjs.tensorflowTfjsStrings.constant
import typings.tensorflowTfjs.tensorflowTfjsStrings.nearest
import typings.tensorflowTfjs.tensorflowTfjsStrings.reflect
import typings.tensorflowTfjs.tensorflowTfjsStrings.wrap
import typings.tensorflowTfjsCore.distTensorMod.Tensor
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

object image {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image")
  @js.native
  val ^ : js.Any = js.native
  
  inline def cropAndResize(image: Tensor4D, boxes: Tensor2D, boxInd: Tensor1D, cropSize: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: Tensor4D,
    boxes: Tensor2D,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: Tensor4D,
    boxes: Tensor2D,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest,
    extrapolationValue: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: Tensor4D,
    boxes: Tensor2D,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: Unit,
    extrapolationValue: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(image: Tensor4D, boxes: Tensor2D, boxInd: TensorLike, cropSize: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: Tensor4D,
    boxes: Tensor2D,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: Tensor4D,
    boxes: Tensor2D,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest,
    extrapolationValue: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: Tensor4D,
    boxes: Tensor2D,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: Unit,
    extrapolationValue: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(image: Tensor4D, boxes: TensorLike, boxInd: Tensor1D, cropSize: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: Tensor4D,
    boxes: TensorLike,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: Tensor4D,
    boxes: TensorLike,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest,
    extrapolationValue: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: Tensor4D,
    boxes: TensorLike,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: Unit,
    extrapolationValue: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(image: Tensor4D, boxes: TensorLike, boxInd: TensorLike, cropSize: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: Tensor4D,
    boxes: TensorLike,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: Tensor4D,
    boxes: TensorLike,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest,
    extrapolationValue: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: Tensor4D,
    boxes: TensorLike,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: Unit,
    extrapolationValue: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(image: TensorLike, boxes: Tensor2D, boxInd: Tensor1D, cropSize: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: TensorLike,
    boxes: Tensor2D,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: TensorLike,
    boxes: Tensor2D,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest,
    extrapolationValue: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: TensorLike,
    boxes: Tensor2D,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: Unit,
    extrapolationValue: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(image: TensorLike, boxes: Tensor2D, boxInd: TensorLike, cropSize: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: TensorLike,
    boxes: Tensor2D,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: TensorLike,
    boxes: Tensor2D,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest,
    extrapolationValue: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: TensorLike,
    boxes: Tensor2D,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: Unit,
    extrapolationValue: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(image: TensorLike, boxes: TensorLike, boxInd: Tensor1D, cropSize: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: TensorLike,
    boxes: TensorLike,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: TensorLike,
    boxes: TensorLike,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest,
    extrapolationValue: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: TensorLike,
    boxes: TensorLike,
    boxInd: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: Unit,
    extrapolationValue: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(image: TensorLike, boxes: TensorLike, boxInd: TensorLike, cropSize: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: TensorLike,
    boxes: TensorLike,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: TensorLike,
    boxes: TensorLike,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear | nearest,
    extrapolationValue: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def cropAndResize(
    image: TensorLike,
    boxes: TensorLike,
    boxInd: TensorLike,
    cropSize: js.Tuple2[Double, Double],
    method: Unit,
    extrapolationValue: Double
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  
  inline def flipLeftRight(image: Tensor4D): Tensor4D = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor4D]
  inline def flipLeftRight(image: TensorLike): Tensor4D = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor4D]
  
  inline def grayscaleToRGB(image: Tensor[R2 | R3 | R4 | R5 | R6]): Tensor[R2] = ^.asInstanceOf[js.Dynamic].applyDynamic("grayscaleToRGB")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor[R2]]
  inline def grayscaleToRGB[T /* <: Tensor2D | Tensor3D | Tensor4D | Tensor5D | Tensor6D */](image: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("grayscaleToRGB")(image.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def nonMaxSuppression(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  inline def nonMaxSuppression(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  inline def nonMaxSuppression(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  inline def nonMaxSuppression(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  inline def nonMaxSuppression(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  inline def nonMaxSuppression(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  inline def nonMaxSuppression(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  inline def nonMaxSuppression(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  inline def nonMaxSuppression(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  inline def nonMaxSuppression(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  inline def nonMaxSuppression(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  inline def nonMaxSuppression(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  inline def nonMaxSuppression(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  inline def nonMaxSuppression(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  inline def nonMaxSuppression(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  inline def nonMaxSuppression(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  
  inline def nonMaxSuppressionAsync(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
  inline def nonMaxSuppressionAsync(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
  inline def nonMaxSuppressionAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
  inline def nonMaxSuppressionAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
  inline def nonMaxSuppressionAsync(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
  inline def nonMaxSuppressionAsync(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
  inline def nonMaxSuppressionAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
  inline def nonMaxSuppressionAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
  inline def nonMaxSuppressionAsync(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
  inline def nonMaxSuppressionAsync(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
  inline def nonMaxSuppressionAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
  inline def nonMaxSuppressionAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
  inline def nonMaxSuppressionAsync(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
  inline def nonMaxSuppressionAsync(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
  inline def nonMaxSuppressionAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
  inline def nonMaxSuppressionAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
  
  inline def nonMaxSuppressionPadded(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionPadded(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  
  inline def nonMaxSuppressionPaddedAsync(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionPaddedAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    padToMaxOutputSize: Boolean
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  
  inline def nonMaxSuppressionWithScore(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def nonMaxSuppressionWithScore(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  
  inline def nonMaxSuppressionWithScoreAsync(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: Tensor2D,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: TensorLike,
    scores: TensorLike,
    maxOutputSize: Double,
    iouThreshold: Unit,
    scoreThreshold: Unit,
    softNmsSigma: Double
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  
  inline def resizeBilinear(images: Tensor[R3 | R4], size: js.Tuple2[Double, Double]): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def resizeBilinear(images: Tensor[R3 | R4], size: js.Tuple2[Double, Double], alignCorners: Boolean): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def resizeBilinear(
    images: Tensor[R3 | R4],
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean,
    halfPixelCenters: Boolean
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any], halfPixelCenters.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def resizeBilinear(
    images: Tensor[R3 | R4],
    size: js.Tuple2[Double, Double],
    alignCorners: Unit,
    halfPixelCenters: Boolean
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any], halfPixelCenters.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def resizeBilinear[T_2 /* <: Tensor3D | Tensor4D */](images: TensorLike, size: js.Tuple2[Double, Double]): T_2 = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T_2]
  inline def resizeBilinear[T_2 /* <: Tensor3D | Tensor4D */](images: TensorLike, size: js.Tuple2[Double, Double], alignCorners: Boolean): T_2 = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T_2]
  inline def resizeBilinear[T_2 /* <: Tensor3D | Tensor4D */](
    images: TensorLike,
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean,
    halfPixelCenters: Boolean
  ): T_2 = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any], halfPixelCenters.asInstanceOf[js.Any])).asInstanceOf[T_2]
  inline def resizeBilinear[T_2 /* <: Tensor3D | Tensor4D */](images: TensorLike, size: js.Tuple2[Double, Double], alignCorners: Unit, halfPixelCenters: Boolean): T_2 = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any], halfPixelCenters.asInstanceOf[js.Any])).asInstanceOf[T_2]
  
  inline def resizeNearestNeighbor(images: Tensor[R3 | R4], size: js.Tuple2[Double, Double]): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def resizeNearestNeighbor(images: Tensor[R3 | R4], size: js.Tuple2[Double, Double], alignCorners: Boolean): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def resizeNearestNeighbor(
    images: Tensor[R3 | R4],
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean,
    halfPixelCenters: Boolean
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any], halfPixelCenters.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def resizeNearestNeighbor(
    images: Tensor[R3 | R4],
    size: js.Tuple2[Double, Double],
    alignCorners: Unit,
    halfPixelCenters: Boolean
  ): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any], halfPixelCenters.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def resizeNearestNeighbor[T_1 /* <: Tensor3D | Tensor4D */](images: TensorLike, size: js.Tuple2[Double, Double]): T_1 = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T_1]
  inline def resizeNearestNeighbor[T_1 /* <: Tensor3D | Tensor4D */](images: TensorLike, size: js.Tuple2[Double, Double], alignCorners: Boolean): T_1 = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T_1]
  inline def resizeNearestNeighbor[T_1 /* <: Tensor3D | Tensor4D */](
    images: TensorLike,
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean,
    halfPixelCenters: Boolean
  ): T_1 = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any], halfPixelCenters.asInstanceOf[js.Any])).asInstanceOf[T_1]
  inline def resizeNearestNeighbor[T_1 /* <: Tensor3D | Tensor4D */](images: TensorLike, size: js.Tuple2[Double, Double], alignCorners: Unit, halfPixelCenters: Boolean): T_1 = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any], halfPixelCenters.asInstanceOf[js.Any])).asInstanceOf[T_1]
  
  inline def rotateWithOffset(image: Tensor4D, radians: Double): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def rotateWithOffset(image: Tensor4D, radians: Double, fillValue: js.Tuple3[Double, Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def rotateWithOffset(
    image: Tensor4D,
    radians: Double,
    fillValue: js.Tuple3[Double, Double, Double],
    center: js.Tuple2[Double, Double]
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def rotateWithOffset(image: Tensor4D, radians: Double, fillValue: js.Tuple3[Double, Double, Double], center: Double): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def rotateWithOffset(image: Tensor4D, radians: Double, fillValue: Double): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def rotateWithOffset(image: Tensor4D, radians: Double, fillValue: Double, center: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def rotateWithOffset(image: Tensor4D, radians: Double, fillValue: Double, center: Double): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def rotateWithOffset(image: Tensor4D, radians: Double, fillValue: Unit, center: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def rotateWithOffset(image: Tensor4D, radians: Double, fillValue: Unit, center: Double): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def rotateWithOffset(image: TensorLike, radians: Double): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def rotateWithOffset(image: TensorLike, radians: Double, fillValue: js.Tuple3[Double, Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def rotateWithOffset(
    image: TensorLike,
    radians: Double,
    fillValue: js.Tuple3[Double, Double, Double],
    center: js.Tuple2[Double, Double]
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def rotateWithOffset(image: TensorLike, radians: Double, fillValue: js.Tuple3[Double, Double, Double], center: Double): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def rotateWithOffset(image: TensorLike, radians: Double, fillValue: Double): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def rotateWithOffset(image: TensorLike, radians: Double, fillValue: Double, center: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def rotateWithOffset(image: TensorLike, radians: Double, fillValue: Double, center: Double): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def rotateWithOffset(image: TensorLike, radians: Double, fillValue: Unit, center: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def rotateWithOffset(image: TensorLike, radians: Double, fillValue: Unit, center: Double): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  
  inline def threshold(image: Tensor3D): Tensor3D = ^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor3D]
  inline def threshold(image: Tensor3D, method: String): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  inline def threshold(image: Tensor3D, method: String, inverted: Boolean): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  inline def threshold(image: Tensor3D, method: String, inverted: Boolean, threshValue: Double): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any], threshValue.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  inline def threshold(image: Tensor3D, method: String, inverted: Unit, threshValue: Double): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any], threshValue.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  inline def threshold(image: Tensor3D, method: Unit, inverted: Boolean): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  inline def threshold(image: Tensor3D, method: Unit, inverted: Boolean, threshValue: Double): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any], threshValue.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  inline def threshold(image: Tensor3D, method: Unit, inverted: Unit, threshValue: Double): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any], threshValue.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  inline def threshold(image: TensorLike): Tensor3D = ^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor3D]
  inline def threshold(image: TensorLike, method: String): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  inline def threshold(image: TensorLike, method: String, inverted: Boolean): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  inline def threshold(image: TensorLike, method: String, inverted: Boolean, threshValue: Double): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any], threshValue.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  inline def threshold(image: TensorLike, method: String, inverted: Unit, threshValue: Double): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any], threshValue.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  inline def threshold(image: TensorLike, method: Unit, inverted: Boolean): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  inline def threshold(image: TensorLike, method: Unit, inverted: Boolean, threshValue: Double): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any], threshValue.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  inline def threshold(image: TensorLike, method: Unit, inverted: Unit, threshValue: Double): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any], threshValue.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  
  inline def transform(
    image: TensorLike | Tensor4D,
    transforms: TensorLike | Tensor2D,
    interpolation: js.UndefOr[bilinear | nearest],
    fillMode: js.UndefOr[reflect | nearest | constant | wrap],
    fillValue: js.UndefOr[Double],
    outputShape: js.UndefOr[js.Tuple2[Double, Double]]
  ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(image.asInstanceOf[js.Any], transforms.asInstanceOf[js.Any], interpolation.asInstanceOf[js.Any], fillMode.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
}
