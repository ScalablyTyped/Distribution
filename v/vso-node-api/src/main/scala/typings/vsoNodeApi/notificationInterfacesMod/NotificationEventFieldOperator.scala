package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationEventFieldOperator extends StObject {
  
  /**
    * Gets or sets the display name of an operator
    */
  var displayName: String = js.native
  
  /**
    * Gets or sets the id of an operator
    */
  var id: String = js.native
}
object NotificationEventFieldOperator {
  
  @scala.inline
  def apply(displayName: String, id: String): NotificationEventFieldOperator = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventFieldOperator]
  }
  
  @scala.inline
  implicit class NotificationEventFieldOperatorMutableBuilder[Self <: NotificationEventFieldOperator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
