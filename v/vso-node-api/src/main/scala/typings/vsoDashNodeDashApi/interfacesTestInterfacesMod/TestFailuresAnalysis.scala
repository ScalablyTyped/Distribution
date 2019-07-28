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
    val __obj = js.Dynamic.literal(existingFailures = existingFailures, fixedTests = fixedTests, newFailures = newFailures, previousContext = previousContext)
  
    __obj.asInstanceOf[TestFailuresAnalysis]
  }
}

