package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/resize_bilinear_packed_gpu", JSImport.Namespace)
@js.native
object resizeBilinearPackedGpuMod extends js.Object {
  
  @js.native
  class ResizeBilinearPackedProgram protected () extends GPGPUProgram {
    def this(
      inputShape: js.Tuple4[Double, Double, Double, Double],
      newHeight: Double,
      newWidth: Double,
      alignCorners: Boolean
    ) = this()
    
    @JSName("packedInputs")
    var packedInputs_ResizeBilinearPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_ResizeBilinearPackedProgram: Boolean = js.native
  }
}
