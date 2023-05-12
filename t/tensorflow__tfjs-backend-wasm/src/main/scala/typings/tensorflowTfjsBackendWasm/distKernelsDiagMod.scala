package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.BackendBackendWasm
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsDiagMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/Diag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def diag(args: BackendBackendWasm): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("diag")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/Diag", "diagConfig")
  @js.native
  val diagConfig: KernelConfig = js.native
}
