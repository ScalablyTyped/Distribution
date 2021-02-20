package typings.tslint.mod

import typings.tslint.runnerMod.Logger
import typings.tslint.testMod.TestResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Test {
  
  @JSImport("tslint", "Test.consoleTestResultHandler")
  @js.native
  def consoleTestResultHandler(testResult: TestResult, logger: Logger): Boolean = js.native
  
  @JSImport("tslint", "Test.consoleTestResultsHandler")
  @js.native
  def consoleTestResultsHandler(testResults: js.Array[TestResult], logger: Logger): Boolean = js.native
  
  @JSImport("tslint", "Test.runTest")
  @js.native
  def runTest(testDirectory: String): TestResult = js.native
  @JSImport("tslint", "Test.runTest")
  @js.native
  def runTest(testDirectory: String, rulesDirectory: String): TestResult = js.native
  @JSImport("tslint", "Test.runTest")
  @js.native
  def runTest(testDirectory: String, rulesDirectory: js.Array[String]): TestResult = js.native
  
  @JSImport("tslint", "Test.runTests")
  @js.native
  def runTests(patterns: js.Array[String]): js.Array[TestResult] = js.native
  @JSImport("tslint", "Test.runTests")
  @js.native
  def runTests(patterns: js.Array[String], rulesDirectory: String): js.Array[TestResult] = js.native
  @JSImport("tslint", "Test.runTests")
  @js.native
  def runTests(patterns: js.Array[String], rulesDirectory: js.Array[String]): js.Array[TestResult] = js.native
}
