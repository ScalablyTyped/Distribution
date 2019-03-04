package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestPlanHubData extends js.Object {
  var selectedSuiteId: scala.Double
  var testPlan: TestPlan
  var testPoints: js.Array[TestPoint]
  var testSuites: js.Array[TestSuite]
  var totalTestPoints: scala.Double
}

object TestPlanHubData {
  @scala.inline
  def apply(
    selectedSuiteId: scala.Double,
    testPlan: TestPlan,
    testPoints: js.Array[TestPoint],
    testSuites: js.Array[TestSuite],
    totalTestPoints: scala.Double
  ): TestPlanHubData = {
    val __obj = js.Dynamic.literal(selectedSuiteId = selectedSuiteId, testPlan = testPlan, testPoints = testPoints, testSuites = testSuites, totalTestPoints = totalTestPoints)
  
    __obj.asInstanceOf[TestPlanHubData]
  }
}

