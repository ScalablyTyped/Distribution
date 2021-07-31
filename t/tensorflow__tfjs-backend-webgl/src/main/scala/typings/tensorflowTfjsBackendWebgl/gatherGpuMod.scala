package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gatherGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gather_gpu", "GatherProgram")
  @js.native
  class GatherProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(aShape: js.Array[Double], indicesLength: Double, axis: Double) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    var rank: Double = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
