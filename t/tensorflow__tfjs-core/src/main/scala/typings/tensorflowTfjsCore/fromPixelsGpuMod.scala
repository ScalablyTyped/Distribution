package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/from_pixels_gpu", JSImport.Namespace)
@js.native
object fromPixelsGpuMod extends js.Object {
  @js.native
  class FromPixelsProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Array[Double]) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

