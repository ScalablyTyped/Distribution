package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/pack_gpu", JSImport.Namespace)
@js.native
object packGpuMod extends js.Object {
  
  @js.native
  class PackProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Array[Double]) = this()
    
    @JSName("packedInputs")
    var packedInputs_PackProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_PackProgram: Boolean = js.native
  }
}
