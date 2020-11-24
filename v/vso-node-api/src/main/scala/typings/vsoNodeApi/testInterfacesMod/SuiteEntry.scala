package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuiteEntry extends js.Object {
  
  /**
    * Id of child suite in a suite
    */
  var childSuiteId: Double = js.native
  
  /**
    * Sequence number for the test case or child suite in the suite
    */
  var sequenceNumber: Double = js.native
  
  /**
    * Id for the suite
    */
  var suiteId: Double = js.native
  
  /**
    * Id of a test case in a suite
    */
  var testCaseId: Double = js.native
}
object SuiteEntry {
  
  @scala.inline
  def apply(childSuiteId: Double, sequenceNumber: Double, suiteId: Double, testCaseId: Double): SuiteEntry = {
    val __obj = js.Dynamic.literal(childSuiteId = childSuiteId.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any], suiteId = suiteId.asInstanceOf[js.Any], testCaseId = testCaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteEntry]
  }
  
  @scala.inline
  implicit class SuiteEntryOps[Self <: SuiteEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildSuiteId(value: Double): Self = this.set("childSuiteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceNumber(value: Double): Self = this.set("sequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuiteId(value: Double): Self = this.set("suiteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseId(value: Double): Self = this.set("testCaseId", value.asInstanceOf[js.Any])
  }
}
