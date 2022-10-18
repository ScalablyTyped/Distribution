package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsResizeNearestNeighborAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsResizeNearestNeighborMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/ResizeNearestNeighbor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resizeNearestNeighbor(args: AttrsResizeNearestNeighborAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/ResizeNearestNeighbor", "resizeNearestNeighborConfig")
  @js.native
  val resizeNearestNeighborConfig: KernelConfig = js.native
}
