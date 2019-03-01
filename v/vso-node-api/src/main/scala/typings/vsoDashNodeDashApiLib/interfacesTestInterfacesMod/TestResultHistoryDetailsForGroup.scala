package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultHistoryDetailsForGroup extends js.Object {
  var groupByValue: js.Any
  var latestResult: TestCaseResult
}

object TestResultHistoryDetailsForGroup {
  @scala.inline
  def apply(groupByValue: js.Any, latestResult: TestCaseResult): TestResultHistoryDetailsForGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("groupByValue")(groupByValue)
    __obj.updateDynamic("latestResult")(latestResult)
    __obj.asInstanceOf[TestResultHistoryDetailsForGroup]
  }
}

