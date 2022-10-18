package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.anon.Imag
import typings.tensorflowTfjsCore.anon.Real
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBackendsComplexUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/complex_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assignToTypedArray(data: TypedArray, real: Double, imag: Double, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assignToTypedArray")(data.asInstanceOf[js.Any], real.asInstanceOf[js.Any], imag.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def complexWithEvenIndex(complex: js.typedarray.Float32Array): Imag = ^.asInstanceOf[js.Dynamic].applyDynamic("complexWithEvenIndex")(complex.asInstanceOf[js.Any]).asInstanceOf[Imag]
  
  inline def complexWithOddIndex(complex: js.typedarray.Float32Array): Imag = ^.asInstanceOf[js.Dynamic].applyDynamic("complexWithOddIndex")(complex.asInstanceOf[js.Any]).asInstanceOf[Imag]
  
  inline def exponent(k: Double, n: Double, inverse: Boolean): Real = (^.asInstanceOf[js.Dynamic].applyDynamic("exponent")(k.asInstanceOf[js.Any], n.asInstanceOf[js.Any], inverse.asInstanceOf[js.Any])).asInstanceOf[Real]
  
  inline def exponents(n: Double, inverse: Boolean): Imag = (^.asInstanceOf[js.Dynamic].applyDynamic("exponents")(n.asInstanceOf[js.Any], inverse.asInstanceOf[js.Any])).asInstanceOf[Imag]
  
  inline def getComplexWithIndex(complex: js.typedarray.Float32Array, index: Double): Real = (^.asInstanceOf[js.Dynamic].applyDynamic("getComplexWithIndex")(complex.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Real]
  
  inline def mergeRealAndImagArrays(real: js.typedarray.Float32Array, imag: js.typedarray.Float32Array): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeRealAndImagArrays")(real.asInstanceOf[js.Any], imag.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  
  inline def splitRealAndImagArrays(complex: js.typedarray.Float32Array): Imag = ^.asInstanceOf[js.Dynamic].applyDynamic("splitRealAndImagArrays")(complex.asInstanceOf[js.Any]).asInstanceOf[Imag]
}
