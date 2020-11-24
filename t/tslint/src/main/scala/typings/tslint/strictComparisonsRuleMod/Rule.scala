package typings.tslint.strictComparisonsRuleMod

import typings.tslint.ruleMod.IRuleMetadata
import typings.tslint.typedRuleMod.TypedRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/strictComparisonsRule", "Rule")
@js.native
class Rule () extends TypedRule {
  
  var getRuleOptions: js.Any = js.native
}
/* static members */
@JSImport("tslint/lib/rules/strictComparisonsRule", "Rule")
@js.native
object Rule extends js.Object {
  
  def INVALID_TYPES(types1: js.Array[TypeKind], types2: js.Array[TypeKind]): String = js.native
  
  def INVALID_TYPE_FOR_OPERATOR(`type`: TypeKind, comparator: String): String = js.native
  
  var metadata: IRuleMetadata = js.native
}
