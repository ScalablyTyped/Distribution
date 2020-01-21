package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.reduceUtilMod.ReduceInfo
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.max
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/argminmax_gpu", JSImport.Namespace)
@js.native
object argminmaxGpuMod extends js.Object {
  @js.native
  class ArgMinMaxProgram protected () extends GPGPUProgram {
    def this(reduceInfo: ReduceInfo, op: max, firstPass: Boolean) = this()
    def this(reduceInfo: ReduceInfo, op: min, firstPass: Boolean) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

