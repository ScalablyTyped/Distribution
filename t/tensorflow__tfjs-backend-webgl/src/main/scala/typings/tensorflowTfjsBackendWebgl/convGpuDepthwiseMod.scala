package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/conv_gpu_depthwise", JSImport.Namespace)
@js.native
object convGpuDepthwiseMod extends js.Object {
  
  @js.native
  class DepthwiseConv2DProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv2DInfo) = this()
    def this(convInfo: Conv2DInfo, addBias: Boolean) = this()
    def this(convInfo: Conv2DInfo, addBias: js.UndefOr[scala.Nothing], activation: String) = this()
    def this(convInfo: Conv2DInfo, addBias: Boolean, activation: String) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: js.UndefOr[scala.Nothing],
      activation: js.UndefOr[scala.Nothing],
      hasPreluActivation: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: js.UndefOr[scala.Nothing],
      activation: String,
      hasPreluActivation: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: Boolean,
      activation: js.UndefOr[scala.Nothing],
      hasPreluActivation: Boolean
    ) = this()
    def this(convInfo: Conv2DInfo, addBias: Boolean, activation: String, hasPreluActivation: Boolean) = this()
  }
}
