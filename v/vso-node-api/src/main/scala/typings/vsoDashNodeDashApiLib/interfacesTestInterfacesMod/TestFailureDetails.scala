package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestFailureDetails extends js.Object {
  var count: scala.Double
  var testResults: js.Array[TestCaseResultIdentifier]
}

object TestFailureDetails {
  @scala.inline
  def apply(count: scala.Double, testResults: js.Array[TestCaseResultIdentifier]): TestFailureDetails = {
    val __obj = js.Dynamic.literal(count = count, testResults = testResults)
  
    __obj.asInstanceOf[TestFailureDetails]
  }
}

