package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResultSummary extends StObject {
  
  var aggregatedResultsAnalysis: AggregatedResultsAnalysis
  
  var teamProject: TeamProjectReference
  
  var testFailures: TestFailuresAnalysis
  
  var testResultsContext: TestResultsContext
}
object TestResultSummary {
  
  inline def apply(
    aggregatedResultsAnalysis: AggregatedResultsAnalysis,
    teamProject: TeamProjectReference,
    testFailures: TestFailuresAnalysis,
    testResultsContext: TestResultsContext
  ): TestResultSummary = {
    val __obj = js.Dynamic.literal(aggregatedResultsAnalysis = aggregatedResultsAnalysis.asInstanceOf[js.Any], teamProject = teamProject.asInstanceOf[js.Any], testFailures = testFailures.asInstanceOf[js.Any], testResultsContext = testResultsContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultSummary]
  }
  
  extension [Self <: TestResultSummary](x: Self) {
    
    inline def setAggregatedResultsAnalysis(value: AggregatedResultsAnalysis): Self = StObject.set(x, "aggregatedResultsAnalysis", value.asInstanceOf[js.Any])
    
    inline def setTeamProject(value: TeamProjectReference): Self = StObject.set(x, "teamProject", value.asInstanceOf[js.Any])
    
    inline def setTestFailures(value: TestFailuresAnalysis): Self = StObject.set(x, "testFailures", value.asInstanceOf[js.Any])
    
    inline def setTestResultsContext(value: TestResultsContext): Self = StObject.set(x, "testResultsContext", value.asInstanceOf[js.Any])
  }
}
