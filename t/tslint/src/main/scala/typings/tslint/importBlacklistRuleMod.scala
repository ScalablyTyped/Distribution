package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/importBlacklistRule", JSImport.Namespace)
@js.native
object importBlacklistRuleMod extends js.Object {
  
  @js.native
  class Rule () extends AbstractRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    var FAILURE_STRING_REGEX: String = js.native
    
    var IMPLICIT_NAMED_IMPORT_FAILURE_STRING: String = js.native
    
    def MAKE_NAMED_IMPORT_FAILURE_STRING(importName: String): String = js.native
    
    var WHOLE_MODULE_FAILURE_STRING: String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
