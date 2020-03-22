package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/kernels/FromPixels_utils/from_pixels_packed_gpu", JSImport.Namespace)
@js.native
object fromPixelsPackedGpuMod extends js.Object {
  @js.native
  class FromPixelsPackedProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Array[Double]) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    @JSName("packedInputs")
    var packedInputs_FromPixelsPackedProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_FromPixelsPackedProgram: Boolean = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

