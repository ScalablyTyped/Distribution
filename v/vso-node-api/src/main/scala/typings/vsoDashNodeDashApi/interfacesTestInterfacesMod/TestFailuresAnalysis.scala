package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestFailuresAnalysis extends js.Object {
  var existingFailures: TestFailureDetails
  var fixedTests: TestFailureDetails
  var newFailures: TestFailureDetails
  var previousContext: TestResultsContext
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
}

