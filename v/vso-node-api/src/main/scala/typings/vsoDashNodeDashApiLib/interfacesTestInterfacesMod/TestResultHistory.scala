package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultHistory extends js.Object {
  var groupByField: java.lang.String
  var resultsForGroup: js.Array[TestResultHistoryDetailsForGroup]
}

object TestResultHistory {
  @scala.inline
  def apply(groupByField: java.lang.String, resultsForGroup: js.Array[TestResultHistoryDetailsForGroup]): TestResultHistory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("groupByField")(groupByField)
    __obj.updateDynamic("resultsForGroup")(resultsForGroup)
    __obj.asInstanceOf[TestResultHistory]
  }
}

