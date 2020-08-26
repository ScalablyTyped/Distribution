package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-webgl/dist/lrn_packed_gpu", JSImport.Namespace)
@js.native
object lrnPackedGpuMod extends js.Object {
  @js.native
  class LRNPackedProgram protected () extends GPGPUProgram {
    def this(xShape: js.Array[Double], radius: Double, bias: Double, alpha: Double, beta: Double) = this()
    @JSName("packedInputs")
    var packedInputs_LRNPackedProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_LRNPackedProgram: Boolean = js.native
  }
  
}

