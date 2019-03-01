package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestSummaryForWorkItem extends js.Object {
  var summary: AggregatedDataForResultTrend
  var workItem: WorkItemReference
}

object TestSummaryForWorkItem {
  @scala.inline
  def apply(summary: AggregatedDataForResultTrend, workItem: WorkItemReference): TestSummaryForWorkItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("summary")(summary)
    __obj.updateDynamic("workItem")(workItem)
    __obj.asInstanceOf[TestSummaryForWorkItem]
  }
}

