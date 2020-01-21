package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestCaseResultIdentifier extends js.Object {
  var testResultId: Double
  var testRunId: Double
}

object TestCaseResultIdentifier {
  @scala.inline
  def apply(testResultId: Double, testRunId: Double): TestCaseResultIdentifier = {
    val __obj = js.Dynamic.literal(testResultId = testResultId.asInstanceOf[js.Any], testRunId = testRunId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestCaseResultIdentifier]
  }
}

