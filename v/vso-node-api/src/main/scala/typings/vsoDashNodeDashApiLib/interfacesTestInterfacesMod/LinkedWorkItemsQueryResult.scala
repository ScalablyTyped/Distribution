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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("automatedTestName")(automatedTestName)
    __obj.updateDynamic("planId")(planId)
    __obj.updateDynamic("pointId")(pointId)
    __obj.updateDynamic("suiteId")(suiteId)
    __obj.updateDynamic("testCaseId")(testCaseId)
    __obj.updateDynamic("workItems")(workItems)
    __obj.asInstanceOf[LinkedWorkItemsQueryResult]
  }
}

