package typings.tensorflowTfjsLayers

import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathUtilsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/math_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayProd(array: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayProd")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def arrayProd(array: js.Array[Double], begin: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayProd")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def arrayProd(array: js.Array[Double], begin: Double, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayProd")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def arrayProd(array: js.Array[Double], begin: Unit, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayProd")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def arrayProd(array: ArrayTypes): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayProd")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def arrayProd(array: ArrayTypes, begin: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayProd")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def arrayProd(array: ArrayTypes, begin: Double, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayProd")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def arrayProd(array: ArrayTypes, begin: Unit, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayProd")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isInteger(x: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def max(array: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def max(array: Float32Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def mean(array: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def mean(array: Float32Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def median(array: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("median")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def median(array: Float32Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("median")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def min(array: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def min(array: Float32Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def range(begin: Double, end: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def sum(array: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def sum(array: Float32Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def variance(array: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("variance")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def variance(array: Float32Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("variance")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  type ArrayTypes = Uint8Array | Int32Array | Float32Array
}
