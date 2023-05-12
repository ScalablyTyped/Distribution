package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.AttrsLRNGradAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsLrngradMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/LRNGrad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lrnGrad(args: AttrsLRNGradAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("lrnGrad")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/LRNGrad", "lrnGradConfig")
  @js.native
  val lrnGradConfig: KernelConfig = js.native
}
