package typings.tslint

import typings.tslint.ruleMod.IRuleMetadata
import typings.tslint.typedRuleMod.TypedRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/noNullUndefinedUnionRule", JSImport.Namespace)
@js.native
object noNullUndefinedUnionRuleMod extends js.Object {
  
  @js.native
  class Rule () extends TypedRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    var FAILURE_STRING: String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
