package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addnPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/addn_packed_gpu", "AddNPackedProgram")
  @js.native
  class AddNPackedProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(outputShape: js.Array[Double], shapes: js.Array[js.Array[Double]]) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_AddNPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_AddNPackedProgram: Boolean = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
