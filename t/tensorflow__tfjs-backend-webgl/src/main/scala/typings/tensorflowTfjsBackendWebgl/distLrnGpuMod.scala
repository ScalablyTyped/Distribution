package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLrnGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/lrn_gpu", "LRNProgram")
  @js.native
  open class LRNProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(xShape: js.Array[Double], radius: Double, bias: Double, alpha: Double, beta: Double) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
