package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/reverse_packed_gpu", JSImport.Namespace)
@js.native
object distBackendsWebglReverseUnderscorePackedUnderscoreGpuMod extends js.Object {
  @js.native
  class ReversePackedProgram protected () extends GPGPUProgram {
    def this(xShape: js.Array[Double], axis: js.Array[Double]) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    @JSName("packedInputs")
    var packedInputs_ReversePackedProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_ReversePackedProgram: Boolean = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

