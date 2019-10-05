package typings.tslint.tslintMod

import typings.tslint.libRunnerMod.Logger
import typings.tslint.libTestMod.TestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "Test")
@js.native
object Test extends js.Object {
  def consoleTestResultHandler(testResult: TestResult, logger: Logger): Boolean = js.native
  def consoleTestResultsHandler(testResults: js.Array[TestResult], logger: Logger): Boolean = js.native
  def runTest(testDirectory: String): TestResult = js.native
  def runTest(testDirectory: String, rulesDirectory: String): TestResult = js.native
  def runTest(testDirectory: String, rulesDirectory: js.Array[String]): TestResult = js.native
  def runTests(patterns: js.Array[String]): js.Array[TestResult] = js.native
  def runTests(patterns: js.Array[String], rulesDirectory: String): js.Array[TestResult] = js.native
  def runTests(patterns: js.Array[String], rulesDirectory: js.Array[String]): js.Array[TestResult] = js.native
}

