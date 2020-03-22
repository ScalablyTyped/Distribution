package typings.xo.mod

import typings.eslint.mod.CLIEngine.LintResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultReport extends js.Object {
  val errorCount: Double
  val results: js.Array[LintResult]
  val warningCount: Double
}

object ResultReport {
  @scala.inline
  def apply(errorCount: Double, results: js.Array[LintResult], warningCount: Double): ResultReport = {
    val __obj = js.Dynamic.literal(errorCount = errorCount.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], warningCount = warningCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResultReport]
  }
}

