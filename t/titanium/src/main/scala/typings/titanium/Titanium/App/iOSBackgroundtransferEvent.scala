package typings.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the events related to a [urlSession](Modules.URLSession) are waiting to be processed.
  * Available only on iOS 7 and later.
  */
@js.native
trait iOSBackgroundtransferEvent extends iOSBaseEvent {
  
  /**
    * Unique string identifier for the `backgroundtransfer` event. This identifier should be passed as the argument
    * to the [endBackgroundHandler](Titanium.App.iOS.endBackgroundHandler) method.
    */
  var handlerId: String = js.native
  
  /**
    * The identifier of the URL session requiring attention. If your app was just launched,
    * you can use this identifier to create a new `urlSession` object that can receive the events.
    */
  var sessionId: String = js.native
}
object iOSBackgroundtransferEvent {
  
  @scala.inline
  def apply(handlerId: String, sessionId: String, source: iOS): iOSBackgroundtransferEvent = {
    val __obj = js.Dynamic.literal(handlerId = handlerId.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSBackgroundtransferEvent]
  }
  
  @scala.inline
  implicit class iOSBackgroundtransferEventOps[Self <: iOSBackgroundtransferEvent] (val x: Self) extends AnyVal {
    
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
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
  }
}
