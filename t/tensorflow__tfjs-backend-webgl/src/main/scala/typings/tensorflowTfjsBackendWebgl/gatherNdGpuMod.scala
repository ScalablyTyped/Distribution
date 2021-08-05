package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gatherNdGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gather_nd_gpu", "GatherNDProgram")
  @js.native
  class GatherNDProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(sliceDim: Double, strides: js.Array[Double], shape: js.Array[Double]) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* private */ var sliceDim: js.Any = js.native
    
    /* private */ var strides: js.Any = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
