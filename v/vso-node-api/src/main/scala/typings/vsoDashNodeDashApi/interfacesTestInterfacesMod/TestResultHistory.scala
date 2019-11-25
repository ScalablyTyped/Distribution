package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultHistory extends js.Object {
  var groupByField: String
  var resultsForGroup: js.Array[TestResultHistoryDetailsForGroup]
}

object TestResultHistory {
  @scala.inline
  def apply(groupByField: String, resultsForGroup: js.Array[TestResultHistoryDetailsForGroup]): TestResultHistory = {
    val __obj = js.Dynamic.literal(groupByField = groupByField.asInstanceOf[js.Any], resultsForGroup = resultsForGroup.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestResultHistory]
  }
}

