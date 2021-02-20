package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convPackedGpuDepthwiseMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/conv_packed_gpu_depthwise", "DepthwiseConvPacked2DProgram")
  @js.native
  class DepthwiseConvPacked2DProgram protected () extends GPGPUProgram {
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
    
    @JSName("packedInputs")
    var packedInputs_DepthwiseConvPacked2DProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_DepthwiseConvPacked2DProgram: Boolean = js.native
  }
}
