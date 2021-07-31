package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.InputsFFTInputs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fftMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/FFT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fft(args: InputsFFTInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fft")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/FFT", "fftConfig")
  @js.native
  val fftConfig: KernelConfig = js.native
}
