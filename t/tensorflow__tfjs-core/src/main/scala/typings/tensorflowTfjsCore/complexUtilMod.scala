package typings.tensorflowTfjsCore

import typings.std.Float32Array
import typings.tensorflowTfjsCore.anon.Imag
import typings.tensorflowTfjsCore.anon.Real
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object complexUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/complex_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assignToTypedArray(data: TypedArray, real: Double, imag: Double, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assignToTypedArray")(data.asInstanceOf[js.Any], real.asInstanceOf[js.Any], imag.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def complexWithEvenIndex(complex: Float32Array): Imag = ^.asInstanceOf[js.Dynamic].applyDynamic("complexWithEvenIndex")(complex.asInstanceOf[js.Any]).asInstanceOf[Imag]
  
  inline def complexWithOddIndex(complex: Float32Array): Imag = ^.asInstanceOf[js.Dynamic].applyDynamic("complexWithOddIndex")(complex.asInstanceOf[js.Any]).asInstanceOf[Imag]
  
  inline def exponent(k: Double, n: Double, inverse: Boolean): Real = (^.asInstanceOf[js.Dynamic].applyDynamic("exponent")(k.asInstanceOf[js.Any], n.asInstanceOf[js.Any], inverse.asInstanceOf[js.Any])).asInstanceOf[Real]
  
  inline def exponents(n: Double, inverse: Boolean): Imag = (^.asInstanceOf[js.Dynamic].applyDynamic("exponents")(n.asInstanceOf[js.Any], inverse.asInstanceOf[js.Any])).asInstanceOf[Imag]
  
  inline def getComplexWithIndex(complex: Float32Array, index: Double): Real = (^.asInstanceOf[js.Dynamic].applyDynamic("getComplexWithIndex")(complex.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Real]
  
  inline def mergeRealAndImagArrays(real: Float32Array, imag: Float32Array): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeRealAndImagArrays")(real.asInstanceOf[js.Any], imag.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  
  inline def splitRealAndImagArrays(complex: Float32Array): Imag = ^.asInstanceOf[js.Dynamic].applyDynamic("splitRealAndImagArrays")(complex.asInstanceOf[js.Any]).asInstanceOf[Imag]
}
