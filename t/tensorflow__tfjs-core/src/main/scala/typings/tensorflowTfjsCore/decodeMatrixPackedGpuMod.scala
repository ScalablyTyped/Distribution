package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.texUtilMod.PackingScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/decode_matrix_packed_gpu", JSImport.Namespace)
@js.native
object decodeMatrixPackedGpuMod extends js.Object {
  @js.native
  class DecodeMatrixPackedProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Tuple3[Double, Double, Double]) = this()
    @JSName("outPackingScheme")
    var outPackingScheme_DecodeMatrixPackedProgram: PackingScheme = js.native
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    @JSName("outputShape")
    var outputShape_DecodeMatrixPackedProgram: js.Tuple3[Double, Double, Double] = js.native
    @JSName("packedInputs")
    var packedInputs_DecodeMatrixPackedProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_DecodeMatrixPackedProgram: Boolean = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

