package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reshapePackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/reshape_packed_gpu", "ReshapePackedProgram")
  @js.native
  class ReshapePackedProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(outputShape: js.Tuple3[Double, Double, Double], inputShape: js.Tuple3[Double, Double, Double]) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_ReshapePackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_ReshapePackedProgram: Boolean = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
