package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.tensorflowTfjsBackendWasmStrings.ArgMax
import typings.tensorflowTfjsBackendWasm.tensorflowTfjsBackendWasmStrings.ArgMin
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsArgminmaxKernelMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/argminmax_kernel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createArgMinMaxKernelConfig(kernelName: ArgMin | ArgMax): KernelConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createArgMinMaxKernelConfig")(kernelName.asInstanceOf[js.Any]).asInstanceOf[KernelConfig]
}
