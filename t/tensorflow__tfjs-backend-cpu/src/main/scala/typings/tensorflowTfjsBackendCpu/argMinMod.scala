package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsBackendInputs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argMinMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/ArgMin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def argMin(args: AttrsBackendInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("argMin")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/ArgMin", "argMinConfig")
  @js.native
  val argMinConfig: KernelConfig = js.native
}
