package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestPlansWithSelection extends js.Object {
  var lastSelectedPlan: Double = js.native
  var lastSelectedSuite: Double = js.native
  var plans: js.Array[TestPlan] = js.native
}

object TestPlansWithSelection {
  @scala.inline
  def apply(lastSelectedPlan: Double, lastSelectedSuite: Double, plans: js.Array[TestPlan]): TestPlansWithSelection = {
    val __obj = js.Dynamic.literal(lastSelectedPlan = lastSelectedPlan.asInstanceOf[js.Any], lastSelectedSuite = lastSelectedSuite.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPlansWithSelection]
  }
  @scala.inline
  implicit class TestPlansWithSelectionOps[Self <: TestPlansWithSelection] (val x: Self) extends AnyVal {
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
    def setLastSelectedPlan(value: Double): Self = this.set("lastSelectedPlan", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastSelectedSuite(value: Double): Self = this.set("lastSelectedSuite", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlansVarargs(value: TestPlan*): Self = this.set("plans", js.Array(value :_*))
    @scala.inline
    def setPlans(value: js.Array[TestPlan]): Self = this.set("plans", value.asInstanceOf[js.Any])
  }
  
}

