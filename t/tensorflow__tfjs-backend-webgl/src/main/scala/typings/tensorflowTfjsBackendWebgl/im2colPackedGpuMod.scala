package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/im2col_packed_gpu", JSImport.Namespace)
@js.native
object im2colPackedGpuMod extends js.Object {
  
  @js.native
  class Im2ColPackedProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Array[Double], inputShape: js.Array[Double], convInfo: Conv2DInfo) = this()
    
    @JSName("packedInputs")
    var packedInputs_Im2ColPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_Im2ColPackedProgram: Boolean = js.native
  }
}
