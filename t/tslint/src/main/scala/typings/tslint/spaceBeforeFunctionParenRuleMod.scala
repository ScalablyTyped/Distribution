package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/spaceBeforeFunctionParenRule", JSImport.Namespace)
@js.native
object spaceBeforeFunctionParenRuleMod extends js.Object {
  
  @js.native
  class Rule () extends AbstractRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    var INVALID_WHITESPACE_ERROR: String = js.native
    
    var MISSING_WHITESPACE_ERROR: String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
