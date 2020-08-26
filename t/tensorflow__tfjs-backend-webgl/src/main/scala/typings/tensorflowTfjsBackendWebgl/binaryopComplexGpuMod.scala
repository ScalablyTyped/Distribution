package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_complex_gpu", JSImport.Namespace)
@js.native
object binaryopComplexGpuMod extends js.Object {
  @js.native
  class BinaryOpComplexProgram protected () extends GPGPUProgram {
    def this(op: String, aShape: js.Array[Double], bShape: js.Array[Double]) = this()
  }
  
  @js.native
  object COMPLEX_MULTIPLY extends js.Object {
    var IMAG: String = js.native
    var REAL: String = js.native
  }
  
}

