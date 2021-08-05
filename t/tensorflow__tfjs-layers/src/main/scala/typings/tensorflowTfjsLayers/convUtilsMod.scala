package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convUtilsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/conv_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convOutputLength(inputLength: Double, filterSize: Double, padding: PaddingMode, stride: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convOutputLength")(inputLength.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def convOutputLength(inputLength: Double, filterSize: Double, padding: PaddingMode, stride: Double, dilation: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convOutputLength")(inputLength.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], dilation.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def deconvLength(dimSize: Double, strideSize: Double, kernelSize: Double, padding: PaddingMode): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("deconvLength")(dimSize.asInstanceOf[js.Any], strideSize.asInstanceOf[js.Any], kernelSize.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def normalizeArray(value: js.Array[Double], n: Double, name: String): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeArray")(value.asInstanceOf[js.Any], n.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def normalizeArray(value: Double, n: Double, name: String): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeArray")(value.asInstanceOf[js.Any], n.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
