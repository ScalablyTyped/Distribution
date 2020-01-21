package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/utils/conv_utils", JSImport.Namespace)
@js.native
object convUtilsMod extends js.Object {
  def convOutputLength(inputLength: Double, filterSize: Double, padding: PaddingMode, stride: Double): Double = js.native
  def convOutputLength(inputLength: Double, filterSize: Double, padding: PaddingMode, stride: Double, dilation: Double): Double = js.native
  def deconvLength(dimSize: Double, strideSize: Double, kernelSize: Double, padding: PaddingMode): Double = js.native
  def normalizeArray(value: js.Array[Double], n: Double, name: String): js.Array[Double] = js.native
  def normalizeArray(value: Double, n: Double, name: String): js.Array[Double] = js.native
}

