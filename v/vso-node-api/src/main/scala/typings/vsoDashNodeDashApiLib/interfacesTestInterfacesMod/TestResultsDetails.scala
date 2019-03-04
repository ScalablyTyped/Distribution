package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultsDetails extends js.Object {
  var groupByField: java.lang.String
  var resultsForGroup: js.Array[TestResultsDetailsForGroup]
}

object TestResultsDetails {
  @scala.inline
  def apply(groupByField: java.lang.String, resultsForGroup: js.Array[TestResultsDetailsForGroup]): TestResultsDetails = {
    val __obj = js.Dynamic.literal(groupByField = groupByField, resultsForGroup = resultsForGroup)
  
    __obj.asInstanceOf[TestResultsDetails]
  }
}

