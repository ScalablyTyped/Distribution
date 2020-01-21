package typings.tslint.testMod

import typings.tslint.runnerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/test", "consoleTestResultHandler")
@js.native
object consoleTestResultHandler extends js.Object {
  def apply(testResult: TestResult, logger: Logger): Boolean = js.native
}

