package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/binaryop_complex_gpu", JSImport.Namespace)
@js.native
object distBackendsWebglBinaryopUnderscoreComplexUnderscoreGpuMod extends js.Object {
  @js.native
  class BinaryOpComplexProgram protected () extends GPGPUProgram {
    def this(op: String, aShape: js.Array[Double], bShape: js.Array[Double]) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
  @js.native
  object COMPLEX_MULTIPLY extends js.Object {
    var IMAG: String = js.native
    var REAL: String = js.native
  }
  
}

