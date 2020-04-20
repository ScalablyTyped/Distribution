package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuiteTestCase extends js.Object {
  var pointAssignments: js.Array[PointAssignment]
  var testCase: WorkItemReference
}

object SuiteTestCase {
  @scala.inline
  def apply(pointAssignments: js.Array[PointAssignment], testCase: WorkItemReference): SuiteTestCase = {
    val __obj = js.Dynamic.literal(pointAssignments = pointAssignments.asInstanceOf[js.Any], testCase = testCase.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteTestCase]
  }
}

