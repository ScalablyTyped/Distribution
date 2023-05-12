package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsResizeNearestNeighborGradAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsResizeNearestNeighborGradMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/ResizeNearestNeighborGrad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resizeNearestNeighborGrad(args: AttrsResizeNearestNeighborGradAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighborGrad")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/ResizeNearestNeighborGrad", "resizeNearestNeighborGradConfig")
  @js.native
  val resizeNearestNeighborGradConfig: KernelConfig = js.native
}
