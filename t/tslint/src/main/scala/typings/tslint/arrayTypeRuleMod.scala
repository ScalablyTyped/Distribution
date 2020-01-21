package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/arrayTypeRule", JSImport.Namespace)
@js.native
object arrayTypeRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING_ARRAY: String = js.native
    var FAILURE_STRING_ARRAY_SIMPLE: String = js.native
    var FAILURE_STRING_GENERIC: String = js.native
    var FAILURE_STRING_GENERIC_SIMPLE: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

