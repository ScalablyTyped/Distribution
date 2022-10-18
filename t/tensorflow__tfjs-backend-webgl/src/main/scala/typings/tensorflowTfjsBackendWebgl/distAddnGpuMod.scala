package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAddnGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/addn_gpu", "AddNProgram")
  @js.native
  open class AddNProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(outputShape: js.Array[Double], shapes: js.Array[js.Array[Double]]) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
