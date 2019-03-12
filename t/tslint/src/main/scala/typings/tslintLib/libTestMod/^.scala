package typings
package tslintLib.libTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/test", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def consoleTestResultHandler(testResult: TestResult, logger: tslintLib.libRunnerMod.Logger): scala.Boolean = js.native
  def consoleTestResultsHandler(testResults: js.Array[TestResult], logger: tslintLib.libRunnerMod.Logger): scala.Boolean = js.native
  def runTest(testDirectory: java.lang.String): TestResult = js.native
  def runTest(testDirectory: java.lang.String, rulesDirectory: java.lang.String): TestResult = js.native
  def runTest(testDirectory: java.lang.String, rulesDirectory: js.Array[java.lang.String]): TestResult = js.native
  def runTests(patterns: js.Array[java.lang.String]): js.Array[TestResult] = js.native
  def runTests(patterns: js.Array[java.lang.String], rulesDirectory: java.lang.String): js.Array[TestResult] = js.native
  def runTests(patterns: js.Array[java.lang.String], rulesDirectory: js.Array[java.lang.String]): js.Array[TestResult] = js.native
}

