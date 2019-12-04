package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/tripleEqualsRule", JSImport.Namespace)
@js.native
object libRulesTripleEqualsRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var EQ_FAILURE_STRING: String = js.native
    var NEQ_FAILURE_STRING: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

