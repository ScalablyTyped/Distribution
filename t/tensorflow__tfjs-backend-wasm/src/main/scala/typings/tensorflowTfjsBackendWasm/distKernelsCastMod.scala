package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.Attrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsCastMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/Cast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cast(args: Attrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/Cast", "castConfig")
  @js.native
  val castConfig: KernelConfig = js.native
}
