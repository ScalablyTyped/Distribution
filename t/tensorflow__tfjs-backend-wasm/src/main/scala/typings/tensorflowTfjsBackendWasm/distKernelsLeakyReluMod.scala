package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.AttrsLeakyReluAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsLeakyReluMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/LeakyRelu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def leakyRelu(args: AttrsLeakyReluAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("leakyRelu")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/LeakyRelu", "leakyReluConfig")
  @js.native
  val leakyReluConfig: KernelConfig = js.native
}
