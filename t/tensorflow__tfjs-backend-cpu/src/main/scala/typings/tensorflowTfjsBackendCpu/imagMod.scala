package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.InputsImagInputs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Imag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def imag(args: InputsImagInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("imag")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Imag", "imagConfig")
  @js.native
  val imagConfig: KernelConfig = js.native
}
