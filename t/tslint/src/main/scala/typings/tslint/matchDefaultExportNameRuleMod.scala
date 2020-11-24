package typings.tslint

import typings.tslint.ruleMod.IRuleMetadata
import typings.tslint.typedRuleMod.TypedRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/matchDefaultExportNameRule", JSImport.Namespace)
@js.native
object matchDefaultExportNameRuleMod extends js.Object {
  
  @js.native
  class Rule () extends TypedRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    def FAILURE_STRING(importName: String, exportName: String): String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
