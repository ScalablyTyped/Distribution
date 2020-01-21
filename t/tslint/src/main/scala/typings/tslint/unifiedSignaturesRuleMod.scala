package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/unifiedSignaturesRule", JSImport.Namespace)
@js.native
object unifiedSignaturesRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING_START: js.Any = js.native
    var metadata: IRuleMetadata = js.native
    def FAILURE_STRING_OMITTING_REST_PARAMETER(): String = js.native
    def FAILURE_STRING_OMITTING_REST_PARAMETER(otherLine: Double): String = js.native
    def FAILURE_STRING_OMITTING_SINGLE_PARAMETER(): String = js.native
    def FAILURE_STRING_OMITTING_SINGLE_PARAMETER(otherLine: Double): String = js.native
    def FAILURE_STRING_SINGLE_PARAMETER_DIFFERENCE(otherLine: js.UndefOr[scala.Nothing], type1: String, type2: String): String = js.native
    def FAILURE_STRING_SINGLE_PARAMETER_DIFFERENCE(otherLine: Double, type1: String, type2: String): String = js.native
  }
  
}

