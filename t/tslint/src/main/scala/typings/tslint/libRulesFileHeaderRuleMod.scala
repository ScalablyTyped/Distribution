package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/fileHeaderRule", JSImport.Namespace)
@js.native
object libRulesFileHeaderRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule {
    var createComment: js.Any = js.native
    var doesNewLineEndingViolationExist: js.Any = js.native
    var generateLineEnding: js.Any = js.native
    var getFileHeaderText: js.Any = js.native
    var getRuleOptions: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var MISSING_HEADER_FAILURE_STRING: String = js.native
    var MISSING_NEW_LINE_FAILURE_STRING: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

