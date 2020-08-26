package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestPlanHubData extends js.Object {
  var selectedSuiteId: Double = js.native
  var testPlan: TestPlan = js.native
  var testPoints: js.Array[TestPoint] = js.native
  var testSuites: js.Array[TestSuite] = js.native
  var totalTestPoints: Double = js.native
}

object TestPlanHubData {
  @scala.inline
  def apply(
    selectedSuiteId: Double,
    testPlan: TestPlan,
    testPoints: js.Array[TestPoint],
    testSuites: js.Array[TestSuite],
    totalTestPoints: Double
  ): TestPlanHubData = {
    val __obj = js.Dynamic.literal(selectedSuiteId = selectedSuiteId.asInstanceOf[js.Any], testPlan = testPlan.asInstanceOf[js.Any], testPoints = testPoints.asInstanceOf[js.Any], testSuites = testSuites.asInstanceOf[js.Any], totalTestPoints = totalTestPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPlanHubData]
  }
  @scala.inline
  implicit class TestPlanHubDataOps[Self <: TestPlanHubData] (val x: Self) extends AnyVal {
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
    def setSelectedSuiteId(value: Double): Self = this.set("selectedSuiteId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestPlan(value: TestPlan): Self = this.set("testPlan", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestPointsVarargs(value: TestPoint*): Self = this.set("testPoints", js.Array(value :_*))
    @scala.inline
    def setTestPoints(value: js.Array[TestPoint]): Self = this.set("testPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestSuitesVarargs(value: TestSuite*): Self = this.set("testSuites", js.Array(value :_*))
    @scala.inline
    def setTestSuites(value: js.Array[TestSuite]): Self = this.set("testSuites", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalTestPoints(value: Double): Self = this.set("totalTestPoints", value.asInstanceOf[js.Any])
  }
  
}

