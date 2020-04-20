package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestPlanHubData extends js.Object {
  var selectedSuiteId: Double
  var testPlan: TestPlan
  var testPoints: js.Array[TestPoint]
  var testSuites: js.Array[TestSuite]
  var totalTestPoints: Double
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
}

