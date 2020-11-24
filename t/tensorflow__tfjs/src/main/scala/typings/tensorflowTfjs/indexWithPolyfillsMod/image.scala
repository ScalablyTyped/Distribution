package typings.tensorflowTfjs.indexWithPolyfillsMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image")
@js.native
object image extends js.Object {
  
  def cropAndResize(
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
  ): Tensor[R4] = js.native
  
  def flipLeftRight(image: String): Tensor[R4] = js.native
  def flipLeftRight(image: js.Array[Uint8Array]): Tensor[R4] = js.native
  def flipLeftRight(image: Boolean): Tensor[R4] = js.native
  def flipLeftRight(image: Double): Tensor[R4] = js.native
  def flipLeftRight(image: Float32Array): Tensor[R4] = js.native
  def flipLeftRight(image: Int32Array): Tensor[R4] = js.native
  def flipLeftRight(image: Uint8Array): Tensor[R4] = js.native
  def flipLeftRight(image: Tensor[R4]): Tensor[R4] = js.native
  def flipLeftRight(
    image: RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]
  ): Tensor[R4] = js.native
  
  def nonMaxSuppression(
    boxes: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R2],
    scores: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double]
  ): Tensor[R1] = js.native
  
  def nonMaxSuppressionAsync(
    boxes: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R2],
    scores: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double]
  ): js.Promise[Tensor[R1]] = js.native
  
  def nonMaxSuppressionPadded(
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
  ): NamedTensorMap = js.native
  
  def nonMaxSuppressionPaddedAsync(
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
  ): js.Promise[NamedTensorMap] = js.native
  
  def nonMaxSuppressionWithScore(
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
  ): NamedTensorMap = js.native
  
  def nonMaxSuppressionWithScoreAsync(
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
  ): js.Promise[NamedTensorMap] = js.native
  
  def resizeBilinear(images: Tensor[R3 | R4], size: js.Tuple2[Double, Double]): Tensor[R3] = js.native
  def resizeBilinear(images: Tensor[R3 | R4], size: js.Tuple2[Double, Double], alignCorners: Boolean): Tensor[R3] = js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double]): T = js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.Array[Uint8Array], size: js.Tuple2[Double, Double]): T = js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.Array[Uint8Array], size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double]): T = js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double]): T = js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Float32Array, size: js.Tuple2[Double, Double]): T = js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Float32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Int32Array, size: js.Tuple2[Double, Double]): T = js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Int32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Uint8Array, size: js.Tuple2[Double, Double]): T = js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Uint8Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ],
    size: js.Tuple2[Double, Double]
  ): T = js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ],
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean
  ): T = js.native
  
  def resizeNearestNeighbor(images: Tensor[R3 | R4], size: js.Tuple2[Double, Double]): Tensor[R3] = js.native
  def resizeNearestNeighbor(images: Tensor[R3 | R4], size: js.Tuple2[Double, Double], alignCorners: Boolean): Tensor[R3] = js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double]): T = js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.Array[Uint8Array], size: js.Tuple2[Double, Double]): T = js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.Array[Uint8Array], size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double]): T = js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double]): T = js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Float32Array, size: js.Tuple2[Double, Double]): T = js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Float32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Int32Array, size: js.Tuple2[Double, Double]): T = js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Int32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Uint8Array, size: js.Tuple2[Double, Double]): T = js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Uint8Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ],
    size: js.Tuple2[Double, Double]
  ): T = js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ],
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean
  ): T = js.native
  
  def rotateWithOffset(
    image: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | Tensor[R4],
    radians: Double,
    fillValue: js.UndefOr[Double | (js.Tuple3[Double, Double, Double])],
    center: js.UndefOr[Double | (js.Tuple2[Double, Double])]
  ): Tensor[R4] = js.native
}
