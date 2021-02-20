package typings.tslint

import org.scalablytyped.runtime.StringDictionary
import typings.tslint.lintErrorMod.LintError
import typings.tslint.runnerMod.Logger
import typings.tslint.tslintBooleans.`false`
import typings.tslint.tslintBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testMod {
  
  @JSImport("tslint/lib/test", "consoleTestResultHandler")
  @js.native
  def consoleTestResultHandler(testResult: TestResult, logger: Logger): Boolean = js.native
  
  @JSImport("tslint/lib/test", "consoleTestResultsHandler")
  @js.native
  def consoleTestResultsHandler(testResults: js.Array[TestResult], logger: Logger): Boolean = js.native
  
  @JSImport("tslint/lib/test", "runTest")
  @js.native
  def runTest(testDirectory: String): TestResult = js.native
  @JSImport("tslint/lib/test", "runTest")
  @js.native
  def runTest(testDirectory: String, rulesDirectory: String): TestResult = js.native
  @JSImport("tslint/lib/test", "runTest")
  @js.native
  def runTest(testDirectory: String, rulesDirectory: js.Array[String]): TestResult = js.native
  
  @JSImport("tslint/lib/test", "runTests")
  @js.native
  def runTests(patterns: js.Array[String]): js.Array[TestResult] = js.native
  @JSImport("tslint/lib/test", "runTests")
  @js.native
  def runTests(patterns: js.Array[String], rulesDirectory: String): js.Array[TestResult] = js.native
  @JSImport("tslint/lib/test", "runTests")
  @js.native
  def runTests(patterns: js.Array[String], rulesDirectory: js.Array[String]): js.Array[TestResult] = js.native
  
  @js.native
  trait SkippedTest extends StObject {
    
    var requirement: String = js.native
    
    var skipped: `true` = js.native
  }
  object SkippedTest {
    
    @scala.inline
    def apply(requirement: String, skipped: `true`): SkippedTest = {
      val __obj = js.Dynamic.literal(requirement = requirement.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkippedTest]
    }
    
    @scala.inline
    implicit class SkippedTestMutableBuilder[Self <: SkippedTest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequirement(value: String): Self = StObject.set(x, "requirement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipped(value: `true`): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TestOutput extends StObject {
    
    var errorsFromLinter: js.Array[LintError] = js.native
    
    var errorsFromMarkup: js.Array[LintError] = js.native
    
    var fixesFromLinter: String = js.native
    
    var fixesFromMarkup: String = js.native
    
    var markupFromLinter: String = js.native
    
    var markupFromMarkup: String = js.native
    
    var skipped: `false` = js.native
  }
  object TestOutput {
    
    @scala.inline
    def apply(
      errorsFromLinter: js.Array[LintError],
      errorsFromMarkup: js.Array[LintError],
      fixesFromLinter: String,
      fixesFromMarkup: String,
      markupFromLinter: String,
      markupFromMarkup: String,
      skipped: `false`
    ): TestOutput = {
      val __obj = js.Dynamic.literal(errorsFromLinter = errorsFromLinter.asInstanceOf[js.Any], errorsFromMarkup = errorsFromMarkup.asInstanceOf[js.Any], fixesFromLinter = fixesFromLinter.asInstanceOf[js.Any], fixesFromMarkup = fixesFromMarkup.asInstanceOf[js.Any], markupFromLinter = markupFromLinter.asInstanceOf[js.Any], markupFromMarkup = markupFromMarkup.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestOutput]
    }
    
    @scala.inline
    implicit class TestOutputMutableBuilder[Self <: TestOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorsFromLinter(value: js.Array[LintError]): Self = StObject.set(x, "errorsFromLinter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsFromLinterVarargs(value: LintError*): Self = StObject.set(x, "errorsFromLinter", js.Array(value :_*))
      
      @scala.inline
      def setErrorsFromMarkup(value: js.Array[LintError]): Self = StObject.set(x, "errorsFromMarkup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsFromMarkupVarargs(value: LintError*): Self = StObject.set(x, "errorsFromMarkup", js.Array(value :_*))
      
      @scala.inline
      def setFixesFromLinter(value: String): Self = StObject.set(x, "fixesFromLinter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixesFromMarkup(value: String): Self = StObject.set(x, "fixesFromMarkup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkupFromLinter(value: String): Self = StObject.set(x, "markupFromLinter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkupFromMarkup(value: String): Self = StObject.set(x, "markupFromMarkup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipped(value: `false`): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TestResult extends StObject {
    
    var directory: String = js.native
    
    var results: StringDictionary[TestOutput | SkippedTest] = js.native
  }
  object TestResult {
    
    @scala.inline
    def apply(directory: String, results: StringDictionary[TestOutput | SkippedTest]): TestResult = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestResult]
    }
    
    @scala.inline
    implicit class TestResultMutableBuilder[Self <: TestResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResults(value: StringDictionary[TestOutput | SkippedTest]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    }
  }
}
