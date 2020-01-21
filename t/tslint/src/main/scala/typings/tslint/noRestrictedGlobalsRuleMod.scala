package typings.tslint

import typings.tslint.ruleMod.IRuleMetadata
import typings.tslint.typedRuleMod.TypedRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/noRestrictedGlobalsRule", JSImport.Namespace)
@js.native
object noRestrictedGlobalsRuleMod extends js.Object {
  @js.native
  class Rule () extends TypedRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var metadata: IRuleMetadata = js.native
    def FAILURE_STRING(name: String): String = js.native
  }
  
}

