package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsResizeBilinearAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsResizeBilinearMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/ResizeBilinear", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resizeBilinear(args: AttrsResizeBilinearAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/ResizeBilinear", "resizeBilinearConfig")
  @js.native
  val resizeBilinearConfig: KernelConfig = js.native
}
