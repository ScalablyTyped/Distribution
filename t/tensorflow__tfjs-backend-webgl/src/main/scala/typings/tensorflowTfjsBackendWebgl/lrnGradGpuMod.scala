package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/lrn_grad_gpu", JSImport.Namespace)
@js.native
object lrnGradGpuMod extends js.Object {
  
  @js.native
  class LRNGradProgram protected () extends GPGPUProgram {
    def this(inputShape: js.Array[Double], depthRadius: Double, bias: Double, alpha: Double, beta: Double) = this()
    
    var alpha: Double = js.native
    
    var beta: Double = js.native
    
    var bias: Double = js.native
    
    var depth: Double = js.native
    
    var depthRadius: Double = js.native
  }
}
