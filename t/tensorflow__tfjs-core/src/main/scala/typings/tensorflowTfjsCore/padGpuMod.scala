package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/pad_gpu", JSImport.Namespace)
@js.native
object padGpuMod extends js.Object {
  @js.native
  class PadProgram protected () extends GPGPUProgram {
    def this(xShape: js.Array[Double], paddings: js.Array[js.Tuple2[Double, Double]], constantValue: Double) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

