package typings.tslint.libTestMod

import typings.tslint.libVerifyLintErrorMod.LintError
import typings.tslint.tslintBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOutput extends js.Object {
  var errorsFromLinter: js.Array[LintError]
  var errorsFromMarkup: js.Array[LintError]
  var fixesFromLinter: String
  var fixesFromMarkup: String
  var markupFromLinter: String
  var markupFromMarkup: String
  var skipped: `false`
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
}

