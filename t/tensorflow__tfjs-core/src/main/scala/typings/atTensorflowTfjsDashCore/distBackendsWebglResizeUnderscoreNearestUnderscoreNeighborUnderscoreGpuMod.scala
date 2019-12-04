package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/resize_nearest_neighbor_gpu", JSImport.Namespace)
@js.native
object distBackendsWebglResizeUnderscoreNearestUnderscoreNeighborUnderscoreGpuMod extends js.Object {
  @js.native
  class ResizeNearestNeighborProgram protected () extends GPGPUProgram {
    def this(
      inputShape: js.Tuple4[Double, Double, Double, Double],
      newHeight: Double,
      newWidth: Double,
      alignCorners: Boolean
    ) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

