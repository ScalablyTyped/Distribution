package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsMaxPoolGradAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsMaxPoolGradMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/MaxPoolGrad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def maxPoolGrad(args: AttrsMaxPoolGradAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolGrad")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/MaxPoolGrad", "maxPoolGradConfig")
  @js.native
  val maxPoolGradConfig: KernelConfig = js.native
}
