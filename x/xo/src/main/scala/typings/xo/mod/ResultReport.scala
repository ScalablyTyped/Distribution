package typings.xo.mod

import typings.eslint.mod.CLIEngine.LintResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultReport extends js.Object {
  val errorCount: Double = js.native
  val results: js.Array[LintResult] = js.native
  val warningCount: Double = js.native
}

object ResultReport {
  @scala.inline
  def apply(errorCount: Double, results: js.Array[LintResult], warningCount: Double): ResultReport = {
    val __obj = js.Dynamic.literal(errorCount = errorCount.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], warningCount = warningCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultReport]
  }
  @scala.inline
  implicit class ResultReportOps[Self <: ResultReport] (val x: Self) extends AnyVal {
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
    def setResultsVarargs(value: LintResult*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[LintResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarningCount(value: Double): Self = this.set("warningCount", value.asInstanceOf[js.Any])
  }
  
}

