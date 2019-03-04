package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestCaseResultIdentifier extends js.Object {
  var testResultId: scala.Double
  var testRunId: scala.Double
}

object TestCaseResultIdentifier {
  @scala.inline
  def apply(testResultId: scala.Double, testRunId: scala.Double): TestCaseResultIdentifier = {
    val __obj = js.Dynamic.literal(testResultId = testResultId, testRunId = testRunId)
  
    __obj.asInstanceOf[TestCaseResultIdentifier]
  }
}

