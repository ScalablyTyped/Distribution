package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typings.tensorflowTfjsCore.convUtilMod.Conv3DInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convBackpropGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/conv_backprop_gpu", "Conv2DDerFilterProgram")
  @js.native
  class Conv2DDerFilterProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv2DInfo) = this()
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/conv_backprop_gpu", "Conv2DDerInputProgram")
  @js.native
  class Conv2DDerInputProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv2DInfo) = this()
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/conv_backprop_gpu", "Conv3DDerFilterProgram")
  @js.native
  class Conv3DDerFilterProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv3DInfo) = this()
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/conv_backprop_gpu", "Conv3DDerInputProgram")
  @js.native
  class Conv3DDerInputProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv3DInfo) = this()
  }
}
