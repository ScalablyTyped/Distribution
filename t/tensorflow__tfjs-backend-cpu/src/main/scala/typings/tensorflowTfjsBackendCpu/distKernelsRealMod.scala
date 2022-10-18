package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.InputsRealInputs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsRealMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Real", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def real(args: InputsRealInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("real")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Real", "realConfig")
  @js.native
  val realConfig: KernelConfig = js.native
}
