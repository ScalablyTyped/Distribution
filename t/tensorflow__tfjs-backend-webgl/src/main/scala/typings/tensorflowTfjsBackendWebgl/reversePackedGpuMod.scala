package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reversePackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/reverse_packed_gpu", "ReversePackedProgram")
  @js.native
  open class ReversePackedProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(xShape: js.Array[Double], axis: js.Array[Double]) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_ReversePackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_ReversePackedProgram: Boolean = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
