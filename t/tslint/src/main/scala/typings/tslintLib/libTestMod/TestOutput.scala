package typings
package tslintLib.libTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TestOutput extends js.Object {
  var errorsFromLinter: js.Array[tslintLib.libVerifyLintErrorMod.LintError]
  var errorsFromMarkup: js.Array[tslintLib.libVerifyLintErrorMod.LintError]
  var fixesFromLinter: java.lang.String
  var fixesFromMarkup: java.lang.String
  var markupFromLinter: java.lang.String
  var markupFromMarkup: java.lang.String
  var skipped: tslintLib.tslintLibNumbers.`false`
}

