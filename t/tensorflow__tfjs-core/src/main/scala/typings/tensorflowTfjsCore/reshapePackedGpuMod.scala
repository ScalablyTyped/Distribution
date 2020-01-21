package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/reshape_packed_gpu", JSImport.Namespace)
@js.native
object reshapePackedGpuMod extends js.Object {
  @js.native
  class ReshapePackedProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Tuple3[Double, Double, Double], inputShape: js.Tuple3[Double, Double, Double]) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    @JSName("packedInputs")
    var packedInputs_ReshapePackedProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_ReshapePackedProgram: Boolean = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

