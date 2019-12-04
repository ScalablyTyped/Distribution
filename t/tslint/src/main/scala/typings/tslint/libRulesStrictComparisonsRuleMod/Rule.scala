package typings.tslint.libRulesStrictComparisonsRuleMod

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.libLanguageRuleTypedRuleMod.TypedRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/strictComparisonsRule", "Rule")
@js.native
class Rule () extends TypedRule {
  var getRuleOptions: js.Any = js.native
}

/* static members */
@JSImport("tslint/lib/rules/strictComparisonsRule", "Rule")
@js.native
object Rule extends js.Object {
  var metadata: IRuleMetadata = js.native
  def INVALID_TYPES(types1: js.Array[TypeKind], types2: js.Array[TypeKind]): String = js.native
  def INVALID_TYPE_FOR_OPERATOR(`type`: TypeKind, comparator: String): String = js.native
}

