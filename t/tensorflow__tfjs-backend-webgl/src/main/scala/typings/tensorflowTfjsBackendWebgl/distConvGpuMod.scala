package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.distOpsConvUtilMod.Conv2DInfo
import typings.tensorflowTfjsCore.distOpsConvUtilMod.Conv3DInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConvGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/conv_gpu", "Conv2DProgram")
  @js.native
  open class Conv2DProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(convInfo: Conv2DInfo) = this()
    def this(convInfo: Conv2DInfo, addBias: Boolean) = this()
    def this(convInfo: Conv2DInfo, addBias: Boolean, activation: String) = this()
    def this(convInfo: Conv2DInfo, addBias: Unit, activation: String) = this()
    def this(convInfo: Conv2DInfo, addBias: Boolean, activation: String, hasPreluActivationWeights: Boolean) = this()
    def this(convInfo: Conv2DInfo, addBias: Boolean, activation: Unit, hasPreluActivationWeights: Boolean) = this()
    def this(convInfo: Conv2DInfo, addBias: Unit, activation: String, hasPreluActivationWeights: Boolean) = this()
    def this(convInfo: Conv2DInfo, addBias: Unit, activation: Unit, hasPreluActivationWeights: Boolean) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: Boolean,
      activation: String,
      hasPreluActivationWeights: Boolean,
      hasLeakyreluAlpha: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: Boolean,
      activation: String,
      hasPreluActivationWeights: Unit,
      hasLeakyreluAlpha: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: Boolean,
      activation: Unit,
      hasPreluActivationWeights: Boolean,
      hasLeakyreluAlpha: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: Boolean,
      activation: Unit,
      hasPreluActivationWeights: Unit,
      hasLeakyreluAlpha: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: Unit,
      activation: String,
      hasPreluActivationWeights: Boolean,
      hasLeakyreluAlpha: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: Unit,
      activation: String,
      hasPreluActivationWeights: Unit,
      hasLeakyreluAlpha: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: Unit,
      activation: Unit,
      hasPreluActivationWeights: Boolean,
      hasLeakyreluAlpha: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: Unit,
      activation: Unit,
      hasPreluActivationWeights: Unit,
      hasLeakyreluAlpha: Boolean
    ) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/conv_gpu", "Conv3DProgram")
  @js.native
  open class Conv3DProgram protected ()
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
