package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/strided_slice_gpu", JSImport.Namespace)
@js.native
object stridedSliceGpuMod extends js.Object {
  @js.native
  class StridedSliceProgram protected () extends GPGPUProgram {
    def this(begin: js.Array[Double], strides: js.Array[Double], size: js.Array[Double]) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

