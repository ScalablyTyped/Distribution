package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typings.tensorflowTfjsCore.convUtilMod.Conv3DInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/conv_gpu", "Conv2DProgram")
  @js.native
  class Conv2DProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv2DInfo) = this()
    def this(convInfo: Conv2DInfo, addBias: Boolean) = this()
    def this(convInfo: Conv2DInfo, addBias: js.UndefOr[scala.Nothing], activation: String) = this()
    def this(convInfo: Conv2DInfo, addBias: Boolean, activation: String) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: js.UndefOr[scala.Nothing],
      activation: js.UndefOr[scala.Nothing],
      hasPreluActivationWeights: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: js.UndefOr[scala.Nothing],
      activation: String,
      hasPreluActivationWeights: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: Boolean,
      activation: js.UndefOr[scala.Nothing],
      hasPreluActivationWeights: Boolean
    ) = this()
    def this(convInfo: Conv2DInfo, addBias: Boolean, activation: String, hasPreluActivationWeights: Boolean) = this()
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/conv_gpu", "Conv3DProgram")
  @js.native
  class Conv3DProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv3DInfo) = this()
  }
}
