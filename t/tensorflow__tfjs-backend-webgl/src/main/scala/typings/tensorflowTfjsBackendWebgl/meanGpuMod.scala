package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.reduceUtilMod.ReduceInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meanGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/mean_gpu", "MeanProgram")
  @js.native
  open class MeanProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(reduceInfo: ReduceInfo) = this()
    def this(reduceInfo: ReduceInfo, divisor: Double) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
