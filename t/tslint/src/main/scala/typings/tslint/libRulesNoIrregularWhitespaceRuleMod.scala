package typings.tslint

import typings.std.RegExp
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/noIrregularWhitespaceRule", JSImport.Namespace)
@js.native
object libRulesNoIrregularWhitespaceRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  val IRREGULAR_WHITESPACE_REGEX: RegExp = js.native
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

