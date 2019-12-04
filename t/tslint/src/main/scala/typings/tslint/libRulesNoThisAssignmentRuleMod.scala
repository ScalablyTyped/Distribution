package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/noThisAssignmentRule", JSImport.Namespace)
@js.native
object libRulesNoThisAssignmentRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING_BINDINGS: String = js.native
    var metadata: IRuleMetadata = js.native
    def FAILURE_STRING_FACTORY_IDENTIFIERS(name: String): String = js.native
  }
  
}

