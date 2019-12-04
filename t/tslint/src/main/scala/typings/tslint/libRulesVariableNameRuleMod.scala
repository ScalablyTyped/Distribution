package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/variableNameRule", JSImport.Namespace)
@js.native
object libRulesVariableNameRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING_CONST: String = js.native
    var KEYWORD_FAILURE: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

