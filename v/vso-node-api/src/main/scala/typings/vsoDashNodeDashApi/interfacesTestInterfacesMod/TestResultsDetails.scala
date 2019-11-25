package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultsDetails extends js.Object {
  var groupByField: String
  var resultsForGroup: js.Array[TestResultsDetailsForGroup]
}

object TestResultsDetails {
  @scala.inline
  def apply(groupByField: String, resultsForGroup: js.Array[TestResultsDetailsForGroup]): TestResultsDetails = {
    val __obj = js.Dynamic.literal(groupByField = groupByField.asInstanceOf[js.Any], resultsForGroup = resultsForGroup.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestResultsDetails]
  }
}

