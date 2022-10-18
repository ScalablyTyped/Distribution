package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.distOpsConvUtilMod.Conv2DInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDilationGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/dilation_gpu", "Dilation2DProgram")
  @js.native
  open class Dilation2DProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(convInfo: Conv2DInfo) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
