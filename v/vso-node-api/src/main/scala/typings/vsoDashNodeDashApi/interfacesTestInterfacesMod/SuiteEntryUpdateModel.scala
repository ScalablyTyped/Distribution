package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuiteEntryUpdateModel extends js.Object {
  /**
    * Id of child suite in a suite
    */
  var childSuiteId: Double
  /**
    * Updated sequence number for the test case or child suite in the suite
    */
  var sequenceNumber: Double
  /**
    * Id of a test case in a suite
    */
  var testCaseId: Double
}

object SuiteEntryUpdateModel {
  @scala.inline
  def apply(childSuiteId: Double, sequenceNumber: Double, testCaseId: Double): SuiteEntryUpdateModel = {
    val __obj = js.Dynamic.literal(childSuiteId = childSuiteId, sequenceNumber = sequenceNumber, testCaseId = testCaseId)
  
    __obj.asInstanceOf[SuiteEntryUpdateModel]
  }
}

