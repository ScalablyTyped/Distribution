package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/preferWhileRule", JSImport.Namespace)
@js.native
object libRulesPreferWhileRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule {
    var createFailure: js.Any = js.native
    var doesNodeViolateRule: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

