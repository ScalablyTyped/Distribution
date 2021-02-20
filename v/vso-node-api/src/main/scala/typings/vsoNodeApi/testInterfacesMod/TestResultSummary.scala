package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResultSummary extends StObject {
  
  var aggregatedResultsAnalysis: AggregatedResultsAnalysis = js.native
  
  var teamProject: TeamProjectReference = js.native
  
  var testFailures: TestFailuresAnalysis = js.native
  
  var testResultsContext: TestResultsContext = js.native
}
object TestResultSummary {
  
  @scala.inline
  def apply(
    aggregatedResultsAnalysis: AggregatedResultsAnalysis,
    teamProject: TeamProjectReference,
    testFailures: TestFailuresAnalysis,
    testResultsContext: TestResultsContext
  ): TestResultSummary = {
    val __obj = js.Dynamic.literal(aggregatedResultsAnalysis = aggregatedResultsAnalysis.asInstanceOf[js.Any], teamProject = teamProject.asInstanceOf[js.Any], testFailures = testFailures.asInstanceOf[js.Any], testResultsContext = testResultsContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultSummary]
  }
  
  @scala.inline
  implicit class TestResultSummaryMutableBuilder[Self <: TestResultSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregatedResultsAnalysis(value: AggregatedResultsAnalysis): Self = StObject.set(x, "aggregatedResultsAnalysis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamProject(value: TeamProjectReference): Self = StObject.set(x, "teamProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestFailures(value: TestFailuresAnalysis): Self = StObject.set(x, "testFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResultsContext(value: TestResultsContext): Self = StObject.set(x, "testResultsContext", value.asInstanceOf[js.Any])
  }
}
