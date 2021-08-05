package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsBackendInputs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object castMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Cast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cast(args: AttrsBackendInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Cast", "castConfig")
  @js.native
  val castConfig: KernelConfig = js.native
}
