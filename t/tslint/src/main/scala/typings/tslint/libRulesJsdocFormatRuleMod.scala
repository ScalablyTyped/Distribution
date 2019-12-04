package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/jsdocFormatRule", JSImport.Namespace)
@js.native
object libRulesJsdocFormatRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var ALIGNMENT_FAILURE_STRING: String = js.native
    var FORMAT_FAILURE_STRING: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

