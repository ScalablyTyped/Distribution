package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typings.tensorflowTfjsCore.convUtilMod.Conv3DInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-webgl/dist/max_pool_backprop_gpu", JSImport.Namespace)
@js.native
object maxPoolBackpropGpuMod extends js.Object {
  @js.native
  class MaxPool2DBackpropProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv2DInfo) = this()
  }
  
  @js.native
  class MaxPool3DBackpropProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv3DInfo) = this()
  }
  
}

