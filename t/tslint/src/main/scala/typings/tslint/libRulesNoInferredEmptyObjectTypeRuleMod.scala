package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.libLanguageRuleTypedRuleMod.TypedRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/noInferredEmptyObjectTypeRule", JSImport.Namespace)
@js.native
object libRulesNoInferredEmptyObjectTypeRuleMod extends js.Object {
  @js.native
  class Rule () extends TypedRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var EMPTY_INTERFACE_FUNCTION: String = js.native
    var EMPTY_INTERFACE_INSTANCE: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

