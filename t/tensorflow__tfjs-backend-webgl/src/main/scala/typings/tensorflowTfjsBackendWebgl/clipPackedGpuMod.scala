package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.Name
import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/clip_packed_gpu", "ClipPackedProgram")
  @js.native
  open class ClipPackedProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(aShape: js.Array[Double]) = this()
    
    @JSName("customUniforms")
    var customUniforms_ClipPackedProgram: js.Array[Name] = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_ClipPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_ClipPackedProgram: Boolean = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
