package typings.vectorious

import typings.vectorious.distTypesMod.DType
import typings.vectorious.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBlasMod {
  
  @JSImport("vectorious/dist/blas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vectorious/dist/blas", "NoTrans")
  @js.native
  val NoTrans: Any = js.native
  
  @JSImport("vectorious/dist/blas", "Trans")
  @js.native
  val Trans: Any = js.native
  
  inline def axpy(dtype: DType, n: Double, alpha: Double, x: TypedArray, inc_x: Double, y: TypedArray, inc_y: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("axpy")(dtype.asInstanceOf[js.Any], n.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], x.asInstanceOf[js.Any], inc_x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], inc_y.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def dot(dtype: DType, n: Double, x: TypedArray, inc_x: Double, y: TypedArray, inc_y: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(dtype.asInstanceOf[js.Any], n.asInstanceOf[js.Any], x.asInstanceOf[js.Any], inc_x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], inc_y.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def gemm(
    dtype: DType,
    transx: Double,
    transy: Double,
    m: Double,
    n: Double,
    k: Double,
    alpha: Double,
    x: TypedArray,
    ldx: Double,
    y: TypedArray,
    ldy: Double,
    beta: Double,
    z: TypedArray,
    ldz: Double
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("gemm")(dtype.asInstanceOf[js.Any], transx.asInstanceOf[js.Any], transy.asInstanceOf[js.Any], m.asInstanceOf[js.Any], n.asInstanceOf[js.Any], k.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], x.asInstanceOf[js.Any], ldx.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ldy.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], z.asInstanceOf[js.Any], ldz.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def iamax(dtype: DType, n: Double, x: TypedArray, inc_x: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("iamax")(dtype.asInstanceOf[js.Any], n.asInstanceOf[js.Any], x.asInstanceOf[js.Any], inc_x.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def nrm2(dtype: DType, n: Double, x: TypedArray, inc_x: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("nrm2")(dtype.asInstanceOf[js.Any], n.asInstanceOf[js.Any], x.asInstanceOf[js.Any], inc_x.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def scal(dtype: DType, n: Double, alpha: Double, x: TypedArray, inc_x: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scal")(dtype.asInstanceOf[js.Any], n.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], x.asInstanceOf[js.Any], inc_x.asInstanceOf[js.Any])).asInstanceOf[Any]
}
