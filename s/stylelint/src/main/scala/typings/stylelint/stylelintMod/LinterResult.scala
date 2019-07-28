package typings.stylelint.stylelintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinterResult extends js.Object {
  var errored: Boolean
  var output: String
  var results: js.Array[LintResult]
}

object LinterResult {
  @scala.inline
  def apply(errored: Boolean, output: String, results: js.Array[LintResult]): LinterResult = {
    val __obj = js.Dynamic.literal(errored = errored, output = output, results = results)
  
    __obj.asInstanceOf[LinterResult]
  }
}

