package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/noDuplicateSuperRule", JSImport.Namespace)
@js.native
object noDuplicateSuperRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING_DUPLICATE: String = js.native
    var FAILURE_STRING_LOOP: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

