package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/preferWhileRule", JSImport.Namespace)
@js.native
object preferWhileRuleMod extends js.Object {
  
  @js.native
  class Rule () extends AbstractRule {
    
    var createFailure: js.Any = js.native
    
    var doesNodeViolateRule: js.Any = js.native
  }
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    var FAILURE_STRING: String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
