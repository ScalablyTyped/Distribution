package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/objectLiteralKeyQuotesRule", JSImport.Namespace)
@js.native
object libRulesObjectLiteralKeyQuotesRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var INCONSISTENT_PROPERTY: String = js.native
    var metadata: IRuleMetadata = js.native
    def UNNEEDED_QUOTES(name: String): String = js.native
    def UNQUOTED_PROPERTY(name: String): String = js.native
  }
  
}

