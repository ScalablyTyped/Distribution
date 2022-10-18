package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.max
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.min
import typings.tensorflowTfjsCore.distOpsReduceUtilMod.ReduceInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distArgminmaxGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/argminmax_gpu", "ArgMinMaxProgram")
  @js.native
  open class ArgMinMaxProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(reduceInfo: ReduceInfo, op: max | min, firstPass: Boolean) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
