package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", JSImport.Namespace)
@js.native
object unaryopGpuMod extends js.Object {
  
  val ABS: /* "return abs(x);" */ String = js.native
  
  val ACOS: String = js.native
  
  val ACOSH: String = js.native
  
  val ASIN: String = js.native
  
  val ASINH: String = js.native
  
  val ATAN: String = js.native
  
  val ATANH: String = js.native
  
  val CEIL: /* "return ceil(x);" */ String = js.native
  
  val CLONE: /* "return x;" */ String = js.native
  
  val COSH: /* "\n  float e2x = exp(-x);\n  return (e2x + 1.0 / e2x) / 2.0;\n" */ String = js.native
  
  val ELU: /* "return (x >= 0.0) ? x : (exp(x) - 1.0);" */ String = js.native
  
  val ERF: String = js.native
  
  val EXP: /* "return exp(x);" */ String = js.native
  
  val EXPM1: /* "return exp(x) - 1.0;" */ String = js.native
  
  val FLOOR: /* "return floor(x);" */ String = js.native
  
  val IS_FINITE: /* "return float(!isnan(x) && !isinf(x));" */ String = js.native
  
  val IS_INF: /* "return float(isinf(x));" */ String = js.native
  
  val IS_NAN: /* "return float(isnan(x));" */ String = js.native
  
  val LINEAR: /* "return x;" */ String = js.native
  
  val LOG: /* "if (x < 0.0) return NAN;\n  return log(x);" */ String = js.native
  
  val LOG1P: /* "return log(1.0 + x);" */ String = js.native
  
  val LOGICAL_NOT: /* "return float(!(x >= 1.0));" */ String = js.native
  
  val NEG: /* "return -x;" */ String = js.native
  
  val RECIPROCAL: /* "return 1.0 / x;" */ String = js.native
  
  val RELU: String = js.native
  
  val RELU6: String = js.native
  
  val ROUND: /* "\n  // OpenGL ES does not support round function.\n  // The algorithm is based on banker's rounding.\n  float base = floor(x);\n  if ((x - base) < 0.5) {\n    return floor(x);\n  } else if ((x - base) > 0.5) {\n    return ceil(x);\n  } else {\n    if (mod(base, 2.0) == 0.0) {\n      return base;\n    } else {\n      return base + 1.0;\n    }\n  }\n" */ String = js.native
  
  val RSQRT: /* "return inversesqrt(x);" */ String = js.native
  
  val SELU: String = js.native
  
  val SIGMOID: /* "return 1.0 / (1.0 + exp(-1.0 * x));" */ String = js.native
  
  val SIGN: /* "\n  if (isnan(x)) { return 0.0; }\n  return sign(x);\n" */ String = js.native
  
  val SINH: /* "\n  float e2x = exp(x);\n  return (e2x - 1.0 / e2x) / 2.0;\n" */ String = js.native
  
  val SOFTPLUS: /* "\n  float epsilon = 1.1920928955078125e-7;\n  float threshold = log(epsilon) + 2.0;\n\n  bool too_large = x > -threshold;\n  bool too_small = x < threshold;\n\n  float result;\n  float exp_x = exp(x);\n\n  if (too_large){\n    result = x;\n  }\n  else if (too_small){\n    result = exp_x;\n  }\n  else{\n    result = log(exp_x + 1.0);\n  }\n  return result;\n" */ String = js.native
  
  val SQRT: /* "return sqrt(x);" */ String = js.native
  
  def STEP(): String = js.native
  def STEP(alpha: Double): String = js.native
  
  val TANH: /* "\n  float e2x = exp(-2.0 * abs(x));\n  return sign(x) * (1.0 - e2x) / (1.0 + e2x);\n" */ String = js.native
  
  @js.native
  class UnaryOpProgram protected () extends GPGPUProgram {
    def this(aShape: js.Array[Double], opSnippet: String) = this()
  }
}
