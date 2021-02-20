package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * App received message from apple watch in foreground. Will be called on startup if the
  * incoming message caused the receiver to launch.
  */
@js.native
trait WatchSessionReceivemessageEvent extends WatchSessionBaseEvent {
  
  /**
    * The message content
    */
  var message: js.Any = js.native
}
object WatchSessionReceivemessageEvent {
  
  @scala.inline
  def apply(message: js.Any, source: WatchSession): WatchSessionReceivemessageEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionReceivemessageEvent]
  }
  
  @scala.inline
  implicit class WatchSessionReceivemessageEventMutableBuilder[Self <: WatchSessionReceivemessageEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
