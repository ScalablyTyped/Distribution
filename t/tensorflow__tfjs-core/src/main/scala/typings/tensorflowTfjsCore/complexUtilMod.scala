package typings.tensorflowTfjsCore

import typings.std.Float32Array
import typings.tensorflowTfjsCore.anon.Imag
import typings.tensorflowTfjsCore.anon.Real
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/complex_util", JSImport.Namespace)
@js.native
object complexUtilMod extends js.Object {
  def assignToTypedArray(data: TypedArray, real: Double, imag: Double, index: Double): Unit = js.native
  def complexWithEvenIndex(complex: Float32Array): Imag = js.native
  def complexWithOddIndex(complex: Float32Array): Imag = js.native
  def exponent(k: Double, n: Double, inverse: Boolean): Real = js.native
  def exponents(n: Double, inverse: Boolean): Imag = js.native
  def getComplexWithIndex(complex: Float32Array, index: Double): Real = js.native
  def mergeRealAndImagArrays(real: Float32Array, imag: Float32Array): Float32Array = js.native
  def splitRealAndImagArrays(complex: Float32Array): Imag = js.native
}

