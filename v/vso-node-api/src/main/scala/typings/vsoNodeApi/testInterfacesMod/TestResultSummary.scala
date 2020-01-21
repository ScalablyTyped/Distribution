package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultSummary extends js.Object {
  var aggregatedResultsAnalysis: AggregatedResultsAnalysis
  var teamProject: TeamProjectReference
  var testFailures: TestFailuresAnalysis
  var testResultsContext: TestResultsContext
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
}

