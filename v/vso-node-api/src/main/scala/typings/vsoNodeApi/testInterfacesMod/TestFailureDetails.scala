package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestFailureDetails extends js.Object {
  var count: Double
  var testResults: js.Array[TestCaseResultIdentifier]
}

object TestFailureDetails {
  @scala.inline
  def apply(count: Double, testResults: js.Array[TestCaseResultIdentifier]): TestFailureDetails = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestFailureDetails]
  }
}

