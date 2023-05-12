package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.InputsFlipLeftRightInputs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsFlipLeftRightMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/FlipLeftRight", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flipLeftRight(args: InputsFlipLeftRightInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/FlipLeftRight", "flipLeftRightConfig")
  @js.native
  val flipLeftRightConfig: KernelConfig = js.native
}
