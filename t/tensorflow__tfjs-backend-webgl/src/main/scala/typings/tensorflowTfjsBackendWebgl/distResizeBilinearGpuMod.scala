package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distResizeBilinearGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/resize_bilinear_gpu", "ResizeBilinearProgram")
  @js.native
  open class ResizeBilinearProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(
      inputShape: js.Tuple4[Double, Double, Double, Double],
      newHeight: Double,
      newWidth: Double,
      alignCorners: Boolean,
      halfPixelCenters: Boolean
    ) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
