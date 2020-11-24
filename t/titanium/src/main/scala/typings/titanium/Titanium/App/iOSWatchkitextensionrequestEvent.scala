package typings.titanium.Titanium.App

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
  implicit class iOSWatchkitextensionrequestEventOps[Self <: iOSWatchkitextensionrequestEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHandlerId(value: String): Self = this.set("handlerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfo(value: js.Any): Self = this.set("userInfo", value.asInstanceOf[js.Any])
  }
}
