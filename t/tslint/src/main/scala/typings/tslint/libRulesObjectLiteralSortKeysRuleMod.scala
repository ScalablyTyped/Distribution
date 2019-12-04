package typings.tslint

import typings.tslint.libLanguageRuleOptionallyTypedRuleMod.OptionallyTypedRule
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/objectLiteralSortKeysRule", JSImport.Namespace)
@js.native
object libRulesObjectLiteralSortKeysRuleMod extends js.Object {
  @js.native
  class Rule () extends OptionallyTypedRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var metadata: IRuleMetadata = js.native
    def FAILURE_STRING_ALPHABETICAL(name: String): String = js.native
    def FAILURE_STRING_SHORTHAND_FIRST(name: String): String = js.native
    def FAILURE_STRING_USE_DECLARATION_ORDER(propName: String): String = js.native
    def FAILURE_STRING_USE_DECLARATION_ORDER(propName: String, typeName: String): String = js.native
  }
  
}

