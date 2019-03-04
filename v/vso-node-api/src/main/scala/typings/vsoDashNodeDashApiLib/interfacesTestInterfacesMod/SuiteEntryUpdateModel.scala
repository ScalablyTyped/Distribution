package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuiteEntryUpdateModel extends js.Object {
  /**
    * Id of child suite in a suite
    */
  var childSuiteId: scala.Double
  /**
    * Updated sequence number for the test case or child suite in the suite
    */
  var sequenceNumber: scala.Double
  /**
    * Id of a test case in a suite
    */
  var testCaseId: scala.Double
}

object SuiteEntryUpdateModel {
  @scala.inline
  def apply(childSuiteId: scala.Double, sequenceNumber: scala.Double, testCaseId: scala.Double): SuiteEntryUpdateModel = {
    val __obj = js.Dynamic.literal(childSuiteId = childSuiteId, sequenceNumber = sequenceNumber, testCaseId = testCaseId)
  
    __obj.asInstanceOf[SuiteEntryUpdateModel]
  }
}

