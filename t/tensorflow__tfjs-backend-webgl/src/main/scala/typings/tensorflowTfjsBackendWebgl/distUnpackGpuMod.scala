package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUnpackGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unpack_gpu", "UnpackProgram")
  @js.native
  open class UnpackProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(outputShape: js.Array[Double]) = this()
    
    @JSName("enableShapeUniforms")
    var enableShapeUniforms_UnpackProgram: Boolean = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_UnpackProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_UnpackProgram: Boolean = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
