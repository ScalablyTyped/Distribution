package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUnaryopPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_packed_gpu", "ELU")
  @js.native
  val ELU: /* "\n  vec4 result;\n\n  result.r = (x.r >= 0.0) ? x.r : (exp(x.r) - 1.0);\n  result.g = (x.g >= 0.0) ? x.g : (exp(x.g) - 1.0);\n  result.b = (x.b >= 0.0) ? x.b : (exp(x.b) - 1.0);\n  result.a = (x.a >= 0.0) ? x.a : (exp(x.a) - 1.0);\n\n  return result;\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_packed_gpu", "LINEAR")
  @js.native
  val LINEAR: /* "return x;" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_packed_gpu", "RELU")
  @js.native
  val RELU: /* "\n  vec4 result = x * vec4(greaterThanEqual(x, vec4(0.0)));\n  bvec4 isNaN = isnan(x);\n\n  result.r = isNaN.r ? x.r : result.r;\n  result.g = isNaN.g ? x.g : result.g;\n  result.b = isNaN.b ? x.b : result.b;\n  result.a = isNaN.a ? x.a : result.a;\n\n  return result;\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_packed_gpu", "RELU6")
  @js.native
  val RELU6: /* "\n  vec4 result = min(x, vec4(6.)) * vec4(greaterThanEqual(x, vec4(0.0)));\n  bvec4 isNaN = isnan(x);\n\n  result.r = isNaN.r ? x.r : result.r;\n  result.g = isNaN.g ? x.g : result.g;\n  result.b = isNaN.b ? x.b : result.b;\n  result.a = isNaN.a ? x.a : result.a;\n\n  return result;\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_packed_gpu", "SIGMOID")
  @js.native
  val SIGMOID: /* "return 1.0 / (1.0 + exp(-1.0 * x));" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_packed_gpu", "UnaryOpPackedProgram")
  @js.native
  open class UnaryOpPackedProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(aShape: js.Array[Double], opSnippet: String) = this()
    
    @JSName("enableShapeUniforms")
    var enableShapeUniforms_UnaryOpPackedProgram: Boolean = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_UnaryOpPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_UnaryOpPackedProgram: Boolean = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
