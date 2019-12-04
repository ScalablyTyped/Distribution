package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHn  // OpenGL ES does not support round functionDOTBACKSLASHn  // The algorithm is based on banker_quotes roundingDOTBACKSLASHn  float base = floor(x);BACKSLASHn  if ((x - base) < 0DOT5) {BACKSLASHn    return floor(x);BACKSLASHn  } else if ((x - base) > 0DOT5) {BACKSLASHn    return ceil(x);BACKSLASHn  } else {BACKSLASHn    if (mod(base, 2DOT0) == 0DOT0) {BACKSLASHn      return base;BACKSLASHn    } else {BACKSLASHn      return base + 1DOT0;BACKSLASHn    }BACKSLASHn  }BACKSLASHn`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHn  float e2x = exp(-2DOT0 * abs(x));BACKSLASHn  return sign(x) * (1DOT0 - e2x) / (1DOT0 + e2x);BACKSLASHn`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHn  float e2x = exp(-x);BACKSLASHn  return (e2x + 1DOT0 / e2x) / 2DOT0;BACKSLASHn`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHn  float e2x = exp(x);BACKSLASHn  return (e2x - 1DOT0 / e2x) / 2DOT0;BACKSLASHn`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHn  float epsilon = 1DOT1920928955078125e-7;BACKSLASHn  float threshold = log(epsilon) + 2DOT0;BACKSLASHnBACKSLASHn  bool too_large = x > -threshold;BACKSLASHn  bool too_small = x < threshold;BACKSLASHnBACKSLASHn  float result;BACKSLASHn  float exp_x = exp(x);BACKSLASHnBACKSLASHn  if (too_large){BACKSLASHn    result = x;BACKSLASHn  }BACKSLASHn  else if (too_small){BACKSLASHn    result = exp_x;BACKSLASHn  }BACKSLASHn  else{BACKSLASHn    result = log(exp_x + 1DOT0);BACKSLASHn  }BACKSLASHn  return result;BACKSLASHn`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHn  if (isnan(x)) { return 0DOT0; }BACKSLASHn  return sign(x);BACKSLASHn`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`if (x < 0DOT0) return NAN;BACKSLASHn  return log(x);`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return (x >= 0DOT0) ? x : (exp(x) - 1DOT0);`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return -x;`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return 1DOT0 / (1DOT0 + exp(-1DOT0 * x));`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return 1DOT0 / x;`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return abs(x);`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return ceil(x);`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return exp(x) - 1DOT0;`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return exp(x);`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return float(!(x >= 1DOT0));`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return float(!isnan(x) && !isinf(x));`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return float(int(x));`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return float(isinf(x));`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return float(isnan(x));`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return floor(x);`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return inversesqrt(x);`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return log(1DOT0 + x);`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return sqrt(x);`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return tan(x);`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return x * x;`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return x;`
import typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/unaryop_gpu", JSImport.Namespace)
@js.native
object distBackendsWebglUnaryopUnderscoreGpuMod extends js.Object {
  @js.native
  class UnaryOpProgram protected () extends GPGPUProgram {
    def this(aShape: js.Array[Double], opSnippet: String) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
  val ABS: `return abs(x);` = js.native
  val ACOS: String = js.native
  val ACOSH: String = js.native
  val ASIN: String = js.native
  val ASINH: String = js.native
  val ATAN: String = js.native
  val ATANH: String = js.native
  val CEIL: `return ceil(x);` = js.native
  val CLONE: `return x;` = js.native
  val COS: String = js.native
  val COSH: `BACKSLASHn  float e2x = exp(-x);BACKSLASHn  return (e2x + 1DOT0 / e2x) / 2DOT0;BACKSLASHn` = js.native
  val ELU: `return (x >= 0DOT0) ? x : (exp(x) - 1DOT0);` = js.native
  val ERF: String = js.native
  val EXP: `return exp(x);` = js.native
  val EXPM1: `return exp(x) - 1DOT0;` = js.native
  val FLOOR: `return floor(x);` = js.native
  val IS_FINITE: `return float(!isnan(x) && !isinf(x));` = js.native
  val IS_INF: `return float(isinf(x));` = js.native
  val IS_NAN: `return float(isnan(x));` = js.native
  val LINEAR: `return x;` = js.native
  val LOG: `if (x < 0DOT0) return NAN;BACKSLASHn  return log(x);` = js.native
  val LOG1P: `return log(1DOT0 + x);` = js.native
  val LOGICAL_NOT: `return float(!(x >= 1DOT0));` = js.native
  val NEG: `return -x;` = js.native
  val RECIPROCAL: `return 1DOT0 / x;` = js.native
  val RELU: String = js.native
  val RELU6: String = js.native
  val ROUND: `BACKSLASHn  // OpenGL ES does not support round functionDOTBACKSLASHn  // The algorithm is based on banker_quotes roundingDOTBACKSLASHn  float base = floor(x);BACKSLASHn  if ((x - base) < 0DOT5) {BACKSLASHn    return floor(x);BACKSLASHn  } else if ((x - base) > 0DOT5) {BACKSLASHn    return ceil(x);BACKSLASHn  } else {BACKSLASHn    if (mod(base, 2DOT0) == 0DOT0) {BACKSLASHn      return base;BACKSLASHn    } else {BACKSLASHn      return base + 1DOT0;BACKSLASHn    }BACKSLASHn  }BACKSLASHn` = js.native
  val RSQRT: `return inversesqrt(x);` = js.native
  val SELU: String = js.native
  val SIGMOID: `return 1DOT0 / (1DOT0 + exp(-1DOT0 * x));` = js.native
  val SIGN: `BACKSLASHn  if (isnan(x)) { return 0DOT0; }BACKSLASHn  return sign(x);BACKSLASHn` = js.native
  val SIN: String = js.native
  val SINH: `BACKSLASHn  float e2x = exp(x);BACKSLASHn  return (e2x - 1DOT0 / e2x) / 2DOT0;BACKSLASHn` = js.native
  val SOFTPLUS: `BACKSLASHn  float epsilon = 1DOT1920928955078125e-7;BACKSLASHn  float threshold = log(epsilon) + 2DOT0;BACKSLASHnBACKSLASHn  bool too_large = x > -threshold;BACKSLASHn  bool too_small = x < threshold;BACKSLASHnBACKSLASHn  float result;BACKSLASHn  float exp_x = exp(x);BACKSLASHnBACKSLASHn  if (too_large){BACKSLASHn    result = x;BACKSLASHn  }BACKSLASHn  else if (too_small){BACKSLASHn    result = exp_x;BACKSLASHn  }BACKSLASHn  else{BACKSLASHn    result = log(exp_x + 1DOT0);BACKSLASHn  }BACKSLASHn  return result;BACKSLASHn` = js.native
  val SQRT: `return sqrt(x);` = js.native
  val SQUARE: `return x * x;` = js.native
  val TAN: `return tan(x);` = js.native
  val TANH: `BACKSLASHn  float e2x = exp(-2DOT0 * abs(x));BACKSLASHn  return sign(x) * (1DOT0 - e2x) / (1DOT0 + e2x);BACKSLASHn` = js.native
  val TO_INT: `return float(int(x));` = js.native
  def STEP(): String = js.native
  def STEP(alpha: Double): String = js.native
}

