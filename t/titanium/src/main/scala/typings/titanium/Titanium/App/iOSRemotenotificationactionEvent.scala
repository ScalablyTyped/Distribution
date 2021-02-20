package typings.titanium.Titanium.App

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a user selects an action for an interactive remote notification.
  */
@js.native
trait iOSRemotenotificationactionEvent extends iOSBaseEvent {
  
  /**
    * Identifier of the category of the interactive notification.
    */
  var category: String = js.native
  
  /**
    * The payload passed to the Apple Push Notification Service.
    */
  var data: js.Any = js.native
  
  /**
    * Identifier of the action that was selected of the interactive notification.
    */
  var identifier: String = js.native
}
object iOSRemotenotificationactionEvent {
  
  @scala.inline
  def apply(category: String, data: js.Any, identifier: String, source: iOS): iOSRemotenotificationactionEvent = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSRemotenotificationactionEvent]
  }
  
  @scala.inline
  implicit class iOSRemotenotificationactionEventMutableBuilder[Self <: iOSRemotenotificationactionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
  }
}
