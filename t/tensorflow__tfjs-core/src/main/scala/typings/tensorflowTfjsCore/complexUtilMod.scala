package typings.tensorflowTfjsCore

import typings.std.Float32Array
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/complex_util", JSImport.Namespace)
@js.native
object complexUtilMod extends js.Object {
  def assignToTypedArray(data: TypedArray, real: Double, imag: Double, index: Double): Unit = js.native
  def complexWithEvenIndex(complex: Float32Array): AnonImag = js.native
  def complexWithOddIndex(complex: Float32Array): AnonImag = js.native
  def exponent(k: Double, n: Double, inverse: Boolean): AnonReal = js.native
  def exponents(n: Double, inverse: Boolean): AnonImag = js.native
  def getComplexWithIndex(complex: Float32Array, index: Double): AnonReal = js.native
  def mergeRealAndImagArrays(real: Float32Array, imag: Float32Array): Float32Array = js.native
  def splitRealAndImagArrays(complex: Float32Array): AnonImag = js.native
}

