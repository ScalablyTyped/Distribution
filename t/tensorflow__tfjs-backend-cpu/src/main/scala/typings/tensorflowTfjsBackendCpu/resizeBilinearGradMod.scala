package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsResizeBilinearGradAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeBilinearGradMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/ResizeBilinearGrad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resizeBilinearGrad(args: AttrsResizeBilinearGradAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinearGrad")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/ResizeBilinearGrad", "resizeBilinearGradConfig")
  @js.native
  val resizeBilinearGradConfig: KernelConfig = js.native
}
