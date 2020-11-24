package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResultSummary extends js.Object {
  
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
  implicit class TestResultSummaryOps[Self <: TestResultSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAggregatedResultsAnalysis(value: AggregatedResultsAnalysis): Self = this.set("aggregatedResultsAnalysis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamProject(value: TeamProjectReference): Self = this.set("teamProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestFailures(value: TestFailuresAnalysis): Self = this.set("testFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResultsContext(value: TestResultsContext): Self = this.set("testResultsContext", value.asInstanceOf[js.Any])
  }
}
