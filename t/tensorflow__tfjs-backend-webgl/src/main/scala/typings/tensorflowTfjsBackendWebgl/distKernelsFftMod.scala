package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.InputsFFTInputs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsFftMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/FFT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fft(args: InputsFFTInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fft")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/FFT", "fftConfig")
  @js.native
  val fftConfig: KernelConfig = js.native
}
