package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-webgl/dist/fft_gpu", JSImport.Namespace)
@js.native
object fftGpuMod extends js.Object {
  @js.native
  class FFTProgram protected () extends GPGPUProgram {
    def this(op: String, inputShape: js.Tuple2[Double, Double], inverse: Boolean) = this()
  }
  
  @js.native
  object COMPLEX_FFT extends js.Object {
    var IMAG: String = js.native
    var REAL: String = js.native
  }
  
}

