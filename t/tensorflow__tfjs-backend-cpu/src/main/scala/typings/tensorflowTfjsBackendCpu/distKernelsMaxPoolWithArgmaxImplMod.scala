package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsCore.distOpsConvUtilMod.Conv2DInfo
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsMaxPoolWithArgmaxImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/MaxPoolWithArgmax_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def maxPoolWithArgmaxImpl(
    xValues: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    includeBatchInIndex: Boolean,
    convInfo: Conv2DInfo
  ): js.Array[
    js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.Array[String]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmaxImpl")(xValues.asInstanceOf[js.Any], xShape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any], convInfo.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.Array[String]
  ]]
}
