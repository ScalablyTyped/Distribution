package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convGpuDepthwiseMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/conv_gpu_depthwise", "DepthwiseConv2DProgram")
  @js.native
  class DepthwiseConv2DProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(convInfo: Conv2DInfo) = this()
    def this(convInfo: Conv2DInfo, addBias: Boolean) = this()
    def this(convInfo: Conv2DInfo, addBias: Boolean, activation: String) = this()
    def this(convInfo: Conv2DInfo, addBias: Unit, activation: String) = this()
    def this(convInfo: Conv2DInfo, addBias: Boolean, activation: String, hasPreluActivation: Boolean) = this()
    def this(convInfo: Conv2DInfo, addBias: Boolean, activation: Unit, hasPreluActivation: Boolean) = this()
    def this(convInfo: Conv2DInfo, addBias: Unit, activation: String, hasPreluActivation: Boolean) = this()
    def this(convInfo: Conv2DInfo, addBias: Unit, activation: Unit, hasPreluActivation: Boolean) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
