package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/objectLiteralKeyQuotesRule", JSImport.Namespace)
@js.native
object objectLiteralKeyQuotesRuleMod extends js.Object {
  
  @js.native
  class Rule () extends AbstractRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    var INCONSISTENT_PROPERTY: String = js.native
    
    def UNNEEDED_QUOTES(name: String): String = js.native
    
    def UNQUOTED_PROPERTY(name: String): String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
