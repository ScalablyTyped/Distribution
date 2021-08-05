package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.IMErrorType
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched in case of instant messaging subsystem error
  */
trait SystemError
  extends StObject
     with VoxImplantIMEvent {
  
  /**
    *    Error data object, contains the error details
    */
  var errorData: js.Object
  
  /**
    *    Error type
    */
  var errorType: IMErrorType
}
object SystemError {
  
  inline def apply(errorData: js.Object, errorType: IMErrorType): SystemError = {
    val __obj = js.Dynamic.literal(errorData = errorData.asInstanceOf[js.Any], errorType = errorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemError]
  }
  
  extension [Self <: SystemError](x: Self) {
    
    inline def setErrorData(value: js.Object): Self = StObject.set(x, "errorData", value.asInstanceOf[js.Any])
    
    inline def setErrorType(value: IMErrorType): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
  }
}
