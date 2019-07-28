package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.TeamProjectReference
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
    val __obj = js.Dynamic.literal(aggregatedResultsAnalysis = aggregatedResultsAnalysis, teamProject = teamProject, testFailures = testFailures, testResultsContext = testResultsContext)
  
    __obj.asInstanceOf[TestResultSummary]
  }
}

