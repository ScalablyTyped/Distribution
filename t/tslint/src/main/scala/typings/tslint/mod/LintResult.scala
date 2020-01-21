package typings.tslint.mod

import typings.tslint.formatterMod.FormatterConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LintResult extends js.Object {
  var errorCount: Double
  var failures: js.Array[typings.tslint.ruleMod.RuleFailure]
  var fixes: js.UndefOr[js.Array[typings.tslint.ruleMod.RuleFailure]] = js.undefined
  var format: String | FormatterConstructor
  var output: String
  var warningCount: Double
}

object LintResult {
  @scala.inline
  def apply(
    errorCount: Double,
    failures: js.Array[typings.tslint.ruleMod.RuleFailure],
    format: String | FormatterConstructor,
    output: String,
    warningCount: Double,
    fixes: js.Array[typings.tslint.ruleMod.RuleFailure] = null
  ): LintResult = {
    val __obj = js.Dynamic.literal(errorCount = errorCount.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], warningCount = warningCount.asInstanceOf[js.Any])
    if (fixes != null) __obj.updateDynamic("fixes")(fixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintResult]
  }
}

