package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-webgl/dist/reverse_packed_gpu", JSImport.Namespace)
@js.native
object reversePackedGpuMod extends js.Object {
  @js.native
  class ReversePackedProgram protected () extends GPGPUProgram {
    def this(xShape: js.Array[Double], axis: js.Array[Double]) = this()
    @JSName("packedInputs")
    var packedInputs_ReversePackedProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_ReversePackedProgram: Boolean = js.native
  }
  
}

