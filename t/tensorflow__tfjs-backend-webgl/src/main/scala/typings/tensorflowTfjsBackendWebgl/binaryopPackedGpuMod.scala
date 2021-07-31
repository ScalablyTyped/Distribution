package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binaryopPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_packed_gpu", "BinaryOpPackedProgram")
  @js.native
  class BinaryOpPackedProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(op: String, aShape: js.Array[Double], bShape: js.Array[Double]) = this()
    def this(op: String, aShape: js.Array[Double], bShape: js.Array[Double], checkOutOfBounds: Boolean) = this()
    
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
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_packed_gpu", "ELU_DER")
  @js.native
  val ELU_DER: /* "\n  vec4 bGTEZero = vec4(greaterThanEqual(b, vec4(0.)));\n  return (bGTEZero * a) + ((vec4(1.0) - bGTEZero) * (a * (b + vec4(1.0))));\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_packed_gpu", "EQUAL")
  @js.native
  val EQUAL: /* "\n  return vec4(equal(a, b));\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_packed_gpu", "GREATER")
  @js.native
  val GREATER: /* "\n  return vec4(greaterThan(a, b));\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_packed_gpu", "GREATER_EQUAL")
  @js.native
  val GREATER_EQUAL: /* "\n  return vec4(greaterThanEqual(a, b));\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_packed_gpu", "INT_DIV")
  @js.native
  val INT_DIV: /* "\n  ivec4 ia = round(a);\n  ivec4 ib = round(b);\n  bvec4 cond = notEqual(ib, ivec4(0));\n  ivec4 result = ivec4(0);\n  vec4 s = sign(a) * sign(b);\n\n  // Windows (D3D) wants guaranteed non-zero int division at compile-time.\n  if (cond[0]) {\n    result[0] = idiv(ia[0], ib[0], s[0]);\n  }\n  if (cond[1]) {\n    result[1] = idiv(ia[1], ib[1], s[1]);\n  }\n  if (cond[2]) {\n    result[2] = idiv(ia[2], ib[2], s[2]);\n  }\n  if (cond[3]) {\n    result[3] = idiv(ia[3], ib[3], s[3]);\n  }\n  return vec4(result);\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_packed_gpu", "LESS")
  @js.native
  val LESS: /* "\n  return vec4(lessThan(a, b));\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_packed_gpu", "LESS_EQUAL")
  @js.native
  val LESS_EQUAL: /* "\n  return vec4(lessThanEqual(a, b));\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_packed_gpu", "LOGICAL_AND")
  @js.native
  val LOGICAL_AND: /* "\n  return vec4(\n    vec4(greaterThanEqual(a, vec4(1.0))) *\n    vec4(greaterThanEqual(b, vec4(1.0))));\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_packed_gpu", "LOGICAL_OR")
  @js.native
  val LOGICAL_OR: /* "\n  return min(\n    vec4(greaterThanEqual(a, vec4(1.0))) +\n    vec4(greaterThanEqual(b, vec4(1.0))),\n    vec4(1.0));\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_packed_gpu", "MAX")
  @js.native
  val MAX: String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_packed_gpu", "MIN")
  @js.native
  val MIN: String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_packed_gpu", "MOD")
  @js.native
  val MOD: String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_packed_gpu", "NOT_EQUAL")
  @js.native
  val NOT_EQUAL: /* "\n  return vec4(notEqual(a, b));\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_packed_gpu", "POW")
  @js.native
  val POW: String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_packed_gpu", "PRELU")
  @js.native
  val PRELU: /* "\n  vec4 aLessThanZero = vec4(lessThan(a, vec4(0.)));\n  return (aLessThanZero * (b * a)) + ((vec4(1.0) - aLessThanZero) * a);\n" */ String = js.native
}
