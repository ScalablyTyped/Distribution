package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/lrn_grad_gpu", JSImport.Namespace)
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
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

