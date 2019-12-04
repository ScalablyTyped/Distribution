package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHn  float s = sign(a) * sign(b);BACKSLASHn  int ia = round(a);BACKSLASHn  int ib = round(b);BACKSLASHn  if (ib != 0) {BACKSLASHn    // Windows (D3D) wants guaranteed non-zero int division at compile-timeDOTBACKSLASHn    return float(idiv(ia, ib, s));BACKSLASHn  } else {BACKSLASHn    return NAN;BACKSLASHn  }BACKSLASHn`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHnif (a == b) {BACKSLASHn  return 1DOT0;BACKSLASHn};BACKSLASHnreturn a / b;`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHnif(a < 0DOT0 && floor(b) < b){BACKSLASHn  return NAN;BACKSLASHn}BACKSLASHnif (b == 0DOT0) {BACKSLASHn  return 1DOT0;BACKSLASHn}BACKSLASHnreturn (round(mod(b, 2DOT0)) != 1) ?BACKSLASHn    pow(abs(a), b) : sign(a) * pow(abs(a), b);BACKSLASHn`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`if (b == 0DOT0) return NAN;BACKSLASHn  return mod(a, b);`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return (a - b) * (a - b);`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return (a < 0DOT) ? b * a : a;`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return (b >= 1DOT0) ? a : a * (b + 1DOT0);`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return a * b;`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return a + b;`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return a - b;`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return float(a != b);`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return float(a < b);`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return float(a <= b);`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return float(a == b);`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return float(a > b);`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return float(a >= 1DOT0 && b >= 1DOT0);`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return float(a >= 1DOT0 || b >= 1DOT0);`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return float(a >= b);`
import typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/binaryop_gpu", JSImport.Namespace)
@js.native
object distBackendsWebglBinaryopUnderscoreGpuMod extends js.Object {
  @js.native
  class BinaryOpProgram protected () extends GPGPUProgram {
    def this(op: String, aShape: js.Array[Double], bShape: js.Array[Double]) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
  val ADD: `return a + b;` = js.native
  val ATAN2: String = js.native
  val DIV: `BACKSLASHnif (a == b) {BACKSLASHn  return 1DOT0;BACKSLASHn};BACKSLASHnreturn a / b;` = js.native
  val ELU_DER: `return (b >= 1DOT0) ? a : a * (b + 1DOT0);` = js.native
  val EQUAL: `return float(a == b);` = js.native
  val GREATER: `return float(a > b);` = js.native
  val GREATER_EQUAL: `return float(a >= b);` = js.native
  val INT_DIV: `BACKSLASHn  float s = sign(a) * sign(b);BACKSLASHn  int ia = round(a);BACKSLASHn  int ib = round(b);BACKSLASHn  if (ib != 0) {BACKSLASHn    // Windows (D3D) wants guaranteed non-zero int division at compile-timeDOTBACKSLASHn    return float(idiv(ia, ib, s));BACKSLASHn  } else {BACKSLASHn    return NAN;BACKSLASHn  }BACKSLASHn` = js.native
  val LESS: `return float(a < b);` = js.native
  val LESS_EQUAL: `return float(a <= b);` = js.native
  val LOGICAL_AND: `return float(a >= 1DOT0 && b >= 1DOT0);` = js.native
  val LOGICAL_OR: `return float(a >= 1DOT0 || b >= 1DOT0);` = js.native
  val MAX: String = js.native
  val MIN: String = js.native
  val MOD: `if (b == 0DOT0) return NAN;BACKSLASHn  return mod(a, b);` = js.native
  val MUL: `return a * b;` = js.native
  val NOT_EQUAL: `return float(a != b);` = js.native
  val POW: `BACKSLASHnif(a < 0DOT0 && floor(b) < b){BACKSLASHn  return NAN;BACKSLASHn}BACKSLASHnif (b == 0DOT0) {BACKSLASHn  return 1DOT0;BACKSLASHn}BACKSLASHnreturn (round(mod(b, 2DOT0)) != 1) ?BACKSLASHn    pow(abs(a), b) : sign(a) * pow(abs(a), b);BACKSLASHn` = js.native
  val PRELU: `return (a < 0DOT) ? b * a : a;` = js.native
  val SQUARED_DIFFERENCE: `return (a - b) * (a - b);` = js.native
  val SUB: `return a - b;` = js.native
}

