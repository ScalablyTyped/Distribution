package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsResizeNearestNeighborAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsResizeNearestNeighborMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/ResizeNearestNeighbor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resizeNearestNeighbor(args: AttrsResizeNearestNeighborAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/ResizeNearestNeighbor", "resizeNearestNeighborConfig")
  @js.native
  val resizeNearestNeighborConfig: KernelConfig = js.native
}
