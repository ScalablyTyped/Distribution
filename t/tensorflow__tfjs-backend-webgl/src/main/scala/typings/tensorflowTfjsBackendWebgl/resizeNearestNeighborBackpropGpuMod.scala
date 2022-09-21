package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeNearestNeighborBackpropGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/resize_nearest_neighbor_backprop_gpu", "ResizeNearestNeigborBackpropProgram")
  @js.native
  open class ResizeNearestNeigborBackpropProgram protected ()
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
