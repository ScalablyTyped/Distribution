package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedWorkItemsQueryResult extends js.Object {
  var automatedTestName: java.lang.String
  var planId: scala.Double
  var pointId: scala.Double
  var suiteId: scala.Double
  var testCaseId: scala.Double
  var workItems: js.Array[WorkItemReference]
}

object LinkedWorkItemsQueryResult {
  @scala.inline
  def apply(
    automatedTestName: java.lang.String,
    planId: scala.Double,
    pointId: scala.Double,
    suiteId: scala.Double,
    testCaseId: scala.Double,
    workItems: js.Array[WorkItemReference]
  ): LinkedWorkItemsQueryResult = {
    val __obj = js.Dynamic.literal(automatedTestName = automatedTestName, planId = planId, pointId = pointId, suiteId = suiteId, testCaseId = testCaseId, workItems = workItems)
  
    __obj.asInstanceOf[LinkedWorkItemsQueryResult]
  }
}

