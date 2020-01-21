package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.texUtilMod.TextureUsage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/encode_float_packed_gpu", JSImport.Namespace)
@js.native
object encodeFloatPackedGpuMod extends js.Object {
  @js.native
  class EncodeFloatPackedProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Tuple3[Double, Double, Double]) = this()
    @JSName("outTexUsage")
    var outTexUsage_EncodeFloatPackedProgram: TextureUsage = js.native
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    @JSName("packedInputs")
    var packedInputs_EncodeFloatPackedProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_EncodeFloatPackedProgram: Boolean = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

