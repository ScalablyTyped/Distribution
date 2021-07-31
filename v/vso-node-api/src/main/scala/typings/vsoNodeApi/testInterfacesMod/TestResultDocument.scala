package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResultDocument extends StObject {
  
  var operationReference: TestOperationReference
  
  var payload: TestResultPayload
}
object TestResultDocument {
  
  @scala.inline
  def apply(operationReference: TestOperationReference, payload: TestResultPayload): TestResultDocument = {
    val __obj = js.Dynamic.literal(operationReference = operationReference.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultDocument]
  }
  
  @scala.inline
  implicit class TestResultDocumentMutableBuilder[Self <: TestResultDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationReference(value: TestOperationReference): Self = StObject.set(x, "operationReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: TestResultPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
