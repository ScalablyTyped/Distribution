package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResultDocument extends StObject {
  
  var operationReference: TestOperationReference
  
  var payload: TestResultPayload
}
object TestResultDocument {
  
  inline def apply(operationReference: TestOperationReference, payload: TestResultPayload): TestResultDocument = {
    val __obj = js.Dynamic.literal(operationReference = operationReference.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultDocument]
  }
  
  extension [Self <: TestResultDocument](x: Self) {
    
    inline def setOperationReference(value: TestOperationReference): Self = StObject.set(x, "operationReference", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: TestResultPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
