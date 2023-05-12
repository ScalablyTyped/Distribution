package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.InputsEluGradInputs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsEluGradMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/EluGrad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eluGrad(args: InputsEluGradInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("eluGrad")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/EluGrad", "eluGradConfig")
  @js.native
  val eluGradConfig: KernelConfig = js.native
}
