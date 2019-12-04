package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/trailingCommaRule", JSImport.Namespace)
@js.native
object libRulesTrailingCommaRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING_ALWAYS: String = js.native
    var FAILURE_STRING_FORBIDDEN: String = js.native
    var FAILURE_STRING_NEVER: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

