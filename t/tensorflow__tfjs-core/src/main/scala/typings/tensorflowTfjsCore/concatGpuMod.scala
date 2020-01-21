package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/concat_gpu", JSImport.Namespace)
@js.native
object concatGpuMod extends js.Object {
  @js.native
  class ConcatProgram protected () extends GPGPUProgram {
    def this(shapes: js.Array[js.Tuple2[Double, Double]]) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

