package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataProviderExceptionDetails extends StObject {
  
  /**
    * The type of the exception that was thrown.
    */
  var exceptionType: String = js.native
  
  /**
    * Message that is associated with the exception.
    */
  var message: String = js.native
  
  /**
    * The StackTrace from the exception turned into a string.
    */
  var stackTrace: String = js.native
}
object DataProviderExceptionDetails {
  
  @scala.inline
  def apply(exceptionType: String, message: String, stackTrace: String): DataProviderExceptionDetails = {
    val __obj = js.Dynamic.literal(exceptionType = exceptionType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProviderExceptionDetails]
  }
  
  @scala.inline
  implicit class DataProviderExceptionDetailsMutableBuilder[Self <: DataProviderExceptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExceptionType(value: String): Self = StObject.set(x, "exceptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackTrace(value: String): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
  }
}
