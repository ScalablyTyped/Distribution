package typings.vsoNodeApi.testInterfacesMod

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
    val __obj = js.Dynamic.literal(automatedTestName = automatedTestName.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], pointId = pointId.asInstanceOf[js.Any], suiteId = suiteId.asInstanceOf[js.Any], testCaseId = testCaseId.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedWorkItemsQueryResult]
  }
}

