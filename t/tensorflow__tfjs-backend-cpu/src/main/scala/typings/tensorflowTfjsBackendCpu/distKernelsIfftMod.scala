package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.InputsIFFTInputs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsIfftMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/IFFT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ifft(args: InputsIFFTInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("ifft")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/IFFT", "ifftConfig")
  @js.native
  val ifftConfig: KernelConfig = js.native
}
