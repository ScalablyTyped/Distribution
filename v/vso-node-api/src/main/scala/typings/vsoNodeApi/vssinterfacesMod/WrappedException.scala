package typings.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WrappedException extends StObject {
  
  var customProperties: StringDictionary[js.Any]
  
  var errorCode: Double
  
  var eventId: Double
  
  var helpLink: String
  
  var innerException: WrappedException
  
  var message: String
  
  var stackTrace: String
  
  var typeKey: String
  
  var typeName: String
}
object WrappedException {
  
  inline def apply(
    customProperties: StringDictionary[js.Any],
    errorCode: Double,
    eventId: Double,
    helpLink: String,
    innerException: WrappedException,
    message: String,
    stackTrace: String,
    typeKey: String,
    typeName: String
  ): WrappedException = {
    val __obj = js.Dynamic.literal(customProperties = customProperties.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], helpLink = helpLink.asInstanceOf[js.Any], innerException = innerException.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any], typeKey = typeKey.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedException]
  }
  
  extension [Self <: WrappedException](x: Self) {
    
    inline def setCustomProperties(value: StringDictionary[js.Any]): Self = StObject.set(x, "customProperties", value.asInstanceOf[js.Any])
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setEventId(value: Double): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setHelpLink(value: String): Self = StObject.set(x, "helpLink", value.asInstanceOf[js.Any])
    
    inline def setInnerException(value: WrappedException): Self = StObject.set(x, "innerException", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStackTrace(value: String): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    inline def setTypeKey(value: String): Self = StObject.set(x, "typeKey", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
