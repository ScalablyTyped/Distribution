package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transposePackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/transpose_packed_gpu", "TransposePackedProgram")
  @js.native
  class TransposePackedProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(aShape: js.Array[Double], newDim: js.Array[Double]) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_TransposePackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_TransposePackedProgram: Boolean = js.native
    
    var rank: Double = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
