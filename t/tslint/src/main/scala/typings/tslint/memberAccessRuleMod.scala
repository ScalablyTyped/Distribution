package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/memberAccessRule", JSImport.Namespace)
@js.native
object memberAccessRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING_NO_PUBLIC: String = js.native
    var metadata: IRuleMetadata = js.native
    def FAILURE_STRING_FACTORY(memberType: String): String = js.native
    def FAILURE_STRING_FACTORY(memberType: String, memberName: String): String = js.native
  }
  
}

