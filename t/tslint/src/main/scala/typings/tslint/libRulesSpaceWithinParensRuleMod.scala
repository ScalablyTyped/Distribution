package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/spaceWithinParensRule", JSImport.Namespace)
@js.native
object libRulesSpaceWithinParensRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_NO_SPACE: String = js.native
    var metadata: IRuleMetadata = js.native
    def FAILURE_NEEDS_SPACE(count: Double): String = js.native
    def FAILURE_NO_EXTRA_SPACE(count: Double): String = js.native
  }
  
}

