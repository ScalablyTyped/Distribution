package typings.tensorflowTfjsCore

import typings.std.WebGLUniformLocation
import typings.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/onehot_gpu", JSImport.Namespace)
@js.native
object onehotGpuMod extends js.Object {
  @js.native
  class OneHotProgram protected () extends GPGPUProgram {
    def this(numIndices: Double, depth: Double, onValue: Double, offValue: Double) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    var seedLoc: WebGLUniformLocation = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

