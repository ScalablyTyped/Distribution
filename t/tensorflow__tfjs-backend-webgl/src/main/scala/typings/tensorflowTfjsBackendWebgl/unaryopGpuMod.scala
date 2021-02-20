package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unaryopGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "ABS")
  @js.native
  val ABS: /* "return abs(x);" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "ACOS")
  @js.native
  val ACOS: String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "ACOSH")
  @js.native
  val ACOSH: String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "ASIN")
  @js.native
  val ASIN: String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "ASINH")
  @js.native
  val ASINH: String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "ATAN")
  @js.native
  val ATAN: String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "ATANH")
  @js.native
  val ATANH: String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "CEIL")
  @js.native
  val CEIL: /* "return ceil(x);" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "CLONE")
  @js.native
  val CLONE: /* "return x;" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "COSH")
  @js.native
  val COSH: /* "\n  float e2x = exp(-x);\n  return (e2x + 1.0 / e2x) / 2.0;\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "ELU")
  @js.native
  val ELU: /* "return (x >= 0.0) ? x : (exp(x) - 1.0);" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "ERF")
  @js.native
  val ERF: String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "EXP")
  @js.native
  val EXP: /* "return exp(x);" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "EXPM1")
  @js.native
  val EXPM1: /* "return exp(x) - 1.0;" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "FLOOR")
  @js.native
  val FLOOR: /* "return floor(x);" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "IS_FINITE")
  @js.native
  val IS_FINITE: /* "return float(!isnan(x) && !isinf(x));" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "IS_INF")
  @js.native
  val IS_INF: /* "return float(isinf(x));" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "IS_NAN")
  @js.native
  val IS_NAN: /* "return float(isnan(x));" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "LINEAR")
  @js.native
  val LINEAR: /* "return x;" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "LOG")
  @js.native
  val LOG: /* "if (x < 0.0) return NAN;\n  return log(x);" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "LOG1P")
  @js.native
  val LOG1P: /* "return log(1.0 + x);" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "LOGICAL_NOT")
  @js.native
  val LOGICAL_NOT: /* "return float(!(x >= 1.0));" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "NEG")
  @js.native
  val NEG: /* "return -x;" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "RECIPROCAL")
  @js.native
  val RECIPROCAL: /* "return 1.0 / x;" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "RELU")
  @js.native
  val RELU: String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "RELU6")
  @js.native
  val RELU6: String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "ROUND")
  @js.native
  val ROUND: /* "\n  // OpenGL ES does not support round function.\n  // The algorithm is based on banker's rounding.\n  float base = floor(x);\n  if ((x - base) < 0.5) {\n    return floor(x);\n  } else if ((x - base) > 0.5) {\n    return ceil(x);\n  } else {\n    if (mod(base, 2.0) == 0.0) {\n      return base;\n    } else {\n      return base + 1.0;\n    }\n  }\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "RSQRT")
  @js.native
  val RSQRT: /* "return inversesqrt(x);" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "SELU")
  @js.native
  val SELU: String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "SIGMOID")
  @js.native
  val SIGMOID: /* "return 1.0 / (1.0 + exp(-1.0 * x));" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "SIGN")
  @js.native
  val SIGN: /* "\n  if (isnan(x)) { return 0.0; }\n  return sign(x);\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "SINH")
  @js.native
  val SINH: /* "\n  float e2x = exp(x);\n  return (e2x - 1.0 / e2x) / 2.0;\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "SOFTPLUS")
  @js.native
  val SOFTPLUS: /* "\n  float epsilon = 1.1920928955078125e-7;\n  float threshold = log(epsilon) + 2.0;\n\n  bool too_large = x > -threshold;\n  bool too_small = x < threshold;\n\n  float result;\n  float exp_x = exp(x);\n\n  if (too_large){\n    result = x;\n  }\n  else if (too_small){\n    result = exp_x;\n  }\n  else{\n    result = log(exp_x + 1.0);\n  }\n  return result;\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "SQRT")
  @js.native
  val SQRT: /* "return sqrt(x);" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "STEP")
  @js.native
  def STEP(): String = js.native
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "STEP")
  @js.native
  def STEP(alpha: Double): String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "TANH")
  @js.native
  val TANH: /* "\n  float e2x = exp(-2.0 * abs(x));\n  return sign(x) * (1.0 - e2x) / (1.0 + e2x);\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "UnaryOpProgram")
  @js.native
  class UnaryOpProgram protected () extends GPGPUProgram {
    def this(aShape: js.Array[Double], opSnippet: String) = this()
  }
}
