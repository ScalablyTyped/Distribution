package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.max
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.min
import typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/argminmax_packed_gpu", JSImport.Namespace)
@js.native
object distBackendsWebglArgminmaxUnderscorePackedUnderscoreGpuMod extends js.Object {
  @js.native
  class ArgMinMaxPackedProgram protected () extends GPGPUProgram {
    def this(shape: js.Array[Double], windowSize: Double, op: max, firstPass: Boolean) = this()
    def this(shape: js.Array[Double], windowSize: Double, op: min, firstPass: Boolean) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    @JSName("packedInputs")
    var packedInputs_ArgMinMaxPackedProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_ArgMinMaxPackedProgram: Boolean = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

