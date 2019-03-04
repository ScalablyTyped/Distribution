package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuiteEntry extends js.Object {
  /**
    * Id of child suite in a suite
    */
  var childSuiteId: scala.Double
  /**
    * Sequence number for the test case or child suite in the suite
    */
  var sequenceNumber: scala.Double
  /**
    * Id for the suite
    */
  var suiteId: scala.Double
  /**
    * Id of a test case in a suite
    */
  var testCaseId: scala.Double
}

object SuiteEntry {
  @scala.inline
  def apply(
    childSuiteId: scala.Double,
    sequenceNumber: scala.Double,
    suiteId: scala.Double,
    testCaseId: scala.Double
  ): SuiteEntry = {
    val __obj = js.Dynamic.literal(childSuiteId = childSuiteId, sequenceNumber = sequenceNumber, suiteId = suiteId, testCaseId = testCaseId)
  
    __obj.asInstanceOf[SuiteEntry]
  }
}

