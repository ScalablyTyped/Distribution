package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.InputsPreluInputs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsPreluMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Prelu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prelu(args: InputsPreluInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("prelu")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Prelu", "preluConfig")
  @js.native
  val preluConfig: KernelConfig = js.native
}
