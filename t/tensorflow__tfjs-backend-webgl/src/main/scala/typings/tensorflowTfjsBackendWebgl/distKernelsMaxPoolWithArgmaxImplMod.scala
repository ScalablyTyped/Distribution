package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distOpsConvUtilMod.Conv2DInfo
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsMaxPoolWithArgmaxImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/MaxPoolWithArgmax_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def maxPoolWithArgmaxImpl(x: TensorInfo, includeBatchInIndex: Boolean, convInfo: Conv2DInfo, backend: MathBackendWebGL): js.Array[TensorInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmaxImpl")(x.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any], convInfo.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[js.Array[TensorInfo]]
}
