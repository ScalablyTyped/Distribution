package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object padPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/pad_packed_gpu", "PadPackedProgram")
  @js.native
  class PadPackedProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(xShape: js.Array[Double], paddings: js.Array[js.Tuple2[Double, Double]], constantValue: Double) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_PadPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_PadPackedProgram: Boolean = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
