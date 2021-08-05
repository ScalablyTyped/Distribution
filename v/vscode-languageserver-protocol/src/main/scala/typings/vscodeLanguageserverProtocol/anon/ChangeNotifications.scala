package typings.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeNotifications extends StObject {
  
  /**
    * Whether the server wants to receive workspace folder
    * change notifications.
    *
    * If a strings is provided the string is treated as a ID
    * under which the notification is registed on the client
    * side. The ID can be used to unregister for these events
    * using the `client/unregisterCapability` request.
    */
  var changeNotifications: js.UndefOr[String | Boolean] = js.undefined
  
  /**
    * The Server has support for workspace folders
    */
  var supported: js.UndefOr[Boolean] = js.undefined
}
object ChangeNotifications {
  
  inline def apply(): ChangeNotifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeNotifications]
  }
  
  extension [Self <: ChangeNotifications](x: Self) {
    
    inline def setChangeNotifications(value: String | Boolean): Self = StObject.set(x, "changeNotifications", value.asInstanceOf[js.Any])
    
    inline def setChangeNotificationsUndefined: Self = StObject.set(x, "changeNotifications", js.undefined)
    
    inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    
    inline def setSupportedUndefined: Self = StObject.set(x, "supported", js.undefined)
  }
}
