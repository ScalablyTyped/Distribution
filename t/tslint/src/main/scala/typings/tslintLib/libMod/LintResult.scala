package typings
package tslintLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LintResult extends js.Object {
  var errorCount: scala.Double
  var failures: js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure]
  var fixes: js.UndefOr[js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure]] = js.undefined
  var format: java.lang.String | tslintLib.libLanguageFormatterFormatterMod.FormatterConstructor
  var output: java.lang.String
  var warningCount: scala.Double
}

object LintResult {
  @scala.inline
  def apply(
    errorCount: scala.Double,
    failures: js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure],
    format: java.lang.String | tslintLib.libLanguageFormatterFormatterMod.FormatterConstructor,
    output: java.lang.String,
    warningCount: scala.Double,
    fixes: js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure] = null
  ): LintResult = {
    val __obj = js.Dynamic.literal(errorCount = errorCount, failures = failures, format = format.asInstanceOf[js.Any], output = output, warningCount = warningCount)
    if (fixes != null) __obj.updateDynamic("fixes")(fixes)
    __obj.asInstanceOf[LintResult]
  }
}

