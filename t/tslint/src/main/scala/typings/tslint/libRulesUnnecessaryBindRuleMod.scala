package typings.tslint

import typings.tslint.libLanguageRuleOptionallyTypedRuleMod.OptionallyTypedRule
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/unnecessaryBindRule", JSImport.Namespace)
@js.native
object libRulesUnnecessaryBindRuleMod extends js.Object {
  @js.native
  class Rule () extends OptionallyTypedRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING_ARROW: String = js.native
    var FAILURE_STRING_FUNCTION: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

