package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distResizeBilinearBackpropGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/resize_bilinear_backprop_gpu", "ResizeBilinearBackpropProgram")
  @js.native
  open class ResizeBilinearBackpropProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(
      dyShape: js.Tuple4[Double, Double, Double, Double],
      inputShape: js.Tuple4[Double, Double, Double, Double],
      alignCorners: Boolean
    ) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
