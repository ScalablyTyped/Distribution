package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/tripleEqualsRule", JSImport.Namespace)
@js.native
object tripleEqualsRuleMod extends js.Object {
  
  @js.native
  class Rule () extends AbstractRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    var EQ_FAILURE_STRING: String = js.native
    
    var NEQ_FAILURE_STRING: String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
