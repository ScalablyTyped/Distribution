package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/resize_bilinear_backprop_gpu", JSImport.Namespace)
@js.native
object resizeBilinearBackpropGpuMod extends js.Object {
  @js.native
  class ResizeBilinearBackpropProgram protected () extends GPGPUProgram {
    def this(dy: Tensor4D, x: Tensor4D, alignCorners: Boolean) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

