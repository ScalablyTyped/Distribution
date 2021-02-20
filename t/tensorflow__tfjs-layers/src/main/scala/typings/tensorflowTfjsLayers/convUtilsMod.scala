package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convUtilsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/conv_utils", "convOutputLength")
  @js.native
  def convOutputLength(inputLength: Double, filterSize: Double, padding: PaddingMode, stride: Double): Double = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/conv_utils", "convOutputLength")
  @js.native
  def convOutputLength(inputLength: Double, filterSize: Double, padding: PaddingMode, stride: Double, dilation: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/conv_utils", "deconvLength")
  @js.native
  def deconvLength(dimSize: Double, strideSize: Double, kernelSize: Double, padding: PaddingMode): Double = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/conv_utils", "normalizeArray")
  @js.native
  def normalizeArray(value: js.Array[Double], n: Double, name: String): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/conv_utils", "normalizeArray")
  @js.native
  def normalizeArray(value: Double, n: Double, name: String): js.Array[Double] = js.native
}
