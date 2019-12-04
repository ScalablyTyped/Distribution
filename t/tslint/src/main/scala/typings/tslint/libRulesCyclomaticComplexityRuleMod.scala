package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/cyclomaticComplexityRule", JSImport.Namespace)
@js.native
object libRulesCyclomaticComplexityRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule {
    val threshold: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var DEFAULT_THRESHOLD: Double = js.native
    var MINIMUM_THRESHOLD: Double = js.native
    var metadata: IRuleMetadata = js.native
    def FAILURE_STRING(expected: Double, actual: Double): String = js.native
    def FAILURE_STRING(expected: Double, actual: Double, name: String): String = js.native
  }
  
}

