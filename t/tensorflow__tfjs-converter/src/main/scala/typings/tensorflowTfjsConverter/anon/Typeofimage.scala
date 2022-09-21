package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.bilinear
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.constant
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.nearest
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.reflect
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.wrap
import typings.tensorflowTfjsCore.distTypesMod.Rank.R1
import typings.tensorflowTfjsCore.distTypesMod.Rank.R2
import typings.tensorflowTfjsCore.distTypesMod.Rank.R3
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.distTypesMod.Rank.R5
import typings.tensorflowTfjsCore.distTypesMod.Rank.R6
import typings.tensorflowTfjsCore.distTypesMod.RecursiveArray
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofimage extends StObject {
  
  def cropAndResize(
    image: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R4],
    boxes: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R2],
    boxInd: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1],
    cropSize: js.Tuple2[Double, Double],
    method: js.UndefOr[bilinear | nearest],
    extrapolationValue: js.UndefOr[Double]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  
  def flipLeftRight(image: String): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def flipLeftRight(image: js.Array[js.typedarray.Uint8Array]): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def flipLeftRight(image: js.typedarray.Float32Array): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def flipLeftRight(image: js.typedarray.Int32Array): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def flipLeftRight(image: js.typedarray.Uint8Array): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def flipLeftRight(image: Boolean): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def flipLeftRight(image: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def flipLeftRight(image: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4]): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def flipLeftRight(
    image: RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  
  def grayscaleToRGB(image: typings.tensorflowTfjsCore.distTensorMod.Tensor[R2 | R3 | R4 | R5 | R6]): typings.tensorflowTfjsCore.distTensorMod.Tensor[R2] = js.native
  def grayscaleToRGB[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R2 | R3 | R4 | R5 | R6] */](image: String): T = js.native
  def grayscaleToRGB[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R2 | R3 | R4 | R5 | R6] */](image: js.Array[js.typedarray.Uint8Array]): T = js.native
  def grayscaleToRGB[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R2 | R3 | R4 | R5 | R6] */](image: js.typedarray.Float32Array): T = js.native
  def grayscaleToRGB[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R2 | R3 | R4 | R5 | R6] */](image: js.typedarray.Int32Array): T = js.native
  def grayscaleToRGB[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R2 | R3 | R4 | R5 | R6] */](image: js.typedarray.Uint8Array): T = js.native
  def grayscaleToRGB[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R2 | R3 | R4 | R5 | R6] */](image: Boolean): T = js.native
  def grayscaleToRGB[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R2 | R3 | R4 | R5 | R6] */](image: Double): T = js.native
  def grayscaleToRGB[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R2 | R3 | R4 | R5 | R6] */](
    image: RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]
  ): T = js.native
  
  def nonMaxSuppression(
    boxes: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R2],
    scores: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R1] = js.native
  
  def nonMaxSuppressionAsync(
    boxes: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R2],
    scores: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double]
  ): js.Promise[typings.tensorflowTfjsCore.distTensorMod.Tensor[R1]] = js.native
  
  def nonMaxSuppressionPadded(
    boxes: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R2],
    scores: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double],
    padToMaxOutputSize: js.UndefOr[Boolean]
  ): NamedTensorMap = js.native
  
  def nonMaxSuppressionPaddedAsync(
    boxes: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R2],
    scores: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double],
    padToMaxOutputSize: js.UndefOr[Boolean]
  ): js.Promise[NamedTensorMap] = js.native
  
  def nonMaxSuppressionWithScore(
    boxes: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R2],
    scores: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double],
    softNmsSigma: js.UndefOr[Double]
  ): NamedTensorMap = js.native
  
  def nonMaxSuppressionWithScoreAsync(
    boxes: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R2],
    scores: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double],
    softNmsSigma: js.UndefOr[Double]
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
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double]): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double], alignCorners: Boolean, halfPixelCenters: Boolean): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double], alignCorners: Unit, halfPixelCenters: Boolean): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: js.Array[js.typedarray.Uint8Array], size: js.Tuple2[Double, Double]): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: js.Array[js.typedarray.Uint8Array], size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: js.Array[js.typedarray.Uint8Array],
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean,
    halfPixelCenters: Boolean
  ): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: js.Array[js.typedarray.Uint8Array],
    size: js.Tuple2[Double, Double],
    alignCorners: Unit,
    halfPixelCenters: Boolean
  ): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: js.typedarray.Float32Array, size: js.Tuple2[Double, Double]): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: js.typedarray.Float32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: js.typedarray.Float32Array,
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean,
    halfPixelCenters: Boolean
  ): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: js.typedarray.Float32Array,
    size: js.Tuple2[Double, Double],
    alignCorners: Unit,
    halfPixelCenters: Boolean
  ): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: js.typedarray.Int32Array, size: js.Tuple2[Double, Double]): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: js.typedarray.Int32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: js.typedarray.Int32Array,
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean,
    halfPixelCenters: Boolean
  ): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: js.typedarray.Int32Array,
    size: js.Tuple2[Double, Double],
    alignCorners: Unit,
    halfPixelCenters: Boolean
  ): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: js.typedarray.Uint8Array, size: js.Tuple2[Double, Double]): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: js.typedarray.Uint8Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: js.typedarray.Uint8Array,
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean,
    halfPixelCenters: Boolean
  ): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: js.typedarray.Uint8Array,
    size: js.Tuple2[Double, Double],
    alignCorners: Unit,
    halfPixelCenters: Boolean
  ): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double]): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double], alignCorners: Boolean, halfPixelCenters: Boolean): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double], alignCorners: Unit, halfPixelCenters: Boolean): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double]): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double], alignCorners: Boolean, halfPixelCenters: Boolean): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double], alignCorners: Unit, halfPixelCenters: Boolean): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ],
    size: js.Tuple2[Double, Double]
  ): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ],
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean
  ): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ],
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean,
    halfPixelCenters: Boolean
  ): T = js.native
  def resizeBilinear[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ],
    size: js.Tuple2[Double, Double],
    alignCorners: Unit,
    halfPixelCenters: Boolean
  ): T = js.native
  
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
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double]): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double], alignCorners: Boolean, halfPixelCenters: Boolean): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double], alignCorners: Unit, halfPixelCenters: Boolean): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: js.Array[js.typedarray.Uint8Array], size: js.Tuple2[Double, Double]): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: js.Array[js.typedarray.Uint8Array], size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: js.Array[js.typedarray.Uint8Array],
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean,
    halfPixelCenters: Boolean
  ): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: js.Array[js.typedarray.Uint8Array],
    size: js.Tuple2[Double, Double],
    alignCorners: Unit,
    halfPixelCenters: Boolean
  ): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: js.typedarray.Float32Array, size: js.Tuple2[Double, Double]): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: js.typedarray.Float32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: js.typedarray.Float32Array,
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean,
    halfPixelCenters: Boolean
  ): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: js.typedarray.Float32Array,
    size: js.Tuple2[Double, Double],
    alignCorners: Unit,
    halfPixelCenters: Boolean
  ): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: js.typedarray.Int32Array, size: js.Tuple2[Double, Double]): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: js.typedarray.Int32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: js.typedarray.Int32Array,
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean,
    halfPixelCenters: Boolean
  ): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: js.typedarray.Int32Array,
    size: js.Tuple2[Double, Double],
    alignCorners: Unit,
    halfPixelCenters: Boolean
  ): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: js.typedarray.Uint8Array, size: js.Tuple2[Double, Double]): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: js.typedarray.Uint8Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: js.typedarray.Uint8Array,
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean,
    halfPixelCenters: Boolean
  ): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: js.typedarray.Uint8Array,
    size: js.Tuple2[Double, Double],
    alignCorners: Unit,
    halfPixelCenters: Boolean
  ): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double]): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double], alignCorners: Boolean, halfPixelCenters: Boolean): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double], alignCorners: Unit, halfPixelCenters: Boolean): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double]): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double], alignCorners: Boolean, halfPixelCenters: Boolean): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double], alignCorners: Unit, halfPixelCenters: Boolean): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ],
    size: js.Tuple2[Double, Double]
  ): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ],
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean
  ): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ],
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean,
    halfPixelCenters: Boolean
  ): T = js.native
  def resizeNearestNeighbor[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ],
    size: js.Tuple2[Double, Double],
    alignCorners: Unit,
    halfPixelCenters: Boolean
  ): T = js.native
  
  def rotateWithOffset(
    image: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R4],
    radians: Double,
    fillValue: js.UndefOr[Double | (js.Tuple3[Double, Double, Double])],
    center: js.UndefOr[Double | (js.Tuple2[Double, Double])]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  
  def threshold(
    image: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R3],
    method: js.UndefOr[String],
    inverted: js.UndefOr[Boolean],
    threshValue: js.UndefOr[Double]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  
  def transform(
    image: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R4],
    transforms: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[R2],
    interpolation: js.UndefOr[bilinear | nearest],
    fillMode: js.UndefOr[reflect | nearest | constant | wrap],
    fillValue: js.UndefOr[Double],
    outputShape: js.UndefOr[js.Tuple2[Double, Double]]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
}
