package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsNonMaxSuppressionV3Attrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nonMaxSuppressionV3Mod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/NonMaxSuppressionV3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nonMaxSuppressionV3(args: AttrsNonMaxSuppressionV3Attrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionV3")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/NonMaxSuppressionV3", "nonMaxSuppressionV3Config")
  @js.native
  val nonMaxSuppressionV3Config: KernelConfig = js.native
}
