package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsAvgPoolGradAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsAvgPoolGradMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/AvgPoolGrad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def avgPoolGrad(args: AttrsAvgPoolGradAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolGrad")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/AvgPoolGrad", "avgPoolGradConfig")
  @js.native
  val avgPoolGradConfig: KernelConfig = js.native
}
