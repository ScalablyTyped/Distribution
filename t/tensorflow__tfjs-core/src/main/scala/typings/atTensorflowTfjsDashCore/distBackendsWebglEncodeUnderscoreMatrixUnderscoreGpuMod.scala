package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/encode_matrix_gpu", JSImport.Namespace)
@js.native
object distBackendsWebglEncodeUnderscoreMatrixUnderscoreGpuMod extends js.Object {
  @js.native
  class EncodeMatrixProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Tuple3[Double, Double, Double], texShape: js.Tuple2[Double, Double]) = this()
    def this(
      outputShape: js.Tuple3[Double, Double, Double],
      texShape: js.Tuple2[Double, Double],
      inputIsUnsignedByte: Boolean
    ) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

