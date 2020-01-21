package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/typeLiteralDelimiterRule", JSImport.Namespace)
@js.native
object typeLiteralDelimiterRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule {
    var getRuleOptions: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING_COMMA: String = js.native
    var FAILURE_STRING_MISSING: String = js.native
    var FAILURE_STRING_TRAILING: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

