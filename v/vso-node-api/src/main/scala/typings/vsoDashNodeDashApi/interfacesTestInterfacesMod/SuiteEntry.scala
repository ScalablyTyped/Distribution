package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuiteEntry extends js.Object {
  /**
    * Id of child suite in a suite
    */
  var childSuiteId: Double
  /**
    * Sequence number for the test case or child suite in the suite
    */
  var sequenceNumber: Double
  /**
    * Id for the suite
    */
  var suiteId: Double
  /**
    * Id of a test case in a suite
    */
  var testCaseId: Double
}

object SuiteEntry {
  @scala.inline
  def apply(childSuiteId: Double, sequenceNumber: Double, suiteId: Double, testCaseId: Double): SuiteEntry = {
    val __obj = js.Dynamic.literal(childSuiteId = childSuiteId, sequenceNumber = sequenceNumber, suiteId = suiteId, testCaseId = testCaseId)
  
    __obj.asInstanceOf[SuiteEntry]
  }
}

