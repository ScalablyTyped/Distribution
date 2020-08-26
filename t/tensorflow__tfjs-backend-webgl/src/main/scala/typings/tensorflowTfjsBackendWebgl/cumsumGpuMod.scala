package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-webgl/dist/cumsum_gpu", JSImport.Namespace)
@js.native
object cumsumGpuMod extends js.Object {
  @js.native
  class CumSumProgram protected () extends GPGPUProgram {
    def this(shape: js.Array[Double], exclusive: Boolean, reverse: Boolean) = this()
  }
  
}

