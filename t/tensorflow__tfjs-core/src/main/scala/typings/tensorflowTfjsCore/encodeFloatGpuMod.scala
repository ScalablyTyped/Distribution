package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.texUtilMod.TextureUsage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/encode_float_gpu", JSImport.Namespace)
@js.native
object encodeFloatGpuMod extends js.Object {
  @js.native
  class EncodeFloatProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Array[Double]) = this()
    @JSName("outTexUsage")
    var outTexUsage_EncodeFloatProgram: TextureUsage = js.native
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

