package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

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
    val __obj = js.Dynamic.literal(testResultId = testResultId, testRunId = testRunId)
  
    __obj.asInstanceOf[TestCaseResultIdentifier]
  }
}

