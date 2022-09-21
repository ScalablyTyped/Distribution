package typings.vectorious

import typings.vectorious.typesMod.DType
import typings.vectorious.typesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lapackMod {
  
  @JSImport("vectorious/dist/lapack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gesv(
    dtype: DType,
    n: Double,
    nrhs: Double,
    x: TypedArray,
    ldx: Double,
    ipiv: js.typedarray.Int32Array,
    y: TypedArray,
    ldy: Double
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("gesv")(dtype.asInstanceOf[js.Any], n.asInstanceOf[js.Any], nrhs.asInstanceOf[js.Any], x.asInstanceOf[js.Any], ldx.asInstanceOf[js.Any], ipiv.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ldy.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getrf(dtype: DType, m: Double, n: Double, x: TypedArray, ldx: Double, ipiv: js.typedarray.Int32Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getrf")(dtype.asInstanceOf[js.Any], m.asInstanceOf[js.Any], n.asInstanceOf[js.Any], x.asInstanceOf[js.Any], ldx.asInstanceOf[js.Any], ipiv.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getri(dtype: DType, n: Double, x: TypedArray, ldx: Double, ipiv: js.typedarray.Int32Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getri")(dtype.asInstanceOf[js.Any], n.asInstanceOf[js.Any], x.asInstanceOf[js.Any], ldx.asInstanceOf[js.Any], ipiv.asInstanceOf[js.Any])).asInstanceOf[Any]
}
