package typings.tslint

import typings.tslint.ruleMod.IRuleMetadata
import typings.tslint.tslintStrings.`null`
import typings.tslint.tslintStrings.undefined
import typings.tslint.typedRuleMod.TypedRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/strictTypePredicatesRule", JSImport.Namespace)
@js.native
object strictTypePredicatesRuleMod extends js.Object {
  
  @js.native
  class Rule () extends TypedRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    @JSName("FAILURE_STRICT_PREFER_STRICT_EQUALS")
    def FAILURE_STRICT_PREFER_STRICT_EQUALS_null(value: `null`, isPositive: Boolean): String = js.native
    @JSName("FAILURE_STRICT_PREFER_STRICT_EQUALS")
    def FAILURE_STRICT_PREFER_STRICT_EQUALS_undefined(value: undefined, isPositive: Boolean): String = js.native
    
    def FAILURE_STRING(value: Boolean): String = js.native
    
    var FAILURE_STRING_BAD_TYPEOF: String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
