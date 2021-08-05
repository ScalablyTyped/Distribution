package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuiteEntryUpdateModel extends StObject {
  
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
  
  inline def apply(childSuiteId: Double, sequenceNumber: Double, testCaseId: Double): SuiteEntryUpdateModel = {
    val __obj = js.Dynamic.literal(childSuiteId = childSuiteId.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any], testCaseId = testCaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteEntryUpdateModel]
  }
  
  extension [Self <: SuiteEntryUpdateModel](x: Self) {
    
    inline def setChildSuiteId(value: Double): Self = StObject.set(x, "childSuiteId", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumber(value: Double): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setTestCaseId(value: Double): Self = StObject.set(x, "testCaseId", value.asInstanceOf[js.Any])
  }
}
