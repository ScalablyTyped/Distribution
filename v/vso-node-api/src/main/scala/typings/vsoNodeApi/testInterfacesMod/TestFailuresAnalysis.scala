package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestFailuresAnalysis extends StObject {
  
  var existingFailures: TestFailureDetails = js.native
  
  var fixedTests: TestFailureDetails = js.native
  
  var newFailures: TestFailureDetails = js.native
  
  var previousContext: TestResultsContext = js.native
}
object TestFailuresAnalysis {
  
  @scala.inline
  def apply(
    existingFailures: TestFailureDetails,
    fixedTests: TestFailureDetails,
    newFailures: TestFailureDetails,
    previousContext: TestResultsContext
  ): TestFailuresAnalysis = {
    val __obj = js.Dynamic.literal(existingFailures = existingFailures.asInstanceOf[js.Any], fixedTests = fixedTests.asInstanceOf[js.Any], newFailures = newFailures.asInstanceOf[js.Any], previousContext = previousContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestFailuresAnalysis]
  }
  
  @scala.inline
  implicit class TestFailuresAnalysisMutableBuilder[Self <: TestFailuresAnalysis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExistingFailures(value: TestFailureDetails): Self = StObject.set(x, "existingFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedTests(value: TestFailureDetails): Self = StObject.set(x, "fixedTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewFailures(value: TestFailureDetails): Self = StObject.set(x, "newFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousContext(value: TestResultsContext): Self = StObject.set(x, "previousContext", value.asInstanceOf[js.Any])
  }
}
