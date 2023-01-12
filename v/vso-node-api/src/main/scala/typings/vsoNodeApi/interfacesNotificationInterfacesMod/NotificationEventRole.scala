package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationEventRole extends StObject {
  
  /**
    * Gets or sets an Id for that role, this id is used by the event.
    */
  var id: String
  
  /**
    * Gets or sets the Name for that role, this name is used for UI display.
    */
  var name: String
  
  /**
    * Gets or sets whether this role can be a group or just an individual user
    */
  var supportsGroups: Boolean
}
object NotificationEventRole {
  
  inline def apply(id: String, name: String, supportsGroups: Boolean): NotificationEventRole = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supportsGroups = supportsGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventRole]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationEventRole] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSupportsGroups(value: Boolean): Self = StObject.set(x, "supportsGroups", value.asInstanceOf[js.Any])
  }
}
