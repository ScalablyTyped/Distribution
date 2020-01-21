package typings.tslint

import typings.tslint.ruleMod.IRuleMetadata
import typings.tslint.typedRuleMod.TypedRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/strictStringExpressionsRule", JSImport.Namespace)
@js.native
object strictStringExpressionsRuleMod extends js.Object {
  @js.native
  class Rule () extends TypedRule {
    var getRuleOptions: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var CONVERSION_REQUIRED: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

