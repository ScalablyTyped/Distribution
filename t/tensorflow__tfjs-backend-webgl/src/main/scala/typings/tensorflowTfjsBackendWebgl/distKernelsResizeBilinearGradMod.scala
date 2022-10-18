package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsResizeBilinearGradAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsResizeBilinearGradMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/ResizeBilinearGrad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resizeBilinearGrad(args: AttrsResizeBilinearGradAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinearGrad")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/ResizeBilinearGrad", "resizeBilinearGradConfig")
  @js.native
  val resizeBilinearGradConfig: KernelConfig = js.native
}
