package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/fft_gpu", JSImport.Namespace)
@js.native
object distBackendsWebglFftUnderscoreGpuMod extends js.Object {
  @js.native
  class FFTProgram protected () extends GPGPUProgram {
    def this(op: String, inputShape: js.Tuple2[Double, Double], inverse: Boolean) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
  @js.native
  object COMPLEX_FFT extends js.Object {
    var IMAG: String = js.native
    var REAL: String = js.native
  }
  
}

