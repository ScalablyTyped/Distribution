package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IRuleMetadata
import typings.tslint.tslintNumbers.`-1`
import typings.tslint.tslintNumbers.`0`
import typings.tslint.tslintNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/memberOrderingRule", JSImport.Namespace)
@js.native
object memberOrderingRuleMod extends js.Object {
  
  @js.native
  class Rule () extends AbstractRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    def FAILURE_STRING_ALPHABETIZE(prevName: String, curName: String): String = js.native
    
    var metadata: IRuleMetadata = js.native
    
    def stringCompare(a: String, b: String): `1` | `-1` | `0` = js.native
  }
}
