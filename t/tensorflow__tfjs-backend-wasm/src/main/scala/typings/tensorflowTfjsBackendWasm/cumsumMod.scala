package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.AttrsBackend
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cumsumMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/Cumsum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cumsum(args: AttrsBackend): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/Cumsum", "cumsumConfig")
  @js.native
  val cumsumConfig: KernelConfig = js.native
}
