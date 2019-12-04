package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.unsortedSegmentSum
import typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram
import typings.atTensorflowTfjsDashCore.distOpsSegmentUnderscoreUtilMod.SegOpInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/segment_gpu", JSImport.Namespace)
@js.native
object distBackendsWebglSegmentUnderscoreGpuMod extends js.Object {
  @js.native
  class SegmentOpProgram protected () extends GPGPUProgram {
    def this(segOpInfo: SegOpInfo, segOpType: unsortedSegmentSum) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

