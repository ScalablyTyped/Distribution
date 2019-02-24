package typings
package tslintLib.libLanguageFormatterFormatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFormatter extends js.Object {
  /**
    * Formats linter results
    * @param failures Linter failures that were not fixed
    * @param fixes Fixed linter failures. Available when the `--fix` argument is used on the command line
    * @param fileNames All of the file paths that were linted
    */
  def format(failures: js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure]): java.lang.String = js.native
  def format(
    failures: js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure],
    fixes: js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure]
  ): java.lang.String = js.native
  def format(
    failures: js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure],
    fixes: js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure],
    fileNames: js.Array[java.lang.String]
  ): java.lang.String = js.native
}

