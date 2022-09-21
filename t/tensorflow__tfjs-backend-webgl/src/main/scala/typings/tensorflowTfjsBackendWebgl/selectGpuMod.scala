package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/select_gpu", "SelectProgram")
  @js.native
  open class SelectProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(cRank: Double, shape: js.Array[Double], rank: Double) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
