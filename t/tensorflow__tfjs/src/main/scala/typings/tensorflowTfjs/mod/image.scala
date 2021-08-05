package typings.tensorflowTfjs.mod

import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import typings.tensorflowTfjs.tensorflowTfjsStrings.bilinear
import typings.tensorflowTfjs.tensorflowTfjsStrings.nearest
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank.R1
import typings.tensorflowTfjsCore.distTypesMod.Rank.R2
import typings.tensorflowTfjsCore.distTypesMod.Rank.R3
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.distTypesMod.RecursiveArray
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object image {
  
  @JSImport("@tensorflow/tfjs", "image")
  @js.native
  val ^ : js.Any = js.native
  
  inline def cropAndResize(
    image: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R4],
    boxes: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R2],
    boxInd: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R1],
    cropSize: js.Tuple2[Double, Double],
    method: js.UndefOr[nearest | bilinear],
    extrapolationValue: js.UndefOr[Double]
  ): Tensor[R4] = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R4]]
  
  inline def flipLeftRight(image: String): Tensor[R4] = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor[R4]]
  inline def flipLeftRight(image: js.Array[Uint8Array]): Tensor[R4] = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor[R4]]
  inline def flipLeftRight(image: Boolean): Tensor[R4] = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor[R4]]
  inline def flipLeftRight(image: Double): Tensor[R4] = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor[R4]]
  inline def flipLeftRight(image: Float32Array): Tensor[R4] = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor[R4]]
  inline def flipLeftRight(image: Int32Array): Tensor[R4] = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor[R4]]
  inline def flipLeftRight(image: Uint8Array): Tensor[R4] = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor[R4]]
  inline def flipLeftRight(image: Tensor[R4]): Tensor[R4] = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor[R4]]
  inline def flipLeftRight(
    image: RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]
  ): Tensor[R4] = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor[R4]]
  
  inline def nonMaxSuppression(
    boxes: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R2],
    scores: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double]
  ): Tensor[R1] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor[R1]]
  
  inline def nonMaxSuppressionAsync(
    boxes: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R2],
    scores: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double]
  ): js.Promise[Tensor[R1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor[R1]]]
  
  inline def nonMaxSuppressionPadded(
    boxes: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R2],
    scores: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double],
    padToMaxOutputSize: js.UndefOr[Boolean]
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  
  inline def nonMaxSuppressionPaddedAsync(
    boxes: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R2],
    scores: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double],
    padToMaxOutputSize: js.UndefOr[Boolean]
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  
  inline def nonMaxSuppressionWithScore(
    boxes: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R2],
    scores: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double],
    softNmsSigma: js.UndefOr[Double]
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  
  inline def nonMaxSuppressionWithScoreAsync(
    boxes: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R2],
    scores: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double],
    softNmsSigma: js.UndefOr[Double]
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  
  inline def resizeBilinear(images: Tensor[R3 | R4], size: js.Tuple2[Double, Double]): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def resizeBilinear(images: Tensor[R3 | R4], size: js.Tuple2[Double, Double], alignCorners: Boolean): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.Array[Uint8Array], size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.Array[Uint8Array], size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Float32Array, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Float32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Int32Array, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Int32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Uint8Array, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Uint8Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeBilinear[T /* <: Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ],
    size: js.Tuple2[Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeBilinear[T /* <: Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ],
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def resizeNearestNeighbor(images: Tensor[R3 | R4], size: js.Tuple2[Double, Double]): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def resizeNearestNeighbor(images: Tensor[R3 | R4], size: js.Tuple2[Double, Double], alignCorners: Boolean): Tensor[R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[Tensor[R3]]
  inline def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.Array[Uint8Array], size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.Array[Uint8Array], size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Float32Array, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Float32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Int32Array, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Int32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Uint8Array, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Uint8Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ],
    size: js.Tuple2[Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ],
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def rotateWithOffset(
    image: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R4],
    radians: Double,
    fillValue: js.UndefOr[Double | (js.Tuple3[Double, Double, Double])],
    center: js.UndefOr[Double | (js.Tuple2[Double, Double])]
  ): Tensor[R4] = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor[R4]]
}
