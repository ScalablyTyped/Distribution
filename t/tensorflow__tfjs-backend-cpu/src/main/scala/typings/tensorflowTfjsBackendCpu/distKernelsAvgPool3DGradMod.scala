package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsAvgPool3DGradAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsAvgPool3DGradMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/AvgPool3DGrad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def avgPool3DGrad(args: AttrsAvgPool3DGradAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPool3DGrad")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/AvgPool3DGrad", "avgPool3DGradConfig")
  @js.native
  val avgPool3DGradConfig: KernelConfig = js.native
}
