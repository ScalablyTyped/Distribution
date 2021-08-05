package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Notification args
  */
trait INotificationArgs extends StObject {
  
  var header: String
  
  var message: String
  
  var `type`: NotificationType
}
object INotificationArgs {
  
  inline def apply(header: String, message: String, `type`: NotificationType): INotificationArgs = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotificationArgs]
  }
  
  extension [Self <: INotificationArgs](x: Self) {
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setType(value: NotificationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
