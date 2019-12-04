package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/noRedundantJsdocRule", JSImport.Namespace)
@js.native
object libRulesNoRedundantJsdocRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING_REDUNDANT_TYPE: String = js.native
    var metadata: IRuleMetadata = js.native
    def FAILURE_STRING_NO_COMMENT(tagName: String): String = js.native
    def FAILURE_STRING_REDUNDANT_TAG(tagName: String): String = js.native
  }
  
}

