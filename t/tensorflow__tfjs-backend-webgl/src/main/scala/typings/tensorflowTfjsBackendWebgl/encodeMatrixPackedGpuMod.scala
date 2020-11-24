package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/encode_matrix_packed_gpu", JSImport.Namespace)
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
    
    @JSName("packedInputs")
    var packedInputs_EncodeMatrixPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_EncodeMatrixPackedProgram: Boolean = js.native
  }
}
