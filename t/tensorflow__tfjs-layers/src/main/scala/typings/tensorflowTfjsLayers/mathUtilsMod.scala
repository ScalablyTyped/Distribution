package typings.tensorflowTfjsLayers

import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathUtilsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", "arrayProd")
  @js.native
  def arrayProd(array: js.Array[Double]): Double = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", "arrayProd")
  @js.native
  def arrayProd(array: js.Array[Double], begin: js.UndefOr[scala.Nothing], end: Double): Double = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", "arrayProd")
  @js.native
  def arrayProd(array: js.Array[Double], begin: Double): Double = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", "arrayProd")
  @js.native
  def arrayProd(array: js.Array[Double], begin: Double, end: Double): Double = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", "arrayProd")
  @js.native
  def arrayProd(array: ArrayTypes): Double = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", "arrayProd")
  @js.native
  def arrayProd(array: ArrayTypes, begin: js.UndefOr[scala.Nothing], end: Double): Double = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", "arrayProd")
  @js.native
  def arrayProd(array: ArrayTypes, begin: Double): Double = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", "arrayProd")
  @js.native
  def arrayProd(array: ArrayTypes, begin: Double, end: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", "isInteger")
  @js.native
  def isInteger(x: Double): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", "max")
  @js.native
  def max(array: js.Array[Double]): Double = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", "max")
  @js.native
  def max(array: Float32Array): Double = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", "mean")
  @js.native
  def mean(array: js.Array[Double]): Double = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", "mean")
  @js.native
  def mean(array: Float32Array): Double = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", "median")
  @js.native
  def median(array: js.Array[Double]): Double = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", "median")
  @js.native
  def median(array: Float32Array): Double = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", "min")
  @js.native
  def min(array: js.Array[Double]): Double = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", "min")
  @js.native
  def min(array: Float32Array): Double = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", "range")
  @js.native
  def range(begin: Double, end: Double): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", "sum")
  @js.native
  def sum(array: js.Array[Double]): Double = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", "sum")
  @js.native
  def sum(array: Float32Array): Double = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", "variance")
  @js.native
  def variance(array: js.Array[Double]): Double = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", "variance")
  @js.native
  def variance(array: Float32Array): Double = js.native
  
  type ArrayTypes = Uint8Array | Int32Array | Float32Array
}
