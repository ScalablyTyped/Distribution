package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestFailureDetails extends js.Object {
  var count: Double = js.native
  var testResults: js.Array[TestCaseResultIdentifier] = js.native
}

object TestFailureDetails {
  @scala.inline
  def apply(count: Double, testResults: js.Array[TestCaseResultIdentifier]): TestFailureDetails = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestFailureDetails]
  }
  @scala.inline
  implicit class TestFailureDetailsOps[Self <: TestFailureDetails] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestResultsVarargs(value: TestCaseResultIdentifier*): Self = this.set("testResults", js.Array(value :_*))
    @scala.inline
    def setTestResults(value: js.Array[TestCaseResultIdentifier]): Self = this.set("testResults", value.asInstanceOf[js.Any])
  }
  
}

