package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.libLanguageRuleTypedRuleMod.TypedRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/restrictPlusOperandsRule", JSImport.Namespace)
@js.native
object libRulesRestrictPlusOperandsRuleMod extends js.Object {
  @js.native
  class Rule () extends TypedRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var INVALID_TYPES_ERROR: String = js.native
    var SUGGEST_TEMPLATE_LITERALS: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

