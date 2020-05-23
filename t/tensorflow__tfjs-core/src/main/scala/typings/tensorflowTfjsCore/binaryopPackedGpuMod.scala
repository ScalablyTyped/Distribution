package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/binaryop_packed_gpu", JSImport.Namespace)
@js.native
object binaryopPackedGpuMod extends js.Object {
  @js.native
  class BinaryOpPackedProgram protected () extends GPGPUProgram {
    def this(op: String, aShape: js.Array[Double], bShape: js.Array[Double]) = this()
    def this(op: String, aShape: js.Array[Double], bShape: js.Array[Double], checkOutOfBounds: Boolean) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    @JSName("packedInputs")
    var packedInputs_BinaryOpPackedProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_BinaryOpPackedProgram: Boolean = js.native
    var supportsBroadcasting: Boolean = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
  val ATAN2: String = js.native
  val DIV: /* "\n  // vec4 one = vec4(equal(a, b));\n  // return one + (vec4(1.0) - one) * a / b;\n  vec4 result = a / b;\n  if(a.x == b.x) {\n    result.x = 1.;\n  }\n  if(a.y == b.y) {\n    result.y = 1.;\n  }\n  if(a.z == b.z) {\n    result.z = 1.;\n  }\n  if(a.w == b.w) {\n    result.w = 1.;\n  }\n\n  return result;\n" */ String = js.native
  val ELU_DER: /* "\n  vec4 bGTEZero = vec4(greaterThanEqual(b, vec4(0.)));\n  return (bGTEZero * a) + ((vec4(1.0) - bGTEZero) * (a * (b + vec4(1.0))));\n" */ String = js.native
  val EQUAL: /* "\n  return vec4(equal(a, b));\n" */ String = js.native
  val GREATER: /* "\n  return vec4(greaterThan(a, b));\n" */ String = js.native
  val GREATER_EQUAL: /* "\n  return vec4(greaterThanEqual(a, b));\n" */ String = js.native
  val INT_DIV: /* "\n  ivec4 ia = round(a);\n  ivec4 ib = round(b);\n  bvec4 cond = notEqual(ib, ivec4(0));\n  ivec4 result = ivec4(0);\n  vec4 s = sign(a) * sign(b);\n\n  // Windows (D3D) wants guaranteed non-zero int division at compile-time.\n  if (cond[0]) {\n    result[0] = idiv(ia[0], ib[0], s[0]);\n  }\n  if (cond[1]) {\n    result[1] = idiv(ia[1], ib[1], s[1]);\n  }\n  if (cond[2]) {\n    result[2] = idiv(ia[2], ib[2], s[2]);\n  }\n  if (cond[3]) {\n    result[3] = idiv(ia[3], ib[3], s[3]);\n  }\n  return vec4(result);\n" */ String = js.native
  val LESS: /* "\n  return vec4(lessThan(a, b));\n" */ String = js.native
  val LESS_EQUAL: /* "\n  return vec4(lessThanEqual(a, b));\n" */ String = js.native
  val LOGICAL_AND: /* "\n  return vec4(\n    vec4(greaterThanEqual(a, vec4(1.0))) *\n    vec4(greaterThanEqual(b, vec4(1.0))));\n" */ String = js.native
  val LOGICAL_OR: /* "\n  return min(\n    vec4(greaterThanEqual(a, vec4(1.0))) +\n    vec4(greaterThanEqual(b, vec4(1.0))),\n    vec4(1.0));\n" */ String = js.native
  val MAX: String = js.native
  val MIN: String = js.native
  val MOD: String = js.native
  val NOT_EQUAL: /* "\n  return vec4(notEqual(a, b));\n" */ String = js.native
  val POW: String = js.native
  val PRELU: /* "\n  vec4 aLessThanZero = vec4(lessThan(a, vec4(0.)));\n  return (aLessThanZero * (b * a)) + ((vec4(1.0) - aLessThanZero) * a);\n" */ String = js.native
}

