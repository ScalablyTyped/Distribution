package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.AttrsLRNAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsLrnMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/LRN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lrn(args: AttrsLRNAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("lrn")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/LRN", "lrnConfig")
  @js.native
  val lrnConfig: KernelConfig = js.native
}
