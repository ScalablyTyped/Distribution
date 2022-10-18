package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.Type
import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.distOpsConvUtilMod.Conv2DInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConvPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/conv_packed_gpu", "Conv2DPackedProgram")
  @js.native
  open class Conv2DPackedProgram protected ()
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
    def this(
      convInfo: Conv2DInfo,
      addBias: Boolean,
      activation: String,
      hasPreluActivation: Boolean,
      hasLeakyReluAlpha: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: Boolean,
      activation: String,
      hasPreluActivation: Unit,
      hasLeakyReluAlpha: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: Boolean,
      activation: Unit,
      hasPreluActivation: Boolean,
      hasLeakyReluAlpha: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: Boolean,
      activation: Unit,
      hasPreluActivation: Unit,
      hasLeakyReluAlpha: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: Unit,
      activation: String,
      hasPreluActivation: Boolean,
      hasLeakyReluAlpha: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: Unit,
      activation: String,
      hasPreluActivation: Unit,
      hasLeakyReluAlpha: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: Unit,
      activation: Unit,
      hasPreluActivation: Boolean,
      hasLeakyReluAlpha: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: Unit,
      activation: Unit,
      hasPreluActivation: Unit,
      hasLeakyReluAlpha: Boolean
    ) = this()
    
    @JSName("customUniforms")
    var customUniforms_Conv2DPackedProgram: js.Array[Type] = js.native
    
    @JSName("enableShapeUniforms")
    var enableShapeUniforms_Conv2DPackedProgram: Boolean = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_Conv2DPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_Conv2DPackedProgram: Boolean = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
