package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/FromPixels_utils/from_pixels_packed_gpu", JSImport.Namespace)
@js.native
object fromPixelsPackedGpuMod extends js.Object {
  
  @js.native
  class FromPixelsPackedProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Array[Double]) = this()
    
    @JSName("packedInputs")
    var packedInputs_FromPixelsPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_FromPixelsPackedProgram: Boolean = js.native
  }
}
