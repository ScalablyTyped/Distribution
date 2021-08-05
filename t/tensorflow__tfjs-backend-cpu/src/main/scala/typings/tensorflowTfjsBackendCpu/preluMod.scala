package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.InputsPreluInputs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preluMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Prelu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prelu(args: InputsPreluInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("prelu")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Prelu", "preluConfig")
  @js.native
  val preluConfig: KernelConfig = js.native
}
