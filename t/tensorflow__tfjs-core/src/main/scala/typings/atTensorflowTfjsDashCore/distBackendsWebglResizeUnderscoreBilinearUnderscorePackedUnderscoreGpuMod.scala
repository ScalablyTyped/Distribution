package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/resize_bilinear_packed_gpu", JSImport.Namespace)
@js.native
object distBackendsWebglResizeUnderscoreBilinearUnderscorePackedUnderscoreGpuMod extends js.Object {
  @js.native
  class ResizeBilinearPackedProgram protected () extends GPGPUProgram {
    def this(
      inputShape: js.Tuple4[Double, Double, Double, Double],
      newHeight: Double,
      newWidth: Double,
      alignCorners: Boolean
    ) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    @JSName("packedInputs")
    var packedInputs_ResizeBilinearPackedProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_ResizeBilinearPackedProgram: Boolean = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

