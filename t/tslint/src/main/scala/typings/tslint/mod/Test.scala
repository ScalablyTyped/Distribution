package typings.tslint.mod

import typings.tslint.libRunnerMod.Logger
import typings.tslint.libTestMod.TestResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Test {
  
  @JSImport("tslint", "Test")
  @js.native
  val ^ : js.Any = js.native
  
  inline def consoleTestResultHandler(testResult: TestResult, logger: Logger): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("consoleTestResultHandler")(testResult.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def consoleTestResultsHandler(testResults: js.Array[TestResult], logger: Logger): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("consoleTestResultsHandler")(testResults.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def runTest(testDirectory: String): TestResult = ^.asInstanceOf[js.Dynamic].applyDynamic("runTest")(testDirectory.asInstanceOf[js.Any]).asInstanceOf[TestResult]
  inline def runTest(testDirectory: String, rulesDirectory: String): TestResult = (^.asInstanceOf[js.Dynamic].applyDynamic("runTest")(testDirectory.asInstanceOf[js.Any], rulesDirectory.asInstanceOf[js.Any])).asInstanceOf[TestResult]
  inline def runTest(testDirectory: String, rulesDirectory: js.Array[String]): TestResult = (^.asInstanceOf[js.Dynamic].applyDynamic("runTest")(testDirectory.asInstanceOf[js.Any], rulesDirectory.asInstanceOf[js.Any])).asInstanceOf[TestResult]
  
  inline def runTests(patterns: js.Array[String]): js.Array[TestResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("runTests")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[TestResult]]
  inline def runTests(patterns: js.Array[String], rulesDirectory: String): js.Array[TestResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTests")(patterns.asInstanceOf[js.Any], rulesDirectory.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestResult]]
  inline def runTests(patterns: js.Array[String], rulesDirectory: js.Array[String]): js.Array[TestResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTests")(patterns.asInstanceOf[js.Any], rulesDirectory.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestResult]]
}
