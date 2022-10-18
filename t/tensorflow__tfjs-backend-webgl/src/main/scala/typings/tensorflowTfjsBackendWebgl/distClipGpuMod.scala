package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.Name
import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClipGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/clip_gpu", "ClipProgram")
  @js.native
  open class ClipProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(aShape: js.Array[Double]) = this()
    
    @JSName("customUniforms")
    var customUniforms_ClipProgram: js.Array[Name] = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
