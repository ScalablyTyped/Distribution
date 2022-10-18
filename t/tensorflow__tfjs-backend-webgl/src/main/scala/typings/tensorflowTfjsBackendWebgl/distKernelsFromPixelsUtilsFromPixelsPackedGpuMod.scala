package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsFromPixelsUtilsFromPixelsPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/FromPixels_utils/from_pixels_packed_gpu", "FromPixelsPackedProgram")
  @js.native
  open class FromPixelsPackedProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(outputShape: js.Array[Double]) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_FromPixelsPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_FromPixelsPackedProgram: Boolean = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
