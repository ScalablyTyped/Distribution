package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStridedSliceGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/strided_slice_gpu", "StridedSliceProgram")
  @js.native
  open class StridedSliceProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(begin: js.Array[Double], strides: js.Array[Double], size: js.Array[Double]) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
