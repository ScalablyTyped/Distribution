package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/maxLineLengthRule", JSImport.Namespace)
@js.native
object maxLineLengthRuleMod extends js.Object {
  
  @js.native
  class Rule () extends AbstractRule {
    
    var getRuleOptions: js.Any = js.native
  }
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    def FAILURE_STRING_FACTORY(lineLimit: Double): String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
