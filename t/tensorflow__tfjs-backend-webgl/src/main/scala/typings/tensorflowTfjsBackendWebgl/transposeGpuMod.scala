package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-webgl/dist/transpose_gpu", JSImport.Namespace)
@js.native
object transposeGpuMod extends js.Object {
  @js.native
  class TransposeProgram protected () extends GPGPUProgram {
    def this(aShape: js.Array[Double], newDim: js.Array[Double]) = this()
    var rank: Double = js.native
  }
  
}

