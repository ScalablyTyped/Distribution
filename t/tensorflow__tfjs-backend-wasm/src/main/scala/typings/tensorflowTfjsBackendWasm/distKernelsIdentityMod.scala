package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.InputsIdentityInputs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsIdentityMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/Identity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def identity(args: InputsIdentityInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/Identity", "identityConfig")
  @js.native
  val identityConfig: KernelConfig = js.native
}
