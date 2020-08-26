package typings.stylelint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinterResult extends js.Object {
  var errored: Boolean = js.native
  var output: String = js.native
  var results: js.Array[LintResult] = js.native
}

object LinterResult {
  @scala.inline
  def apply(errored: Boolean, output: String, results: js.Array[LintResult]): LinterResult = {
    val __obj = js.Dynamic.literal(errored = errored.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinterResult]
  }
  @scala.inline
  implicit class LinterResultOps[Self <: LinterResult] (val x: Self) extends AnyVal {
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
    def setErrored(value: Boolean): Self = this.set("errored", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultsVarargs(value: LintResult*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[LintResult]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
  
}

