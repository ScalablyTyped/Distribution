package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/spaceWithinParensRule", JSImport.Namespace)
@js.native
object spaceWithinParensRuleMod extends js.Object {
  
  @js.native
  class Rule () extends AbstractRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    def FAILURE_NEEDS_SPACE(count: Double): String = js.native
    
    def FAILURE_NO_EXTRA_SPACE(count: Double): String = js.native
    
    var FAILURE_NO_SPACE: String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
