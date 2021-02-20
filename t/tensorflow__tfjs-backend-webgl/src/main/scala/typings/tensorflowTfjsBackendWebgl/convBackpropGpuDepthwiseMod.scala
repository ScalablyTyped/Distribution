package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convBackpropGpuDepthwiseMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/conv_backprop_gpu_depthwise", "DepthwiseConv2DDerFilterProgram")
  @js.native
  class DepthwiseConv2DDerFilterProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv2DInfo) = this()
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/conv_backprop_gpu_depthwise", "DepthwiseConv2DDerInputProgram")
  @js.native
  class DepthwiseConv2DDerInputProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv2DInfo) = this()
  }
}
