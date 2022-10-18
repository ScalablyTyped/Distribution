package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConcatPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/concat_packed_gpu", "ConcatPackedProgram")
  @js.native
  open class ConcatPackedProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(shapes: js.Array[js.Array[Double]], axis: Double) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_ConcatPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_ConcatPackedProgram: Boolean = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
