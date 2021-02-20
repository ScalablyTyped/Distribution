package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Notification args
  */
@js.native
trait INotificationArgs extends StObject {
  
  var header: String = js.native
  
  var message: String = js.native
  
  var `type`: NotificationType = js.native
}
object INotificationArgs {
  
  @scala.inline
  def apply(header: String, message: String, `type`: NotificationType): INotificationArgs = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotificationArgs]
  }
  
  @scala.inline
  implicit class INotificationArgsMutableBuilder[Self <: INotificationArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NotificationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
