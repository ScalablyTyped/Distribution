package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodeMatrixPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/encode_matrix_packed_gpu", "EncodeMatrixPackedProgram")
  @js.native
  class EncodeMatrixPackedProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(outputShape: js.Tuple3[Double, Double, Double], texShape: js.Tuple2[Double, Double]) = this()
    def this(
      outputShape: js.Tuple3[Double, Double, Double],
      texShape: js.Tuple2[Double, Double],
      inputIsUnsignedByte: Boolean
    ) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_EncodeMatrixPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_EncodeMatrixPackedProgram: Boolean = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
