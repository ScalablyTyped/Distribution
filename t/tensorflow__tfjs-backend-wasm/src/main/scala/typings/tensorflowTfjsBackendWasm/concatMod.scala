package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.Backend
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/Concat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concat(args: Backend): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/Concat", "concatConfig")
  @js.native
  val concatConfig: KernelConfig = js.native
}
