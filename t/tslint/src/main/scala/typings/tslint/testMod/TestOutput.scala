package typings.tslint.testMod

import typings.tslint.lintErrorMod.LintError
import typings.tslint.tslintBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestOutput extends js.Object {
  var errorsFromLinter: js.Array[LintError] = js.native
  var errorsFromMarkup: js.Array[LintError] = js.native
  var fixesFromLinter: String = js.native
  var fixesFromMarkup: String = js.native
  var markupFromLinter: String = js.native
  var markupFromMarkup: String = js.native
  var skipped: `false` = js.native
}

object TestOutput {
  @scala.inline
  def apply(
    errorsFromLinter: js.Array[LintError],
    errorsFromMarkup: js.Array[LintError],
    fixesFromLinter: String,
    fixesFromMarkup: String,
    markupFromLinter: String,
    markupFromMarkup: String,
    skipped: `false`
  ): TestOutput = {
    val __obj = js.Dynamic.literal(errorsFromLinter = errorsFromLinter.asInstanceOf[js.Any], errorsFromMarkup = errorsFromMarkup.asInstanceOf[js.Any], fixesFromLinter = fixesFromLinter.asInstanceOf[js.Any], fixesFromMarkup = fixesFromMarkup.asInstanceOf[js.Any], markupFromLinter = markupFromLinter.asInstanceOf[js.Any], markupFromMarkup = markupFromMarkup.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestOutput]
  }
  @scala.inline
  implicit class TestOutputOps[Self <: TestOutput] (val x: Self) extends AnyVal {
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
    def setErrorsFromLinterVarargs(value: LintError*): Self = this.set("errorsFromLinter", js.Array(value :_*))
    @scala.inline
    def setErrorsFromLinter(value: js.Array[LintError]): Self = this.set("errorsFromLinter", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorsFromMarkupVarargs(value: LintError*): Self = this.set("errorsFromMarkup", js.Array(value :_*))
    @scala.inline
    def setErrorsFromMarkup(value: js.Array[LintError]): Self = this.set("errorsFromMarkup", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixesFromLinter(value: String): Self = this.set("fixesFromLinter", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixesFromMarkup(value: String): Self = this.set("fixesFromMarkup", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkupFromLinter(value: String): Self = this.set("markupFromLinter", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkupFromMarkup(value: String): Self = this.set("markupFromMarkup", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipped(value: `false`): Self = this.set("skipped", value.asInstanceOf[js.Any])
  }
  
}

