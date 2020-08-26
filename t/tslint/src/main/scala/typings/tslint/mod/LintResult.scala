package typings.tslint.mod

import typings.tslint.formatterMod.FormatterConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LintResult extends js.Object {
  var errorCount: Double = js.native
  var failures: js.Array[typings.tslint.ruleMod.RuleFailure] = js.native
  var fixes: js.UndefOr[js.Array[typings.tslint.ruleMod.RuleFailure]] = js.native
  var format: String | FormatterConstructor = js.native
  var output: String = js.native
  var warningCount: Double = js.native
}

object LintResult {
  @scala.inline
  def apply(
    errorCount: Double,
    failures: js.Array[typings.tslint.ruleMod.RuleFailure],
    format: String | FormatterConstructor,
    output: String,
    warningCount: Double
  ): LintResult = {
    val __obj = js.Dynamic.literal(errorCount = errorCount.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], warningCount = warningCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintResult]
  }
  @scala.inline
  implicit class LintResultOps[Self <: LintResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorCount(value: Double): Self = this.set("errorCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailuresVarargs(value: typings.tslint.ruleMod.RuleFailure*): Self = this.set("failures", js.Array(value :_*))
    @scala.inline
    def setFailures(value: js.Array[typings.tslint.ruleMod.RuleFailure]): Self = this.set("failures", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: String | FormatterConstructor): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarningCount(value: Double): Self = this.set("warningCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixesVarargs(value: typings.tslint.ruleMod.RuleFailure*): Self = this.set("fixes", js.Array(value :_*))
    @scala.inline
    def setFixes(value: js.Array[typings.tslint.ruleMod.RuleFailure]): Self = this.set("fixes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixes: Self = this.set("fixes", js.undefined)
  }
  
}

