package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/banTypesRule", JSImport.Namespace)
@js.native
object banTypesRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var metadata: IRuleMetadata = js.native
    def FAILURE_STRING_FACTORY(typeName: String): String = js.native
    def FAILURE_STRING_FACTORY(typeName: String, messageAddition: String): String = js.native
  }
  
}

