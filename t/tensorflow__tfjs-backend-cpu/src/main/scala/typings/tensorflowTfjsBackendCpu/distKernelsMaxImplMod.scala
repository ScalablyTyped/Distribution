package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsMaxImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Max_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def maxImpl(aVals: TypedArray, reduceSize: Double, outShape: js.Array[Double], dtype: DataType): TypedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("maxImpl")(aVals.asInstanceOf[js.Any], reduceSize.asInstanceOf[js.Any], outShape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TypedArray]
}
