package typings.tensorflowTfjsCore

import typings.std.Float32Array
import typings.tensorflowTfjsCore.anon.Imag
import typings.tensorflowTfjsCore.anon.Real
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object complexUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/complex_util", "assignToTypedArray")
  @js.native
  def assignToTypedArray(data: TypedArray, real: Double, imag: Double, index: Double): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/complex_util", "complexWithEvenIndex")
  @js.native
  def complexWithEvenIndex(complex: Float32Array): Imag = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/complex_util", "complexWithOddIndex")
  @js.native
  def complexWithOddIndex(complex: Float32Array): Imag = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/complex_util", "exponent")
  @js.native
  def exponent(k: Double, n: Double, inverse: Boolean): Real = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/complex_util", "exponents")
  @js.native
  def exponents(n: Double, inverse: Boolean): Imag = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/complex_util", "getComplexWithIndex")
  @js.native
  def getComplexWithIndex(complex: Float32Array, index: Double): Real = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/complex_util", "mergeRealAndImagArrays")
  @js.native
  def mergeRealAndImagArrays(real: Float32Array, imag: Float32Array): Float32Array = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/complex_util", "splitRealAndImagArrays")
  @js.native
  def splitRealAndImagArrays(complex: Float32Array): Imag = js.native
}
