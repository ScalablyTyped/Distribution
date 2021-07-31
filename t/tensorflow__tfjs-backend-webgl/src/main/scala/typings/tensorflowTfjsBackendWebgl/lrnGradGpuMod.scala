package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lrnGradGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/lrn_grad_gpu", "LRNGradProgram")
  @js.native
  class LRNGradProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(inputShape: js.Array[Double], depthRadius: Double, bias: Double, alpha: Double, beta: Double) = this()
    
    var alpha: Double = js.native
    
    var beta: Double = js.native
    
    var bias: Double = js.native
    
    var depth: Double = js.native
    
    var depthRadius: Double = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
