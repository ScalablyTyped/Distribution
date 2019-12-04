package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram
import typings.atTensorflowTfjsDashCore.distOpsConvUnderscoreUtilMod.Conv2DInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/im2col_packed_gpu", JSImport.Namespace)
@js.native
object distBackendsWebglIm2colUnderscorePackedUnderscoreGpuMod extends js.Object {
  @js.native
  class Im2ColPackedProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Array[Double], inputShape: js.Array[Double], convInfo: Conv2DInfo) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    @JSName("packedInputs")
    var packedInputs_Im2ColPackedProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_Im2ColPackedProgram: Boolean = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

