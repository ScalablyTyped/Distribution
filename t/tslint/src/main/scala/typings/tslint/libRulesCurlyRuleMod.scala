package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/curlyRule", JSImport.Namespace)
@js.native
object libRulesCurlyRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING_AS_NEEDED: String = js.native
    var metadata: IRuleMetadata = js.native
    def FAILURE_STRING_FACTORY(kind: String): String = js.native
  }
  
}

