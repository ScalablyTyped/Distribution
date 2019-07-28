package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedWorkItemsQuery extends js.Object {
  var automatedTestNames: js.Array[String]
  var planId: Double
  var pointIds: js.Array[Double]
  var suiteIds: js.Array[Double]
  var testCaseIds: js.Array[Double]
  var workItemCategory: String
}

object LinkedWorkItemsQuery {
  @scala.inline
  def apply(
    automatedTestNames: js.Array[String],
    planId: Double,
    pointIds: js.Array[Double],
    suiteIds: js.Array[Double],
    testCaseIds: js.Array[Double],
    workItemCategory: String
  ): LinkedWorkItemsQuery = {
    val __obj = js.Dynamic.literal(automatedTestNames = automatedTestNames, planId = planId, pointIds = pointIds, suiteIds = suiteIds, testCaseIds = testCaseIds, workItemCategory = workItemCategory)
  
    __obj.asInstanceOf[LinkedWorkItemsQuery]
  }
}

