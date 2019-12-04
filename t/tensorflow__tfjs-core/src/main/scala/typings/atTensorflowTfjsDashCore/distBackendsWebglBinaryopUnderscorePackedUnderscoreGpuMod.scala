package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHn  // vec4 one = vec4(equal(a, b));BACKSLASHn  // return one + (vec4(1DOT0) - one) * a / b;BACKSLASHn  vec4 result = a / b;BACKSLASHn  if(aDOTx == bDOTx) {BACKSLASHn    resultDOTx = 1DOT;BACKSLASHn  }BACKSLASHn  if(aDOTy == bDOTy) {BACKSLASHn    resultDOTy = 1DOT;BACKSLASHn  }BACKSLASHn  if(aDOTz == bDOTz) {BACKSLASHn    resultDOTz = 1DOT;BACKSLASHn  }BACKSLASHn  if(aDOTw == bDOTw) {BACKSLASHn    resultDOTw = 1DOT;BACKSLASHn  }BACKSLASHnBACKSLASHn  return result;BACKSLASHn`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHn  ivec4 ia = round(a);BACKSLASHn  ivec4 ib = round(b);BACKSLASHn  bvec4 cond = notEqual(ib, ivec4(0));BACKSLASHn  ivec4 result = ivec4(0);BACKSLASHn  vec4 s = sign(a) * sign(b);BACKSLASHnBACKSLASHn  // Windows (D3D) wants guaranteed non-zero int division at compile-timeDOTBACKSLASHn  if (cond[0]) {BACKSLASHn    result[0] = idiv(ia[0], ib[0], s[0]);BACKSLASHn  }BACKSLASHn  if (cond[1]) {BACKSLASHn    result[1] = idiv(ia[1], ib[1], s[1]);BACKSLASHn  }BACKSLASHn  if (cond[2]) {BACKSLASHn    result[2] = idiv(ia[2], ib[2], s[2]);BACKSLASHn  }BACKSLASHn  if (cond[3]) {BACKSLASHn    result[3] = idiv(ia[3], ib[3], s[3]);BACKSLASHn  }BACKSLASHn  return vec4(result);BACKSLASHn`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHn  return min(BACKSLASHn    vec4(greaterThanEqual(a, vec4(1DOT0))) +BACKSLASHn    vec4(greaterThanEqual(b, vec4(1DOT0))),BACKSLASHn    vec4(1DOT0));BACKSLASHn`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHn  return vec4(BACKSLASHn    vec4(greaterThanEqual(a, vec4(1DOT0))) *BACKSLASHn    vec4(greaterThanEqual(b, vec4(1DOT0))));BACKSLASHn`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHn  return vec4(equal(a, b));BACKSLASHn`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHn  return vec4(greaterThan(a, b));BACKSLASHn`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHn  return vec4(greaterThanEqual(a, b));BACKSLASHn`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHn  return vec4(lessThan(a, b));BACKSLASHn`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHn  return vec4(lessThanEqual(a, b));BACKSLASHn`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHn  return vec4(notEqual(a, b));BACKSLASHn`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHn  vec4 aLessThanZero = vec4(lessThan(a, vec4(0DOT)));BACKSLASHn  return (aLessThanZero * (b * a)) + ((vec4(1DOT0) - aLessThanZero) * a);BACKSLASHn`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHn  vec4 bGTEZero = vec4(greaterThanEqual(b, vec4(0DOT)));BACKSLASHn  return (bGTEZero * a) + ((vec4(1DOT0) - bGTEZero) * (a * (b + vec4(1DOT0))));BACKSLASHn`
import typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/binaryop_packed_gpu", JSImport.Namespace)
@js.native
object distBackendsWebglBinaryopUnderscorePackedUnderscoreGpuMod extends js.Object {
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
  val DIV: `BACKSLASHn  // vec4 one = vec4(equal(a, b));BACKSLASHn  // return one + (vec4(1DOT0) - one) * a / b;BACKSLASHn  vec4 result = a / b;BACKSLASHn  if(aDOTx == bDOTx) {BACKSLASHn    resultDOTx = 1DOT;BACKSLASHn  }BACKSLASHn  if(aDOTy == bDOTy) {BACKSLASHn    resultDOTy = 1DOT;BACKSLASHn  }BACKSLASHn  if(aDOTz == bDOTz) {BACKSLASHn    resultDOTz = 1DOT;BACKSLASHn  }BACKSLASHn  if(aDOTw == bDOTw) {BACKSLASHn    resultDOTw = 1DOT;BACKSLASHn  }BACKSLASHnBACKSLASHn  return result;BACKSLASHn` = js.native
  val ELU_DER: `BACKSLASHn  vec4 bGTEZero = vec4(greaterThanEqual(b, vec4(0DOT)));BACKSLASHn  return (bGTEZero * a) + ((vec4(1DOT0) - bGTEZero) * (a * (b + vec4(1DOT0))));BACKSLASHn` = js.native
  val EQUAL: `BACKSLASHn  return vec4(equal(a, b));BACKSLASHn` = js.native
  val GREATER: `BACKSLASHn  return vec4(greaterThan(a, b));BACKSLASHn` = js.native
  val GREATER_EQUAL: `BACKSLASHn  return vec4(greaterThanEqual(a, b));BACKSLASHn` = js.native
  val INT_DIV: `BACKSLASHn  ivec4 ia = round(a);BACKSLASHn  ivec4 ib = round(b);BACKSLASHn  bvec4 cond = notEqual(ib, ivec4(0));BACKSLASHn  ivec4 result = ivec4(0);BACKSLASHn  vec4 s = sign(a) * sign(b);BACKSLASHnBACKSLASHn  // Windows (D3D) wants guaranteed non-zero int division at compile-timeDOTBACKSLASHn  if (cond[0]) {BACKSLASHn    result[0] = idiv(ia[0], ib[0], s[0]);BACKSLASHn  }BACKSLASHn  if (cond[1]) {BACKSLASHn    result[1] = idiv(ia[1], ib[1], s[1]);BACKSLASHn  }BACKSLASHn  if (cond[2]) {BACKSLASHn    result[2] = idiv(ia[2], ib[2], s[2]);BACKSLASHn  }BACKSLASHn  if (cond[3]) {BACKSLASHn    result[3] = idiv(ia[3], ib[3], s[3]);BACKSLASHn  }BACKSLASHn  return vec4(result);BACKSLASHn` = js.native
  val LESS: `BACKSLASHn  return vec4(lessThan(a, b));BACKSLASHn` = js.native
  val LESS_EQUAL: `BACKSLASHn  return vec4(lessThanEqual(a, b));BACKSLASHn` = js.native
  val LOGICAL_AND: `BACKSLASHn  return vec4(BACKSLASHn    vec4(greaterThanEqual(a, vec4(1DOT0))) *BACKSLASHn    vec4(greaterThanEqual(b, vec4(1DOT0))));BACKSLASHn` = js.native
  val LOGICAL_OR: `BACKSLASHn  return min(BACKSLASHn    vec4(greaterThanEqual(a, vec4(1DOT0))) +BACKSLASHn    vec4(greaterThanEqual(b, vec4(1DOT0))),BACKSLASHn    vec4(1DOT0));BACKSLASHn` = js.native
  val MAX: String = js.native
  val MIN: String = js.native
  val MOD: String = js.native
  val NOT_EQUAL: `BACKSLASHn  return vec4(notEqual(a, b));BACKSLASHn` = js.native
  val POW: String = js.native
  val PRELU: `BACKSLASHn  vec4 aLessThanZero = vec4(lessThan(a, vec4(0DOT)));BACKSLASHn  return (aLessThanZero * (b * a)) + ((vec4(1DOT0) - aLessThanZero) * a);BACKSLASHn` = js.native
}

