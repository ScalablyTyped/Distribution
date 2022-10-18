package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.BackendInputs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsDepthToSpaceMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/DepthToSpace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def depthToSpace(args: BackendInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("depthToSpace")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/DepthToSpace", "depthToSpaceConfig")
  @js.native
  val depthToSpaceConfig: KernelConfig = js.native
}
