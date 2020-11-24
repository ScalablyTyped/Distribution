package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/transpose_packed_gpu", JSImport.Namespace)
@js.native
object transposePackedGpuMod extends js.Object {
  
  @js.native
  class TransposePackedProgram protected () extends GPGPUProgram {
    def this(aShape: js.Array[Double], newDim: js.Array[Double]) = this()
    
    @JSName("packedInputs")
    var packedInputs_TransposePackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_TransposePackedProgram: Boolean = js.native
    
    var rank: Double = js.native
  }
}
