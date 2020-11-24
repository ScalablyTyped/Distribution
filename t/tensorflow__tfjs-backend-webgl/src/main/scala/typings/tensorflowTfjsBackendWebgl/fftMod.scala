package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.BackendMathBackendWebGL
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/FFT", JSImport.Namespace)
@js.native
object fftMod extends js.Object {
  
  def fft(args: BackendMathBackendWebGL): TensorInfo = js.native
  
  val fftConfig: KernelConfig = js.native
}
