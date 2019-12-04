package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/linebreakStyleRule", JSImport.Namespace)
@js.native
object libRulesLinebreakStyleRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_CRLF: String = js.native
    var FAILURE_LF: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

