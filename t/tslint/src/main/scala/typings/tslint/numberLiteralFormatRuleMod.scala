package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/numberLiteralFormatRule", JSImport.Namespace)
@js.native
object numberLiteralFormatRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING_LEADING_0: String = js.native
    var FAILURE_STRING_LEADING_DECIMAL: String = js.native
    var FAILURE_STRING_NOT_UPPERCASE: String = js.native
    var FAILURE_STRING_TRAILING_0: String = js.native
    var FAILURE_STRING_TRAILING_DECIMAL: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

