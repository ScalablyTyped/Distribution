package typings.tslint

import typings.std.RegExp
import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/noIrregularWhitespaceRule", JSImport.Namespace)
@js.native
object noIrregularWhitespaceRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  val IRREGULAR_WHITESPACE_REGEX: RegExp = js.native
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

