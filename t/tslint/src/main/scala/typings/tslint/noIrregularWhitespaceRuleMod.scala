package typings.tslint

import typings.std.RegExp
import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/noIrregularWhitespaceRule", JSImport.Namespace)
@js.native
object noIrregularWhitespaceRuleMod extends js.Object {
  
  val IRREGULAR_WHITESPACE_REGEX: RegExp = js.native
  
  @js.native
  class Rule () extends AbstractRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    var FAILURE_STRING: String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
