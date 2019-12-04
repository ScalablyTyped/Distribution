package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distTypesMod.TypedArray
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/complex_util", JSImport.Namespace)
@js.native
object distBackendsComplexUnderscoreUtilMod extends js.Object {
  def assignToTypedArray(data: TypedArray, real: Double, imag: Double, index: Double): Unit = js.native
  def complexWithEvenIndex(complex: Float32Array): Anon_Imag = js.native
  def complexWithOddIndex(complex: Float32Array): Anon_Imag = js.native
  def exponent(k: Double, n: Double, inverse: Boolean): Anon_ImagReal = js.native
  def exponents(n: Double, inverse: Boolean): Anon_Imag = js.native
  def getComplexWithIndex(complex: Float32Array, index: Double): Anon_ImagReal = js.native
  def mergeRealAndImagArrays(real: Float32Array, imag: Float32Array): Float32Array = js.native
  def splitRealAndImagArrays(complex: Float32Array): Anon_Imag = js.native
}

