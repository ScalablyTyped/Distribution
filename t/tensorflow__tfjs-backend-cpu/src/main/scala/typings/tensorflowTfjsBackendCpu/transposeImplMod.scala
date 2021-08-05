package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transposeImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Transpose_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transposeImpl(
    xVals: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    perm: js.Array[Double],
    newShape: js.Array[Double]
  ): TypedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("transposeImpl")(xVals.asInstanceOf[js.Any], xShape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], perm.asInstanceOf[js.Any], newShape.asInstanceOf[js.Any])).asInstanceOf[TypedArray]
}
