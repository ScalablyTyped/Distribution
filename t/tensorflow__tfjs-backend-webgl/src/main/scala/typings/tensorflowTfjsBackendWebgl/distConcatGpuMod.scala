package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConcatGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/concat_gpu", "ConcatProgram")
  @js.native
  open class ConcatProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(shapes: js.Array[js.Tuple2[Double, Double]]) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
