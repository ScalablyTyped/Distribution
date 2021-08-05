package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsSpaceToBatchNDAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spaceToBatchNDMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SpaceToBatchND", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def spaceToBatchND(args: AttrsSpaceToBatchNDAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("spaceToBatchND")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SpaceToBatchND", "spaceToBatchNDConfig")
  @js.native
  val spaceToBatchNDConfig: KernelConfig = js.native
}
