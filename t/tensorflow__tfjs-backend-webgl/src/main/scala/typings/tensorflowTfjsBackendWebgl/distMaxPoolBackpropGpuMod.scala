package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.distOpsConvUtilMod.Conv2DInfo
import typings.tensorflowTfjsCore.distOpsConvUtilMod.Conv3DInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMaxPoolBackpropGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/max_pool_backprop_gpu", "MaxPool2DBackpropProgram")
  @js.native
  open class MaxPool2DBackpropProgram protected ()
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
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/max_pool_backprop_gpu", "MaxPool3DBackpropProgram")
  @js.native
  open class MaxPool3DBackpropProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(convInfo: Conv3DInfo) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
