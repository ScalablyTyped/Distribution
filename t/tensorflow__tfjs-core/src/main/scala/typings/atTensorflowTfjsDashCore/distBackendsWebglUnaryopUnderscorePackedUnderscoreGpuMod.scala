package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHn  vec4 result = log(x);BACKSLASHn  vec4 isNaN = vec4(lessThan(x, vec4(0DOT0)));BACKSLASHn  resultDOTr = isNaNDOTr == 1DOT0 ? NAN : resultDOTr;BACKSLASHn  resultDOTg = isNaNDOTg == 1DOT0 ? NAN : resultDOTg;BACKSLASHn  resultDOTb = isNaNDOTb == 1DOT0 ? NAN : resultDOTb;BACKSLASHn  resultDOTa = isNaNDOTa == 1DOT0 ? NAN : resultDOTa;BACKSLASHnBACKSLASHn  return result;BACKSLASHn`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHn  vec4 result = min(x, vec4(6DOT)) * vec4(greaterThanEqual(x, vec4(0DOT0)));BACKSLASHn  bvec4 isNaN = isnan(x);BACKSLASHnBACKSLASHn  resultDOTr = isNaNDOTr ? xDOTr : resultDOTr;BACKSLASHn  resultDOTg = isNaNDOTg ? xDOTg : resultDOTg;BACKSLASHn  resultDOTb = isNaNDOTb ? xDOTb : resultDOTb;BACKSLASHn  resultDOTa = isNaNDOTa ? xDOTa : resultDOTa;BACKSLASHnBACKSLASHn  return result;BACKSLASHn`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHn  vec4 result = x * vec4(greaterThanEqual(x, vec4(0DOT0)));BACKSLASHn  bvec4 isNaN = isnan(x);BACKSLASHnBACKSLASHn  resultDOTr = isNaNDOTr ? xDOTr : resultDOTr;BACKSLASHn  resultDOTg = isNaNDOTg ? xDOTg : resultDOTg;BACKSLASHn  resultDOTb = isNaNDOTb ? xDOTb : resultDOTb;BACKSLASHn  resultDOTa = isNaNDOTa ? xDOTa : resultDOTa;BACKSLASHnBACKSLASHn  return result;BACKSLASHn`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`BACKSLASHn  vec4 result;BACKSLASHnBACKSLASHn  resultDOTr = (xDOTr >= 0DOT0) ? xDOTr : (exp(xDOTr) - 1DOT0);BACKSLASHn  resultDOTg = (xDOTg >= 0DOT0) ? xDOTg : (exp(xDOTg) - 1DOT0);BACKSLASHn  resultDOTb = (xDOTb >= 0DOT0) ? xDOTb : (exp(xDOTb) - 1DOT0);BACKSLASHn  resultDOTa = (xDOTa >= 0DOT0) ? xDOTa : (exp(xDOTa) - 1DOT0);BACKSLASHnBACKSLASHn  return result;BACKSLASHn`
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.`return x;`
import typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/unaryop_packed_gpu", JSImport.Namespace)
@js.native
object distBackendsWebglUnaryopUnderscorePackedUnderscoreGpuMod extends js.Object {
  @js.native
  class UnaryOpPackedProgram protected () extends GPGPUProgram {
    def this(aShape: js.Array[Double], opSnippet: String) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    @JSName("packedInputs")
    var packedInputs_UnaryOpPackedProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_UnaryOpPackedProgram: Boolean = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
  val ELU: `BACKSLASHn  vec4 result;BACKSLASHnBACKSLASHn  resultDOTr = (xDOTr >= 0DOT0) ? xDOTr : (exp(xDOTr) - 1DOT0);BACKSLASHn  resultDOTg = (xDOTg >= 0DOT0) ? xDOTg : (exp(xDOTg) - 1DOT0);BACKSLASHn  resultDOTb = (xDOTb >= 0DOT0) ? xDOTb : (exp(xDOTb) - 1DOT0);BACKSLASHn  resultDOTa = (xDOTa >= 0DOT0) ? xDOTa : (exp(xDOTa) - 1DOT0);BACKSLASHnBACKSLASHn  return result;BACKSLASHn` = js.native
  val LINEAR: `return x;` = js.native
  val LOG: `BACKSLASHn  vec4 result = log(x);BACKSLASHn  vec4 isNaN = vec4(lessThan(x, vec4(0DOT0)));BACKSLASHn  resultDOTr = isNaNDOTr == 1DOT0 ? NAN : resultDOTr;BACKSLASHn  resultDOTg = isNaNDOTg == 1DOT0 ? NAN : resultDOTg;BACKSLASHn  resultDOTb = isNaNDOTb == 1DOT0 ? NAN : resultDOTb;BACKSLASHn  resultDOTa = isNaNDOTa == 1DOT0 ? NAN : resultDOTa;BACKSLASHnBACKSLASHn  return result;BACKSLASHn` = js.native
  val RELU: `BACKSLASHn  vec4 result = x * vec4(greaterThanEqual(x, vec4(0DOT0)));BACKSLASHn  bvec4 isNaN = isnan(x);BACKSLASHnBACKSLASHn  resultDOTr = isNaNDOTr ? xDOTr : resultDOTr;BACKSLASHn  resultDOTg = isNaNDOTg ? xDOTg : resultDOTg;BACKSLASHn  resultDOTb = isNaNDOTb ? xDOTb : resultDOTb;BACKSLASHn  resultDOTa = isNaNDOTa ? xDOTa : resultDOTa;BACKSLASHnBACKSLASHn  return result;BACKSLASHn` = js.native
  val RELU6: `BACKSLASHn  vec4 result = min(x, vec4(6DOT)) * vec4(greaterThanEqual(x, vec4(0DOT0)));BACKSLASHn  bvec4 isNaN = isnan(x);BACKSLASHnBACKSLASHn  resultDOTr = isNaNDOTr ? xDOTr : resultDOTr;BACKSLASHn  resultDOTg = isNaNDOTg ? xDOTg : resultDOTg;BACKSLASHn  resultDOTb = isNaNDOTb ? xDOTb : resultDOTb;BACKSLASHn  resultDOTa = isNaNDOTa ? xDOTa : resultDOTa;BACKSLASHnBACKSLASHn  return result;BACKSLASHn` = js.native
}

