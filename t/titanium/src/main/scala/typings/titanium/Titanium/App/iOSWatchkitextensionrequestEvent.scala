package typings.titanium.Titanium.App

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when openParentApplication:reply is called from a WatchKit extension. Available only on iOS 8.2 and later.
  */
@js.native
trait iOSWatchkitextensionrequestEvent extends iOSBaseEvent {
  
  /**
    * Unique string identifier for the `watchkitextensionrequest` event. This identifier should be passed an argument
    * to the [sendWatchExtensionReply](Titanium.App.iOS.sendWatchExtensionReply) method.
    */
  var handlerId: String = js.native
  
  /**
    * The payload passed to the `openParentApplication:reply` method from the WatchKit extension.
    */
  var userInfo: js.Any = js.native
}
object iOSWatchkitextensionrequestEvent {
  
  @scala.inline
  def apply(handlerId: String, source: iOS, userInfo: js.Any): iOSWatchkitextensionrequestEvent = {
    val __obj = js.Dynamic.literal(handlerId = handlerId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSWatchkitextensionrequestEvent]
  }
  
  @scala.inline
  implicit class iOSWatchkitextensionrequestEventMutableBuilder[Self <: iOSWatchkitextensionrequestEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandlerId(value: String): Self = StObject.set(x, "handlerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfo(value: js.Any): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
  }
}
