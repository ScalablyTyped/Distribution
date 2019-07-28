package typings.tslint.libTestMod

import typings.tslint.libVerifyLintErrorMod.LintError
import typings.tslint.tslintNumbers.`false`
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
    val __obj = js.Dynamic.literal(errorsFromLinter = errorsFromLinter, errorsFromMarkup = errorsFromMarkup, fixesFromLinter = fixesFromLinter, fixesFromMarkup = fixesFromMarkup, markupFromLinter = markupFromLinter, markupFromMarkup = markupFromMarkup, skipped = skipped)
  
    __obj.asInstanceOf[TestOutput]
  }
}

