package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/gather_nd_gpu", JSImport.Namespace)
@js.native
object distBackendsWebglGatherUnderscoreNdUnderscoreGpuMod extends js.Object {
  @js.native
  class GatherNDProgram protected () extends GPGPUProgram {
    def this(sliceDim: Double, strides: js.Array[Double], shape: js.Array[Double]) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    var sliceDim: js.Any = js.native
    var strides: js.Any = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

