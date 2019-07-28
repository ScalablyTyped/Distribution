package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedWorkItemsQueryResult extends js.Object {
  var automatedTestName: String
  var planId: Double
  var pointId: Double
  var suiteId: Double
  var testCaseId: Double
  var workItems: js.Array[WorkItemReference]
}

object LinkedWorkItemsQueryResult {
  @scala.inline
  def apply(
    automatedTestName: String,
    planId: Double,
    pointId: Double,
    suiteId: Double,
    testCaseId: Double,
    workItems: js.Array[WorkItemReference]
  ): LinkedWorkItemsQueryResult = {
    val __obj = js.Dynamic.literal(automatedTestName = automatedTestName, planId = planId, pointId = pointId, suiteId = suiteId, testCaseId = testCaseId, workItems = workItems)
  
    __obj.asInstanceOf[LinkedWorkItemsQueryResult]
  }
}

