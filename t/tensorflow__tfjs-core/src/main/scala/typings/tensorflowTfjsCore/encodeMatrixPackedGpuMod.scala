package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/encode_matrix_packed_gpu", JSImport.Namespace)
@js.native
object encodeMatrixPackedGpuMod extends js.Object {
  @js.native
  class EncodeMatrixPackedProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Tuple3[Double, Double, Double], texShape: js.Tuple2[Double, Double]) = this()
    def this(
      outputShape: js.Tuple3[Double, Double, Double],
      texShape: js.Tuple2[Double, Double],
      inputIsUnsignedByte: Boolean
    ) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    @JSName("packedInputs")
    var packedInputs_EncodeMatrixPackedProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_EncodeMatrixPackedProgram: Boolean = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

