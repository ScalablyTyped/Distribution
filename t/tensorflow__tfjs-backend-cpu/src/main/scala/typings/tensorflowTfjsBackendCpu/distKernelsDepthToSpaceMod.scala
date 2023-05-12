package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsDepthToSpaceAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsDepthToSpaceMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/DepthToSpace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def depthToSpace(args: AttrsDepthToSpaceAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("depthToSpace")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/DepthToSpace", "depthToSpaceConfig")
  @js.native
  val depthToSpaceConfig: KernelConfig = js.native
}
