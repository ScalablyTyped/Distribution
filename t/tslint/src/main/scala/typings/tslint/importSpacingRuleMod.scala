package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/importSpacingRule", JSImport.Namespace)
@js.native
object importSpacingRuleMod extends js.Object {
  
  @js.native
  class Rule () extends AbstractRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    var ADD_SPACE_AFTER_FROM: String = js.native
    
    var ADD_SPACE_AFTER_IMPORT: String = js.native
    
    var ADD_SPACE_AFTER_STAR: String = js.native
    
    var ADD_SPACE_BEFORE_FROM: String = js.native
    
    var NO_LINE_BREAKS: String = js.native
    
    var TOO_MANY_SPACES_AFTER_FROM: String = js.native
    
    var TOO_MANY_SPACES_AFTER_IMPORT: String = js.native
    
    var TOO_MANY_SPACES_AFTER_STAR: String = js.native
    
    var TOO_MANY_SPACES_BEFORE_FROM: String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
