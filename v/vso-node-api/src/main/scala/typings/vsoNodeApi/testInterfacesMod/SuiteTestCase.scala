package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuiteTestCase extends js.Object {
  var pointAssignments: js.Array[PointAssignment] = js.native
  var testCase: WorkItemReference = js.native
}

object SuiteTestCase {
  @scala.inline
  def apply(pointAssignments: js.Array[PointAssignment], testCase: WorkItemReference): SuiteTestCase = {
    val __obj = js.Dynamic.literal(pointAssignments = pointAssignments.asInstanceOf[js.Any], testCase = testCase.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteTestCase]
  }
  @scala.inline
  implicit class SuiteTestCaseOps[Self <: SuiteTestCase] (val x: Self) extends AnyVal {
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
    def setPointAssignmentsVarargs(value: PointAssignment*): Self = this.set("pointAssignments", js.Array(value :_*))
    @scala.inline
    def setPointAssignments(value: js.Array[PointAssignment]): Self = this.set("pointAssignments", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestCase(value: WorkItemReference): Self = this.set("testCase", value.asInstanceOf[js.Any])
  }
  
}

