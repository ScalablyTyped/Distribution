package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/gather_gpu", JSImport.Namespace)
@js.native
object distBackendsWebglGatherUnderscoreGpuMod extends js.Object {
  @js.native
  class GatherProgram protected () extends GPGPUProgram {
    def this(aShape: js.Array[Double], indicesLength: Double, axis: Double) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    var rank: Double = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

