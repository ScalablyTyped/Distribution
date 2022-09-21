package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.AttrsReverseAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reverseMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/Reverse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reverse(args: AttrsReverseAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/Reverse", "reverseConfig")
  @js.native
  val reverseConfig: KernelConfig = js.native
}
