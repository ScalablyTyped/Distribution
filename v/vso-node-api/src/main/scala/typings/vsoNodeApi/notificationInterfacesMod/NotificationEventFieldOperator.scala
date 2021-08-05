package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationEventFieldOperator extends StObject {
  
  /**
    * Gets or sets the display name of an operator
    */
  var displayName: String
  
  /**
    * Gets or sets the id of an operator
    */
  var id: String
}
object NotificationEventFieldOperator {
  
  inline def apply(displayName: String, id: String): NotificationEventFieldOperator = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventFieldOperator]
  }
  
  extension [Self <: NotificationEventFieldOperator](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
