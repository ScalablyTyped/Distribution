package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/scatter_gpu", JSImport.Namespace)
@js.native
object distBackendsWebglScatterUnderscoreGpuMod extends js.Object {
  @js.native
  class ScatterProgram protected () extends GPGPUProgram {
    def this(
      updateSize: Double,
      sliceDim: Double,
      indicesRank: Double,
      updatesRank: Double,
      strides: js.Array[Double],
      shape: js.Array[Double]
    ) = this()
    def this(
      updateSize: Double,
      sliceDim: Double,
      indicesRank: Double,
      updatesRank: Double,
      strides: js.Array[Double],
      shape: js.Array[Double],
      summingDupeIndex: Boolean
    ) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

