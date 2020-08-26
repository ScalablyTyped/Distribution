package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestPlanCloneRequest extends js.Object {
  var destinationTestPlan: TestPlan = js.native
  var options: CloneOptions = js.native
  var suiteIds: js.Array[Double] = js.native
}

object TestPlanCloneRequest {
  @scala.inline
  def apply(destinationTestPlan: TestPlan, options: CloneOptions, suiteIds: js.Array[Double]): TestPlanCloneRequest = {
    val __obj = js.Dynamic.literal(destinationTestPlan = destinationTestPlan.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], suiteIds = suiteIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPlanCloneRequest]
  }
  @scala.inline
  implicit class TestPlanCloneRequestOps[Self <: TestPlanCloneRequest] (val x: Self) extends AnyVal {
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
    def setDestinationTestPlan(value: TestPlan): Self = this.set("destinationTestPlan", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: CloneOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuiteIdsVarargs(value: Double*): Self = this.set("suiteIds", js.Array(value :_*))
    @scala.inline
    def setSuiteIds(value: js.Array[Double]): Self = this.set("suiteIds", value.asInstanceOf[js.Any])
  }
  
}

