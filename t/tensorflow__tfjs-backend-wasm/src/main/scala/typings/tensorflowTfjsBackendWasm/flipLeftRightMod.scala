package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.BackendBackendWasm
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flipLeftRightMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/FlipLeftRight", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flipLeftRight(args: BackendBackendWasm): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/FlipLeftRight", "flipLeftRightConfig")
  @js.native
  val flipLeftRightConfig: KernelConfig = js.native
}
