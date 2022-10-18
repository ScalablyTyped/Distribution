package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBinaryopPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_packed_gpu", "BinaryOpPackedProgram")
  @js.native
  open class BinaryOpPackedProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(op: String, aShape: js.Array[Double], bShape: js.Array[Double]) = this()
    def this(op: String, aShape: js.Array[Double], bShape: js.Array[Double], checkOutOfBounds: Boolean) = this()
    
    @JSName("enableShapeUniforms")
    var enableShapeUniforms_BinaryOpPackedProgram: Boolean = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_BinaryOpPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_BinaryOpPackedProgram: Boolean = js.native
    
    var supportsBroadcasting: Boolean = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_packed_gpu", "CHECK_NAN_SNIPPET_PACKED")
  @js.native
  val CHECK_NAN_SNIPPET_PACKED: /* "\n  result.r = isNaN.r ? NAN : result.r;\n  result.g = isNaN.g ? NAN : result.g;\n  result.b = isNaN.b ? NAN : result.b;\n  result.a = isNaN.a ? NAN : result.a;\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_packed_gpu", "ELU_DER")
  @js.native
  val ELU_DER: /* "\n  vec4 bGTEZero = vec4(greaterThanEqual(b, vec4(0.)));\n  return (bGTEZero * a) + ((vec4(1.0) - bGTEZero) * (a * (b + vec4(1.0))));\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_packed_gpu", "NOT_EQUAL")
  @js.native
  val NOT_EQUAL: /* "\n  return vec4(notEqual(a, b));\n" */ String = js.native
}
