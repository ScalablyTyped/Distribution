package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedWorkItemsQuery extends js.Object {
  var automatedTestNames: js.Array[java.lang.String]
  var planId: scala.Double
  var pointIds: js.Array[scala.Double]
  var suiteIds: js.Array[scala.Double]
  var testCaseIds: js.Array[scala.Double]
  var workItemCategory: java.lang.String
}

object LinkedWorkItemsQuery {
  @scala.inline
  def apply(
    automatedTestNames: js.Array[java.lang.String],
    planId: scala.Double,
    pointIds: js.Array[scala.Double],
    suiteIds: js.Array[scala.Double],
    testCaseIds: js.Array[scala.Double],
    workItemCategory: java.lang.String
  ): LinkedWorkItemsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("automatedTestNames")(automatedTestNames)
    __obj.updateDynamic("planId")(planId)
    __obj.updateDynamic("pointIds")(pointIds)
    __obj.updateDynamic("suiteIds")(suiteIds)
    __obj.updateDynamic("testCaseIds")(testCaseIds)
    __obj.updateDynamic("workItemCategory")(workItemCategory)
    __obj.asInstanceOf[LinkedWorkItemsQuery]
  }
}

