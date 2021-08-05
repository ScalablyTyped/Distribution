package typings.tensorflowTfjsBackendCpu

import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import typings.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maxPoolWithArgmaxImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/MaxPoolWithArgmax_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def maxPoolWithArgmaxImpl(
    xValues: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    includeBatchInIndex: Boolean,
    convInfo: Conv2DInfo
  ): js.Array[js.Array[String] | Uint8Array | Int32Array | Float32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmaxImpl")(xValues.asInstanceOf[js.Any], xShape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any], convInfo.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String] | Uint8Array | Int32Array | Float32Array]]
}
