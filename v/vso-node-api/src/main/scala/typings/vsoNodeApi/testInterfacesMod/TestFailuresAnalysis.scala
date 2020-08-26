package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestFailuresAnalysis extends js.Object {
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
  implicit class TestFailuresAnalysisOps[Self <: TestFailuresAnalysis] (val x: Self) extends AnyVal {
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
    def setExistingFailures(value: TestFailureDetails): Self = this.set("existingFailures", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixedTests(value: TestFailureDetails): Self = this.set("fixedTests", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewFailures(value: TestFailureDetails): Self = this.set("newFailures", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousContext(value: TestResultsContext): Self = this.set("previousContext", value.asInstanceOf[js.Any])
  }
  
}

