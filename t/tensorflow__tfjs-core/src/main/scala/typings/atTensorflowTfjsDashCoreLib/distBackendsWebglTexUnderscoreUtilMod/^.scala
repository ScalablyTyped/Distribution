package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglTexUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/tex_util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decodeMatrixFromUnpackedColorRGBAArray(unpackedArray: stdLib.Float32Array, matrix: stdLib.Float32Array, channels: scala.Double): scala.Unit = js.native
  def getColorMatrixTextureShapeWidthHeight(rows: scala.Double, columns: scala.Double): js.Tuple2[scala.Double, scala.Double] = js.native
  def getDenseTexShape(shape: js.Array[scala.Double]): js.Tuple2[scala.Double, scala.Double] = js.native
  def getMatrixSizeFromUnpackedArraySize(unpackedSize: scala.Double, channelsPerTexture: scala.Double): scala.Double = js.native
  def getPackedMatrixTextureShapeWidthHeight(rows: scala.Double, columns: scala.Double): js.Tuple2[scala.Double, scala.Double] = js.native
  def getPackedRGBAArraySizeFromMatrixShape(rows: scala.Double, columns: scala.Double): scala.Double = js.native
  def getUnpackedArraySizeFromMatrixSize(matrixSize: scala.Double, channelsPerTexture: scala.Double): scala.Double = js.native
  def getUnpackedMatrixTextureShapeWidthHeight(rows: scala.Double, columns: scala.Double): js.Tuple2[scala.Double, scala.Double] = js.native
}

