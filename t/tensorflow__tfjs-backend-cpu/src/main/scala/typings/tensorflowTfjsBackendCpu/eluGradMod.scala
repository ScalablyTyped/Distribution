package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.InputsEluGradInputs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eluGradMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/EluGrad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eluGrad(args: InputsEluGradInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("eluGrad")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/EluGrad", "eluGradConfig")
  @js.native
  val eluGradConfig: KernelConfig = js.native
}
