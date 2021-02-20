package typings.titanium.Titanium.App

import org.scalablytyped.runtime.StObject
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
  implicit class iOSBackgroundtransferEventMutableBuilder[Self <: iOSBackgroundtransferEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandlerId(value: String): Self = StObject.set(x, "handlerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
