package typings.tslint.libTestMod

import typings.tslint.libRunnerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/test", "consoleTestResultsHandler")
@js.native
object consoleTestResultsHandler extends js.Object {
  def apply(testResults: js.Array[TestResult], logger: Logger): Boolean = js.native
}

