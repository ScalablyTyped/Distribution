package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/commentFormatRule", JSImport.Namespace)
@js.native
object libRulesCommentFormatRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var LEADING_SPACE_FAILURE: String = js.native
    var LOWERCASE_FAILURE: String = js.native
    var SPACE_LOWERCASE_FAILURE: String = js.native
    var SPACE_UPPERCASE_FAILURE: String = js.native
    var UPPERCASE_FAILURE: String = js.native
    var metadata: IRuleMetadata = js.native
    def IGNORE_PATTERN_FAILURE_FACTORY(pattern: String): String = js.native
    def IGNORE_WORDS_FAILURE_FACTORY(words: js.Array[String]): String = js.native
  }
  
}

