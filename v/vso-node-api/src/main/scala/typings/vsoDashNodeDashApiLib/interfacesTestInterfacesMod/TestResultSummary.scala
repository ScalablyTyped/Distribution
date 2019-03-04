package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultSummary extends js.Object {
  var aggregatedResultsAnalysis: AggregatedResultsAnalysis
  var teamProject: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference
  var testFailures: TestFailuresAnalysis
  var testResultsContext: TestResultsContext
}

object TestResultSummary {
  @scala.inline
  def apply(
    aggregatedResultsAnalysis: AggregatedResultsAnalysis,
    teamProject: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference,
    testFailures: TestFailuresAnalysis,
    testResultsContext: TestResultsContext
  ): TestResultSummary = {
    val __obj = js.Dynamic.literal(aggregatedResultsAnalysis = aggregatedResultsAnalysis, teamProject = teamProject, testFailures = testFailures, testResultsContext = testResultsContext)
  
    __obj.asInstanceOf[TestResultSummary]
  }
}

