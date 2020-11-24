package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsBackendWebgl.texUtilMod.PackingScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/decode_matrix_packed_gpu", JSImport.Namespace)
@js.native
object decodeMatrixPackedGpuMod extends js.Object {
  
  @js.native
  class DecodeMatrixPackedProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Tuple3[Double, Double, Double]) = this()
    
    @JSName("outPackingScheme")
    var outPackingScheme_DecodeMatrixPackedProgram: PackingScheme = js.native
    
    @JSName("outputShape")
    var outputShape_DecodeMatrixPackedProgram: js.Tuple3[Double, Double, Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_DecodeMatrixPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_DecodeMatrixPackedProgram: Boolean = js.native
  }
}
