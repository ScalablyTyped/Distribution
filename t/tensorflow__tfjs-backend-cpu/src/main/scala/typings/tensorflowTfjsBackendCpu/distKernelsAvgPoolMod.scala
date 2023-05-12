package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsAvgPoolAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsAvgPoolMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/AvgPool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def avgPool(args: AttrsAvgPoolAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/AvgPool", "avgPoolConfig")
  @js.native
  val avgPoolConfig: KernelConfig = js.native
}
