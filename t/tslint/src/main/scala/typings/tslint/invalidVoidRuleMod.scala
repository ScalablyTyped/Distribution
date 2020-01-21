package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/invalidVoidRule", JSImport.Namespace)
@js.native
object invalidVoidRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule {
    var getAllowGenerics: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING_ALLOW_GENERICS: String = js.native
    var FAILURE_STRING_NO_GENERICS: String = js.native
    var metadata: IRuleMetadata = js.native
    def FAILURE_WRONG_GENERIC(genericName: String): String = js.native
  }
  
}

