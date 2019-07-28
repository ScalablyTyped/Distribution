package typings.atTensorflowTfjsDashCore.distBackendsWebglTexUnderscoreUtilMod

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/tex_util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decodeMatrixFromUnpackedColorRGBAArray(unpackedArray: Float32Array, matrix: Float32Array, channels: Double): Unit = js.native
  def getColorMatrixTextureShapeWidthHeight(rows: Double, columns: Double): js.Tuple2[Double, Double] = js.native
  def getDenseTexShape(shape: js.Array[Double]): js.Tuple2[Double, Double] = js.native
  def getMatrixSizeFromUnpackedArraySize(unpackedSize: Double, channelsPerTexture: Double): Double = js.native
  def getPackedMatrixTextureShapeWidthHeight(rows: Double, columns: Double): js.Tuple2[Double, Double] = js.native
  def getPackedRGBAArraySizeFromMatrixShape(rows: Double, columns: Double): Double = js.native
  def getUnpackedArraySizeFromMatrixSize(matrixSize: Double, channelsPerTexture: Double): Double = js.native
  def getUnpackedMatrixTextureShapeWidthHeight(rows: Double, columns: Double): js.Tuple2[Double, Double] = js.native
}

