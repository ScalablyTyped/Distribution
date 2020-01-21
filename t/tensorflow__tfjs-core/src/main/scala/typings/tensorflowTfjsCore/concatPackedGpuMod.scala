package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/concat_packed_gpu", JSImport.Namespace)
@js.native
object concatPackedGpuMod extends js.Object {
  @js.native
  class ConcatPackedProgram protected () extends GPGPUProgram {
    def this(shapes: js.Array[js.Array[Double]], axis: Double) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    @JSName("packedInputs")
    var packedInputs_ConcatPackedProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_ConcatPackedProgram: Boolean = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

