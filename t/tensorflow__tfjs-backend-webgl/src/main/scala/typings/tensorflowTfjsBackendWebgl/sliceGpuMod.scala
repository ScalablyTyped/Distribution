package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.ArrayIndexName
import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliceGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/slice_gpu", "SliceProgram")
  @js.native
  open class SliceProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(destSize: js.Array[Double]) = this()
    
    @JSName("customUniforms")
    var customUniforms_SliceProgram: js.Array[ArrayIndexName] = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    var rank: Double = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
