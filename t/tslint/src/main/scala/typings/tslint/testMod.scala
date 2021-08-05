package typings.tslint

import org.scalablytyped.runtime.StringDictionary
import typings.tslint.lintErrorMod.LintError
import typings.tslint.runnerMod.Logger
import typings.tslint.tslintBooleans.`false`
import typings.tslint.tslintBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testMod {
  
  @JSImport("tslint/lib/test", JSImport.Namespace)
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
  
  trait SkippedTest extends StObject {
    
    var requirement: String
    
    var skipped: `true`
  }
  object SkippedTest {
    
    inline def apply(requirement: String): SkippedTest = {
      val __obj = js.Dynamic.literal(requirement = requirement.asInstanceOf[js.Any], skipped = true)
      __obj.asInstanceOf[SkippedTest]
    }
    
    extension [Self <: SkippedTest](x: Self) {
      
      inline def setRequirement(value: String): Self = StObject.set(x, "requirement", value.asInstanceOf[js.Any])
      
      inline def setSkipped(value: `true`): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    }
  }
  
  trait TestOutput extends StObject {
    
    var errorsFromLinter: js.Array[LintError]
    
    var errorsFromMarkup: js.Array[LintError]
    
    var fixesFromLinter: String
    
    var fixesFromMarkup: String
    
    var markupFromLinter: String
    
    var markupFromMarkup: String
    
    var skipped: `false`
  }
  object TestOutput {
    
    inline def apply(
      errorsFromLinter: js.Array[LintError],
      errorsFromMarkup: js.Array[LintError],
      fixesFromLinter: String,
      fixesFromMarkup: String,
      markupFromLinter: String,
      markupFromMarkup: String
    ): TestOutput = {
      val __obj = js.Dynamic.literal(errorsFromLinter = errorsFromLinter.asInstanceOf[js.Any], errorsFromMarkup = errorsFromMarkup.asInstanceOf[js.Any], fixesFromLinter = fixesFromLinter.asInstanceOf[js.Any], fixesFromMarkup = fixesFromMarkup.asInstanceOf[js.Any], markupFromLinter = markupFromLinter.asInstanceOf[js.Any], markupFromMarkup = markupFromMarkup.asInstanceOf[js.Any], skipped = false)
      __obj.asInstanceOf[TestOutput]
    }
    
    extension [Self <: TestOutput](x: Self) {
      
      inline def setErrorsFromLinter(value: js.Array[LintError]): Self = StObject.set(x, "errorsFromLinter", value.asInstanceOf[js.Any])
      
      inline def setErrorsFromLinterVarargs(value: LintError*): Self = StObject.set(x, "errorsFromLinter", js.Array(value :_*))
      
      inline def setErrorsFromMarkup(value: js.Array[LintError]): Self = StObject.set(x, "errorsFromMarkup", value.asInstanceOf[js.Any])
      
      inline def setErrorsFromMarkupVarargs(value: LintError*): Self = StObject.set(x, "errorsFromMarkup", js.Array(value :_*))
      
      inline def setFixesFromLinter(value: String): Self = StObject.set(x, "fixesFromLinter", value.asInstanceOf[js.Any])
      
      inline def setFixesFromMarkup(value: String): Self = StObject.set(x, "fixesFromMarkup", value.asInstanceOf[js.Any])
      
      inline def setMarkupFromLinter(value: String): Self = StObject.set(x, "markupFromLinter", value.asInstanceOf[js.Any])
      
      inline def setMarkupFromMarkup(value: String): Self = StObject.set(x, "markupFromMarkup", value.asInstanceOf[js.Any])
      
      inline def setSkipped(value: `false`): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    }
  }
  
  trait TestResult extends StObject {
    
    var directory: String
    
    var results: StringDictionary[TestOutput | SkippedTest]
  }
  object TestResult {
    
    inline def apply(directory: String, results: StringDictionary[TestOutput | SkippedTest]): TestResult = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestResult]
    }
    
    extension [Self <: TestResult](x: Self) {
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setResults(value: StringDictionary[TestOutput | SkippedTest]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    }
  }
}
