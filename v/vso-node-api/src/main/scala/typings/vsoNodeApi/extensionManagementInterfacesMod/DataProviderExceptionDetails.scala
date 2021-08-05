package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataProviderExceptionDetails extends StObject {
  
  /**
    * The type of the exception that was thrown.
    */
  var exceptionType: String
  
  /**
    * Message that is associated with the exception.
    */
  var message: String
  
  /**
    * The StackTrace from the exception turned into a string.
    */
  var stackTrace: String
}
object DataProviderExceptionDetails {
  
  inline def apply(exceptionType: String, message: String, stackTrace: String): DataProviderExceptionDetails = {
    val __obj = js.Dynamic.literal(exceptionType = exceptionType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProviderExceptionDetails]
  }
  
  extension [Self <: DataProviderExceptionDetails](x: Self) {
    
    inline def setExceptionType(value: String): Self = StObject.set(x, "exceptionType", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStackTrace(value: String): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
  }
}
